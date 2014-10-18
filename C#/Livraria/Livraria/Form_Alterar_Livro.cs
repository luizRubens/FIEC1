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
    public partial class Form_Alterar_Livro : Form
    {

        Conexao c = new Conexao();

        public Form_Alterar_Livro()
        {
            InitializeComponent();
        }

        private void btnSair_Click(object sender, EventArgs e)
        {
            Close();
        }

         private void tabela_Livro_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {
            txtCod_livro.Text = tabela_Livro.CurrentRow.Cells[0].Value.ToString();
            txtANO_Lancamento.Text = tabela_Livro.CurrentRow.Cells[2].Value.ToString();
            txtTitulo.Text = tabela_Livro.CurrentRow.Cells[1].Value.ToString();
            txtAutor.Text = tabela_Livro.CurrentRow.Cells[3].Value.ToString();
            txtPreco_Compra.Text = tabela_Livro.CurrentRow.Cells[4].Value.ToString();
            txtPreco_Venda.Text = tabela_Livro.CurrentRow.Cells[5].Value.ToString();
            txtGenero.Text = tabela_Livro.CurrentRow.Cells[6].Value.ToString();
            txtQuantidade.Text = tabela_Livro.CurrentRow.Cells[8].Value.ToString();
            txtCod_Editora.Text = tabela_Livro.CurrentRow.Cells[7].Value.ToString();       
        }

        private void tabela_Livro_CellClick(object sender, DataGridViewCellEventArgs e)
        {
            txtCod_livro.Text = tabela_Livro.CurrentRow.Cells[0].Value.ToString();
            txtANO_Lancamento.Text = tabela_Livro.CurrentRow.Cells[2].Value.ToString();
            txtTitulo.Text = tabela_Livro.CurrentRow.Cells[1].Value.ToString();
            txtAutor.Text = tabela_Livro.CurrentRow.Cells[3].Value.ToString();
            txtPreco_Compra.Text = tabela_Livro.CurrentRow.Cells[4].Value.ToString();
            txtPreco_Venda.Text = tabela_Livro.CurrentRow.Cells[5].Value.ToString();
            txtGenero.Text = tabela_Livro.CurrentRow.Cells[6].Value.ToString();
            txtQuantidade.Text = tabela_Livro.CurrentRow.Cells[8].Value.ToString();
            txtCod_Editora.Text = tabela_Livro.CurrentRow.Cells[7].Value.ToString();  
        }

        private void txtBusca_Livo_TextChanged(object sender, EventArgs e)
        {
            tabela_Livro.DataSource = c.criaTabelaComSelect("select * from livro where titulo like '%" + txtBusca_Livo.Text + "%'");

        }

        private void txtBusca_Editora_TextChanged(object sender, EventArgs e)
        {
            tabela_Editora.DataSource = c.criaTabelaComSelect("select * from editoraa where descricao like '%" + txtBusca_Editora.Text + "%'");

        }

        private void tabela_Editora_CellClick(object sender, DataGridViewCellEventArgs e)
        {
            txtCod_Editora.Text = tabela_Editora.CurrentRow.Cells[0].Value.ToString();
        }
             
        private void Form_Alterar_Livro_Load(object sender, EventArgs e)
        {

            //carrega as informações do banco ao carregar o form
            // TODO: esta linha de código carrega dados na tabela 'livrariaDataSet2.editoraa'. Você pode movê-la ou removê-la conforme necessário.
            this.editoraaTableAdapter.Fill(this.livrariaDataSet2.editoraa);
            // TODO: esta linha de código carrega dados na tabela 'livrariaDataSet2.livro'. Você pode movê-la ou removê-la conforme necessário.
            this.livroTableAdapter.Fill(this.livrariaDataSet2.livro);

        }
              

        private void btnCancelar_Click(object sender, EventArgs e)
        {

            if (MessageBox.Show("Deseja realmente deletar este livro?", "Confirmação", MessageBoxButtons.YesNo, MessageBoxIcon.Question) == DialogResult.Yes)
            {
                if (c.ExecutarComando("DELETE FROM livro WHERE cod_livro = " + txtCod_livro.Text))
                {

                    MessageBox.Show("Livro deletado com sucesso!", "Informação", MessageBoxButtons.OK, MessageBoxIcon.Information);
                    
                    //aqui vai atualizar o grid                  
                    tabela_Livro.DataSource = c.ExecutarComando("select * from livro order by titulo");

                    txtCod_Editora.Clear();
                    txtCod_livro.Clear();
                    txtGenero.Clear();
                    txtPreco_Compra.Clear();
                    txtPreco_Venda.Clear();
                    txtQuantidade.Clear();
                    txtANO_Lancamento.Clear();
                    txtAutor.Clear();
                    txtTitulo.Clear();
                    txtTitulo.Focus();

                    
                }
                else
                {
                    MessageBox.Show("Ocorreu um erro ao deletar o livro.");
                }
            }

        }

        private void btnAplicar_Click(object sender, EventArgs e)
        {
            
            if( c.ExecutarComando("update livro set titulo='"+txtTitulo.Text+"', ano_lançamento='"+txtANO_Lancamento.Text+"', autor='"+txtAutor.Text+"' ,preco_custo='"+txtPreco_Compra.Text+"' ,preco_venda='"+txtPreco_Venda.Text+"' , genero='"+txtGenero.Text+"' , cod_editora='"+txtCod_Editora.Text+"' , quantidade='"+txtQuantidade.Text+"'  where cod_livro='"+txtCod_livro.Text+"'"))
            {
                MessageBox.Show("Atualizado no banco de dados com sucesso.");

                txtCod_Editora.Clear();
                txtCod_livro.Clear();
                txtGenero.Clear();
                txtPreco_Compra.Clear();
                txtPreco_Venda.Clear();
                txtANO_Lancamento.Clear();
                txtQuantidade.Clear();
                txtTitulo.Clear();
                txtTitulo.Focus();

                c.Desconectar();


                //aqui vai atualizar o grid
                tabela_Livro.DataSource = c.criaTabelaComSelect("select * from livro");
               
            }
            else
            {
                MessageBox.Show("Ocorreu um erro.");
            }
        }  
        
        

        private void Ca_Click(object sender, EventArgs e)
        {
            this.DialogResult = DialogResult.Cancel;
        }
    }
}
