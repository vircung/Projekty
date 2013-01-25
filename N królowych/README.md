# Problem ustawienia n-królowych

Opis zaczerpnięty z tej [strony](http://nqueens.fatmagnus.ppa.pl/nqueen_definicja.php)

## Definicja zadania


Zadanie polega na ustawieniu n-królowych na szachownicy o wymiarach n*n, w taki sposób, aby królowe się wzajemnie nie szachowały. Oznacza to (zgodnie z regułami gry w szachy), że żadne dwie królowe nie mogą się znajdować w tym samym wierszu, kolumnie i na tej samej przekątnej. Może istnieć wiele sposobów ustawienia królowych na szachownicy o danym rozmiarze 

## Algorytm naiwny

Najprostszym rozwiązaniem problemu n-królowych byłoby wygenerowanie wszystkich możliwych ustawień królowych na szachownicy. Oczywiście bierzemy pod uwagę fakt, że w jednym wierszu powinna znajdować się dokładnie jedna królowa, oraz że królowe nie mogą się nawzajem szachować. Dokonujemy więc przestawień królowych w kolumnach i sprawdzamy czy się nie szachują. Dla przykładu, na szachownicy o wymiarach 5x5 otrzymujemy 5*5*5*5*5 = 3125 potencjalnych rozwiązań, podczas gdy jest ich tak naprawdę tylko 10. Jak widać algorytm naiwny jest bardzo nieefektywny, nawet dla szachownic o dosyć niewielkich rozmiarach.

## Algorytm z powrotami

Aby rozwiązać problem n-królowych metodą algorytmów z powrotami, należy najpierw przedstawić szachownicę w postaci drzewa. Każdy z jego poziomów jest odpowiednikiem wiersza na szachownicy. Zaś wierzchołkom przypisane są współrzędne konkretnych pól. Konwersja małej szachownicy o wymiarach 2x2 do postaci drzewa przestrzeni stanów

Warto tutaj zaznaczyć, że każdy wierzchołek nie będący liściem ma zawsze taką samą ilość węzłów potomnych. Ilość ta jest uzależniona od liczby kolumn (lub wierszy) w danej szachownicy.

Celem algorytmu jest odnalezienie wszystkich możliwych kombinacji ustawień królowych na szachownicy o zadanym rozmiarze. Dzięki zastosowaniu techniki przeszukiwania w głąb, algorytm z powrotami nie musi generować od razu wszystkich możliwych rozwiązań (jak algorytm naiwny). Może dojść do nich poprzez analizę każdego napotkanego węzła i cofać się w drzewie przestrzeni stanów, jeśli uzna dany węzeł za nieobiecujący. 