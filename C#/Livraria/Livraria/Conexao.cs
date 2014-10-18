using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Data.SqlClient;
using System.Configuration;
using System.Data;
using System.Windows.Forms;


namespace Livraria
{
    class Conexao
    {
        SqlConnection conexao;

        public Conexao(){
            conexao = new SqlConnection();
        }
        private void Conectar()
        {
            if(!(conexao.State == ConnectionState.Open))
            {
                conexao.ConnectionString = ConfigurationManager.ConnectionStrings["DBCS"].ConnectionString;
                conexao.Open();
            }
        
        }
        public void Desconectar()
        {
            conexao.Close();
        }

        public Boolean ExecutarComando(string comando)
        {
            try
            {
                SqlCommand c = new SqlCommand();

                c.CommandText = comando;
                c.Connection = conexao;
                Conectar();
                c.ExecuteNonQuery();
                return true;

            }
            catch(SqlException erro)
            {
                MessageBox.Show(erro.ToString());
                return false;
            }
        }

        public DataTable criaTabelaComSelect(string select)
        {
            this.Conectar();

            SqlCommand c = new SqlCommand();

            c.CommandText = select;
            c.Connection = this.conexao;
            SqlDataReader leitor = c.ExecuteReader();
            DataTable tabela = new DataTable();
            tabela.Load(leitor);
            Desconectar();
            return tabela;
        }
        public string selecionaUmRegistro(string command)
        {
            SqlCommand comando = new SqlCommand(command, conexao);
            string retorno;
            Conectar();
            SqlDataReader leitor = comando.ExecuteReader();
            if (leitor.Read())
            {
                retorno = leitor.GetValue(0).ToString();
            }

            else
                retorno = "";

            Desconectar();
            return retorno;

        }
        public String BuscarNome(String comando)
        {
            String nome;
            nome = "";
            try
            {
                SqlCommand c = new SqlCommand();
                c.CommandText = comando;
                c.Connection = this.conexao;
                Conectar();
                SqlDataReader leitor = c.ExecuteReader();

                while (leitor.Read() == true)
                {
                    nome = leitor["nome"].ToString();
                }
                return nome;
            }
            catch (SqlException erro)
            {
                return "Erro " + erro.ToString();
            }
        }
    }
}
