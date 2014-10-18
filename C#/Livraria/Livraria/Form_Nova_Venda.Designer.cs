namespace Livraria
{
    partial class Form_Nova_Venda
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
            this.components = new System.ComponentModel.Container();
            this.label1 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.label4 = new System.Windows.Forms.Label();
            this.date_Compra = new System.Windows.Forms.DateTimePicker();
            this.txtValor_total = new System.Windows.Forms.TextBox();
            this.label5 = new System.Windows.Forms.Label();
            this.btnEfetuar_compra = new System.Windows.Forms.Button();
            this.btnSair = new System.Windows.Forms.Button();
            this.txtBusca_Cliente = new System.Windows.Forms.TextBox();
            this.label6 = new System.Windows.Forms.Label();
            this.txtBusca_Livro = new System.Windows.Forms.TextBox();
            this.label7 = new System.Windows.Forms.Label();
            this.txtBusca_funcionario = new System.Windows.Forms.TextBox();
            this.label8 = new System.Windows.Forms.Label();
            this.tabela_Cliente = new System.Windows.Forms.DataGridView();
            this.codclienteDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.nomeDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.clienteBindingSource = new System.Windows.Forms.BindingSource(this.components);
            this.livrariaDataSet2 = new Livraria.livrariaDataSet2();
            this.tabela_Livro = new System.Windows.Forms.DataGridView();
            this.codlivroDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.tituloDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.preco_venda = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.livroBindingSource = new System.Windows.Forms.BindingSource(this.components);
            this.tabela_Funcionario = new System.Windows.Forms.DataGridView();
            this.codfuncionarioDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.nomeDataGridViewTextBoxColumn1 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.funcionarioBindingSource = new System.Windows.Forms.BindingSource(this.components);
            this.clienteTableAdapter = new Livraria.livrariaDataSet2TableAdapters.clienteTableAdapter();
            this.livroTableAdapter = new Livraria.livrariaDataSet2TableAdapters.livroTableAdapter();
            this.funcionarioTableAdapter = new Livraria.livrariaDataSet2TableAdapters.funcionarioTableAdapter();
            this.txtCod_Livro = new System.Windows.Forms.TextBox();
            this.txtCod_Cliente = new System.Windows.Forms.TextBox();
            this.txtCOD_Funcionario = new System.Windows.Forms.TextBox();
            this.txtCliente = new System.Windows.Forms.TextBox();
            this.label9 = new System.Windows.Forms.Label();
            this.txtLivro = new System.Windows.Forms.TextBox();
            this.label11 = new System.Windows.Forms.Label();
            ((System.ComponentModel.ISupportInitialize)(this.tabela_Cliente)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.clienteBindingSource)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.livrariaDataSet2)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.tabela_Livro)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.livroBindingSource)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.tabela_Funcionario)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.funcionarioBindingSource)).BeginInit();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Calibri", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(46, 34);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(55, 19);
            this.label1.TabIndex = 0;
            this.label1.Text = "Cliente";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Font = new System.Drawing.Font("Calibri", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label2.Location = new System.Drawing.Point(48, 257);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(84, 19);
            this.label2.TabIndex = 3;
            this.label2.Text = "Funcionário";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Font = new System.Drawing.Font("Calibri", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label3.Location = new System.Drawing.Point(338, 34);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(40, 19);
            this.label3.TabIndex = 5;
            this.label3.Text = "Livro";
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Font = new System.Drawing.Font("Calibri", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label4.Location = new System.Drawing.Point(342, 336);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(112, 19);
            this.label4.TabIndex = 7;
            this.label4.Text = "Data da compra";
            // 
            // date_Compra
            // 
            this.date_Compra.Enabled = false;
            this.date_Compra.Font = new System.Drawing.Font("Calibri", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.date_Compra.Format = System.Windows.Forms.DateTimePickerFormat.Short;
            this.date_Compra.Location = new System.Drawing.Point(345, 357);
            this.date_Compra.Name = "date_Compra";
            this.date_Compra.Size = new System.Drawing.Size(210, 27);
            this.date_Compra.TabIndex = 8;
            // 
            // txtValor_total
            // 
            this.txtValor_total.Enabled = false;
            this.txtValor_total.Font = new System.Drawing.Font("Calibri", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txtValor_total.Location = new System.Drawing.Point(345, 415);
            this.txtValor_total.Name = "txtValor_total";
            this.txtValor_total.Size = new System.Drawing.Size(210, 27);
            this.txtValor_total.TabIndex = 10;
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Font = new System.Drawing.Font("Calibri", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label5.Location = new System.Drawing.Point(342, 393);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(42, 19);
            this.label5.TabIndex = 9;
            this.label5.Text = "Valor";
            // 
            // btnEfetuar_compra
            // 
            this.btnEfetuar_compra.Font = new System.Drawing.Font("Calibri", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnEfetuar_compra.Location = new System.Drawing.Point(189, 493);
            this.btnEfetuar_compra.Name = "btnEfetuar_compra";
            this.btnEfetuar_compra.Size = new System.Drawing.Size(121, 32);
            this.btnEfetuar_compra.TabIndex = 4;
            this.btnEfetuar_compra.Text = "Efetuar Compra";
            this.btnEfetuar_compra.UseVisualStyleBackColor = true;
            this.btnEfetuar_compra.Click += new System.EventHandler(this.btnEfetuar_compra_Click);
            // 
            // btnSair
            // 
            this.btnSair.Font = new System.Drawing.Font("Calibri", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnSair.Location = new System.Drawing.Point(337, 493);
            this.btnSair.Name = "btnSair";
            this.btnSair.Size = new System.Drawing.Size(101, 32);
            this.btnSair.TabIndex = 5;
            this.btnSair.Text = "Sair";
            this.btnSair.UseVisualStyleBackColor = true;
            this.btnSair.Click += new System.EventHandler(this.btnSair_Click);
            // 
            // txtBusca_Cliente
            // 
            this.txtBusca_Cliente.Font = new System.Drawing.Font("Calibri", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txtBusca_Cliente.Location = new System.Drawing.Point(50, 81);
            this.txtBusca_Cliente.Name = "txtBusca_Cliente";
            this.txtBusca_Cliente.Size = new System.Drawing.Size(214, 27);
            this.txtBusca_Cliente.TabIndex = 1;
            this.txtBusca_Cliente.TextChanged += new System.EventHandler(this.txtBusca_Cliente_TextChanged);
            // 
            // label6
            // 
            this.label6.AutoSize = true;
            this.label6.Font = new System.Drawing.Font("Calibri", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label6.Location = new System.Drawing.Point(47, 59);
            this.label6.Name = "label6";
            this.label6.Size = new System.Drawing.Size(118, 19);
            this.label6.TabIndex = 18;
            this.label6.Text = "Buscar por nome";
            // 
            // txtBusca_Livro
            // 
            this.txtBusca_Livro.Font = new System.Drawing.Font("Calibri", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txtBusca_Livro.Location = new System.Drawing.Point(342, 81);
            this.txtBusca_Livro.Name = "txtBusca_Livro";
            this.txtBusca_Livro.Size = new System.Drawing.Size(213, 27);
            this.txtBusca_Livro.TabIndex = 2;
            this.txtBusca_Livro.TextChanged += new System.EventHandler(this.txtBusca_Livro_TextChanged);
            // 
            // label7
            // 
            this.label7.AutoSize = true;
            this.label7.Font = new System.Drawing.Font("Calibri", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label7.Location = new System.Drawing.Point(339, 59);
            this.label7.Name = "label7";
            this.label7.Size = new System.Drawing.Size(116, 19);
            this.label7.TabIndex = 23;
            this.label7.Text = "Buscar por título";
            // 
            // txtBusca_funcionario
            // 
            this.txtBusca_funcionario.Font = new System.Drawing.Font("Calibri", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txtBusca_funcionario.Location = new System.Drawing.Point(51, 304);
            this.txtBusca_funcionario.Name = "txtBusca_funcionario";
            this.txtBusca_funcionario.Size = new System.Drawing.Size(213, 27);
            this.txtBusca_funcionario.TabIndex = 3;
            this.txtBusca_funcionario.TextChanged += new System.EventHandler(this.txtBusca_funcionario_TextChanged);
            // 
            // label8
            // 
            this.label8.AutoSize = true;
            this.label8.Font = new System.Drawing.Font("Calibri", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label8.Location = new System.Drawing.Point(48, 282);
            this.label8.Name = "label8";
            this.label8.Size = new System.Drawing.Size(118, 19);
            this.label8.TabIndex = 26;
            this.label8.Text = "Buscar por nome";
            // 
            // tabela_Cliente
            // 
            this.tabela_Cliente.AllowUserToAddRows = false;
            this.tabela_Cliente.AllowUserToDeleteRows = false;
            this.tabela_Cliente.AutoGenerateColumns = false;
            this.tabela_Cliente.BackgroundColor = System.Drawing.Color.White;
            this.tabela_Cliente.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.tabela_Cliente.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.codclienteDataGridViewTextBoxColumn,
            this.nomeDataGridViewTextBoxColumn});
            this.tabela_Cliente.DataSource = this.clienteBindingSource;
            this.tabela_Cliente.Location = new System.Drawing.Point(51, 115);
            this.tabela_Cliente.Name = "tabela_Cliente";
            this.tabela_Cliente.ReadOnly = true;
            this.tabela_Cliente.Size = new System.Drawing.Size(214, 104);
            this.tabela_Cliente.TabIndex = 29;
            this.tabela_Cliente.CellClick += new System.Windows.Forms.DataGridViewCellEventHandler(this.tabela_Cliente_CellClick);
            // 
            // codclienteDataGridViewTextBoxColumn
            // 
            this.codclienteDataGridViewTextBoxColumn.DataPropertyName = "cod_cliente";
            this.codclienteDataGridViewTextBoxColumn.HeaderText = "Codigo";
            this.codclienteDataGridViewTextBoxColumn.Name = "codclienteDataGridViewTextBoxColumn";
            this.codclienteDataGridViewTextBoxColumn.ReadOnly = true;
            // 
            // nomeDataGridViewTextBoxColumn
            // 
            this.nomeDataGridViewTextBoxColumn.DataPropertyName = "nome";
            this.nomeDataGridViewTextBoxColumn.HeaderText = "Nome";
            this.nomeDataGridViewTextBoxColumn.Name = "nomeDataGridViewTextBoxColumn";
            this.nomeDataGridViewTextBoxColumn.ReadOnly = true;
            // 
            // clienteBindingSource
            // 
            this.clienteBindingSource.DataMember = "cliente";
            this.clienteBindingSource.DataSource = this.livrariaDataSet2;
            // 
            // livrariaDataSet2
            // 
            this.livrariaDataSet2.DataSetName = "livrariaDataSet2";
            this.livrariaDataSet2.SchemaSerializationMode = System.Data.SchemaSerializationMode.IncludeSchema;
            // 
            // tabela_Livro
            // 
            this.tabela_Livro.AllowUserToAddRows = false;
            this.tabela_Livro.AllowUserToDeleteRows = false;
            this.tabela_Livro.AutoGenerateColumns = false;
            this.tabela_Livro.BackgroundColor = System.Drawing.Color.White;
            this.tabela_Livro.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.tabela_Livro.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.codlivroDataGridViewTextBoxColumn,
            this.tituloDataGridViewTextBoxColumn,
            this.preco_venda});
            this.tabela_Livro.DataSource = this.livroBindingSource;
            this.tabela_Livro.Location = new System.Drawing.Point(341, 115);
            this.tabela_Livro.Name = "tabela_Livro";
            this.tabela_Livro.ReadOnly = true;
            this.tabela_Livro.Size = new System.Drawing.Size(214, 104);
            this.tabela_Livro.TabIndex = 30;
            this.tabela_Livro.CellClick += new System.Windows.Forms.DataGridViewCellEventHandler(this.tabela_Livro_CellClick);
            // 
            // codlivroDataGridViewTextBoxColumn
            // 
            this.codlivroDataGridViewTextBoxColumn.DataPropertyName = "cod_livro";
            this.codlivroDataGridViewTextBoxColumn.HeaderText = "Codigo";
            this.codlivroDataGridViewTextBoxColumn.Name = "codlivroDataGridViewTextBoxColumn";
            this.codlivroDataGridViewTextBoxColumn.ReadOnly = true;
            // 
            // tituloDataGridViewTextBoxColumn
            // 
            this.tituloDataGridViewTextBoxColumn.DataPropertyName = "titulo";
            this.tituloDataGridViewTextBoxColumn.HeaderText = "Título";
            this.tituloDataGridViewTextBoxColumn.Name = "tituloDataGridViewTextBoxColumn";
            this.tituloDataGridViewTextBoxColumn.ReadOnly = true;
            // 
            // preco_venda
            // 
            this.preco_venda.DataPropertyName = "preco_venda";
            this.preco_venda.HeaderText = "Preço_Venda";
            this.preco_venda.Name = "preco_venda";
            this.preco_venda.ReadOnly = true;
            // 
            // livroBindingSource
            // 
            this.livroBindingSource.DataMember = "livro";
            this.livroBindingSource.DataSource = this.livrariaDataSet2;
            // 
            // tabela_Funcionario
            // 
            this.tabela_Funcionario.AllowUserToAddRows = false;
            this.tabela_Funcionario.AllowUserToDeleteRows = false;
            this.tabela_Funcionario.AutoGenerateColumns = false;
            this.tabela_Funcionario.BackgroundColor = System.Drawing.Color.White;
            this.tabela_Funcionario.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.tabela_Funcionario.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.codfuncionarioDataGridViewTextBoxColumn,
            this.nomeDataGridViewTextBoxColumn1});
            this.tabela_Funcionario.DataSource = this.funcionarioBindingSource;
            this.tabela_Funcionario.Location = new System.Drawing.Point(50, 337);
            this.tabela_Funcionario.Name = "tabela_Funcionario";
            this.tabela_Funcionario.ReadOnly = true;
            this.tabela_Funcionario.Size = new System.Drawing.Size(214, 104);
            this.tabela_Funcionario.TabIndex = 31;
            this.tabela_Funcionario.CellClick += new System.Windows.Forms.DataGridViewCellEventHandler(this.tabela_Funcionario_CellClick);
            // 
            // codfuncionarioDataGridViewTextBoxColumn
            // 
            this.codfuncionarioDataGridViewTextBoxColumn.DataPropertyName = "cod_funcionario";
            this.codfuncionarioDataGridViewTextBoxColumn.HeaderText = "Codigo";
            this.codfuncionarioDataGridViewTextBoxColumn.Name = "codfuncionarioDataGridViewTextBoxColumn";
            this.codfuncionarioDataGridViewTextBoxColumn.ReadOnly = true;
            // 
            // nomeDataGridViewTextBoxColumn1
            // 
            this.nomeDataGridViewTextBoxColumn1.DataPropertyName = "nome";
            this.nomeDataGridViewTextBoxColumn1.HeaderText = "Nome";
            this.nomeDataGridViewTextBoxColumn1.Name = "nomeDataGridViewTextBoxColumn1";
            this.nomeDataGridViewTextBoxColumn1.ReadOnly = true;
            // 
            // funcionarioBindingSource
            // 
            this.funcionarioBindingSource.DataMember = "funcionario";
            this.funcionarioBindingSource.DataSource = this.livrariaDataSet2;
            // 
            // clienteTableAdapter
            // 
            this.clienteTableAdapter.ClearBeforeFill = true;
            // 
            // livroTableAdapter
            // 
            this.livroTableAdapter.ClearBeforeFill = true;
            // 
            // funcionarioTableAdapter
            // 
            this.funcionarioTableAdapter.ClearBeforeFill = true;
            // 
            // txtCod_Livro
            // 
            this.txtCod_Livro.Enabled = false;
            this.txtCod_Livro.Location = new System.Drawing.Point(13, 448);
            this.txtCod_Livro.Name = "txtCod_Livro";
            this.txtCod_Livro.Size = new System.Drawing.Size(26, 20);
            this.txtCod_Livro.TabIndex = 34;
            this.txtCod_Livro.Visible = false;
            // 
            // txtCod_Cliente
            // 
            this.txtCod_Cliente.Enabled = false;
            this.txtCod_Cliente.Location = new System.Drawing.Point(12, 422);
            this.txtCod_Cliente.Name = "txtCod_Cliente";
            this.txtCod_Cliente.Size = new System.Drawing.Size(26, 20);
            this.txtCod_Cliente.TabIndex = 35;
            this.txtCod_Cliente.Visible = false;
            // 
            // txtCOD_Funcionario
            // 
            this.txtCOD_Funcionario.Enabled = false;
            this.txtCOD_Funcionario.Location = new System.Drawing.Point(13, 474);
            this.txtCOD_Funcionario.Name = "txtCOD_Funcionario";
            this.txtCOD_Funcionario.Size = new System.Drawing.Size(26, 20);
            this.txtCOD_Funcionario.TabIndex = 37;
            this.txtCOD_Funcionario.Visible = false;
            // 
            // txtCliente
            // 
            this.txtCliente.Enabled = false;
            this.txtCliente.Font = new System.Drawing.Font("Calibri", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txtCliente.Location = new System.Drawing.Point(342, 255);
            this.txtCliente.Name = "txtCliente";
            this.txtCliente.Size = new System.Drawing.Size(213, 27);
            this.txtCliente.TabIndex = 40;
            // 
            // label9
            // 
            this.label9.AutoSize = true;
            this.label9.Font = new System.Drawing.Font("Calibri", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label9.Location = new System.Drawing.Point(339, 233);
            this.label9.Name = "label9";
            this.label9.Size = new System.Drawing.Size(55, 19);
            this.label9.TabIndex = 39;
            this.label9.Text = "Cliente";
            // 
            // txtLivro
            // 
            this.txtLivro.Enabled = false;
            this.txtLivro.Font = new System.Drawing.Font("Calibri", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txtLivro.Location = new System.Drawing.Point(345, 304);
            this.txtLivro.Name = "txtLivro";
            this.txtLivro.Size = new System.Drawing.Size(210, 27);
            this.txtLivro.TabIndex = 44;
            // 
            // label11
            // 
            this.label11.AutoSize = true;
            this.label11.Font = new System.Drawing.Font("Calibri", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label11.Location = new System.Drawing.Point(342, 282);
            this.label11.Name = "label11";
            this.label11.Size = new System.Drawing.Size(40, 19);
            this.label11.TabIndex = 43;
            this.label11.Text = "Livro";
            // 
            // Form_Nova_Venda
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.White;
            this.ClientSize = new System.Drawing.Size(610, 538);
            this.Controls.Add(this.txtLivro);
            this.Controls.Add(this.label11);
            this.Controls.Add(this.txtCliente);
            this.Controls.Add(this.label9);
            this.Controls.Add(this.txtCOD_Funcionario);
            this.Controls.Add(this.txtCod_Cliente);
            this.Controls.Add(this.txtCod_Livro);
            this.Controls.Add(this.tabela_Funcionario);
            this.Controls.Add(this.tabela_Livro);
            this.Controls.Add(this.tabela_Cliente);
            this.Controls.Add(this.txtBusca_funcionario);
            this.Controls.Add(this.label8);
            this.Controls.Add(this.txtBusca_Livro);
            this.Controls.Add(this.label7);
            this.Controls.Add(this.txtBusca_Cliente);
            this.Controls.Add(this.label6);
            this.Controls.Add(this.btnSair);
            this.Controls.Add(this.btnEfetuar_compra);
            this.Controls.Add(this.txtValor_total);
            this.Controls.Add(this.label5);
            this.Controls.Add(this.date_Compra);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.MaximizeBox = false;
            this.Name = "Form_Nova_Venda";
            this.Text = "Nova Venda";
            this.Load += new System.EventHandler(this.Form_Nova_Venda_Load);
            ((System.ComponentModel.ISupportInitialize)(this.tabela_Cliente)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.clienteBindingSource)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.livrariaDataSet2)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.tabela_Livro)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.livroBindingSource)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.tabela_Funcionario)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.funcionarioBindingSource)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.DateTimePicker date_Compra;
        private System.Windows.Forms.TextBox txtValor_total;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.Button btnEfetuar_compra;
        private System.Windows.Forms.Button btnSair;
        private System.Windows.Forms.TextBox txtBusca_Cliente;
        private System.Windows.Forms.Label label6;
        private System.Windows.Forms.TextBox txtBusca_Livro;
        private System.Windows.Forms.Label label7;
        private System.Windows.Forms.TextBox txtBusca_funcionario;
        private System.Windows.Forms.Label label8;
        private System.Windows.Forms.DataGridView tabela_Cliente;
        private System.Windows.Forms.DataGridView tabela_Livro;
        private System.Windows.Forms.DataGridView tabela_Funcionario;
        private livrariaDataSet2 livrariaDataSet2;
        private System.Windows.Forms.BindingSource clienteBindingSource;
        private livrariaDataSet2TableAdapters.clienteTableAdapter clienteTableAdapter;
        private System.Windows.Forms.DataGridViewTextBoxColumn codclienteDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn nomeDataGridViewTextBoxColumn;
        private System.Windows.Forms.BindingSource livroBindingSource;
        private livrariaDataSet2TableAdapters.livroTableAdapter livroTableAdapter;
        private System.Windows.Forms.BindingSource funcionarioBindingSource;
        private livrariaDataSet2TableAdapters.funcionarioTableAdapter funcionarioTableAdapter;
        private System.Windows.Forms.DataGridViewTextBoxColumn codfuncionarioDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn nomeDataGridViewTextBoxColumn1;
        private System.Windows.Forms.TextBox txtCod_Livro;
        private System.Windows.Forms.TextBox txtCod_Cliente;
        private System.Windows.Forms.TextBox txtCOD_Funcionario;
        private System.Windows.Forms.DataGridViewTextBoxColumn codlivroDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn tituloDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn preco_venda;
        private System.Windows.Forms.TextBox txtCliente;
        private System.Windows.Forms.Label label9;
        private System.Windows.Forms.TextBox txtLivro;
        private System.Windows.Forms.Label label11;

    }
}