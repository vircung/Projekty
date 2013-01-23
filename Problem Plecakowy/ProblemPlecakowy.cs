using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using System.Threading;

namespace Problem_Plecakowy
{
    public partial class ProblemPlecakowy : Form
    {
        int ile_przedmiotow;
        int ile_dodanych_przedmiotow;
        float rozmiar_plecaka;

        Plecak plecak;
        List<Przedmiot> przedmioty;

        public ProblemPlecakowy()
        {
            InitializeComponent();
            ile_przedmiotow = 0;
            przedmioty = new List<Przedmiot>();
        }

        private void btn_dodaj_przedmioty_Click(object sender, EventArgs e)
        {
            #region Sprawdzanie wartości Opcji
            if (!float.TryParse(txt_rozmiar_plecaka.Text, out rozmiar_plecaka))
            {
                MessageBox.Show("Rozmiar plecaka powinien być liczbą zmiennoprzecinkową.", "Blad przy konwersji.");
                return;
            }
            if (!int.TryParse(txt_ile_przedmiotow.Text, out ile_przedmiotow))
            {
                MessageBox.Show("Ilość przedmiotów powinna być liczbą całkowitą.", "Blad przy konwersji.");
                return;
            }
            if (ile_przedmiotow <= 0)
            {
                MessageBox.Show("Minimalna ilość przedmiotów 1", "Niepoprawna wartość");
                return;
            }
            if (rozmiar_plecaka < 1.0f)
            {
                MessageBox.Show("Minimalny rozmiar plecaka 1.0", "Niepoprawna wartość");
                return;
            }
            #endregion

            group_przedmioty.Enabled = true;
            group_opcje.Enabled = false;
            plecak = new Plecak(rozmiar_plecaka);
            ile_dodanych_przedmiotow = 0;
            UstawStatusIlePrzedmiowow();
        }

        private void UstawStatusIlePrzedmiowow()
        {
            toolStripStatusLabel1.Text = "Pozostało do dodania " + (ile_przedmiotow - ile_dodanych_przedmiotow) + " do dodania";
        }

        private void btn_dodaj_przedmiot_Click(object sender, EventArgs e)
        {
            float ile;
            float cena;

            #region Sprawdzanie wartości nowego przedmiotu
            if (!float.TryParse(txt_przedmiot_ilosc.Text, out ile))
            {
                MessageBox.Show("Ilość przedmiotu powinna być liczbą zmiennoprzecinkową.", "Błąd przy konwersji");
                return;
            }
            if (!float.TryParse(txt_przedmiot_cena.Text, out cena))
            {
                MessageBox.Show("Cena powinna być liczbą zmiennoprzecinkową", "Błąd przy konwersji");
                return;
            }
            if (ile < 1.0f)
            {
                MessageBox.Show("Minimalna ilość przedmiotu to 1", "Niepoprawna wartość");
                return;
            }
            if(cena < 1.0f)
            {
                MessageBox.Show("Minimalna cena przedmiotu to 1", "Niepoprawna wartość");
                return;
            }
            #endregion

            #region Dodaj przedmiot
            Przedmiot przedmiot = new Przedmiot(cena, ile);
            przedmioty.Add(przedmiot);
            if (++ile_dodanych_przedmiotow == ile_przedmiotow)
            {
                group_przedmioty.Enabled = false;
                group_rozwiaz.Enabled = true;
            }
            txt_przedmiot_cena.Text = "";
            txt_przedmiot_ilosc.Text = "";
            UstawStatusIlePrzedmiowow();

            txt_przedmioty.Text = ListToSring(przedmioty);
            #endregion
        }


        private string ListToSring(List<Przedmiot> prz)
        {
            StringBuilder sb = new StringBuilder();

            foreach (Przedmiot p in prz)
            {
                sb.AppendLine(p.ToString());
            }
            return sb.ToString();
        }

        private void btn_rozwiaz_Click(object sender, EventArgs e)
        {
            float rozmiar = plecak.Rozmiar;

            przedmioty.Sort();
            foreach (Przedmiot p in przedmioty)
            {
                plecak.DodajPrzedmiot(p, radio_dyskretny.Checked);
                txt_plecak.Text = ListToSring(plecak.Przedmioty);
            }

            plecak.Przedmioty.Sort();
            txt_plecak.Text = ListToSring(plecak.Przedmioty);

            txt_plecak.Text += System.Environment.NewLine +
                               "Rozmiar plecaka " + rozmiar.ToString() + System.Environment.NewLine +
                               "Wolne miejsce w plecaku " + plecak.Rozmiar.ToString() + System.Environment.NewLine +
                               "Ilosc przedmiotow w plecaku " + plecak.Przedmioty.Count.ToString() + System.Environment.NewLine +
                               "Wartość plecaka " + plecak.Wartosc.ToString();

            btn_rozwiaz.Enabled = false;
        }

        private void btn_posortuj_Click(object sender, EventArgs e)
        {
            przedmioty.Sort();
            txt_przedmioty.Text = ListToSring(przedmioty);
            plecak.Przedmioty.Sort();
            txt_plecak.Text = ListToSring(plecak.Przedmioty);
            btn_posortuj.Enabled = false;
        }

    }
}
