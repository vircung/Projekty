using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Problem_Plecakowy
{
    public class Przedmiot : IComparable
    {
        public float Ilosc { get; private set; }
        public float Cena { get; private set; }
        public float Wartosc { get { return Ilosc * Cena; } }
        public float Jakosc { get { return Cena / Ilosc; } }

        public Przedmiot(float cena, float ilosc)
        {
            Cena = cena;
            Ilosc = ilosc;
        }

        public int CompareTo(object obj)
        {
            if (obj == null) return 1;

            Przedmiot p = obj as Przedmiot;

            if (p != null)
                return -Jakosc.CompareTo(p.Jakosc);
            else
                throw new ArgumentException("Porownywany obiekt nie jest Przedmiotem");
        }

        override public string ToString()
        {
            return String.Format("{0:0.00}", Ilosc) + " x " + 
                   String.Format("{0:0.00}", Cena) + " = " + 
                   String.Format("{0:0.00}", Wartosc) + " | " + 
                   String.Format("{0:0.00}", Jakosc);
        }

    }
}
