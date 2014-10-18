using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Data.SqlClient;
using System.Windows.Forms;
using System.Data;

namespace aula_03_Setembro
{
    class Conexao
    {
        SqlConnection cnn;

        public Conexao()
        {
            cnn = new SqlConnection("Data Source=LUIZ_RUBENS;Initial Catalog=vallim;Integrated Security=True");
        }

        private bool Conectar()
        {
            try
            {
                cnn.Open();
                return true;
            }
            catch (SqlException e){
                MessageBox.Show(e.ToString());
                return false;
            }            
        }

        private bool Desconectar()
        {
            try
            {
                cnn.Close();
                return true;
            }
            catch (SqlException e)
            {
                MessageBox.Show(e.ToString());
                return false;
            }
        }

        public DataTable selecionaRegistros(string command)
        {
            
            SqlCommand comando = new SqlCommand(command, cnn);
            Conectar();
            SqlDataReader leitor = comando.ExecuteReader();
            DataTable tabela = new DataTable();

            tabela.Load(leitor);
            Desconectar();

            return tabela;
        }
        public string selecionaUmRegistro(string command)
        {
            SqlCommand comando = new SqlCommand(command, cnn);
            string retorno;
            Conectar();
            SqlDataReader leitor = comando.ExecuteReader();
            if (leitor.Read()){
                retorno = leitor.GetValue(0).ToString();
            }
                
            else
                retorno = "";           
            
            Desconectar();
            return retorno;

        }

        public bool ExecutaComando(string command)
        {
            try
            {
                SqlCommand comando = new SqlCommand(command, cnn);
                Conectar();
                comando.ExecuteNonQuery();
                return true;
            }
            catch (SqlException e)
            {
                MessageBox.Show(e.ToString());
                return false;
            }
            finally
            {
                Desconectar();
            }
        }
    }
}