using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Configuration;
using System.Data;
using System.Data.SqlClient;

namespace aula03
{
    class conexao
    {
        private SqlConnection con;
        private string cs;

        public SqlConnection conectar()
        {
            cs = ConfigurationManager.ConnectionStrings["DBCS"].ConnectionString;

            con = new SqlConnection(cs);

            con.Open();

            return this.con;
        }

        public DataTable criaTabelaComSelect(string select)
        {
            this.conectar();

            SqlCommand comando = new SqlCommand();

            comando.CommandText = select;
            comando.Connection = this.con;
            SqlDataReader leitor = comando.ExecuteReader();
            DataTable tabela = new DataTable();
            tabela.Load(leitor);
            return tabela;
            
        }
    }
}