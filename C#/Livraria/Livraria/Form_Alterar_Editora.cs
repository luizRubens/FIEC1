using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Livraria
{
    public partial class Form_Alterar_Editora : Form
    {

        Conexao c = new Conexao();

        public Form_Alterar_Editora()
        {
            InitializeComponent();
        }

        private void btnSair_Click(object sender, EventArgs e)
        {
            Close();

          
        }

        private void btnCancelar_Click(object sender, EventArgs e)
        {
            this.DialogResult = DialogResult.Cancel;
        }

        private void tabela_Editora_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {
            txtCod_editora.Text = tabela_Editora.CurrentRow.Cells[0].Value.ToString();
            txtDescricao.Text = tabela_Editora.CurrentRow.Cells[1].Value.ToString();
            txtEmail.Text = tabela_Editora.CurrentRow.Cells[4].Value.ToString();
            txtEndereco.Text = tabela_Editora.CurrentRow.Cells[3].Value.ToString();
            txtResponsavel.Text = tabela_Editora.CurrentRow.Cells[5].Value.ToString();
            txtTelefone.Text = tabela_Editora.CurrentRow.Cells[2].Value.ToString();
        }

        private void Form_Alterar_Editora_Load(object sender, EventArgs e)
        {
            // TODO: esta linha de código carrega dados na tabela 'livrariaDataSet2.editoraa'. Você pode movê-la ou removê-la conforme necessário.
            this.editoraaTableAdapter.Fill(this.livrariaDataSet2.editoraa);

        }

        private void textBox6_TextChanged(object sender, EventArgs e)
        {
            tabela_Editora.DataSource = c.criaTabelaComSelect("select * from editoraa where descricao like '%" + txtBusca_Descricao.Text + "%'");

        }

        private void btnOk_Click(object sender, EventArgs e)
        {
            c.Desconectar();

           if( c.ExecutarComando("update editoraa set telefone='"+txtTelefone.Text+"', descricao='"+txtDescricao.Text+"', endereco='"+txtEndereco.Text+"' ,email='"+txtEmail.Text+"' ,responsavel='"+txtResponsavel.Text+"' where cod_editora='"+txtCod_editora.Text+"'"))
           {
               MessageBox.Show("Alterado com sucesso.");

               txtBusca_Descricao.Clear();
               txtCod_editora.Clear();
               txtDescricao.Clear();
               txtEmail.Clear();
               txtEndereco.Clear();
               txtResponsavel.Clear();
               txtTelefone.Clear();              

               c.Desconectar();

               tabela_Editora.DataSource = c.criaTabelaComSelect("select * from editoraa");
           }
           else
           {
               MessageBox.Show("Ocorreu um erro.");
           }
        
        }

        private void btnDeletar_Click(object sender, EventArgs e)
        {
            if (MessageBox.Show("Deseja realmente deletar esta editora?", "Confirmação", MessageBoxButtons.YesNo, MessageBoxIcon.Question) == DialogResult.Yes)
            {
                if (c.ExecutarComando("DELETE FROM editoraa WHERE cod_editora = " + txtCod_editora.Text))
                {
                    MessageBox.Show("Deletado com sucesso.");

                    txtBusca_Descricao.Clear();
                    txtCod_editora.Clear();
                    txtDescricao.Clear();
                    txtEmail.Clear();
                    txtEndereco.Clear();
                    txtResponsavel.Clear();
                    txtTelefone.Clear(); 

                    c.Desconectar();

                    tabela_Editora.DataSource = c.criaTabelaComSelect("select * from editoraa");
                }
                else
                {
                    MessageBox.Show("Ocorreu um erro.");
                }
            }
        }

        private void tabela_Editora_CellClick(object sender, DataGridViewCellEventArgs e)
        {
            txtCod_editora.Text = tabela_Editora.CurrentRow.Cells[0].Value.ToString();
            txtDescricao.Text = tabela_Editora.CurrentRow.Cells[1].Value.ToString();
            txtEmail.Text = tabela_Editora.CurrentRow.Cells[4].Value.ToString();
            txtEndereco.Text = tabela_Editora.CurrentRow.Cells[3].Value.ToString();
            txtResponsavel.Text = tabela_Editora.CurrentRow.Cells[5].Value.ToString();
            txtTelefone.Text = tabela_Editora.CurrentRow.Cells[2].Value.ToString();

        }
    }
}
