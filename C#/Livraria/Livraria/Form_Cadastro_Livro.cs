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

namespace Livraria
{
    public partial class Form_Cadastro_Livro : Form
    {

        Conexao c = new Conexao();

        public Form_Cadastro_Livro()
        {
            InitializeComponent();
        }


        private void button2_Click(object sender, EventArgs e)
        {
            Close();
        }

        private void editoraBindingNavigatorSaveItem_Click(object sender, EventArgs e)
        {
            this.Validate();
            this.editoraaBindingSource.EndEdit();
 //        this.tableAdapterManager.UpdateAll(this.livrariaDataSet2);

        }

        private void button1_Click(object sender, EventArgs e)
        {
            if (txtAno_Lanacamento.Text == "")
            {

                MessageBox.Show("Por favor forneça o ano de laçamento do livro.");

            }
            else if (txtAutor.Text == "")
            {

                MessageBox.Show("Por favor forneça o nome do autor.");

            }
            else if (txtGenero.Text == "")
            {

                MessageBox.Show("Por favor forneça o gênero.");


            }
            else if (txtPreco_compra.Text == "")
            {

                MessageBox.Show("Por favor forneça o gênero.");

            }
            else if (txtPreco_venda.Text == "")
            {

                MessageBox.Show("Por favor forneça o preço de venda.");

            }
            else if (txtQuantidade.Text == "")
            {

                MessageBox.Show("Por favor forneça a quantidade.");

            }
            else if (txtTitulo.Text == "")
            {

                MessageBox.Show("Por favor informe o título.");

            }
            else
            {
                try
                {

                    string codedi = tabela_Editora.CurrentRow.Cells[0].Value.ToString();

                    if (!(codedi=="")){
             
                    c.ExecutarComando("insert into livro (titulo,ano_lançamento,autor,preco_custo,preco_venda,genero,cod_editora,quantidade) values ('" + txtTitulo.Text + "','" + txtAno_Lanacamento.Text + "','" + txtAutor.Text + "','" + txtPreco_compra.Text + "','" + txtPreco_venda.Text + "','" + txtGenero.Text + "','" + codedi + "','" + txtQuantidade.Text + "')");


                    txtAno_Lanacamento.Clear();
                    txtAutor.Clear();
                    txtBusca.Clear();
                    txtGenero.Clear();
                    txtPreco_compra.Clear();
                    txtPreco_venda.Clear();
                    txtQuantidade.Clear();
                    txtTitulo.Clear();
                    txtTitulo.Focus();

                    c.Desconectar();

                    MessageBox.Show("Gravado no banco de dados com sucesso!");
         }
                    else
                    {
                        MessageBox.Show("Por favor selecione corretamente a editora.");
                    }
         }
                catch (SqlException e1)
                {
                    MessageBox.Show("Ocorreu um erro na gravação." + e1.ToString());
                }
            }
        }
        private void dataGridView1_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {
            tabela_Editora.DataSource = c.criaTabelaComSelect("select cod_editora,descricao from editoraa");

        }

        private void txtBusca_TextChanged(object sender, EventArgs e)
        {
            tabela_Editora.DataSource = c.criaTabelaComSelect("select cod_editora,descricao from editoraaa where descricao like '%" + txtBusca.Text + "%'");

        }

        private void Form_Cadastro_Livro_Load(object sender, EventArgs e)
        {
            tabela_Editora.DataSource = c.criaTabelaComSelect("select cod_editora,descricao from editoraa");
        }       
    }
}
