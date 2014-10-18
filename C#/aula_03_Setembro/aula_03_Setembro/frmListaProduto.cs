using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Data.SqlClient;

namespace aula_03_Setembro
{
    public partial class frmListaProduto : Form
    {
        public frmListaProduto()
        {
            InitializeComponent();
        }

         Conexao conexao = new Conexao();
        
        
        private void txtPesquisa_KeyDown(object sender, KeyEventArgs e)
        {
            PesquisaProduto();
        }
        //Método que pesquisa os produtos
        private void PesquisaProduto()
        {
            grdProdutos.DataSource = conexao.selecionaRegistros("SELECT id, nome, valor FROM produtos WHERE nome LIKE '"+txtPesquisa.Text+"%'");
            LoadProduto();
        }
        private void LoadProduto()
        {

            txtID.Text = grdProdutos.CurrentRow.Cells["id"].Value.ToString();
            txtNome.Text = grdProdutos.CurrentRow.Cells["nome"].Value.ToString();
            txtValor.Text = grdProdutos.CurrentRow.Cells["valor"].Value.ToString();
        }

        private void ListaProduto()
        {
            //Instancia classe conexao
           
            grdProdutos.DataSource = conexao.selecionaRegistros("SELECT id, nome, valor FROM produtos ORDER BY nome");
            LoadProduto();
        }
        private void frmListaProduto_Load(object sender, EventArgs e)
        {
            ListaProduto();
        }

        private void grdProdutos_CellClick(object sender, DataGridViewCellEventArgs e)
        {
         
            LoadProduto();
        }





















        private void btnSalvar_Click(object sender, EventArgs e)
        {
            if (conexao.ExecutaComando("UPDATE produtos SET nome = '" + txtNome.Text + "', valor = "+txtValor.Text.Replace(',','.')+" WHERE id = " + txtID.Text))
            {
                ListaProduto();
                MessageBox.Show("Produto atualizado com sucesso!", "Informação", MessageBoxButtons.OK, MessageBoxIcon.Information);
            }
        }

        private void btnExcluir_Click(object sender, EventArgs e)
        {
            if (MessageBox.Show("Deseja realmente deletar o produto?", "Confirmação", MessageBoxButtons.YesNo , MessageBoxIcon.Question) == DialogResult.Yes)
            {
                if (conexao.ExecutaComando("DELETE FROM produtos WHERE id = " + txtID.Text))
                {
                    ListaProduto();
                    MessageBox.Show("Produto deletado com sucesso!", "Informação", MessageBoxButtons.OK, MessageBoxIcon.Information);
                }
            }
        }        
    }
}
