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
    public partial class IleKrolowych : Form
    {
        public int IloscKrolowych { get; private set; }
        int ileK;
        bool jestOk;
        public IleKrolowych()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            jestOk = int.TryParse(textBox1.Text, out ileK);
            if (!jestOk)
            {
                MessageBox.Show("Powinieneś podać liczbę całkowitą", "Błąd konwersji", MessageBoxButtons.OK, MessageBoxIcon.Error);
                return;
            }
            if (ileK <= 3)
            {
                MessageBox.Show("Przynajmniej 4 królowe", "Niepoprawna ilość", MessageBoxButtons.OK, MessageBoxIcon.Error);
                jestOk = false;
                return;
            }
            IloscKrolowych = ileK;
            jestOk = true;
            Close();
        }

        private void IleKrolowych_FormClosing(object sender, FormClosingEventArgs e)
        {
            e.Cancel = !jestOk;
        }
    }
}
