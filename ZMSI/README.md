Zaawansowane Metody Sztucznej Inteligencji, semestr 3
=======

# Problem działania sieci Hopfielda

Uruchomienie sieci:

* parametrem jest siecią neuronów
* parametrem są badane punkty
* parametrem jest nazwa funkcji aktywującej (`bipolar` lub `unipolar`)
* parametrem jest flaga czy mają być wyświetlane dodatkowe komunikaty z działania sieci

````
    input_network = [
         0,  1, -1, -4;
         1,  0, -2,  1;
        -1, -2,  0,  3;
        -4,  1,  3,  0
    ]
    input_values = [
      -1, -1, -1, -1;
      -1, -1, -1,  1;
      -1, -1,  1, -1;
      -1, -1,  1,  1;
      -1,  1, -1, -1;
      -1,  1, -1,  1;
      -1,  1,  1, -1;
      -1,  1,  1,  1;
       1, -1, -1, -1;
       1, -1, -1,  1;
       1, -1,  1, -1;
       1, -1,  1,  1;
       1,  1, -1, -1;
       1,  1, -1,  1;
       1,  1,  1, -1;
       1,  1,  1,  1
    ]
    hopfield_network(input_network, input_values, unipolar, %F)

    input_network = [
         0, -1, -3;
        -1,  0,  2;
        -3,  2,  0
    ]
    input_values = [
      -1, -1, -1;
      -1, -1,  1;
      -1,  1, -1;
      -1,  1,  1;
       1, -1, -1;
       1, -1,  1;
       1,  1, -1;
       1,  1,  1
    ]
    hopfield_network(input_network, input_values, bipolar, %T)
````
