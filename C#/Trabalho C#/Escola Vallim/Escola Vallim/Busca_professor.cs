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
    public partial class Busca_professor : Form
    {
        public Busca_professor()
        {
            InitializeComponent();
        }

        private void btBuscar_Click(object sender, EventArgs e)
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

            comboBusca_professor.Items.Clear();

            while(leitor.Read()){
                comboBusca_professor.Items.Add (leitor["nome"].ToString());
                        
            }
        }
    }
}
