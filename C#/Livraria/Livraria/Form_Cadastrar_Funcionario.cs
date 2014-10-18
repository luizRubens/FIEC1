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
    public partial class Form_Cadastrar_Funcionario : Form
    {

        public Form_Cadastrar_Funcionario()
        {
            InitializeComponent();
        }

        private void btSair_Click(object sender, EventArgs e)
        {
            Close();
        }

        private void btnCadastrar_Click(object sender, EventArgs e)
        {
            Conexao c = new Conexao();

            string senha1,senha2,senhaf;

            senha1=txtSenha.Text;
            senha2=txtConfirmar_Senha.Text;

            if(senha1==senha2 || senha1=="" || senha2==""){

                senhaf=senha1;

            try
            {

                c.ExecutarComando("insert into funcionario (cidade,bairro,nome,endereco,uf,cargo,email,salario,login,senha) values('" + txtCidade.Text + "','" + txtBairro.Text + "','" + txtNome.Text + "','" + txtEndereco.Text + "','" + comboEstado.Text + "','" + txtCargo.Text + "','" + txtEmail.Text + "','" + txtSalario.Text + "','" + txtLogin.Text+ "','" + senhaf+"')");

                txtBairro.Clear();
                txtCargo.Clear();
                txtCidade.Clear();
                txtConfirmar_Senha.Clear();
                txtEmail.Clear();
                txtEndereco.Clear();
                txtLogin.Clear();
                txtNome.Clear();
                txtSalario.Clear();
                txtSenha.Clear();
                txtTelefone.Clear();

                txtNome.Focus();


                MessageBox.Show("Gravado no banco de dados com sucesso!");
            }
            catch
            {
                MessageBox.Show("Ocorreu um erro na gravação.");
            }
            }
            else{
                MessageBox.Show("Senha incorreta");
            }
        }       
    }
}
