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
    public partial class Form_Professor : Form
    {
        public Form_Professor()
        {
            InitializeComponent();
        }       

        private void btCadastrar_Click(object sender, EventArgs e)
        {
            if (checkDeficiente.Checked)
            {
            MySqlConnection conexao;
            //String de conexão
            string caminho = "SERVER=localhost;DATABASE=trabalho_c_sharp;UID=root;PWD=";
            conexao = new MySqlConnection(caminho);
            if (txtCPF.Text == "")
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
            if (txtTelefone.Text == "")
            {
                MessageBox.Show("Por favor insira o telefone.");

            }
                if (txtDeficiente.Text==""){
                    MessageBox.Show("Por favor forneça qual é a deficiencia");

                }

            
                try
            {
                conexao.Open();
                //se der certo
                MessageBox.Show("Conectado com sucesso!");
                string nome;
                string telefone;
                string data_nascimento;
                string rg;
                string cpf;
                string escolaridade = comboEscolaridade.Text;
                string email;
                string deficiente_desc = txtDeficiente.Text;
                string deficiente = "Sim";              

                telefone = txtTelefone.Text;
                email = txtEmail.Text;
                nome = txtNome.Text;
                data_nascimento = Calendario.Value.Date.ToString("yyyy-MM-dd");
                rg = txtRG.Text;
                cpf = txtCPF.Text;

                string inserir = "INSERT INTO professor (nome,cpf,rg,escolaridade,deficiente,data_nascimento,telefone,email,deficiente_desc)" + " VALUES ('" + nome + "','" + cpf + "','" + rg + "','" + escolaridade + "','" + deficiente + "','" + data_nascimento + "','" + telefone + "','" + email + "','" + deficiente_desc + "');";

                MessageBox.Show(inserir);

                MySqlCommand comando;

               comando = new MySqlCommand(inserir, conexao);

               comando.ExecuteNonQuery();

                MessageBox.Show("Gravado no banco de dados com sucesso.");

                txtCPF.Clear();
                txtNome.Clear();
                txtRG.Clear();
                txtTelefone.Clear();
                txtEmail.Clear();

            }
            catch
            {
                //se der errado
                MessageBox.Show("Ocorreu um erro ao se conectar ao banco de dados.");
            }
        
            }
            else {
            MySqlConnection conexao;
            //String de conexão
            string caminho = "SERVER=localhost;DATABASE=trabalho_c_sharp;UID=root;PWD=";
            conexao = new MySqlConnection(caminho);
            if (txtCPF.Text == "")
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
            if (txtTelefone.Text == "")
            {
                MessageBox.Show("Por favor insira o telefone.");

            }

            try
            {
                conexao.Open();
                //se der certo
               // MessageBox.Show("Conectado com sucesso!");
                string nome;
                string telefone;
                string data_nascimento;
                string rg;
                string cpf;
                string escolaridade = comboEscolaridade.Text;
                string email;
                string deficiente = "Nao";
                string deficiente_desc = "Nenhuma";
                              

                telefone = txtTelefone.Text;
                email = txtEmail.Text;
                nome = txtNome.Text;
                data_nascimento = Calendario.Value.Date.ToString("yyyy-MM-dd");
                rg = txtRG.Text;
                cpf = txtCPF.Text;

                string inserir = "INSERT INTO professor (nome,cpf,rg,escolaridade,deficiente,data_nascimento,telefone,email,deficiente_desc)" + " VALUES ('" + nome + "','" + cpf + "','" + rg + "','" + escolaridade + "','" + deficiente + "','" + data_nascimento + "','" + telefone + "','" + email + "','" + deficiente_desc + "')";

                //MessageBox.Show(inserir);

                MySqlCommand comando;

               comando = new MySqlCommand(inserir, conexao);

               comando.ExecuteNonQuery();

                MessageBox.Show("Gravado no banco de dados com sucesso.");

                txtCPF.Clear();
                txtNome.Clear();
                txtRG.Clear();
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

        private void btSair_Click(object sender, EventArgs e)
        {
            Close();
        }

        private void checkDeficiente_CheckedChanged(object sender, EventArgs e)
        {
            if (checkDeficiente.Checked)
                txtDeficiente.Visible = true;
            else
                txtDeficiente.Visible = false;
        }
    }
}
