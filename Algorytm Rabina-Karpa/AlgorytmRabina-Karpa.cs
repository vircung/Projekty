using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace Algorytm_Rabina_Karpa
{
    public partial class Form1 : Form
    {
        string tekst;
        string wzorzec;

        int tekst_dlugosc;
        int wzorzec_dlugosc;

        int wzorzec_hash;
        int[] tekst_hashe;
        
        public Form1()
        {
            InitializeComponent();
        }

        private void btn_szukaj_Click(object sender, EventArgs e)
        {
            tekst = txt_tekst.Text;
            wzorzec = txt_wzozec.Text;

            tekst_dlugosc = tekst.Length;
            wzorzec_dlugosc = wzorzec.Length;

            #region Sprawdzanie błędów
            if (tekst == "")
            {
                MessageBox.Show("Nie podałeś tekstu", "Błąd", MessageBoxButtons.OK, MessageBoxIcon.Error);
                return;
            }
 
            if (wzorzec == "")
            {
                MessageBox.Show("Nie podałeś wzorca", "Błąd", MessageBoxButtons.OK, MessageBoxIcon.Error);
                return;
            }

            if (wzorzec_dlugosc > tekst_dlugosc)
            {
                MessageBox.Show("Dlugość wzorca nie może być większa od długości tekstu", "Błąd", MessageBoxButtons.OK, MessageBoxIcon.Error);
                return;
            }
            #endregion

            wzorzec_hash = wzorzec.GetHashCode();
            
            BudujTablice();

            
            Szukaj();
        }

        private void BudujTablice()
        {
            tekst_hashe = new int[tekst_dlugosc - wzorzec_dlugosc];

            for (int i = 0; i < tekst_hashe.Length; i++)
            {
                tekst_hashe[i] = tekst.Substring(i, wzorzec_dlugosc).GetHashCode();
            }
        }

        private void Szukaj()
        {
            txt_wynik.Text = "";
            txt_wynik.AppendText("Wzorzec: " + Environment.NewLine +
                                  wzorzec + Environment.NewLine);
            txt_wynik.AppendText("Tekst: " + Environment.NewLine +
                                  tekst + Environment.NewLine);

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < tekst_hashe.Length; i++)
            {
                if (wzorzec_hash != tekst_hashe[i])
                    sb.Append("_");
                else
                    sb.Append("^");
            }

            txt_wynik.AppendText(sb.ToString());
        }
    }
}
