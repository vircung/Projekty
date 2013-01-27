namespace Problem_Plecakowy
{
    partial class ProblemPlecakowy
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.group_opcje = new System.Windows.Forms.GroupBox();
            this.btn_dodaj_przedmioty = new System.Windows.Forms.Button();
            this.txt_ile_przedmiotow = new System.Windows.Forms.TextBox();
            this.txt_rozmiar_plecaka = new System.Windows.Forms.TextBox();
            this.label2 = new System.Windows.Forms.Label();
            this.label1 = new System.Windows.Forms.Label();
            this.radio_ciagly = new System.Windows.Forms.RadioButton();
            this.radio_dyskretny = new System.Windows.Forms.RadioButton();
            this.group_przedmioty = new System.Windows.Forms.GroupBox();
            this.btn_dodaj_przedmiot = new System.Windows.Forms.Button();
            this.txt_przedmiot_cena = new System.Windows.Forms.TextBox();
            this.label4 = new System.Windows.Forms.Label();
            this.txt_przedmiot_ilosc = new System.Windows.Forms.TextBox();
            this.label3 = new System.Windows.Forms.Label();
            this.statusStrip1 = new System.Windows.Forms.StatusStrip();
            this.toolStripStatusLabel1 = new System.Windows.Forms.ToolStripStatusLabel();
            this.group_rozwiaz = new System.Windows.Forms.GroupBox();
            this.btn_rozwiaz = new System.Windows.Forms.Button();
            this.label6 = new System.Windows.Forms.Label();
            this.txt_przedmioty = new System.Windows.Forms.TextBox();
            this.label5 = new System.Windows.Forms.Label();
            this.txt_plecak = new System.Windows.Forms.TextBox();
            this.btn_posortuj = new System.Windows.Forms.Button();
            this.group_opcje.SuspendLayout();
            this.group_przedmioty.SuspendLayout();
            this.statusStrip1.SuspendLayout();
            this.group_rozwiaz.SuspendLayout();
            this.SuspendLayout();
            // 
            // group_opcje
            // 
            this.group_opcje.Controls.Add(this.btn_dodaj_przedmioty);
            this.group_opcje.Controls.Add(this.txt_ile_przedmiotow);
            this.group_opcje.Controls.Add(this.txt_rozmiar_plecaka);
            this.group_opcje.Controls.Add(this.label2);
            this.group_opcje.Controls.Add(this.label1);
            this.group_opcje.Controls.Add(this.radio_ciagly);
            this.group_opcje.Controls.Add(this.radio_dyskretny);
            this.group_opcje.Location = new System.Drawing.Point(12, 12);
            this.group_opcje.Name = "group_opcje";
            this.group_opcje.Size = new System.Drawing.Size(259, 107);
            this.group_opcje.TabIndex = 0;
            this.group_opcje.TabStop = false;
            this.group_opcje.Text = "Ustawienia";
            // 
            // btn_dodaj_przedmioty
            // 
            this.btn_dodaj_przedmioty.Anchor = ((System.Windows.Forms.AnchorStyles)(((System.Windows.Forms.AnchorStyles.Bottom | System.Windows.Forms.AnchorStyles.Left)
                        | System.Windows.Forms.AnchorStyles.Right)));
            this.btn_dodaj_przedmioty.Location = new System.Drawing.Point(6, 78);
            this.btn_dodaj_przedmioty.Name = "btn_dodaj_przedmioty";
            this.btn_dodaj_przedmioty.Size = new System.Drawing.Size(247, 23);
            this.btn_dodaj_przedmioty.TabIndex = 3;
            this.btn_dodaj_przedmioty.Text = "Dodaj przedmioty";
            this.btn_dodaj_przedmioty.UseVisualStyleBackColor = true;
            this.btn_dodaj_przedmioty.Click += new System.EventHandler(this.btn_dodaj_przedmioty_Click);
            // 
            // txt_ile_przedmiotow
            // 
            this.txt_ile_przedmiotow.Anchor = ((System.Windows.Forms.AnchorStyles)((System.Windows.Forms.AnchorStyles.Top | System.Windows.Forms.AnchorStyles.Right)));
            this.txt_ile_przedmiotow.Location = new System.Drawing.Point(181, 44);
            this.txt_ile_przedmiotow.Name = "txt_ile_przedmiotow";
            this.txt_ile_przedmiotow.Size = new System.Drawing.Size(72, 20);
            this.txt_ile_przedmiotow.TabIndex = 2;
            // 
            // txt_rozmiar_plecaka
            // 
            this.txt_rozmiar_plecaka.Anchor = ((System.Windows.Forms.AnchorStyles)((System.Windows.Forms.AnchorStyles.Top | System.Windows.Forms.AnchorStyles.Right)));
            this.txt_rozmiar_plecaka.Location = new System.Drawing.Point(181, 18);
            this.txt_rozmiar_plecaka.Name = "txt_rozmiar_plecaka";
            this.txt_rozmiar_plecaka.Size = new System.Drawing.Size(72, 20);
            this.txt_rozmiar_plecaka.TabIndex = 1;
            // 
            // label2
            // 
            this.label2.Anchor = ((System.Windows.Forms.AnchorStyles)((System.Windows.Forms.AnchorStyles.Top | System.Windows.Forms.AnchorStyles.Right)));
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(80, 47);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(91, 13);
            this.label2.TabIndex = 0;
            this.label2.Text = "Ilość przedmiotów";
            // 
            // label1
            // 
            this.label1.Anchor = ((System.Windows.Forms.AnchorStyles)((System.Windows.Forms.AnchorStyles.Top | System.Windows.Forms.AnchorStyles.Right)));
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(80, 21);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(86, 13);
            this.label1.TabIndex = 0;
            this.label1.Text = "Rozmiar plecaka";
            // 
            // radio_ciagly
            // 
            this.radio_ciagly.AutoSize = true;
            this.radio_ciagly.Checked = true;
            this.radio_ciagly.Location = new System.Drawing.Point(6, 45);
            this.radio_ciagly.Name = "radio_ciagly";
            this.radio_ciagly.Size = new System.Drawing.Size(55, 17);
            this.radio_ciagly.TabIndex = 0;
            this.radio_ciagly.TabStop = true;
            this.radio_ciagly.Text = "Ciągły";
            this.radio_ciagly.UseVisualStyleBackColor = true;
            // 
            // radio_dyskretny
            // 
            this.radio_dyskretny.AutoSize = true;
            this.radio_dyskretny.Location = new System.Drawing.Point(6, 19);
            this.radio_dyskretny.Name = "radio_dyskretny";
            this.radio_dyskretny.Size = new System.Drawing.Size(72, 17);
            this.radio_dyskretny.TabIndex = 0;
            this.radio_dyskretny.Text = "Dyskretny";
            this.radio_dyskretny.UseVisualStyleBackColor = true;
            // 
            // group_przedmioty
            // 
            this.group_przedmioty.Controls.Add(this.btn_dodaj_przedmiot);
            this.group_przedmioty.Controls.Add(this.txt_przedmiot_cena);
            this.group_przedmioty.Controls.Add(this.label4);
            this.group_przedmioty.Controls.Add(this.txt_przedmiot_ilosc);
            this.group_przedmioty.Controls.Add(this.label3);
            this.group_przedmioty.Enabled = false;
            this.group_przedmioty.Location = new System.Drawing.Point(12, 125);
            this.group_przedmioty.Name = "group_przedmioty";
            this.group_przedmioty.Size = new System.Drawing.Size(259, 79);
            this.group_przedmioty.TabIndex = 1;
            this.group_przedmioty.TabStop = false;
            this.group_przedmioty.Text = "Nowy przedmiot";
            // 
            // btn_dodaj_przedmiot
            // 
            this.btn_dodaj_przedmiot.Anchor = ((System.Windows.Forms.AnchorStyles)(((System.Windows.Forms.AnchorStyles.Top | System.Windows.Forms.AnchorStyles.Bottom)
                        | System.Windows.Forms.AnchorStyles.Right)));
            this.btn_dodaj_przedmiot.Location = new System.Drawing.Point(181, 19);
            this.btn_dodaj_przedmiot.Name = "btn_dodaj_przedmiot";
            this.btn_dodaj_przedmiot.Size = new System.Drawing.Size(72, 46);
            this.btn_dodaj_przedmiot.TabIndex = 3;
            this.btn_dodaj_przedmiot.Text = "Dodaj przedmiot";
            this.btn_dodaj_przedmiot.UseVisualStyleBackColor = true;
            this.btn_dodaj_przedmiot.Click += new System.EventHandler(this.btn_dodaj_przedmiot_Click);
            // 
            // txt_przedmiot_cena
            // 
            this.txt_przedmiot_cena.Location = new System.Drawing.Point(57, 45);
            this.txt_przedmiot_cena.Name = "txt_przedmiot_cena";
            this.txt_przedmiot_cena.Size = new System.Drawing.Size(70, 20);
            this.txt_przedmiot_cena.TabIndex = 2;
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(6, 48);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(32, 13);
            this.label4.TabIndex = 0;
            this.label4.Text = "Cena";
            // 
            // txt_przedmiot_ilosc
            // 
            this.txt_przedmiot_ilosc.Location = new System.Drawing.Point(57, 19);
            this.txt_przedmiot_ilosc.Name = "txt_przedmiot_ilosc";
            this.txt_przedmiot_ilosc.Size = new System.Drawing.Size(70, 20);
            this.txt_przedmiot_ilosc.TabIndex = 1;
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(6, 22);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(29, 13);
            this.label3.TabIndex = 0;
            this.label3.Text = "Ilość";
            // 
            // statusStrip1
            // 
            this.statusStrip1.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.toolStripStatusLabel1});
            this.statusStrip1.Location = new System.Drawing.Point(0, 285);
            this.statusStrip1.Name = "statusStrip1";
            this.statusStrip1.Size = new System.Drawing.Size(616, 22);
            this.statusStrip1.TabIndex = 2;
            this.statusStrip1.Text = "statusStrip1";
            // 
            // toolStripStatusLabel1
            // 
            this.toolStripStatusLabel1.Name = "toolStripStatusLabel1";
            this.toolStripStatusLabel1.Size = new System.Drawing.Size(0, 17);
            // 
            // group_rozwiaz
            // 
            this.group_rozwiaz.Anchor = ((System.Windows.Forms.AnchorStyles)((((System.Windows.Forms.AnchorStyles.Top | System.Windows.Forms.AnchorStyles.Bottom)
                        | System.Windows.Forms.AnchorStyles.Left)
                        | System.Windows.Forms.AnchorStyles.Right)));
            this.group_rozwiaz.Controls.Add(this.btn_posortuj);
            this.group_rozwiaz.Controls.Add(this.btn_rozwiaz);
            this.group_rozwiaz.Controls.Add(this.label6);
            this.group_rozwiaz.Controls.Add(this.txt_przedmioty);
            this.group_rozwiaz.Controls.Add(this.label5);
            this.group_rozwiaz.Controls.Add(this.txt_plecak);
            this.group_rozwiaz.Enabled = false;
            this.group_rozwiaz.Location = new System.Drawing.Point(277, 12);
            this.group_rozwiaz.Name = "group_rozwiaz";
            this.group_rozwiaz.Size = new System.Drawing.Size(327, 260);
            this.group_rozwiaz.TabIndex = 3;
            this.group_rozwiaz.TabStop = false;
            this.group_rozwiaz.Text = "Rozwiąż";
            // 
            // btn_rozwiaz
            // 
            this.btn_rozwiaz.Location = new System.Drawing.Point(6, 213);
            this.btn_rozwiaz.Name = "btn_rozwiaz";
            this.btn_rozwiaz.Size = new System.Drawing.Size(101, 41);
            this.btn_rozwiaz.TabIndex = 4;
            this.btn_rozwiaz.Text = "Rozwiąż";
            this.btn_rozwiaz.UseVisualStyleBackColor = true;
            this.btn_rozwiaz.Click += new System.EventHandler(this.btn_rozwiaz_Click);
            // 
            // label6
            // 
            this.label6.AutoSize = true;
            this.label6.Location = new System.Drawing.Point(6, 16);
            this.label6.Name = "label6";
            this.label6.Size = new System.Drawing.Size(58, 13);
            this.label6.TabIndex = 3;
            this.label6.Text = "Przedmioty";
            // 
            // txt_przedmioty
            // 
            this.txt_przedmioty.Enabled = false;
            this.txt_przedmioty.Location = new System.Drawing.Point(8, 32);
            this.txt_przedmioty.Multiline = true;
            this.txt_przedmioty.Name = "txt_przedmioty";
            this.txt_przedmioty.Size = new System.Drawing.Size(148, 175);
            this.txt_przedmioty.TabIndex = 2;
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Location = new System.Drawing.Point(219, 16);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(40, 13);
            this.label5.TabIndex = 1;
            this.label5.Text = "Plecak";
            // 
            // txt_plecak
            // 
            this.txt_plecak.Enabled = false;
            this.txt_plecak.Location = new System.Drawing.Point(162, 32);
            this.txt_plecak.Multiline = true;
            this.txt_plecak.Name = "txt_plecak";
            this.txt_plecak.Size = new System.Drawing.Size(159, 175);
            this.txt_plecak.TabIndex = 0;
            // 
            // btn_posortuj
            // 
            this.btn_posortuj.Location = new System.Drawing.Point(220, 213);
            this.btn_posortuj.Name = "btn_posortuj";
            this.btn_posortuj.Size = new System.Drawing.Size(101, 41);
            this.btn_posortuj.TabIndex = 5;
            this.btn_posortuj.Text = "Posortuj listy";
            this.btn_posortuj.UseVisualStyleBackColor = true;
            this.btn_posortuj.Click += new System.EventHandler(this.btn_posortuj_Click);
            // 
            // ProblemPlecakowy
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(616, 307);
            this.Controls.Add(this.group_rozwiaz);
            this.Controls.Add(this.statusStrip1);
            this.Controls.Add(this.group_przedmioty);
            this.Controls.Add(this.group_opcje);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedSingle;
            this.MaximizeBox = false;
            this.MinimizeBox = false;
            this.Name = "ProblemPlecakowy";
            this.Text = "Problem plecakowy";
            this.group_opcje.ResumeLayout(false);
            this.group_opcje.PerformLayout();
            this.group_przedmioty.ResumeLayout(false);
            this.group_przedmioty.PerformLayout();
            this.statusStrip1.ResumeLayout(false);
            this.statusStrip1.PerformLayout();
            this.group_rozwiaz.ResumeLayout(false);
            this.group_rozwiaz.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.GroupBox group_opcje;
        private System.Windows.Forms.TextBox txt_rozmiar_plecaka;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.RadioButton radio_ciagly;
        private System.Windows.Forms.RadioButton radio_dyskretny;
        private System.Windows.Forms.TextBox txt_ile_przedmiotow;
        private System.Windows.Forms.GroupBox group_przedmioty;
        private System.Windows.Forms.Button btn_dodaj_przedmioty;
        private System.Windows.Forms.Button btn_dodaj_przedmiot;
        private System.Windows.Forms.TextBox txt_przedmiot_cena;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.TextBox txt_przedmiot_ilosc;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.StatusStrip statusStrip1;
        private System.Windows.Forms.ToolStripStatusLabel toolStripStatusLabel1;
        private System.Windows.Forms.GroupBox group_rozwiaz;
        private System.Windows.Forms.TextBox txt_plecak;
        private System.Windows.Forms.Label label6;
        private System.Windows.Forms.TextBox txt_przedmioty;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.Button btn_rozwiaz;
        private System.Windows.Forms.Button btn_posortuj;

    }
}

