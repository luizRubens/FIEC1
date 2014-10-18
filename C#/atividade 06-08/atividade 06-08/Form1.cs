using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace atividade_06_08
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void btnBuscar_Click(object sender, EventArgs e)
        {

            conexao conexao = new conexao();

            dataGridView1.DataSource = conexao.criaTabelaComSelect("select * from produto where descricao like '%" + txtNome.Text + "%'");
         
        }

        private void btnVer_Click(object sender, EventArgs e)
        {
            conexao conexao = new conexao();

            dataGridView1.DataSource = conexao.criaTabelaComSelect("select * from produto");
         
        }

        private void btnSair_Click(object sender, EventArgs e)
        {
            Close();
        }
    }
}
