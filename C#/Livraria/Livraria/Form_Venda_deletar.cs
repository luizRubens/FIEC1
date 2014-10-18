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
    public partial class Form_Venda_deletar : Form
    {
        Conexao c = new Conexao();

        public Form_Venda_deletar()
        {
            InitializeComponent();
        }

        private void btnSair_Click(object sender, EventArgs e)
        {
            Close();
        }

        private void Form_Venda_deletar_Load(object sender, EventArgs e)
        {
            tabela_venda.DataSource = c.criaTabelaComSelect("select v.cod_venda as Codigo, v.data as Data_Venda, c.nome as Nome_Cliente, f.nome as Nome_Funcionario, l.titulo as Titulo, l.preco_venda as Preço_Venda from venda v inner join cliente c on v.cod_cliente=c.cod_cliente inner join funcionario f on f.cod_funcionario=v.cod_funcionario inner join livro l on l.cod_livro=v.cod_livro");
            
        }

        private void txtpesquisa_TextChanged(object sender, EventArgs e)
        {
            if (radioCliente.Checked == true)
            {

                tabela_venda.DataSource = c.criaTabelaComSelect("select v.cod_venda as Codigo, v.data as Data_Venda, c.nome as Nome_Cliente, f.nome as Nome_Funcionario, l.titulo as Titulo, l.preco_venda as Preço_Venda from venda v inner join cliente c on v.cod_cliente=c.cod_cliente inner join funcionario f on v.cod_funcionario=v.cod_funcionario inner join livro l on l.cod_livro=v.cod_livro where c.nome like '%" + txtpesquisa.Text + "%'");

            }
        
            else if (radioFuncionario.Checked == true)
            {

                tabela_venda.DataSource = c.criaTabelaComSelect("select v.cod_venda as Codigo, v.data as Data_Venda, c.nome as Nome_Cliente, f.nome as Nome_Funcionario, l.titulo as Titulo, l.preco_venda as Preço_Venda from venda v inner join cliente c on v.cod_cliente=c.cod_cliente inner join funcionario f on v.cod_funcionario=v.cod_funcionario inner join livro l on l.cod_livro=v.cod_livro where f.nome like '%" + txtpesquisa.Text + "%'");

            }
            else if (radioLivro.Checked == true)
            {

                tabela_venda.DataSource = c.criaTabelaComSelect("select v.cod_venda as Codigo, v.data as Data_Venda, c.nome as Nome_Cliente, f.nome as Nome_Funcionario, l.titulo as Titulo, l.preco_venda as Preço_Venda from venda v inner join cliente c on v.cod_cliente=c.cod_cliente inner join funcionario f on v.cod_funcionario=v.cod_funcionario inner join livro l on l.cod_livro=v.cod_livro where l.titulo like '%" + txtpesquisa.Text + "%'");

            }
            else
            {

                MessageBox.Show("Por favor selecione o parametro de pesquisa.\n Se ela será por nome de cliente, nome de funcionario, ou titulo do livro");

            }
        }

        private void btnDeletar_Click(object sender, EventArgs e)
        {
            string cod = tabela_venda.CurrentRow.Cells[0].Value.ToString();

            if(!(cod=="")){

            c.ExecutarComando("delete from venda where cod_venda="+cod+"");

            c.Desconectar();


            tabela_venda.DataSource = c.criaTabelaComSelect("select v.cod_venda as Codigo, v.data as Data_Venda, c.nome as Nome_Cliente, f.nome as Nome_Funcionario, l.titulo as Titulo, l.preco_venda as Preço_Venda from venda v inner join cliente c on v.cod_cliente=c.cod_cliente inner join funcionario f on v.cod_funcionario=v.cod_funcionario inner join livro l on l.cod_livro=v.cod_livro where f.nome like '%" + txtpesquisa.Text + "%'");

            }
            else
            {
                MessageBox.Show("Por favor selecione uma venda corretamente.");
            }
        }
    }
}
