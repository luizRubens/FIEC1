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
    public partial class form_Professores : Form
    {
        public form_Professores()
        {
            InitializeComponent();
        }

        private void btSair_Click(object sender, EventArgs e)
        {
            Close();
        }

        private void btCadastrar_Click(object sender, EventArgs e)
        {
            MySqlConnection conexao;
            //String de conexão
            string caminho = "SERVER=localhost;DATABASE=trabalho_c_sharp;UID=root;PWD=1234";
            conexao = new MySqlConnection(caminho);
            if (txtCpf.Text == "")
            {
                MessageBox.Show("Por favor insira o CPF.");

            }
            if (txtNome.Text == "")
            {
                MessageBox.Show("Por favor insira o nome.");

            }
            if (txtRg.Text == "")
            {
                MessageBox.Show("Por favor insira o RG.");

            }
            if (txtTelefone.Text == "")
            {
                MessageBox.Show("Por favor insira o telefone.");

            }
       
            try
            {
                conexao.Open();
                //se der certo
                //MessageBox.Show("Conectado com sucesso!");
                string nome;
                string telefone;
                string data_nascimento;
                string rg;
                string cpf;
                Boolean deficiente= radioSim.IsAccessible;
                string escolaridade = comboEscolaridade.Text;
                string email;

                telefone = txtTelefone.Text;
                email = txtEmail.Text;
                nome = txtNome.Text;
                data_nascimento = dataCalendario.Value.Date.ToString("yyyy/MM/dd");
                rg = txtRg.Text;
                cpf = txtCpf.Text;

                string inserir = "INSERT INTO professor (nome,cpf,rg,escolaridade,deficiente,data_nascimento,telefone,email)" + " VALUES ('" + nome + "','" + cpf  + "','" + rg + "','" + escolaridade + "','" + deficiente + "','"+ data_nascimento +"','"+ telefone + "','" + email+"');";

                MessageBox.Show(inserir);

                MySqlCommand comando;

                comando = new MySqlCommand(inserir, conexao);

                comando.ExecuteNonQuery();

                MessageBox.Show("Gravado no banco de dados com sucesso.");

                txtCpf.Clear();
                txtNome.Clear();
                txtRg.Clear();
                txtTelefone.Clear();
                txtEmail.Clear();
                
            }
            catch
            {
                //se der errado
                MessageBox.Show("Ocorreu um erro ao se conectar ao banco de dados.");
            }
        }
      }
}
