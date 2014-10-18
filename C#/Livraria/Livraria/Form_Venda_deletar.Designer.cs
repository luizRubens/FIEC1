namespace Livraria
{
    partial class Form_Venda_deletar
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
            this.radioFuncionario = new System.Windows.Forms.RadioButton();
            this.label1 = new System.Windows.Forms.Label();
            this.radioCliente = new System.Windows.Forms.RadioButton();
            this.txtpesquisa = new System.Windows.Forms.TextBox();
            this.btnSair = new System.Windows.Forms.Button();
            this.btnDeletar = new System.Windows.Forms.Button();
            this.tabela_venda = new System.Windows.Forms.DataGridView();
            this.radioLivro = new System.Windows.Forms.RadioButton();
            ((System.ComponentModel.ISupportInitialize)(this.tabela_venda)).BeginInit();
            this.SuspendLayout();
            // 
            // radioFuncionario
            // 
            this.radioFuncionario.AutoSize = true;
            this.radioFuncionario.Location = new System.Drawing.Point(37, 72);
            this.radioFuncionario.Name = "radioFuncionario";
            this.radioFuncionario.Size = new System.Drawing.Size(102, 23);
            this.radioFuncionario.TabIndex = 0;
            this.radioFuncionario.TabStop = true;
            this.radioFuncionario.Text = "Funcionario";
            this.radioFuncionario.UseVisualStyleBackColor = true;
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(33, 36);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(82, 19);
            this.label1.TabIndex = 1;
            this.label1.Text = "Buscar por:";
            // 
            // radioCliente
            // 
            this.radioCliente.AutoSize = true;
            this.radioCliente.Location = new System.Drawing.Point(163, 72);
            this.radioCliente.Name = "radioCliente";
            this.radioCliente.Size = new System.Drawing.Size(73, 23);
            this.radioCliente.TabIndex = 3;
            this.radioCliente.TabStop = true;
            this.radioCliente.Text = "Cliente";
            this.radioCliente.UseVisualStyleBackColor = true;
            // 
            // txtpesquisa
            // 
            this.txtpesquisa.Location = new System.Drawing.Point(37, 101);
            this.txtpesquisa.Name = "txtpesquisa";
            this.txtpesquisa.Size = new System.Drawing.Size(302, 27);
            this.txtpesquisa.TabIndex = 1;
            this.txtpesquisa.TextChanged += new System.EventHandler(this.txtpesquisa_TextChanged);
            // 
            // btnSair
            // 
            this.btnSair.Location = new System.Drawing.Point(393, 467);
            this.btnSair.Name = "btnSair";
            this.btnSair.Size = new System.Drawing.Size(75, 27);
            this.btnSair.TabIndex = 3;
            this.btnSair.Text = "Sair";
            this.btnSair.UseVisualStyleBackColor = true;
            this.btnSair.Click += new System.EventHandler(this.btnSair_Click);
            // 
            // btnDeletar
            // 
            this.btnDeletar.Location = new System.Drawing.Point(248, 467);
            this.btnDeletar.Name = "btnDeletar";
            this.btnDeletar.Size = new System.Drawing.Size(87, 27);
            this.btnDeletar.TabIndex = 2;
            this.btnDeletar.Text = "Deletar";
            this.btnDeletar.UseVisualStyleBackColor = true;
            this.btnDeletar.Click += new System.EventHandler(this.btnDeletar_Click);
            // 
            // tabela_venda
            // 
            this.tabela_venda.AllowUserToAddRows = false;
            this.tabela_venda.AllowUserToDeleteRows = false;
            this.tabela_venda.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.tabela_venda.Location = new System.Drawing.Point(37, 148);
            this.tabela_venda.Name = "tabela_venda";
            this.tabela_venda.ReadOnly = true;
            this.tabela_venda.Size = new System.Drawing.Size(662, 306);
            this.tabela_venda.TabIndex = 8;
            // 
            // radioLivro
            // 
            this.radioLivro.AutoSize = true;
            this.radioLivro.Location = new System.Drawing.Point(266, 72);
            this.radioLivro.Name = "radioLivro";
            this.radioLivro.Size = new System.Drawing.Size(58, 23);
            this.radioLivro.TabIndex = 9;
            this.radioLivro.TabStop = true;
            this.radioLivro.Text = "Livro";
            this.radioLivro.UseVisualStyleBackColor = true;
            // 
            // Form_Venda_deletar
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 19F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.White;
            this.ClientSize = new System.Drawing.Size(737, 508);
            this.Controls.Add(this.radioLivro);
            this.Controls.Add(this.tabela_venda);
            this.Controls.Add(this.btnDeletar);
            this.Controls.Add(this.btnSair);
            this.Controls.Add(this.txtpesquisa);
            this.Controls.Add(this.radioCliente);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.radioFuncionario);
            this.Font = new System.Drawing.Font("Calibri", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.Margin = new System.Windows.Forms.Padding(4);
            this.MaximizeBox = false;
            this.Name = "Form_Venda_deletar";
            this.Text = "Deletar Venda";
            this.Load += new System.EventHandler(this.Form_Venda_deletar_Load);
            ((System.ComponentModel.ISupportInitialize)(this.tabela_venda)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.RadioButton radioFuncionario;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.RadioButton radioCliente;
        private System.Windows.Forms.TextBox txtpesquisa;
        private System.Windows.Forms.Button btnSair;
        private System.Windows.Forms.Button btnDeletar;
        private System.Windows.Forms.DataGridView tabela_venda;
        private System.Windows.Forms.RadioButton radioLivro;
    }
}