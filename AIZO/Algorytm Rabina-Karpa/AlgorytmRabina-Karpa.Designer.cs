namespace Algorytm_Rabina_Karpa
{
    partial class Form1
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
            this.label1 = new System.Windows.Forms.Label();
            this.txt_tekst = new System.Windows.Forms.TextBox();
            this.txt_wzozec = new System.Windows.Forms.TextBox();
            this.label2 = new System.Windows.Forms.Label();
            this.btn_szukaj = new System.Windows.Forms.Button();
            this.txt_wynik = new System.Windows.Forms.TextBox();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(12, 15);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(34, 13);
            this.label1.TabIndex = 0;
            this.label1.Text = "Tekst";
            // 
            // txt_tekst
            // 
            this.txt_tekst.Location = new System.Drawing.Point(67, 12);
            this.txt_tekst.Name = "txt_tekst";
            this.txt_tekst.Size = new System.Drawing.Size(205, 20);
            this.txt_tekst.TabIndex = 1;
            this.txt_tekst.WordWrap = false;
            // 
            // txt_wzozec
            // 
            this.txt_wzozec.Location = new System.Drawing.Point(67, 38);
            this.txt_wzozec.Name = "txt_wzozec";
            this.txt_wzozec.Size = new System.Drawing.Size(205, 20);
            this.txt_wzozec.TabIndex = 3;
            this.txt_wzozec.WordWrap = false;
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(12, 41);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(49, 13);
            this.label2.TabIndex = 2;
            this.label2.Text = "Wzorzec";
            // 
            // btn_szukaj
            // 
            this.btn_szukaj.Location = new System.Drawing.Point(67, 64);
            this.btn_szukaj.Name = "btn_szukaj";
            this.btn_szukaj.Size = new System.Drawing.Size(75, 23);
            this.btn_szukaj.TabIndex = 4;
            this.btn_szukaj.Text = "Szukaj";
            this.btn_szukaj.UseVisualStyleBackColor = true;
            this.btn_szukaj.Click += new System.EventHandler(this.btn_szukaj_Click);
            // 
            // txt_wynik
            // 
            this.txt_wynik.Font = new System.Drawing.Font("Consolas", 8.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(238)));
            this.txt_wynik.Location = new System.Drawing.Point(12, 93);
            this.txt_wynik.Multiline = true;
            this.txt_wynik.Name = "txt_wynik";
            this.txt_wynik.ScrollBars = System.Windows.Forms.ScrollBars.Horizontal;
            this.txt_wynik.Size = new System.Drawing.Size(260, 106);
            this.txt_wynik.TabIndex = 5;
            this.txt_wynik.WordWrap = false;
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(284, 211);
            this.Controls.Add(this.txt_wynik);
            this.Controls.Add(this.btn_szukaj);
            this.Controls.Add(this.txt_wzozec);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.txt_tekst);
            this.Controls.Add(this.label1);
            this.Name = "Form1";
            this.Text = "Algorytm Rabina-Karpa";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.TextBox txt_tekst;
        private System.Windows.Forms.TextBox txt_wzozec;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Button btn_szukaj;
        private System.Windows.Forms.TextBox txt_wynik;
    }
}

