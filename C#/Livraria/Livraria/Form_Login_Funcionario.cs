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
    public partial class Form_Login_Funcionario : Form
    {
        public Form_Login_Funcionario()
        {
            InitializeComponent();
        }

        private void btnAcessar_Click(object sender, EventArgs e)
        {
            Conexao con = new Conexao();

            String nome = "";

            try
            {
                nome = con.BuscarNome("SELECT nome from funcionario where login ='" + txtLogin.Text + "' and  senha = '" + txtSenha.Text + "'");
            }
            catch
            {
                MessageBox.Show("Deu Merda");
            }
            if (nome != "")
            {
                MessageBox.Show("Bem Vindo, " + nome);
                this.DialogResult = DialogResult.OK;

            }
            else
            {

                txtLogin.Focus();
                MessageBox.Show("Erro ao fazer o login");
            }
        }
    }
}