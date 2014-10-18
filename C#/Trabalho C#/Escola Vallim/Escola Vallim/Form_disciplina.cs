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
    public partial class Form_disciplina : Form
    {
        public Form_disciplina()
        {
            InitializeComponent();
        }

        private void btCadastrar_Click(object sender, EventArgs e)
        {
            MySqlConnection conexao;
            string caminho = "SERVER=localhost;DATABASE=trabalho_c_sharp;UID=root;PWD=";
            conexao = new MySqlConnection(caminho);
            if (txtCarga.Text == "")
            {
                MessageBox.Show("Por favor insira a carga horaria");
            }
            if (txtCurso.Text == "")
            {
                MessageBox.Show("Por favor insira o curso");
            }
            if (txtDescricao.Text == "")
            {
                MessageBox.Show("Por favor insira a descrição");
            }
           
            try
            {
                conexao.Open();

                string carga = txtCarga.Text;
                string curso = txtCurso.Text;
                string descricao = txtDescricao.Text;
                string professor = comboBuscaProfessor.Text;

                string inserir = "INSERT INTO disciplina (descricao,professor,carga_horaria,curso)" + " VALUES ('" + descricao + "','" + professor + "','" + carga + "','" + curso + "')";

                MySqlCommand comando;

                comando = new MySqlCommand(inserir, conexao);

                comando.ExecuteNonQuery();

                MessageBox.Show("Gravado no banco de dados com sucesso.");

                txtCarga.Clear();
                txtCurso.Clear();
                txtDescricao.Clear();
           

            }
            catch
            {
                //se der errado
                MessageBox.Show("Ocorreu um erro ao se conectar ao banco de dados.");
            }
        }

        private void btSair_Click(object sender, EventArgs e)
        {
            Close();
        }

        private void comboBuscaProfessor_SelectedIndexChanged(object sender, EventArgs e)
        {

        }

        private void Form_disciplina_Shown(object sender, EventArgs e)
        {
            MySqlConnection conexao;

            string caminho = "SERVER=localhost;DATABASE=trabalho_c_sharp;UID=root;PWD=";

            conexao = new MySqlConnection(caminho);

            try
            {
                conexao.Open();
            }
            catch (MySqlException erro)
            {

                MessageBox.Show("Falha ao acessar o banco de dados.");
            }

            MySqlCommand comando;

            string consulta = "select nome from professor;";

            comando = new MySqlCommand(consulta, conexao);

            MySqlDataReader leitor = comando.ExecuteReader();

            comboBuscaProfessor.Items.Clear();

            while (leitor.Read())
            {
                comboBuscaProfessor.Items.Add(leitor["nome"].ToString());

            }
        }
    }
}
