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
    public partial class Form_Nova_Venda : Form
    {
        Conexao c = new Conexao();

        string g = "preco_venda";
        string n = "nome";
        String n1 = "nome";

           

        public Form_Nova_Venda()
        {
            InitializeComponent();
        }

        private void btnSair_Click(object sender, EventArgs e)
        {
            Close();
        }

        private void Form_Nova_Venda_Load(object sender, EventArgs e)
        {
            // TODO: esta linha de código carrega dados na tabela 'livrariaDataSet2.funcionario'. Você pode movê-la ou removê-la conforme necessário.
            this.funcionarioTableAdapter.Fill(this.livrariaDataSet2.funcionario);
            // TODO: esta linha de código carrega dados na tabela 'livrariaDataSet2.livro'. Você pode movê-la ou removê-la conforme necessário.
            this.livroTableAdapter.Fill(this.livrariaDataSet2.livro);
            // TODO: esta linha de código carrega dados na tabela 'livrariaDataSet2.cliente'. Você pode movê-la ou removê-la conforme necessário.
            this.clienteTableAdapter.Fill(this.livrariaDataSet2.cliente);

        }

        private void btnEfetuar_compra_Click(object sender, EventArgs e)
        {

            if (c.ExecutarComando("insert into venda (data,valor_total,cod_funcionario,cod_cliente,cod_livro) values ('" + date_Compra.Text + "','" + txtValor_total.Text + "','" + txtCOD_Funcionario.Text + "','" + txtCod_Cliente.Text + "','" + txtCod_Livro.Text + "')"))
            {
                c.Desconectar();

                c.ExecutarComando("update livro set quantidade=quantidade - 1 where cod_livro= '" + txtCod_Livro.Text + "'");

                MessageBox.Show("Compra efetuada com sucesso.");

                
                txtCod_Cliente.Clear();
                txtCOD_Funcionario.Clear();
                txtCod_Livro.Clear();
                txtValor_total.Clear();
                
                c.Desconectar();

            }
            else
            {
                MessageBox.Show("Ocorreu um erro ao efetuar a compra.");
            }
        
        }

        private void Load_Cliente()
        {
            txtCod_Cliente.Text = tabela_Cliente.CurrentRow.Cells[0].Value.ToString();
            txtCliente.Text = tabela_Cliente.CurrentRow.Cells[1].Value.ToString();

        }
        private void Load_Funcionario()
        {
           
            txtCOD_Funcionario.Text = tabela_Funcionario.CurrentRow.Cells[0].Value.ToString();
           
        }
        private void Load_Livro()
        {
            txtCod_Livro.Text = tabela_Livro.CurrentRow.Cells[0].Value.ToString();
            txtValor_total.Text = tabela_Livro.CurrentRow.Cells[g].Value.ToString();
            txtLivro.Text = tabela_Livro.CurrentRow.Cells[1].Value.ToString();
            
        }

        private void tabela_Cliente_CellClick(object sender, DataGridViewCellEventArgs e)
        {
            Load_Cliente();
        }

        private void tabela_Livro_CellClick(object sender, DataGridViewCellEventArgs e)
        {
            Load_Livro();
        }

        private void tabela_Funcionario_CellClick(object sender, DataGridViewCellEventArgs e)
        {
            Load_Funcionario();
        }

        private void txtBusca_Cliente_TextChanged(object sender, EventArgs e)
        {
            tabela_Cliente.DataSource = c.criaTabelaComSelect("select cod_cliente,nome from cliente where nome like '%" + txtBusca_Cliente.Text + "%'");
        }

        private void txtBusca_Livro_TextChanged(object sender, EventArgs e)
        {
            tabela_Livro.DataSource = c.criaTabelaComSelect("select cod_livro,titulo from livro where titulo like '%" + txtBusca_Livro.Text + "%'");
       
        }

        private void txtBusca_funcionario_TextChanged(object sender, EventArgs e)
        {
            tabela_Funcionario.DataSource = c.criaTabelaComSelect("select cod_funcionario,nome from funcionario where nome like '%" + txtBusca_funcionario.Text + "%'");
       
        }
    }
}
