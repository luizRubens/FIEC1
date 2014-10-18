using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Data.SqlClient;
using System.Configuration;

namespace MyApp
{
    class Conexao
    {
        SqlConnection conexao;

        public Conexao()
        {
            conexao = new SqlConnection();
        }
        private void Conectar()
        {
            
            conexao.ConnectionString = ConfigurationManager.ConnectionStrings["DBCS"].ConnectionString;
            conexao.Open();
        }
        private void Desconectar()
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
            catch
            {
                return false;
            }
        }
    }
}
