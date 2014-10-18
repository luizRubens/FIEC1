namespace Livraria
{
    partial class Form_Venda_Alterar
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
            this.label3 = new System.Windows.Forms.Label();
            this.label4 = new System.Windows.Forms.Label();
            this.label5 = new System.Windows.Forms.Label();
            this.label6 = new System.Windows.Forms.Label();
            this.label7 = new System.Windows.Forms.Label();
            this.txtValor = new System.Windows.Forms.TextBox();
            this.radioFuncionario = new System.Windows.Forms.RadioButton();
            this.radioCliente = new System.Windows.Forms.RadioButton();
            this.label2 = new System.Windows.Forms.Label();
            this.txtPesquisa = new System.Windows.Forms.TextBox();
            this.btnAplicar = new System.Windows.Forms.Button();
            this.btnSair = new System.Windows.Forms.Button();
            this.tabela_Livro = new System.Windows.Forms.DataGridView();
            this.codlivroDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.tituloDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.precovendaDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.livroBindingSource = new System.Windows.Forms.BindingSource(this.components);
            this.livrariaDataSet2 = new Livraria.livrariaDataSet2();
            this.tabela_Funcionario = new System.Windows.Forms.DataGridView();
            this.codfuncionarioDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.nomeDataGridViewTextBoxColumn1 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.cargoDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.funcionarioBindingSource = new System.Windows.Forms.BindingSource(this.components);
            this.tabela_Cliente = new System.Windows.Forms.DataGridView();
            this.codclienteDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.nomeDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.clienteBindingSource = new System.Windows.Forms.BindingSource(this.components);
            this.tabela_Venda = new System.Windows.Forms.DataGridView();
            this.vendaBindingSource = new System.Windows.Forms.BindingSource(this.components);
            this.vendaTableAdapter = new Livraria.livrariaDataSet2TableAdapters.vendaTableAdapter();
            this.livroTableAdapter = new Livraria.livrariaDataSet2TableAdapters.livroTableAdapter();
            this.clienteTableAdapter = new Livraria.livrariaDataSet2TableAdapters.clienteTableAdapter();
            this.funcionarioTableAdapter = new Livraria.livrariaDataSet2TableAdapters.funcionarioTableAdapter();
            this.txtTitulo = new System.Windows.Forms.TextBox();
            this.label1 = new System.Windows.Forms.Label();
            this.txtFuncionario = new System.Windows.Forms.TextBox();
            this.label10 = new System.Windows.Forms.Label();
            this.txtCliente = new System.Windows.Forms.TextBox();
            this.label11 = new System.Windows.Forms.Label();
            this.textBox1 = new System.Windows.Forms.TextBox();
            this.textBox2 = new System.Windows.Forms.TextBox();
            this.textBox3 = new System.Windows.Forms.TextBox();
            this.txtCod_venda = new System.Windows.Forms.TextBox();
            this.txtCod_livro = new System.Windows.Forms.TextBox();
            this.txtCod_Cliente = new System.Windows.Forms.TextBox();
            this.txtCod_funcionario = new System.Windows.Forms.TextBox();
            this.data_VEnda = new System.Windows.Forms.TextBox();
            this.radioTitulo = new System.Windows.Forms.RadioButton();
            ((System.ComponentModel.ISupportInitialize)(this.tabela_Livro)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.livroBindingSource)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.livrariaDataSet2)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.tabela_Funcionario)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.funcionarioBindingSource)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.tabela_Cliente)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.clienteBindingSource)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.tabela_Venda)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.vendaBindingSource)).BeginInit();
            this.SuspendLayout();
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Font = new System.Drawing.Font("Calibri", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label3.Location = new System.Drawing.Point(43, 418);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(84, 19);
            this.label3.TabIndex = 2;
            this.label3.Text = "Funcionário";
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Font = new System.Drawing.Font("Calibri", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label4.Location = new System.Drawing.Point(419, 556);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(42, 19);
            this.label4.TabIndex = 3;
            this.label4.Text = "Valor";
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Font = new System.Drawing.Font("Calibri", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label5.Location = new System.Drawing.Point(43, 557);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(55, 19);
            this.label5.TabIndex = 4;
            this.label5.Text = "Cliente";
            // 
            // label6
            // 
            this.label6.AutoSize = true;
            this.label6.Font = new System.Drawing.Font("Calibri", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label6.Location = new System.Drawing.Point(419, 490);
            this.label6.Name = "label6";
            this.label6.Size = new System.Drawing.Size(40, 19);
            this.label6.TabIndex = 5;
            this.label6.Text = "Data";
            // 
            // label7
            // 
            this.label7.AutoSize = true;
            this.label7.Font = new System.Drawing.Font("Calibri", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label7.Location = new System.Drawing.Point(52, 279);
            this.label7.Name = "label7";
            this.label7.Size = new System.Drawing.Size(40, 19);
            this.label7.TabIndex = 6;
            this.label7.Text = "Livro";
            // 
            // txtValor
            // 
            this.txtValor.Enabled = false;
            this.txtValor.Font = new System.Drawing.Font("Calibri", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txtValor.Location = new System.Drawing.Point(423, 579);
            this.txtValor.Name = "txtValor";
            this.txtValor.Size = new System.Drawing.Size(263, 27);
            this.txtValor.TabIndex = 12;
            // 
            // radioFuncionario
            // 
            this.radioFuncionario.AutoSize = true;
            this.radioFuncionario.Font = new System.Drawing.Font("Calibri", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.radioFuncionario.Location = new System.Drawing.Point(47, 40);
            this.radioFuncionario.Name = "radioFuncionario";
            this.radioFuncionario.Size = new System.Drawing.Size(102, 23);
            this.radioFuncionario.TabIndex = 15;
            this.radioFuncionario.TabStop = true;
            this.radioFuncionario.Text = "Funcionário";
            this.radioFuncionario.UseVisualStyleBackColor = true;
            // 
            // radioCliente
            // 
            this.radioCliente.AutoSize = true;
            this.radioCliente.Font = new System.Drawing.Font("Calibri", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.radioCliente.Location = new System.Drawing.Point(171, 40);
            this.radioCliente.Name = "radioCliente";
            this.radioCliente.Size = new System.Drawing.Size(73, 23);
            this.radioCliente.TabIndex = 16;
            this.radioCliente.TabStop = true;
            this.radioCliente.Text = "Cliente";
            this.radioCliente.UseVisualStyleBackColor = true;
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Font = new System.Drawing.Font("Calibri", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label2.Location = new System.Drawing.Point(43, 14);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(96, 19);
            this.label2.TabIndex = 18;
            this.label2.Text = "Pesquise por:";
            // 
            // txtPesquisa
            // 
            this.txtPesquisa.Font = new System.Drawing.Font("Calibri", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txtPesquisa.Location = new System.Drawing.Point(47, 70);
            this.txtPesquisa.Name = "txtPesquisa";
            this.txtPesquisa.Size = new System.Drawing.Size(299, 27);
            this.txtPesquisa.TabIndex = 1;
            this.txtPesquisa.TextChanged += new System.EventHandler(this.txtPesquisa_TextChanged);
            // 
            // btnAplicar
            // 
            this.btnAplicar.Font = new System.Drawing.Font("Calibri", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnAplicar.Location = new System.Drawing.Point(423, 633);
            this.btnAplicar.Name = "btnAplicar";
            this.btnAplicar.Size = new System.Drawing.Size(137, 33);
            this.btnAplicar.TabIndex = 5;
            this.btnAplicar.Text = "Aplicar Mudanças";
            this.btnAplicar.UseVisualStyleBackColor = true;
            this.btnAplicar.Click += new System.EventHandler(this.btnAplicar_Click);
            // 
            // btnSair
            // 
            this.btnSair.Font = new System.Drawing.Font("Calibri", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnSair.Location = new System.Drawing.Point(584, 633);
            this.btnSair.Name = "btnSair";
            this.btnSair.Size = new System.Drawing.Size(102, 33);
            this.btnSair.TabIndex = 6;
            this.btnSair.Text = "Sair";
            this.btnSair.UseVisualStyleBackColor = true;
            this.btnSair.Click += new System.EventHandler(this.btnSair_Click);
            // 
            // tabela_Livro
            // 
            this.tabela_Livro.AllowUserToAddRows = false;
            this.tabela_Livro.AllowUserToDeleteRows = false;
            this.tabela_Livro.AutoGenerateColumns = false;
            this.tabela_Livro.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.tabela_Livro.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.codlivroDataGridViewTextBoxColumn,
            this.tituloDataGridViewTextBoxColumn,
            this.precovendaDataGridViewTextBoxColumn});
            this.tabela_Livro.DataSource = this.livroBindingSource;
            this.tabela_Livro.Location = new System.Drawing.Point(47, 303);
            this.tabela_Livro.Name = "tabela_Livro";
            this.tabela_Livro.ReadOnly = true;
            this.tabela_Livro.Size = new System.Drawing.Size(279, 85);
            this.tabela_Livro.TabIndex = 24;
            this.tabela_Livro.CellContentClick += new System.Windows.Forms.DataGridViewCellEventHandler(this.tabela_Livro_CellContentClick);
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
            this.tituloDataGridViewTextBoxColumn.HeaderText = "Titulo";
            this.tituloDataGridViewTextBoxColumn.Name = "tituloDataGridViewTextBoxColumn";
            this.tituloDataGridViewTextBoxColumn.ReadOnly = true;
            // 
            // precovendaDataGridViewTextBoxColumn
            // 
            this.precovendaDataGridViewTextBoxColumn.DataPropertyName = "preco_venda";
            this.precovendaDataGridViewTextBoxColumn.HeaderText = "Preço_Venda";
            this.precovendaDataGridViewTextBoxColumn.Name = "precovendaDataGridViewTextBoxColumn";
            this.precovendaDataGridViewTextBoxColumn.ReadOnly = true;
            // 
            // livroBindingSource
            // 
            this.livroBindingSource.DataMember = "livro";
            this.livroBindingSource.DataSource = this.livrariaDataSet2;
            // 
            // livrariaDataSet2
            // 
            this.livrariaDataSet2.DataSetName = "livrariaDataSet2";
            this.livrariaDataSet2.SchemaSerializationMode = System.Data.SchemaSerializationMode.IncludeSchema;
            // 
            // tabela_Funcionario
            // 
            this.tabela_Funcionario.AllowUserToAddRows = false;
            this.tabela_Funcionario.AllowUserToDeleteRows = false;
            this.tabela_Funcionario.AutoGenerateColumns = false;
            this.tabela_Funcionario.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.tabela_Funcionario.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.codfuncionarioDataGridViewTextBoxColumn,
            this.nomeDataGridViewTextBoxColumn1,
            this.cargoDataGridViewTextBoxColumn});
            this.tabela_Funcionario.DataSource = this.funcionarioBindingSource;
            this.tabela_Funcionario.Location = new System.Drawing.Point(47, 441);
            this.tabela_Funcionario.Name = "tabela_Funcionario";
            this.tabela_Funcionario.ReadOnly = true;
            this.tabela_Funcionario.Size = new System.Drawing.Size(279, 85);
            this.tabela_Funcionario.TabIndex = 26;
            this.tabela_Funcionario.CellContentClick += new System.Windows.Forms.DataGridViewCellEventHandler(this.tabela_Funcionario_CellContentClick);
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
            // cargoDataGridViewTextBoxColumn
            // 
            this.cargoDataGridViewTextBoxColumn.DataPropertyName = "cargo";
            this.cargoDataGridViewTextBoxColumn.HeaderText = "Cargo";
            this.cargoDataGridViewTextBoxColumn.Name = "cargoDataGridViewTextBoxColumn";
            this.cargoDataGridViewTextBoxColumn.ReadOnly = true;
            // 
            // funcionarioBindingSource
            // 
            this.funcionarioBindingSource.DataMember = "funcionario";
            this.funcionarioBindingSource.DataSource = this.livrariaDataSet2;
            // 
            // tabela_Cliente
            // 
            this.tabela_Cliente.AllowUserToAddRows = false;
            this.tabela_Cliente.AllowUserToDeleteRows = false;
            this.tabela_Cliente.AutoGenerateColumns = false;
            this.tabela_Cliente.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.tabela_Cliente.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.codclienteDataGridViewTextBoxColumn,
            this.nomeDataGridViewTextBoxColumn});
            this.tabela_Cliente.DataSource = this.clienteBindingSource;
            this.tabela_Cliente.Location = new System.Drawing.Point(47, 579);
            this.tabela_Cliente.Name = "tabela_Cliente";
            this.tabela_Cliente.ReadOnly = true;
            this.tabela_Cliente.Size = new System.Drawing.Size(279, 87);
            this.tabela_Cliente.TabIndex = 27;
            this.tabela_Cliente.CellContentClick += new System.Windows.Forms.DataGridViewCellEventHandler(this.tabela_Cliente_CellContentClick);
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
            // tabela_Venda
            // 
            this.tabela_Venda.AllowUserToAddRows = false;
            this.tabela_Venda.AllowUserToDeleteRows = false;
            this.tabela_Venda.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.tabela_Venda.Location = new System.Drawing.Point(47, 114);
            this.tabela_Venda.Name = "tabela_Venda";
            this.tabela_Venda.ReadOnly = true;
            this.tabela_Venda.Size = new System.Drawing.Size(639, 155);
            this.tabela_Venda.TabIndex = 28;
            this.tabela_Venda.CellContentClick += new System.Windows.Forms.DataGridViewCellEventHandler(this.tabela_Venda_CellContentClick);
            // 
            // vendaBindingSource
            // 
            this.vendaBindingSource.DataMember = "venda";
            this.vendaBindingSource.DataSource = this.livrariaDataSet2;
            // 
            // vendaTableAdapter
            // 
            this.vendaTableAdapter.ClearBeforeFill = true;
            // 
            // livroTableAdapter
            // 
            this.livroTableAdapter.ClearBeforeFill = true;
            // 
            // clienteTableAdapter
            // 
            this.clienteTableAdapter.ClearBeforeFill = true;
            // 
            // funcionarioTableAdapter
            // 
            this.funcionarioTableAdapter.ClearBeforeFill = true;
            // 
            // txtTitulo
            // 
            this.txtTitulo.Enabled = false;
            this.txtTitulo.Font = new System.Drawing.Font("Calibri", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txtTitulo.Location = new System.Drawing.Point(423, 303);
            this.txtTitulo.Name = "txtTitulo";
            this.txtTitulo.Size = new System.Drawing.Size(263, 27);
            this.txtTitulo.TabIndex = 1;
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Calibri", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(419, 279);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(46, 19);
            this.label1.TabIndex = 29;
            this.label1.Text = "Título";
            // 
            // txtFuncionario
            // 
            this.txtFuncionario.Enabled = false;
            this.txtFuncionario.Font = new System.Drawing.Font("Calibri", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txtFuncionario.Location = new System.Drawing.Point(423, 441);
            this.txtFuncionario.Name = "txtFuncionario";
            this.txtFuncionario.Size = new System.Drawing.Size(263, 27);
            this.txtFuncionario.TabIndex = 36;
            // 
            // label10
            // 
            this.label10.AutoSize = true;
            this.label10.Font = new System.Drawing.Font("Calibri", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label10.Location = new System.Drawing.Point(419, 419);
            this.label10.Name = "label10";
            this.label10.Size = new System.Drawing.Size(84, 19);
            this.label10.TabIndex = 35;
            this.label10.Text = "Funcionário";
            // 
            // txtCliente
            // 
            this.txtCliente.Enabled = false;
            this.txtCliente.Font = new System.Drawing.Font("Calibri", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txtCliente.Location = new System.Drawing.Point(423, 371);
            this.txtCliente.Name = "txtCliente";
            this.txtCliente.Size = new System.Drawing.Size(263, 27);
            this.txtCliente.TabIndex = 38;
            // 
            // label11
            // 
            this.label11.AutoSize = true;
            this.label11.Font = new System.Drawing.Font("Calibri", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label11.Location = new System.Drawing.Point(419, 348);
            this.label11.Name = "label11";
            this.label11.Size = new System.Drawing.Size(55, 19);
            this.label11.TabIndex = 37;
            this.label11.Text = "Cliente";
            // 
            // textBox1
            // 
            this.textBox1.Font = new System.Drawing.Font("Calibri", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.textBox1.Location = new System.Drawing.Point(47, 389);
            this.textBox1.Name = "textBox1";
            this.textBox1.Size = new System.Drawing.Size(279, 27);
            this.textBox1.TabIndex = 2;
            this.textBox1.TextChanged += new System.EventHandler(this.textBox1_TextChanged);
            // 
            // textBox2
            // 
            this.textBox2.Font = new System.Drawing.Font("Calibri", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.textBox2.Location = new System.Drawing.Point(47, 527);
            this.textBox2.Name = "textBox2";
            this.textBox2.Size = new System.Drawing.Size(279, 27);
            this.textBox2.TabIndex = 3;
            this.textBox2.TextChanged += new System.EventHandler(this.textBox2_TextChanged);
            // 
            // textBox3
            // 
            this.textBox3.Font = new System.Drawing.Font("Calibri", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.textBox3.Location = new System.Drawing.Point(47, 667);
            this.textBox3.Name = "textBox3";
            this.textBox3.Size = new System.Drawing.Size(279, 27);
            this.textBox3.TabIndex = 4;
            this.textBox3.TextChanged += new System.EventHandler(this.textBox3_TextChanged);
            // 
            // txtCod_venda
            // 
            this.txtCod_venda.Enabled = false;
            this.txtCod_venda.Font = new System.Drawing.Font("Calibri", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txtCod_venda.Location = new System.Drawing.Point(396, 512);
            this.txtCod_venda.Name = "txtCod_venda";
            this.txtCod_venda.Size = new System.Drawing.Size(21, 27);
            this.txtCod_venda.TabIndex = 42;
            this.txtCod_venda.Visible = false;
            // 
            // txtCod_livro
            // 
            this.txtCod_livro.Enabled = false;
            this.txtCod_livro.Font = new System.Drawing.Font("Calibri", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txtCod_livro.Location = new System.Drawing.Point(396, 303);
            this.txtCod_livro.Name = "txtCod_livro";
            this.txtCod_livro.Size = new System.Drawing.Size(21, 27);
            this.txtCod_livro.TabIndex = 43;
            this.txtCod_livro.Visible = false;
            // 
            // txtCod_Cliente
            // 
            this.txtCod_Cliente.Enabled = false;
            this.txtCod_Cliente.Font = new System.Drawing.Font("Calibri", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txtCod_Cliente.Location = new System.Drawing.Point(396, 371);
            this.txtCod_Cliente.Name = "txtCod_Cliente";
            this.txtCod_Cliente.Size = new System.Drawing.Size(21, 27);
            this.txtCod_Cliente.TabIndex = 44;
            this.txtCod_Cliente.Visible = false;
            // 
            // txtCod_funcionario
            // 
            this.txtCod_funcionario.Enabled = false;
            this.txtCod_funcionario.Font = new System.Drawing.Font("Calibri", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txtCod_funcionario.Location = new System.Drawing.Point(396, 441);
            this.txtCod_funcionario.Name = "txtCod_funcionario";
            this.txtCod_funcionario.Size = new System.Drawing.Size(21, 27);
            this.txtCod_funcionario.TabIndex = 45;
            this.txtCod_funcionario.Visible = false;
            // 
            // data_VEnda
            // 
            this.data_VEnda.Font = new System.Drawing.Font("Calibri", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.data_VEnda.Location = new System.Drawing.Point(423, 512);
            this.data_VEnda.Name = "data_VEnda";
            this.data_VEnda.Size = new System.Drawing.Size(263, 27);
            this.data_VEnda.TabIndex = 46;
            // 
            // radioTitulo
            // 
            this.radioTitulo.AutoSize = true;
            this.radioTitulo.Font = new System.Drawing.Font("Calibri", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.radioTitulo.Location = new System.Drawing.Point(273, 40);
            this.radioTitulo.Name = "radioTitulo";
            this.radioTitulo.Size = new System.Drawing.Size(58, 23);
            this.radioTitulo.TabIndex = 47;
            this.radioTitulo.TabStop = true;
            this.radioTitulo.Text = "Livro";
            this.radioTitulo.UseVisualStyleBackColor = true;
            // 
            // Form_Venda_Alterar
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.White;
            this.ClientSize = new System.Drawing.Size(757, 700);
            this.Controls.Add(this.radioTitulo);
            this.Controls.Add(this.data_VEnda);
            this.Controls.Add(this.txtCod_funcionario);
            this.Controls.Add(this.txtCod_Cliente);
            this.Controls.Add(this.txtCod_livro);
            this.Controls.Add(this.txtCod_venda);
            this.Controls.Add(this.textBox3);
            this.Controls.Add(this.textBox2);
            this.Controls.Add(this.textBox1);
            this.Controls.Add(this.txtCliente);
            this.Controls.Add(this.label11);
            this.Controls.Add(this.txtFuncionario);
            this.Controls.Add(this.label10);
            this.Controls.Add(this.txtTitulo);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.tabela_Venda);
            this.Controls.Add(this.tabela_Cliente);
            this.Controls.Add(this.tabela_Funcionario);
            this.Controls.Add(this.tabela_Livro);
            this.Controls.Add(this.btnSair);
            this.Controls.Add(this.btnAplicar);
            this.Controls.Add(this.txtPesquisa);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.radioCliente);
            this.Controls.Add(this.radioFuncionario);
            this.Controls.Add(this.txtValor);
            this.Controls.Add(this.label7);
            this.Controls.Add(this.label6);
            this.Controls.Add(this.label5);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.label3);
            this.MaximizeBox = false;
            this.Name = "Form_Venda_Alterar";
            this.Text = "Alterar Venda";
            this.Load += new System.EventHandler(this.Form_Venda_Alterar_Load);
            ((System.ComponentModel.ISupportInitialize)(this.tabela_Livro)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.livroBindingSource)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.livrariaDataSet2)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.tabela_Funcionario)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.funcionarioBindingSource)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.tabela_Cliente)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.clienteBindingSource)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.tabela_Venda)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.vendaBindingSource)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.Label label6;
        private System.Windows.Forms.Label label7;
        private System.Windows.Forms.TextBox txtValor;
        private System.Windows.Forms.RadioButton radioFuncionario;
        private System.Windows.Forms.RadioButton radioCliente;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.TextBox txtPesquisa;
        private System.Windows.Forms.Button btnAplicar;
        private System.Windows.Forms.Button btnSair;
        private System.Windows.Forms.DataGridView tabela_Livro;
        private System.Windows.Forms.DataGridView tabela_Funcionario;
        private System.Windows.Forms.DataGridView tabela_Cliente;
        private System.Windows.Forms.DataGridView tabela_Venda;
        private livrariaDataSet2 livrariaDataSet2;
        private System.Windows.Forms.BindingSource vendaBindingSource;
        private livrariaDataSet2TableAdapters.vendaTableAdapter vendaTableAdapter;
        private System.Windows.Forms.BindingSource livroBindingSource;
        private livrariaDataSet2TableAdapters.livroTableAdapter livroTableAdapter;
        private System.Windows.Forms.DataGridViewTextBoxColumn codlivroDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn tituloDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn precovendaDataGridViewTextBoxColumn;
        private System.Windows.Forms.BindingSource clienteBindingSource;
        private livrariaDataSet2TableAdapters.clienteTableAdapter clienteTableAdapter;
        private System.Windows.Forms.DataGridViewTextBoxColumn codclienteDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn nomeDataGridViewTextBoxColumn;
        private System.Windows.Forms.BindingSource funcionarioBindingSource;
        private livrariaDataSet2TableAdapters.funcionarioTableAdapter funcionarioTableAdapter;
        private System.Windows.Forms.DataGridViewTextBoxColumn codfuncionarioDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn nomeDataGridViewTextBoxColumn1;
        private System.Windows.Forms.DataGridViewTextBoxColumn cargoDataGridViewTextBoxColumn;
        private System.Windows.Forms.TextBox txtTitulo;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.TextBox txtFuncionario;
        private System.Windows.Forms.Label label10;
        private System.Windows.Forms.TextBox txtCliente;
        private System.Windows.Forms.Label label11;
        private System.Windows.Forms.TextBox textBox1;
        private System.Windows.Forms.TextBox textBox2;
        private System.Windows.Forms.TextBox textBox3;
        private System.Windows.Forms.TextBox txtCod_venda;
        private System.Windows.Forms.TextBox txtCod_livro;
        private System.Windows.Forms.TextBox txtCod_Cliente;
        private System.Windows.Forms.TextBox txtCod_funcionario;
        private System.Windows.Forms.TextBox data_VEnda;
        private System.Windows.Forms.RadioButton radioTitulo;
    }
}