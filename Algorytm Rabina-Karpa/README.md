# Algorytm Karpa-Rabina 

## Definicja zadania

Podstawowym problemem dotyczącym tekstów jest problem wyszukiwania wzorca. 
Polega on na znalezieniu wszystkich wystąpień tekstu wzorzec, w tekście tekst. 

## Założenia

Przyjmujemy, że: m = wzorzec.dlugosc(), n = tekst.dlugosc() oraz n >= m.

W Algorytmie tym stosujemy funkcję haszującą (mieszającą) h, dzięki, 
której będziemy obliczać pewną wartość (kod) podsłowa tekst\[i\]=tekst.substr(i, i+m-1)) 
tekstu wejściowego. 

Jeśli h(tekst\[i\])=h(wzorzec), to z bardzo dużym prawdopodobieństwem 
wzorzec występuje w tekscie na i-tym miejscu. Efektywność algorytmu wynika z możliwości 
szybkiego obliczenia wartości h(tekst\[i+1\]), jeżeli wartość h(tekst\[i\]) jest już znana.

**W programie użyję wbudowanej funkcji haszującej.**

## Algorytm działania

1. Oblicz długość wzorca = _m_
2. Oblicz długośc tekstu = _n_
3. Oblicz hasz(wzorzec) = _Hp_
4. Zbuduj tablicę zawierającą hasz(tekst\[_i_\]), dla _i_ z przedziału \[0, n-m\] = _Ht_
5. Porównaj kolejne elementy tablicy _Ht_ z _Hp_
 - Jeżeli element tablicy _Ht_[_i_] = _Hp_ zapisz indeks _i_
 