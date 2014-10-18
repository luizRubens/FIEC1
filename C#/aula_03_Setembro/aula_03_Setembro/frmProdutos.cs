using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace aula_03_Setembro
{
    public partial class frmProdutos : Form
    {
        public frmProdutos()
        {
            InitializeComponent();
        }

        private void maskedTextBox1_Enter(object sender, EventArgs e)
        {

        }

        private void btnSalvar_Click(object sender, EventArgs e)
        {
            Conexao conexao = new Conexao();

            if (conexao.ExecutaComando("INSERT INTO produtos (nome, valor) VALUES ('" + txtNome.Text + "'," + txtValor.Text.Replace(',', '.')+")"))
                MessageBox.Show("Produto inserido com sucesso!","Informação");
        }
    }
}
