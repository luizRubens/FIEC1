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


namespace Trabalho
{
    public partial class Forms_Aluno : Form
    {
        public Forms_Aluno()
        {
            InitializeComponent();
        }
        private void button1_Click_1(object sender, EventArgs e)
        {
            MySqlConnection conexao;
            //String de conexão
            string caminho = "SERVER=localhost;DATABASE=trabalho_c_sharp;UID=root;PWD=1234";
            conexao = new MySqlConnection(caminho);
            if (txtCPF1.Text == "")
            {
                MessageBox.Show("Por favor insira o CPF.");

            }
            if (txtNome1.Text == "")
            {
                MessageBox.Show("Por favor insira o nome.");

            }
            if (txtRG1.Text == "")
            {
                MessageBox.Show("Por favor insira o RG.");

            }
            if (txtRM1.Text == "")
            {
                MessageBox.Show("Por favor insira o RM.");

            }


            try
            {
                conexao.Open();
                //se der certo
                //MessageBox.Show("Conectado com sucesso!");
                string nome;
                string rm;
                string data_nascimento;
                string rg;
                string cpf;

                nome = txtNome1.Text;
                rm = txtRM1.Text;
                data_nascimento = data_nascimento1.Value.Date.ToString("yyyy/MM/dd");
                rg = txtRG1.Text;
                cpf = txtCPF1.Text;

                string inserir = "INSERT INTO aluno (nome, rm, data_nascimento, rg, cpf)" + "VALUES('" + nome + "','" + rm + "','" + data_nascimento + "','" + rg + "','" + cpf + "');";

                MessageBox.Show(inserir);

                MySqlCommand comando;

                comando = new MySqlCommand(inserir, conexao);

                comando.ExecuteNonQuery();

                MessageBox.Show("Gravado no banco de dados com sucesso.");

                txtCPF1.Clear();
                txtNome1.Clear();
                txtRG1.Clear();
                txtRM1.Clear();
            }
            catch
            {
                //se der errado
                MessageBox.Show("Ocorreu um erro ao se conectar ao banco de dados.");
            }
        }

        private void button2_Click_1(object sender, EventArgs e)
        {
            Close();
        }

        
    }
}