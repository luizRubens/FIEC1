using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Livraria
{
    public partial class Form_Cadastro_Cliente : Form
    {
        public Form_Cadastro_Cliente()
        {
            InitializeComponent();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            Close();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            
            try
            {
                Conexao con = new Conexao();

                con.ExecutarComando("insert into cliente (nome,email,telefone) values('" + txtNome.Text + "','" + txtEmail.Text + "','" + txtTelefone.Text + "')");

                txtEmail.Clear();
                txtNome.Clear();
                txtTelefone.Clear();

                MessageBox.Show("Gravado no banco de dados com sucesso!");

                con.Desconectar();
            }
            catch
            {
                MessageBox.Show("Ocorreu um erro na gravação.");
            }
        }
    }
}
