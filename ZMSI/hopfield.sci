function [out]=unipolar(in)
    if in > 0 then
        out = 1;
    else
        out = 0;
    end
endfunction

function [out]=bipolar(in)
    if in > 0 then
        out = 1;
    else
        out = -1;
    end
endfunction

function [out]=activate(in, expression, display_messages)
    [rows, cols] = size(in);
    if rows * cols <> 1 then
        out = zeros(rows, cols)
        for row = 1:rows
            for col = 1:cols
                out(row, col) = activate(in(row, col))
            end
        end
        if display_messages then
            disp(out.', 'Wygenerowane potencjały wyjściowe')
        end
    else
        out = expression(in);
    end
endfunction

function [stop_condition]=verify_finished(last_steps, display_messages)
    stop_condition = %T
    [rows_size, cols_size] = size(last_steps)
    col_results = ones(1, cols_size)

    if rows_size == cols_size then
        for col_index = 1:cols_size
            col_value = sum(last_steps(:, col_index)) / rows_size
            for row_index = 1:rows_size
                row_value = last_steps(row_index, col_index)
                col_results(col_index) = col_results(col_index) & col_value == last_steps(row_index, col_index)
            end
        end
        stop_condition = sum(col_results) <> cols_size
    end

    if display_messages then
        disp(col_results, 'Poprawność potencjałów')
        disp(last_steps, 'W ostatnich wykonaniach')
        disp(stop_condition, 'Kontynuuj')
    end
endfunction

function [last_steps] = apply_execution(input_steps, new_execution)
    last_steps = [input_steps; new_execution]
    [rows_size, cols_size] = size(last_steps)

    if rows_size > cols_size then
        last_steps(1, :) = []
    end
endfunction

function hopfield_network(input_network, input_values, expression, display_messages)
    last_steps = []
    output_values = []
    [rows, cols] = size(input_values)

    if display_messages then
        disp(input_values, 'Punkty wejściowe')
        disp(input_network, 'Sieć wejściowa')
    end

    for row_index = 1:rows
        input_point = input_values(row_index, :)
        output_point = input_point.';

        if display_messages then
            disp(input_point, 'Potencjały wejściowe:')
        end

        continue_work = %T
        while continue_work
            for col_index = 1:cols
                if display_messages then
                    disp(col_index, 'KROK')
                    disp(output_point.', 'Potencjały wejściowe w kroku')
                end
                result = input_network * output_point
                result_activated = activate(result, expression, display_messages)
                output_point(col_index, 1) = result_activated(col_index, 1)
                step = output_point.'
                last_steps = apply_execution(last_steps, step)

                if display_messages then
                    disp(step, 'Potencjały wyjściowe w kroku')
                end
            end

            continue_work = verify_finished(last_steps, display_messages)
        end

        input_point = output_point.'

        if display_messages then
            disp(input_point, 'Potencjały wyjściowe')
        end
        output_values(row_index, :) = input_point
    end

    convergent_points = []
    for row_index = 1:rows
        if input_values(row_index, :) == output_values(row_index, :) then
           convergent_points = [convergent_points; output_values(row_index, :)]
        end
    end

    disp(input_network, 'Sieć')
    disp(input_values, 'Dla punktów wejściowych')
    disp(output_values, 'Generuje punkty wyjściowe')
    disp(convergent_points, 'Posiada punkty zbieżne')
endfunction