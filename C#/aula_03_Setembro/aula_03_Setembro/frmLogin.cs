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
    /*btnLogin definico com Accept Button*/
{
    public partial class frmLogin : Form
    {
        public frmLogin()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            //Instancia classe conexão
            Conexao conexao = new Conexao();
            //Verifica apenas se o usuário existe
            if ((conexao.selecionaUmRegistro("SELECT id FROM usuarios WHERE nome = '" + txtNome.Text + "'")) != "")
            {
                MessageBox.Show("Usuário existe!");
                //Verificar se a senha é valida
                if ((conexao.selecionaUmRegistro("SELECT id FROM usuarios WHERE nome = '" + txtNome.Text + "' AND senha = '" + txtSenha.Text + "'")) != "")
                {
                    MessageBox.Show("Senha confere!");
                    this.DialogResult = DialogResult.OK;
                }
                else
                {
                    MessageBox.Show("Senha NÃO confere!");
                    txtSenha.Focus();
                    txtSenha.SelectAll();
                }
            }
            else
            {
                MessageBox.Show("Usuário NÃO existe!");
                txtNome.Focus();
                txtNome.SelectAll();
            }
        }

        private void button2_Click(object sender, EventArgs e)
        {
            this.DialogResult = DialogResult.Cancel;
        }
    }
}
