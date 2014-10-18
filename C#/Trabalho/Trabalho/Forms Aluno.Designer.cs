namespace Trabalho
{
    partial class Forms_Aluno
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
            this.label8 = new System.Windows.Forms.Label();
            this.label9 = new System.Windows.Forms.Label();
            this.label10 = new System.Windows.Forms.Label();
            this.label11 = new System.Windows.Forms.Label();
            this.label12 = new System.Windows.Forms.Label();
            this.txtNome1 = new System.Windows.Forms.TextBox();
            this.txtCPF1 = new System.Windows.Forms.TextBox();
            this.txtRG1 = new System.Windows.Forms.TextBox();
            this.txtRM1 = new System.Windows.Forms.TextBox();
            this.data_nascimento1 = new System.Windows.Forms.DateTimePicker();
            this.button1 = new System.Windows.Forms.Button();
            this.button2 = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // label8
            // 
            this.label8.AutoSize = true;
            this.label8.Location = new System.Drawing.Point(336, 77);
            this.label8.Name = "label8";
            this.label8.Size = new System.Drawing.Size(27, 13);
            this.label8.TabIndex = 1;
            this.label8.Text = "CPF";
            // 
            // label9
            // 
            this.label9.AutoSize = true;
            this.label9.Location = new System.Drawing.Point(336, 30);
            this.label9.Name = "label9";
            this.label9.Size = new System.Drawing.Size(63, 13);
            this.label9.TabIndex = 2;
            this.label9.Text = "Nascimento";
            // 
            // label10
            // 
            this.label10.AutoSize = true;
            this.label10.Location = new System.Drawing.Point(41, 77);
            this.label10.Name = "label10";
            this.label10.Size = new System.Drawing.Size(28, 13);
            this.label10.TabIndex = 3;
            this.label10.Text = "RM*";
            // 
            // label11
            // 
            this.label11.AutoSize = true;
            this.label11.Location = new System.Drawing.Point(41, 30);
            this.label11.Name = "label11";
            this.label11.Size = new System.Drawing.Size(39, 13);
            this.label11.TabIndex = 4;
            this.label11.Text = "Nome*";
            // 
            // label12
            // 
            this.label12.AutoSize = true;
            this.label12.Location = new System.Drawing.Point(41, 133);
            this.label12.Name = "label12";
            this.label12.Size = new System.Drawing.Size(27, 13);
            this.label12.TabIndex = 5;
            this.label12.Text = "RG*";
            // 
            // txtNome1
            // 
            this.txtNome1.Location = new System.Drawing.Point(86, 27);
            this.txtNome1.Name = "txtNome1";
            this.txtNome1.Size = new System.Drawing.Size(146, 20);
            this.txtNome1.TabIndex = 6;
            // 
            // txtCPF1
            // 
            this.txtCPF1.Location = new System.Drawing.Point(401, 70);
            this.txtCPF1.Name = "txtCPF1";
            this.txtCPF1.Size = new System.Drawing.Size(115, 20);
            this.txtCPF1.TabIndex = 8;
            // 
            // txtRG1
            // 
            this.txtRG1.Location = new System.Drawing.Point(86, 133);
            this.txtRG1.Name = "txtRG1";
            this.txtRG1.Size = new System.Drawing.Size(146, 20);
            this.txtRG1.TabIndex = 9;
            // 
            // txtRM1
            // 
            this.txtRM1.Location = new System.Drawing.Point(86, 74);
            this.txtRM1.Name = "txtRM1";
            this.txtRM1.Size = new System.Drawing.Size(146, 20);
            this.txtRM1.TabIndex = 10;
            // 
            // data_nascimento1
            // 
            this.data_nascimento1.Format = System.Windows.Forms.DateTimePickerFormat.Short;
            this.data_nascimento1.Location = new System.Drawing.Point(401, 27);
            this.data_nascimento1.Name = "data_nascimento1";
            this.data_nascimento1.Size = new System.Drawing.Size(115, 20);
            this.data_nascimento1.TabIndex = 11;
            // 
            // button1
            // 
            this.button1.Location = new System.Drawing.Point(339, 133);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(75, 23);
            this.button1.TabIndex = 12;
            this.button1.Text = "Cadastrar";
            this.button1.UseVisualStyleBackColor = true;
            this.button1.Click += new System.EventHandler(this.button1_Click_1);
            // 
            // button2
            // 
            this.button2.Location = new System.Drawing.Point(452, 131);
            this.button2.Name = "button2";
            this.button2.Size = new System.Drawing.Size(75, 23);
            this.button2.TabIndex = 13;
            this.button2.Text = "Sair";
            this.button2.UseVisualStyleBackColor = true;
            this.button2.Click += new System.EventHandler(this.button2_Click_1);
            // 
            // Forms_Aluno
            // 
            this.ClientSize = new System.Drawing.Size(573, 183);
            this.Controls.Add(this.button2);
            this.Controls.Add(this.button1);
            this.Controls.Add(this.data_nascimento1);
            this.Controls.Add(this.txtRM1);
            this.Controls.Add(this.txtRG1);
            this.Controls.Add(this.txtCPF1);
            this.Controls.Add(this.txtNome1);
            this.Controls.Add(this.label12);
            this.Controls.Add(this.label11);
            this.Controls.Add(this.label10);
            this.Controls.Add(this.label9);
            this.Controls.Add(this.label8);
            this.Name = "Forms_Aluno";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.TextBox txtCPF;
        private System.Windows.Forms.TextBox txtRG;
        private System.Windows.Forms.TextBox txtRM;
        private System.Windows.Forms.TextBox txtNome;
        private System.Windows.Forms.Button btCadastrar;
        private System.Windows.Forms.Button btSair;
        private System.Windows.Forms.DateTimePicker dataNascimento;
        private System.Windows.Forms.Label label6;
        private System.Windows.Forms.Label label8;
        private System.Windows.Forms.Label label9;
        private System.Windows.Forms.Label label10;
        private System.Windows.Forms.Label label11;
        private System.Windows.Forms.Label label12;
        private System.Windows.Forms.TextBox txtNome1;
        private System.Windows.Forms.TextBox txtCPF1;
        private System.Windows.Forms.TextBox txtRG1;
        private System.Windows.Forms.TextBox txtRM1;
        private System.Windows.Forms.DateTimePicker data_nascimento1;
        private System.Windows.Forms.Button button1;
        private System.Windows.Forms.Button button2;
    }
}