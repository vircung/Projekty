# Problem placakowy

## Definicja zadania

Jest to jeden z najczęsciej poruszanych problemów optymalizacyjnych. Nazwa zagadnienia pochodzi od maksymalizacyjnego problemu wyboru przedmiotów, tak aby ich sumaryczna wartość była jak największa i jednocześnie zmieściły się w plecaku. Przy podanym zbiorze elementów o podanej wadze i wartości, należy wybrać taki podzbiór by suma wartości była możliwie największa, a suma wag była nie większa od danej pojemności plecaka.

Problem plecakowy częsci przedstawiany jest jako problem złodzieja rabującego sklep.

## Dyskretny vs. ciągły

Istnieją dwie werjsie tego problemu, dyskretna oraz ciągła. 

Główną różnicą jest to, iż w ciągłej możemy chować do plecaka ułamkowe częsci przedmiotów w przeciwieństwie do dyskretnej.

## Algorytm działania

1. Posortuj listę dostępnych przedmiotów malejąco wg ich 'jakości', tzn. stosunku cena/ilość
2. Analizuj kolejno wszystkie przedmioty listy, dopóki jest wolne miejsce w plecaku
 1. Jeżeli przedmiot zmieści się do plecaka
  - Dodaj przedmiot
  - Zmniejsz ilość dostępnego miejsca
 2. Jeżeli przedmiot nie zmieści się do plecaka
  - W przypadku problemu ciągłego umieść część przedmiotu w plecaku odpowiadającą pozostałemu wolemu miejscu
  - W przypadku problemu dyskretnego przejdź do następnego przedmiotu