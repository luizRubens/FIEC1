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
    public partial class Form_Venda_Alterar : Form
    {
        Conexao c = new Conexao();

        string comando = "select v.cod_venda as Codigo, v.data as Data_Venda, c.nome as Nome_Cliente, f.nome as Nome_Funcionario, l.titulo as Titulo, l.preco_venda as Preço_Venda from venda v inner join cliente c on v.cod_cliente=c.cod_cliente inner join funcionario f on f.cod_funcionario=v.cod_funcionario inner join livro l on l.cod_livro=v.cod_livro";

        public Form_Venda_Alterar()
        {
            InitializeComponent();
        }

        private void btnSair_Click(object sender, EventArgs e)
        {
            Close();
        }

        private void txtPesquisa_TextChanged(object sender, EventArgs e)
        {
            if(radioFuncionario.Checked == true){

                tabela_Venda.DataSource = c.criaTabelaComSelect("select v.cod_venda as Codigo, v.data as Data_Venda, c.nome as Nome_Cliente, f.nome as Nome_Funcionario, l.titulo as Titulo, l.preco_venda as Preço_Venda from venda v inner join cliente c on v.cod_cliente=c.cod_cliente inner join funcionario f on f.cod_funcionario=v.cod_funcionario inner join livro l on l.cod_livro=v.cod_livro where f.nome like '%" + txtPesquisa.Text + "%'");

            }
            else if(radioCliente.Checked == true){

                tabela_Venda.DataSource = c.criaTabelaComSelect("select v.cod_venda as Codigo, v.data as Data_Venda, c.nome as Nome_Cliente, f.nome as Nome_Funcionario, l.titulo as Titulo, l.preco_venda as Preço_Venda from venda v inner join cliente c on v.cod_cliente=c.cod_cliente inner join funcionario f on f.cod_funcionario=v.cod_funcionario inner join livro l on l.cod_livro=v.cod_livro where c.nome like '%" + txtPesquisa.Text + "%'");

            }           
           
            else if (radioTitulo.Checked == true){

                tabela_Venda.DataSource = c.criaTabelaComSelect("select v.cod_venda as Codigo, v.data as Data_Venda, c.nome as Nome_Cliente, f.nome as Nome_Funcionario, l.titulo as Titulo, l.preco_venda as Preço_Venda from venda v inner join cliente c on v.cod_cliente=c.cod_cliente inner join funcionario f on f.cod_funcionario=v.cod_funcionario inner join livro l on l.cod_livro=v.cod_livro where l.titulo like '%" + txtPesquisa.Text + "%'");

            }
            else{

                MessageBox.Show("Por favor selecione o parametro de pesquisa.\n Se ela será por nome de cliente, nome de funcionario, ou data de venda");

            }

        }

        private void Form_Venda_Alterar_Load(object sender, EventArgs e)
        {
            // TODO: esta linha de código carrega dados na tabela 'livrariaDataSet2.funcionario'. Você pode movê-la ou removê-la conforme necessário.
            this.funcionarioTableAdapter.Fill(this.livrariaDataSet2.funcionario);
            // TODO: esta linha de código carrega dados na tabela 'livrariaDataSet2.cliente'. Você pode movê-la ou removê-la conforme necessário.
            this.clienteTableAdapter.Fill(this.livrariaDataSet2.cliente);
            // TODO: esta linha de código carrega dados na tabela 'livrariaDataSet2.livro'. Você pode movê-la ou removê-la conforme necessário.
            this.livroTableAdapter.Fill(this.livrariaDataSet2.livro);
          
           tabela_Venda.DataSource = c.criaTabelaComSelect(comando);
        }

        private void btnAplicar_Click(object sender, EventArgs e)
        {
            if( c.ExecutarComando("update venda set data='"+data_VEnda.Text+"', valor_total='"+txtValor.Text+"', cod_funcionario='"+txtCod_funcionario.Text+"', cod_cliente='"+txtCod_Cliente.Text+"', cod_livro='"+txtCod_livro.Text+"' where cod_venda='"+txtCod_venda.Text+"'")){

                txtCliente.Clear();
                txtCod_Cliente.Clear();
                txtCod_funcionario.Clear();
                txtCod_livro.Clear();
                txtCod_venda.Clear();
                txtFuncionario.Clear();
                txtPesquisa.Clear();
                txtTitulo.Clear();
                txtValor.Clear();
                textBox1.Clear();
                textBox2.Clear();
                textBox3.Clear();

                MessageBox.Show("Altualizado com sucesso.");
           
                c.Desconectar();

             tabela_Venda.DataSource = c.criaTabelaComSelect(comando);
            }
            else{
                MessageBox.Show("Ocorreu um erro.");
            }
        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {
            tabela_Livro.DataSource = c.criaTabelaComSelect("select cod_livro, titulo, preco_venda from livro where titulo like '%"+textBox1.Text+"%'");
        }

        private void textBox2_TextChanged(object sender, EventArgs e)
        {
            tabela_Funcionario.DataSource = c.criaTabelaComSelect("select cod_funcionario, nome, cargo from funcionario where nome like '%" + textBox2.Text + "%'");
      
        }

        private void textBox3_TextChanged(object sender, EventArgs e)
        {
            tabela_Cliente.DataSource = c.criaTabelaComSelect("select cod_cliente, nome from cliente where nome like '%" + textBox3.Text + "%'");
      
        }

        private void tabela_Venda_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {
            txtCod_venda.Text = tabela_Venda.CurrentRow.Cells[0].Value.ToString();
            data_VEnda.Text = tabela_Venda.CurrentRow.Cells[1].Value.ToString();
            txtValor.Text = tabela_Venda.CurrentRow.Cells[5].Value.ToString();

        }

        private void tabela_Livro_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {
            txtCod_livro.Text = tabela_Livro.CurrentRow.Cells[0].Value.ToString();
            txtTitulo.Text = tabela_Livro.CurrentRow.Cells[1].Value.ToString();

        }

        private void tabela_Funcionario_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {

            txtCod_funcionario.Text = tabela_Funcionario.CurrentRow.Cells[0].Value.ToString();
            txtFuncionario.Text = tabela_Funcionario.CurrentRow.Cells[1].Value.ToString();

        }

        private void tabela_Cliente_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {


            txtCod_Cliente.Text = tabela_Cliente.CurrentRow.Cells[0].Value.ToString();
            txtCliente.Text = tabela_Cliente.CurrentRow.Cells[1].Value.ToString();
        
        }  
    }
}
