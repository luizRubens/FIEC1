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
    public partial class Forms_Aluno : Form
    {
        public Forms_Aluno()
        {
            InitializeComponent();
        }

        private void btCadastrar_Click(object sender, EventArgs e)
        {
            string caminho = "SERVER=localhost;DATABASE=trabalho_c_sharp;UID=root;PWD=";
            MySqlConnection conexao;
            conexao = new MySqlConnection(caminho);
            if (txtCpf.Text == "")
            {
                MessageBox.Show("Por favor insira o CPF.");

            }
            if (txtNome.Text == "")
            {
                MessageBox.Show("Por favor insira o nome.");

            }
            if (txtRG.Text == "")
            {
                MessageBox.Show("Por favor insira o RG.");

            }
            if (txtRG.Text == "")
            {
                MessageBox.Show("Por favor insira o RM.");

            }


            try
            {
                conexao.Open();
                //se der certo
                MessageBox.Show("Conectado com sucesso!");
                string nome;
                string rm;
                string data_nascimento;
                string rg;
                string cpf;

                nome = txtNome.Text;
                rm = txtRG.Text;
                data_nascimento = Calendario.Value.Date.ToString("yyyy-MM-dd");
                rg = txtRG.Text;
                cpf = txtCpf.Text;

                string inserir = "INSERT INTO aluno (nome,rm,data_nascimento,rg,cpf)" + " VALUES('" + nome + "','" + rm + "','" + data_nascimento + "','" + rg + "','" + cpf + "')";

                MessageBox.Show(inserir);

                MySqlCommand comando;

                comando = new MySqlCommand(inserir, conexao);

                comando.ExecuteNonQuery();

                MessageBox.Show("Gravado no banco de dados com sucesso.");

                txtCpf.Clear();
                txtNome.Clear();
                txtRG.Clear();
                txtRm.Clear();
            }
            catch(MySqlException eeee)
            {
                //se der errado
                MessageBox.Show("Ocorreu um erro ao se conectar ao banco de dados." + eeee);
            }
        }

        private void btSair_Click(object sender, EventArgs e)
        {
            Close();
        }

        private void label7_Click(object sender, EventArgs e)
        {

        }
    }
}
