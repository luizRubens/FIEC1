using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using MySql.Data.MySqlClient;

namespace Escola_Vallim
{
    public partial class Form_curso : Form
    {

        int c = 0;

        public Form_curso()
        {
            InitializeComponent();
        }

        private void btCadastrar_Click(object sender, EventArgs e)
        {
            MySqlConnection conexao;

            string caminho = "SERVER=localhost;DATABASE=trabalho_c_sharp;UID=root;PWD=";

            conexao = new MySqlConnection(caminho);

            if (txtCoordenador.Text==""){
                MessageBox.Show("Por favor insira o nome do coordenador.");

            }
            if (txtDescricao.Text == "")
            {
                MessageBox.Show("Por favor forneça uma descrição.");

            }
            if (txtDuracao.Text == "")
            {
                MessageBox.Show("Por favor informe a duração do curso.");

            }
            if (txtLocal.Text == "")
            {
                MessageBox.Show("Por favor informe o local.");

            }
            if (txtNum_sala.Text == "")
            {
                MessageBox.Show("Por favor informe o numero da sala.");

            }
            if (txtQuantidade.Text == "")
            {
                MessageBox.Show("Por favor informe a quantidade.");

            }
            try
            {
                conexao.Open();

                string descricao = txtDescricao.Text;
                string periodo = comboPeriodo.Text;
                string coordenador = txtCoordenador.Text;
                string duracao = txtDuracao.Text;
                string quantidade = txtQuantidade.Text;
                string local = txtLocal.Text;
                string num_sala = txtNum_sala.Text;

                string inserir = "INSERT INTO curso (descricao,periodo,coordenador,duracao,quantidade_modulos,local,num_sala)" + " VALUES ('" + descricao + "','" + periodo + "','" + coordenador + "','" + duracao + "','" + quantidade + "','" + local + "','" + num_sala +"')";

                MySqlCommand comando;

                comando = new MySqlCommand(inserir, conexao);
                
                comando.ExecuteNonQuery();

                MessageBox.Show("Gravado no banco de dados com sucesso.");

                txtCoordenador.Clear();
                txtDescricao.Clear();
                txtDuracao.Clear();
                txtLocal.Clear();
                txtNum_sala.Clear();
                txtQuantidade.Clear();
                
            }
            catch
            {
                MessageBox.Show("Ocorreu um erro ao se conectar com o banco de dados.");
            }

        }
        
        private void btSair_Click(object sender, EventArgs e)
        {
            Close();
        }

        private void btMais_Click(object sender, EventArgs e)
        {
            if (txtQuantidade.Text == "")
            {
                txtQuantidade.Text = "0";
            }

            int v = Int32.Parse(txtQuantidade.Text);
            c = c + 1;
            txtQuantidade.Text = c.ToString();
        }

        private void btMenos_Click(object sender, EventArgs e)
        {
            if (txtQuantidade.Text == "")
            {
                txtQuantidade.Text = "0";
            }

            int v = Int32.Parse(txtQuantidade.Text);
            c = c - 1;
            txtQuantidade.Text = c.ToString();
        }

        private void btMais2_Click(object sender, EventArgs e)
        {
            if (txtNum_sala.Text == "")
            {
                txtNum_sala.Text = "0";
            }

            int v = Int32.Parse(txtNum_sala.Text);
            c = c + 1;
            txtNum_sala.Text = c.ToString();
        }

        private void btMenos2_Click(object sender, EventArgs e)
        {
            if (txtNum_sala.Text == "")
            {
                txtNum_sala.Text = "0";
            }

            int v = Int32.Parse(txtNum_sala.Text);
            c = c - 1;
            txtNum_sala.Text = c.ToString();
        }

     } 
}
