using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Data.SqlClient;
using System.Configuration;

namespace MyApp
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void btnConectar_Click(object sender, EventArgs e)
        {
            try
            {
                Conexao con = new Conexao();
                string da = Date_Calendario.Text;

                con.ExecutarComando("insert into Cliente (Nome,Data_nascimento) values('" + txtNome.Text +"','"+da+ "')");

                txtNome.Clear();
                MessageBox.Show("Gravado no banco de dados com sucesso!");
            }
            catch
            {
                MessageBox.Show("Ocorreu um erro na gravação.");
            }
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Close();
        }
    }
}
