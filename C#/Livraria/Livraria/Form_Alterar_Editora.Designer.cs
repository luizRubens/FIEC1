namespace Livraria
{
    partial class Form_Alterar_Editora
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
            this.label3 = new System.Windows.Forms.Label();
            this.label4 = new System.Windows.Forms.Label();
            this.label5 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.txtDescricao = new System.Windows.Forms.TextBox();
            this.txtEmail = new System.Windows.Forms.TextBox();
            this.txtResponsavel = new System.Windows.Forms.TextBox();
            this.txtEndereco = new System.Windows.Forms.TextBox();
            this.btnOk = new System.Windows.Forms.Button();
            this.btnCancelar = new System.Windows.Forms.Button();
            this.btnSair = new System.Windows.Forms.Button();
            this.txtBusca_Descricao = new System.Windows.Forms.TextBox();
            this.label6 = new System.Windows.Forms.Label();
            this.tabela_Editora = new System.Windows.Forms.DataGridView();
            this.codeditoraDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.descricaoDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.dataGridViewTextBoxColumn1 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.enderecoDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.dataGridViewTextBoxColumn2 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.responsavelDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.editoraaBindingSource = new System.Windows.Forms.BindingSource(this.components);
            this.livrariaDataSet2 = new Livraria.livrariaDataSet2();
            this.clienteBindingSource1 = new System.Windows.Forms.BindingSource(this.components);
            this.editoraBindingSource = new System.Windows.Forms.BindingSource(this.components);
            this.clienteBindingSource = new System.Windows.Forms.BindingSource(this.components);
            this.editoraaTableAdapter = new Livraria.livrariaDataSet2TableAdapters.editoraaTableAdapter();
            this.txtCod_editora = new System.Windows.Forms.TextBox();
            this.txtTelefone = new System.Windows.Forms.MaskedTextBox();
            ((System.ComponentModel.ISupportInitialize)(this.tabela_Editora)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.editoraaBindingSource)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.livrariaDataSet2)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.clienteBindingSource1)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.editoraBindingSource)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.clienteBindingSource)).BeginInit();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(61, 44);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(73, 19);
            this.label1.TabIndex = 0;
            this.label1.Text = "Descrição";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(453, 121);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(50, 19);
            this.label3.TabIndex = 2;
            this.label3.Text = "E-mail";
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(61, 121);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(65, 19);
            this.label4.TabIndex = 3;
            this.label4.Text = "Telefone";
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Location = new System.Drawing.Point(453, 44);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(69, 19);
            this.label5.TabIndex = 4;
            this.label5.Text = "Endereço";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(61, 200);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(91, 19);
            this.label2.TabIndex = 5;
            this.label2.Text = "Responsável";
            // 
            // txtDescricao
            // 
            this.txtDescricao.Location = new System.Drawing.Point(65, 68);
            this.txtDescricao.Name = "txtDescricao";
            this.txtDescricao.Size = new System.Drawing.Size(267, 27);
            this.txtDescricao.TabIndex = 1;
            // 
            // txtEmail
            // 
            this.txtEmail.Location = new System.Drawing.Point(457, 144);
            this.txtEmail.Name = "txtEmail";
            this.txtEmail.Size = new System.Drawing.Size(267, 27);
            this.txtEmail.TabIndex = 4;
            // 
            // txtResponsavel
            // 
            this.txtResponsavel.Location = new System.Drawing.Point(65, 223);
            this.txtResponsavel.Name = "txtResponsavel";
            this.txtResponsavel.Size = new System.Drawing.Size(267, 27);
            this.txtResponsavel.TabIndex = 5;
            // 
            // txtEndereco
            // 
            this.txtEndereco.Location = new System.Drawing.Point(457, 68);
            this.txtEndereco.Name = "txtEndereco";
            this.txtEndereco.Size = new System.Drawing.Size(267, 27);
            this.txtEndereco.TabIndex = 2;
            // 
            // btnOk
            // 
            this.btnOk.Location = new System.Drawing.Point(185, 586);
            this.btnOk.Name = "btnOk";
            this.btnOk.Size = new System.Drawing.Size(75, 31);
            this.btnOk.TabIndex = 7;
            this.btnOk.Text = "Aplicar";
            this.btnOk.UseVisualStyleBackColor = true;
            this.btnOk.Click += new System.EventHandler(this.btnOk_Click);
            // 
            // btnCancelar
            // 
            this.btnCancelar.Location = new System.Drawing.Point(344, 586);
            this.btnCancelar.Name = "btnCancelar";
            this.btnCancelar.Size = new System.Drawing.Size(92, 31);
            this.btnCancelar.TabIndex = 12;
            this.btnCancelar.Text = "Cancelar";
            this.btnCancelar.UseVisualStyleBackColor = true;
            this.btnCancelar.Click += new System.EventHandler(this.btnCancelar_Click);
            // 
            // btnSair
            // 
            this.btnSair.Location = new System.Drawing.Point(523, 586);
            this.btnSair.Name = "btnSair";
            this.btnSair.Size = new System.Drawing.Size(75, 31);
            this.btnSair.TabIndex = 13;
            this.btnSair.Text = "Sair";
            this.btnSair.UseVisualStyleBackColor = true;
            this.btnSair.Click += new System.EventHandler(this.btnSair_Click);
            // 
            // txtBusca_Descricao
            // 
            this.txtBusca_Descricao.Location = new System.Drawing.Point(65, 334);
            this.txtBusca_Descricao.Name = "txtBusca_Descricao";
            this.txtBusca_Descricao.Size = new System.Drawing.Size(267, 27);
            this.txtBusca_Descricao.TabIndex = 6;
            this.txtBusca_Descricao.TextChanged += new System.EventHandler(this.textBox6_TextChanged);
            // 
            // label6
            // 
            this.label6.AutoSize = true;
            this.label6.Location = new System.Drawing.Point(61, 311);
            this.label6.Name = "label6";
            this.label6.Size = new System.Drawing.Size(188, 19);
            this.label6.TabIndex = 14;
            this.label6.Text = "Buscar por nome de editora";
            // 
            // tabela_Editora
            // 
            this.tabela_Editora.AllowUserToAddRows = false;
            this.tabela_Editora.AllowUserToDeleteRows = false;
            this.tabela_Editora.AutoGenerateColumns = false;
            this.tabela_Editora.BackgroundColor = System.Drawing.Color.White;
            this.tabela_Editora.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.tabela_Editora.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.codeditoraDataGridViewTextBoxColumn,
            this.descricaoDataGridViewTextBoxColumn,
            this.dataGridViewTextBoxColumn1,
            this.enderecoDataGridViewTextBoxColumn,
            this.dataGridViewTextBoxColumn2,
            this.responsavelDataGridViewTextBoxColumn});
            this.tabela_Editora.DataSource = this.editoraaBindingSource;
            this.tabela_Editora.Location = new System.Drawing.Point(65, 367);
            this.tabela_Editora.Name = "tabela_Editora";
            this.tabela_Editora.ReadOnly = true;
            this.tabela_Editora.Size = new System.Drawing.Size(659, 186);
            this.tabela_Editora.TabIndex = 17;
            this.tabela_Editora.CellClick += new System.Windows.Forms.DataGridViewCellEventHandler(this.tabela_Editora_CellClick);
            this.tabela_Editora.CellContentClick += new System.Windows.Forms.DataGridViewCellEventHandler(this.tabela_Editora_CellContentClick);
            // 
            // codeditoraDataGridViewTextBoxColumn
            // 
            this.codeditoraDataGridViewTextBoxColumn.DataPropertyName = "cod_editora";
            this.codeditoraDataGridViewTextBoxColumn.HeaderText = "Codigo";
            this.codeditoraDataGridViewTextBoxColumn.Name = "codeditoraDataGridViewTextBoxColumn";
            this.codeditoraDataGridViewTextBoxColumn.ReadOnly = true;
            // 
            // descricaoDataGridViewTextBoxColumn
            // 
            this.descricaoDataGridViewTextBoxColumn.DataPropertyName = "descricao";
            this.descricaoDataGridViewTextBoxColumn.HeaderText = "Editora";
            this.descricaoDataGridViewTextBoxColumn.Name = "descricaoDataGridViewTextBoxColumn";
            this.descricaoDataGridViewTextBoxColumn.ReadOnly = true;
            // 
            // dataGridViewTextBoxColumn1
            // 
            this.dataGridViewTextBoxColumn1.DataPropertyName = "telefone";
            this.dataGridViewTextBoxColumn1.HeaderText = "Telefone";
            this.dataGridViewTextBoxColumn1.Name = "dataGridViewTextBoxColumn1";
            this.dataGridViewTextBoxColumn1.ReadOnly = true;
            // 
            // enderecoDataGridViewTextBoxColumn
            // 
            this.enderecoDataGridViewTextBoxColumn.DataPropertyName = "endereco";
            this.enderecoDataGridViewTextBoxColumn.HeaderText = "Endereço";
            this.enderecoDataGridViewTextBoxColumn.Name = "enderecoDataGridViewTextBoxColumn";
            this.enderecoDataGridViewTextBoxColumn.ReadOnly = true;
            // 
            // dataGridViewTextBoxColumn2
            // 
            this.dataGridViewTextBoxColumn2.DataPropertyName = "email";
            this.dataGridViewTextBoxColumn2.HeaderText = "E-mail";
            this.dataGridViewTextBoxColumn2.Name = "dataGridViewTextBoxColumn2";
            this.dataGridViewTextBoxColumn2.ReadOnly = true;
            // 
            // responsavelDataGridViewTextBoxColumn
            // 
            this.responsavelDataGridViewTextBoxColumn.DataPropertyName = "responsavel";
            this.responsavelDataGridViewTextBoxColumn.HeaderText = "Responsável";
            this.responsavelDataGridViewTextBoxColumn.Name = "responsavelDataGridViewTextBoxColumn";
            this.responsavelDataGridViewTextBoxColumn.ReadOnly = true;
            // 
            // editoraaBindingSource
            // 
            this.editoraaBindingSource.DataMember = "editoraa";
            this.editoraaBindingSource.DataSource = this.livrariaDataSet2;
            // 
            // livrariaDataSet2
            // 
            this.livrariaDataSet2.DataSetName = "livrariaDataSet2";
            this.livrariaDataSet2.SchemaSerializationMode = System.Data.SchemaSerializationMode.IncludeSchema;
            // 
            // clienteBindingSource1
            // 
            this.clienteBindingSource1.DataMember = "cliente";
            // 
            // editoraBindingSource
            // 
            this.editoraBindingSource.DataMember = "editora";
            // 
            // clienteBindingSource
            // 
            this.clienteBindingSource.DataMember = "cliente";
            // 
            // editoraaTableAdapter
            // 
            this.editoraaTableAdapter.ClearBeforeFill = true;
            // 
            // txtCod_editora
            // 
            this.txtCod_editora.Location = new System.Drawing.Point(331, 268);
            this.txtCod_editora.Name = "txtCod_editora";
            this.txtCod_editora.Size = new System.Drawing.Size(267, 27);
            this.txtCod_editora.TabIndex = 19;
            this.txtCod_editora.Visible = false;
            // 
            // txtTelefone
            // 
            this.txtTelefone.Location = new System.Drawing.Point(65, 144);
            this.txtTelefone.Mask = "(99) 9999-9999 / (99) 99999-9999";
            this.txtTelefone.Name = "txtTelefone";
            this.txtTelefone.Size = new System.Drawing.Size(267, 27);
            this.txtTelefone.TabIndex = 3;
            // 
            // Form_Alterar_Editora
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 19F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.White;
            this.ClientSize = new System.Drawing.Size(780, 640);
            this.Controls.Add(this.txtTelefone);
            this.Controls.Add(this.txtCod_editora);
            this.Controls.Add(this.tabela_Editora);
            this.Controls.Add(this.txtBusca_Descricao);
            this.Controls.Add(this.label6);
            this.Controls.Add(this.btnSair);
            this.Controls.Add(this.btnCancelar);
            this.Controls.Add(this.btnOk);
            this.Controls.Add(this.txtEndereco);
            this.Controls.Add(this.txtResponsavel);
            this.Controls.Add(this.txtEmail);
            this.Controls.Add(this.txtDescricao);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label5);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.label1);
            this.Font = new System.Drawing.Font("Calibri", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.Margin = new System.Windows.Forms.Padding(4);
            this.MaximizeBox = false;
            this.Name = "Form_Alterar_Editora";
            this.Text = "Alterar / Atualizar Editora";
            this.Load += new System.EventHandler(this.Form_Alterar_Editora_Load);
            ((System.ComponentModel.ISupportInitialize)(this.tabela_Editora)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.editoraaBindingSource)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.livrariaDataSet2)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.clienteBindingSource1)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.editoraBindingSource)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.clienteBindingSource)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.TextBox txtDescricao;
        private System.Windows.Forms.TextBox txtEmail;
        private System.Windows.Forms.TextBox txtResponsavel;
        private System.Windows.Forms.TextBox txtEndereco;
        private System.Windows.Forms.Button btnOk;
        private System.Windows.Forms.Button btnCancelar;
        private System.Windows.Forms.Button btnSair;
        private System.Windows.Forms.TextBox txtBusca_Descricao;
        private System.Windows.Forms.Label label6;
        private System.Windows.Forms.DataGridView tabela_Editora;
    //    private livrariaDataSet livrariaDataSet;
        private System.Windows.Forms.BindingSource editoraBindingSource;
    //    private livrariaDataSetTableAdapters.editoraTableAdapter editoraTableAdapter;
        private System.Windows.Forms.BindingSource clienteBindingSource;
     //   private livrariaDataSetTableAdapters.clienteTableAdapter clienteTableAdapter;
       /* private System.Windows.Forms.DataGridViewTextBoxColumn codclienteDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn nomeDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn emailDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn telefoneDataGridViewTextBoxColumn; */
        private System.Windows.Forms.BindingSource clienteBindingSource1;
        private livrariaDataSet2 livrariaDataSet2;
        private System.Windows.Forms.BindingSource editoraaBindingSource;
        private livrariaDataSet2TableAdapters.editoraaTableAdapter editoraaTableAdapter;
        private System.Windows.Forms.TextBox txtCod_editora;
        private System.Windows.Forms.DataGridViewTextBoxColumn codeditoraDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn descricaoDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn dataGridViewTextBoxColumn1;
        private System.Windows.Forms.DataGridViewTextBoxColumn enderecoDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn dataGridViewTextBoxColumn2;
        private System.Windows.Forms.DataGridViewTextBoxColumn responsavelDataGridViewTextBoxColumn;
        private System.Windows.Forms.MaskedTextBox txtTelefone;
    }
}