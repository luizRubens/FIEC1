namespace Livraria
{
    partial class Form_Alterar_Livro
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
            this.label5 = new System.Windows.Forms.Label();
            this.label6 = new System.Windows.Forms.Label();
            this.label7 = new System.Windows.Forms.Label();
            this.label8 = new System.Windows.Forms.Label();
            this.txtTitulo = new System.Windows.Forms.TextBox();
            this.txtPreco_Venda = new System.Windows.Forms.TextBox();
            this.txtPreco_Compra = new System.Windows.Forms.TextBox();
            this.txtQuantidade = new System.Windows.Forms.TextBox();
            this.txtGenero = new System.Windows.Forms.TextBox();
            this.txtAutor = new System.Windows.Forms.TextBox();
            this.txtBusca_Livo = new System.Windows.Forms.TextBox();
            this.label9 = new System.Windows.Forms.Label();
            this.btnAplicar = new System.Windows.Forms.Button();
            this.btnSair = new System.Windows.Forms.Button();
            this.txtANO_Lancamento = new System.Windows.Forms.TextBox();
            this.tabela_Livro = new System.Windows.Forms.DataGridView();
            this.codlivroDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.tituloDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.anolançamentoDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.autorDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.precocustoDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.precovendaDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.generoDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.codeditoraDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.quantidadeDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.livroBindingSource = new System.Windows.Forms.BindingSource(this.components);
            this.livrariaDataSet2 = new Livraria.livrariaDataSet2();
            this.livroTableAdapter = new Livraria.livrariaDataSet2TableAdapters.livroTableAdapter();
            this.label10 = new System.Windows.Forms.Label();
            this.txtBusca_Editora = new System.Windows.Forms.TextBox();
            this.tabela_Editora = new System.Windows.Forms.DataGridView();
            this.codeditoraDataGridViewTextBoxColumn1 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.descricaoDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.editoraaBindingSource = new System.Windows.Forms.BindingSource(this.components);
            this.editoraaTableAdapter = new Livraria.livrariaDataSet2TableAdapters.editoraaTableAdapter();
            this.txtCod_livro = new System.Windows.Forms.TextBox();
            this.txtCod_Editora = new System.Windows.Forms.TextBox();
            this.label11 = new System.Windows.Forms.Label();
            this.btnCancelar = new System.Windows.Forms.Button();
            ((System.ComponentModel.ISupportInitialize)(this.tabela_Livro)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.livroBindingSource)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.livrariaDataSet2)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.tabela_Editora)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.editoraaBindingSource)).BeginInit();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(41, 33);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(46, 19);
            this.label1.TabIndex = 0;
            this.label1.Text = "Título";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(398, 33);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(44, 19);
            this.label2.TabIndex = 1;
            this.label2.Text = "Autor";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(398, 187);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(109, 19);
            this.label3.TabIndex = 2;
            this.label3.Text = "Preço de Venda";
            this.label3.TextAlign = System.Drawing.ContentAlignment.TopCenter;
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(41, 187);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(119, 19);
            this.label4.TabIndex = 3;
            this.label4.Text = "Preço de Compra";
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Location = new System.Drawing.Point(398, 108);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(85, 19);
            this.label5.TabIndex = 4;
            this.label5.Text = "Quantidade";
            // 
            // label6
            // 
            this.label6.AutoSize = true;
            this.label6.Location = new System.Drawing.Point(41, 108);
            this.label6.Name = "label6";
            this.label6.Size = new System.Drawing.Size(56, 19);
            this.label6.TabIndex = 5;
            this.label6.Text = "Gênero";
            // 
            // label7
            // 
            this.label7.AutoSize = true;
            this.label7.Location = new System.Drawing.Point(41, 260);
            this.label7.Name = "label7";
            this.label7.Size = new System.Drawing.Size(137, 19);
            this.label7.TabIndex = 7;
            this.label7.Text = "Ano de Lançamento";
            // 
            // label8
            // 
            this.label8.AutoSize = true;
            this.label8.Location = new System.Drawing.Point(398, 260);
            this.label8.Name = "label8";
            this.label8.Size = new System.Drawing.Size(55, 19);
            this.label8.TabIndex = 6;
            this.label8.Text = "Editora";
            // 
            // txtTitulo
            // 
            this.txtTitulo.Location = new System.Drawing.Point(45, 56);
            this.txtTitulo.Name = "txtTitulo";
            this.txtTitulo.Size = new System.Drawing.Size(266, 27);
            this.txtTitulo.TabIndex = 1;
            // 
            // txtPreco_Venda
            // 
            this.txtPreco_Venda.Location = new System.Drawing.Point(402, 209);
            this.txtPreco_Venda.Name = "txtPreco_Venda";
            this.txtPreco_Venda.Size = new System.Drawing.Size(266, 27);
            this.txtPreco_Venda.TabIndex = 6;
            // 
            // txtPreco_Compra
            // 
            this.txtPreco_Compra.Location = new System.Drawing.Point(45, 209);
            this.txtPreco_Compra.Name = "txtPreco_Compra";
            this.txtPreco_Compra.Size = new System.Drawing.Size(266, 27);
            this.txtPreco_Compra.TabIndex = 5;
            // 
            // txtQuantidade
            // 
            this.txtQuantidade.Location = new System.Drawing.Point(402, 130);
            this.txtQuantidade.Name = "txtQuantidade";
            this.txtQuantidade.Size = new System.Drawing.Size(266, 27);
            this.txtQuantidade.TabIndex = 4;
            // 
            // txtGenero
            // 
            this.txtGenero.Location = new System.Drawing.Point(45, 130);
            this.txtGenero.Name = "txtGenero";
            this.txtGenero.Size = new System.Drawing.Size(266, 27);
            this.txtGenero.TabIndex = 3;
            // 
            // txtAutor
            // 
            this.txtAutor.Location = new System.Drawing.Point(402, 56);
            this.txtAutor.Name = "txtAutor";
            this.txtAutor.Size = new System.Drawing.Size(266, 27);
            this.txtAutor.TabIndex = 2;
            // 
            // txtBusca_Livo
            // 
            this.txtBusca_Livo.Location = new System.Drawing.Point(45, 424);
            this.txtBusca_Livo.Name = "txtBusca_Livo";
            this.txtBusca_Livo.Size = new System.Drawing.Size(266, 27);
            this.txtBusca_Livo.TabIndex = 9;
            this.txtBusca_Livo.TextChanged += new System.EventHandler(this.txtBusca_Livo_TextChanged);
            // 
            // label9
            // 
            this.label9.AutoSize = true;
            this.label9.Location = new System.Drawing.Point(41, 402);
            this.label9.Name = "label9";
            this.label9.Size = new System.Drawing.Size(148, 19);
            this.label9.TabIndex = 21;
            this.label9.Text = "Buscar livro por título";
            // 
            // btnAplicar
            // 
            this.btnAplicar.Font = new System.Drawing.Font("Calibri", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnAplicar.Location = new System.Drawing.Point(182, 634);
            this.btnAplicar.Name = "btnAplicar";
            this.btnAplicar.Size = new System.Drawing.Size(71, 30);
            this.btnAplicar.TabIndex = 10;
            this.btnAplicar.Text = "Aplicar";
            this.btnAplicar.UseVisualStyleBackColor = true;
            this.btnAplicar.Click += new System.EventHandler(this.btnAplicar_Click);
            // 
            // btnSair
            // 
            this.btnSair.Font = new System.Drawing.Font("Calibri", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnSair.Location = new System.Drawing.Point(477, 634);
            this.btnSair.Name = "btnSair";
            this.btnSair.Size = new System.Drawing.Size(67, 30);
            this.btnSair.TabIndex = 24;
            this.btnSair.Text = "Sair";
            this.btnSair.UseVisualStyleBackColor = true;
            this.btnSair.Click += new System.EventHandler(this.btnSair_Click);
            // 
            // txtANO_Lancamento
            // 
            this.txtANO_Lancamento.Location = new System.Drawing.Point(45, 282);
            this.txtANO_Lancamento.Name = "txtANO_Lancamento";
            this.txtANO_Lancamento.Size = new System.Drawing.Size(266, 27);
            this.txtANO_Lancamento.TabIndex = 7;
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
            this.anolançamentoDataGridViewTextBoxColumn,
            this.autorDataGridViewTextBoxColumn,
            this.precocustoDataGridViewTextBoxColumn,
            this.precovendaDataGridViewTextBoxColumn,
            this.generoDataGridViewTextBoxColumn,
            this.codeditoraDataGridViewTextBoxColumn,
            this.quantidadeDataGridViewTextBoxColumn});
            this.tabela_Livro.DataSource = this.livroBindingSource;
            this.tabela_Livro.Location = new System.Drawing.Point(45, 457);
            this.tabela_Livro.Name = "tabela_Livro";
            this.tabela_Livro.ReadOnly = true;
            this.tabela_Livro.Size = new System.Drawing.Size(623, 150);
            this.tabela_Livro.TabIndex = 25;
            this.tabela_Livro.CellClick += new System.Windows.Forms.DataGridViewCellEventHandler(this.tabela_Livro_CellClick);
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
            this.tituloDataGridViewTextBoxColumn.HeaderText = "Título";
            this.tituloDataGridViewTextBoxColumn.Name = "tituloDataGridViewTextBoxColumn";
            this.tituloDataGridViewTextBoxColumn.ReadOnly = true;
            // 
            // anolançamentoDataGridViewTextBoxColumn
            // 
            this.anolançamentoDataGridViewTextBoxColumn.DataPropertyName = "ano_lançamento";
            this.anolançamentoDataGridViewTextBoxColumn.HeaderText = "Ano_Lanaçamento";
            this.anolançamentoDataGridViewTextBoxColumn.Name = "anolançamentoDataGridViewTextBoxColumn";
            this.anolançamentoDataGridViewTextBoxColumn.ReadOnly = true;
            // 
            // autorDataGridViewTextBoxColumn
            // 
            this.autorDataGridViewTextBoxColumn.DataPropertyName = "autor";
            this.autorDataGridViewTextBoxColumn.HeaderText = "Autor";
            this.autorDataGridViewTextBoxColumn.Name = "autorDataGridViewTextBoxColumn";
            this.autorDataGridViewTextBoxColumn.ReadOnly = true;
            // 
            // precocustoDataGridViewTextBoxColumn
            // 
            this.precocustoDataGridViewTextBoxColumn.DataPropertyName = "preco_custo";
            this.precocustoDataGridViewTextBoxColumn.HeaderText = "Preço_custo";
            this.precocustoDataGridViewTextBoxColumn.Name = "precocustoDataGridViewTextBoxColumn";
            this.precocustoDataGridViewTextBoxColumn.ReadOnly = true;
            // 
            // precovendaDataGridViewTextBoxColumn
            // 
            this.precovendaDataGridViewTextBoxColumn.DataPropertyName = "preco_venda";
            this.precovendaDataGridViewTextBoxColumn.HeaderText = "Preco_Venda";
            this.precovendaDataGridViewTextBoxColumn.Name = "precovendaDataGridViewTextBoxColumn";
            this.precovendaDataGridViewTextBoxColumn.ReadOnly = true;
            // 
            // generoDataGridViewTextBoxColumn
            // 
            this.generoDataGridViewTextBoxColumn.DataPropertyName = "genero";
            this.generoDataGridViewTextBoxColumn.HeaderText = "Gênero";
            this.generoDataGridViewTextBoxColumn.Name = "generoDataGridViewTextBoxColumn";
            this.generoDataGridViewTextBoxColumn.ReadOnly = true;
            // 
            // codeditoraDataGridViewTextBoxColumn
            // 
            this.codeditoraDataGridViewTextBoxColumn.DataPropertyName = "cod_editora";
            this.codeditoraDataGridViewTextBoxColumn.HeaderText = "Cod_Editora";
            this.codeditoraDataGridViewTextBoxColumn.Name = "codeditoraDataGridViewTextBoxColumn";
            this.codeditoraDataGridViewTextBoxColumn.ReadOnly = true;
            // 
            // quantidadeDataGridViewTextBoxColumn
            // 
            this.quantidadeDataGridViewTextBoxColumn.DataPropertyName = "quantidade";
            this.quantidadeDataGridViewTextBoxColumn.HeaderText = "Quantidade";
            this.quantidadeDataGridViewTextBoxColumn.Name = "quantidadeDataGridViewTextBoxColumn";
            this.quantidadeDataGridViewTextBoxColumn.ReadOnly = true;
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
            // livroTableAdapter
            // 
            this.livroTableAdapter.ClearBeforeFill = true;
            // 
            // label10
            // 
            this.label10.AutoSize = true;
            this.label10.Location = new System.Drawing.Point(398, 350);
            this.label10.Name = "label10";
            this.label10.Size = new System.Drawing.Size(118, 19);
            this.label10.TabIndex = 28;
            this.label10.Text = "Buscar por nome";
            // 
            // txtBusca_Editora
            // 
            this.txtBusca_Editora.Location = new System.Drawing.Point(402, 372);
            this.txtBusca_Editora.Name = "txtBusca_Editora";
            this.txtBusca_Editora.Size = new System.Drawing.Size(266, 27);
            this.txtBusca_Editora.TabIndex = 8;
            this.txtBusca_Editora.TextChanged += new System.EventHandler(this.txtBusca_Editora_TextChanged);
            // 
            // tabela_Editora
            // 
            this.tabela_Editora.AllowUserToAddRows = false;
            this.tabela_Editora.AllowUserToDeleteRows = false;
            this.tabela_Editora.AutoGenerateColumns = false;
            this.tabela_Editora.BackgroundColor = System.Drawing.Color.White;
            this.tabela_Editora.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.tabela_Editora.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.codeditoraDataGridViewTextBoxColumn1,
            this.descricaoDataGridViewTextBoxColumn});
            this.tabela_Editora.DataSource = this.editoraaBindingSource;
            this.tabela_Editora.Location = new System.Drawing.Point(402, 282);
            this.tabela_Editora.Name = "tabela_Editora";
            this.tabela_Editora.ReadOnly = true;
            this.tabela_Editora.Size = new System.Drawing.Size(266, 65);
            this.tabela_Editora.TabIndex = 29;
            this.tabela_Editora.CellClick += new System.Windows.Forms.DataGridViewCellEventHandler(this.tabela_Editora_CellClick);
            // 
            // codeditoraDataGridViewTextBoxColumn1
            // 
            this.codeditoraDataGridViewTextBoxColumn1.DataPropertyName = "cod_editora";
            this.codeditoraDataGridViewTextBoxColumn1.HeaderText = "Codigo";
            this.codeditoraDataGridViewTextBoxColumn1.Name = "codeditoraDataGridViewTextBoxColumn1";
            this.codeditoraDataGridViewTextBoxColumn1.ReadOnly = true;
            // 
            // descricaoDataGridViewTextBoxColumn
            // 
            this.descricaoDataGridViewTextBoxColumn.DataPropertyName = "descricao";
            this.descricaoDataGridViewTextBoxColumn.HeaderText = "Descrição";
            this.descricaoDataGridViewTextBoxColumn.Name = "descricaoDataGridViewTextBoxColumn";
            this.descricaoDataGridViewTextBoxColumn.ReadOnly = true;
            // 
            // editoraaBindingSource
            // 
            this.editoraaBindingSource.DataMember = "editoraa";
            this.editoraaBindingSource.DataSource = this.livrariaDataSet2;
            // 
            // editoraaTableAdapter
            // 
            this.editoraaTableAdapter.ClearBeforeFill = true;
            // 
            // txtCod_livro
            // 
            this.txtCod_livro.Location = new System.Drawing.Point(402, 3);
            this.txtCod_livro.Name = "txtCod_livro";
            this.txtCod_livro.Size = new System.Drawing.Size(100, 27);
            this.txtCod_livro.TabIndex = 30;
            this.txtCod_livro.Visible = false;
            // 
            // txtCod_Editora
            // 
            this.txtCod_Editora.Enabled = false;
            this.txtCod_Editora.Location = new System.Drawing.Point(402, 424);
            this.txtCod_Editora.Name = "txtCod_Editora";
            this.txtCod_Editora.Size = new System.Drawing.Size(266, 27);
            this.txtCod_Editora.TabIndex = 32;
            // 
            // label11
            // 
            this.label11.AutoSize = true;
            this.label11.Location = new System.Drawing.Point(398, 402);
            this.label11.Name = "label11";
            this.label11.Size = new System.Drawing.Size(108, 19);
            this.label11.TabIndex = 31;
            this.label11.Text = "Codigo_Editora";
            // 
            // btnCancelar
            // 
            this.btnCancelar.Font = new System.Drawing.Font("Calibri", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnCancelar.Location = new System.Drawing.Point(327, 634);
            this.btnCancelar.Name = "btnCancelar";
            this.btnCancelar.Size = new System.Drawing.Size(78, 30);
            this.btnCancelar.TabIndex = 33;
            this.btnCancelar.Text = "Cancelar";
            this.btnCancelar.UseVisualStyleBackColor = true;
            this.btnCancelar.Click += new System.EventHandler(this.Ca_Click);
            // 
            // Form_Alterar_Livro
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 19F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.White;
            this.ClientSize = new System.Drawing.Size(734, 689);
            this.Controls.Add(this.btnCancelar);
            this.Controls.Add(this.txtCod_Editora);
            this.Controls.Add(this.label11);
            this.Controls.Add(this.txtCod_livro);
            this.Controls.Add(this.tabela_Editora);
            this.Controls.Add(this.label10);
            this.Controls.Add(this.txtBusca_Editora);
            this.Controls.Add(this.tabela_Livro);
            this.Controls.Add(this.btnSair);
            this.Controls.Add(this.btnAplicar);
            this.Controls.Add(this.label9);
            this.Controls.Add(this.txtBusca_Livo);
            this.Controls.Add(this.txtAutor);
            this.Controls.Add(this.txtGenero);
            this.Controls.Add(this.txtQuantidade);
            this.Controls.Add(this.txtPreco_Compra);
            this.Controls.Add(this.txtPreco_Venda);
            this.Controls.Add(this.txtANO_Lancamento);
            this.Controls.Add(this.txtTitulo);
            this.Controls.Add(this.label7);
            this.Controls.Add(this.label8);
            this.Controls.Add(this.label6);
            this.Controls.Add(this.label5);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.Font = new System.Drawing.Font("Calibri", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.Margin = new System.Windows.Forms.Padding(4);
            this.MaximizeBox = false;
            this.Name = "Form_Alterar_Livro";
            this.Text = "Alterar / Atualizar Livro";
            this.Load += new System.EventHandler(this.Form_Alterar_Livro_Load);
            ((System.ComponentModel.ISupportInitialize)(this.tabela_Livro)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.livroBindingSource)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.livrariaDataSet2)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.tabela_Editora)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.editoraaBindingSource)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.Label label6;
        private System.Windows.Forms.Label label7;
        private System.Windows.Forms.Label label8;
        private System.Windows.Forms.TextBox txtTitulo;
        private System.Windows.Forms.TextBox txtPreco_Venda;
        private System.Windows.Forms.TextBox txtPreco_Compra;
        private System.Windows.Forms.TextBox txtQuantidade;
        private System.Windows.Forms.TextBox txtGenero;
        private System.Windows.Forms.TextBox txtAutor;
        private System.Windows.Forms.TextBox txtBusca_Livo;
        private System.Windows.Forms.Label label9;
        private System.Windows.Forms.Button btnAplicar;
        private System.Windows.Forms.Button btnSair;
        private System.Windows.Forms.TextBox txtANO_Lancamento;
        private System.Windows.Forms.DataGridView tabela_Livro;
        private livrariaDataSet2 livrariaDataSet2;
        private System.Windows.Forms.BindingSource livroBindingSource;
        private livrariaDataSet2TableAdapters.livroTableAdapter livroTableAdapter;
        private System.Windows.Forms.Label label10;
        private System.Windows.Forms.TextBox txtBusca_Editora;
        private System.Windows.Forms.DataGridView tabela_Editora;
        private System.Windows.Forms.BindingSource editoraaBindingSource;
        private livrariaDataSet2TableAdapters.editoraaTableAdapter editoraaTableAdapter;
        private System.Windows.Forms.DataGridViewTextBoxColumn codeditoraDataGridViewTextBoxColumn1;
        private System.Windows.Forms.DataGridViewTextBoxColumn descricaoDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn codlivroDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn tituloDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn anolançamentoDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn autorDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn precocustoDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn precovendaDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn generoDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn codeditoraDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn quantidadeDataGridViewTextBoxColumn;
        private System.Windows.Forms.TextBox txtCod_livro;
        private System.Windows.Forms.TextBox txtCod_Editora;
        private System.Windows.Forms.Label label11;
        private System.Windows.Forms.Button btnCancelar;
    }
}