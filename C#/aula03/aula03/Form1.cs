using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Configuration;
using System.Data.SqlClient;

namespace aula03
{
    public partial class Clientes : Form
    {
        public Clientes()
        {
            InitializeComponent();
        }

        private void btnVisu_Click(object sender, EventArgs e)
        {

            conexao conexao = new conexao();

            dataGridView1.DataSource = conexao.criaTabelaComSelect("select * from cliente where nome like '%" + txtNome.Text + "%'");
         

        }

     }
}
