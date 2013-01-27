using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace N_królowych
{
    public partial class NKrolowych : Form
    {
        IleKrolowych k;

        int ileKrolowych;
        int rozmiarPola = 20;
        int odstep = 5;

        bool czyStop;

        Dictionary<Point, Button> szachownica;

        int[] kolumny;

        public NKrolowych()
        {
            InitializeComponent();

            k = new IleKrolowych();
            k.ShowDialog();
            ileKrolowych = k.IloscKrolowych;

            szachownica = new Dictionary<Point, Button>();

            #region Dodawanie kontrolek
            for (int x = 0; x < ileKrolowych; x++)
                for (int y = 0; y < ileKrolowych; y++)
                {
                    Button pole = new Button();
                    pole.Size = new Size(rozmiarPola, rozmiarPola);
                    pole.Location = new Point(rozmiarPola * x + odstep * x + panel_szachownica.Padding.Left, rozmiarPola * y + odstep * y + panel_szachownica.Padding.Top);
                    pole.BackColor = Color.LightGray;
                    panel_szachownica.Controls.Add(pole);
                    szachownica.Add(new Point(x, y), pole);
                }

            Button start = new Button();
            start.Size = new System.Drawing.Size(panel_szachownica.Width, 30);
            start.Location = new Point(panel_szachownica.Padding.Left, panel_szachownica.Height + panel_szachownica.Padding.Vertical);
            start.Text = "Rozwiaz problem";
            start.Name = "btn_rozwiaz";
            start.Click += btn_rozwiaz_Click;
            Controls.Add(start);
            #endregion
        }

        private void btn_rozwiaz_Click(object sender, EventArgs e)
        {
            czyStop = false;
            WyswietlKrolowe(true);
            kolumny = new int[ileKrolowych];
            ustawKrolowe(-1);
        }

        bool czyObiecujacy(int wiersz_test)
        {
            int krolowa = 0;
            bool obiecujacy = true;

            while (krolowa < wiersz_test && obiecujacy)
            {
                if (kolumny[wiersz_test] == kolumny[krolowa] || Math.Abs(kolumny[wiersz_test] - kolumny[krolowa]) == wiersz_test - krolowa)
                    obiecujacy = false;
                krolowa++;
            }

            return obiecujacy;
        }

        void ustawKrolowe(int wiersz)
        {
            if (czyStop)
                return;
            int j;
            int x;

            if (czyObiecujacy(wiersz))
                if (wiersz == ileKrolowych - 1)
                {
                    WyswietlKrolowe(false);

                    if (MessageBox.Show("Sprawdzić czy istnieje jeszcze jedno rozwiązanie?", "Może jeszcze coś znajdziemy", MessageBoxButtons.OKCancel, MessageBoxIcon.Question) == System.Windows.Forms.DialogResult.OK)
                        WyswietlKrolowe(true);
                    else
                        czyStop = true;
                }
                else
                {
                    for (j = 0; j < ileKrolowych; j++)
                    {
                        kolumny[wiersz + 1] = j;
                        ustawKrolowe(wiersz + 1);
                    }
                }
        }

        private void WyswietlKrolowe(bool wyczysc)
        {
            if (wyczysc)
                foreach (Button b in szachownica.Values)
                    panel_szachownica.Controls[panel_szachownica.Controls.IndexOf(b)].Text = "";
            else
                for (int x = 0; x < kolumny.Length; x++)
                {
                    Button b = szachownica[new Point(x, kolumny[x])];
                    int i = panel_szachownica.Controls.IndexOf(b);
                    panel_szachownica.Controls[i].Text = "X";
                }
        }
    }
}
