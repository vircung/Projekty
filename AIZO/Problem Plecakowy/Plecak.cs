using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Problem_Plecakowy
{
    public class Plecak
    {
        public List<Przedmiot> Przedmioty { get; private set; }
        public float Wartosc { get; private set; }
        public float Rozmiar { get; private set; }

        public Plecak(float rozmiar)
        {
            Przedmioty = new List<Przedmiot>();
            Rozmiar = rozmiar;
            Wartosc = 0.0f;
        }

        public bool CzySieZmiesci(Przedmiot przedmiot)
        {
            return Rozmiar >= przedmiot.Ilosc;
        }

        public bool DodajPrzedmiot(Przedmiot przedmiot, bool dyskretny)
        {
            if (Rozmiar <= 0.0f)
                return false;

            if (dyskretny)
            {
                if (CzySieZmiesci(przedmiot))
                {
                    DodajPrzedmiot(przedmiot);
                    return true;
                }
                return false;
            }
            else
            {
                Przedmiot p;
                if (Rozmiar < przedmiot.Ilosc)
                {
                    p = new Przedmiot(przedmiot.Cena, Rozmiar);
                }
                else
                {
                    p = przedmiot;
                }

                DodajPrzedmiot(p);
                return true;
            }
        }

        private void DodajPrzedmiot(Przedmiot p)
        {
            Przedmioty.Add(p);
            Rozmiar -= p.Ilosc;
            Wartosc += p.Wartosc;
        }
    }
}
