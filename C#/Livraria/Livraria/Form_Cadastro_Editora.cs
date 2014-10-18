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
    public partial class Form_Cadastro_Editora : Form
    {
        public Form_Cadastro_Editora()
        {
            InitializeComponent();
        }

        private void btnSair_Click(object sender, EventArgs e)
        {
            Close();
        }

        private void btnCadastrar_Click(object sender, EventArgs e)
        {
            if (txtDescricao.Text == "")
            {

                MessageBox.Show("Por favor forneça o nome da editora.");

            }
            else if (txtEmail.Text == "")
            {

                MessageBox.Show("Por favor forneça o nome da editora.");

            }
            else if (txtEndereco.Text == "")
            {

                MessageBox.Show("Por favor forneça o endereço.");

            }
            else if (txtResponsavel.Text == "")
            {


                MessageBox.Show("Por favor forneça o nome do responsável.");


            }
            else if (txtTelefone.Text == "")
            {

                MessageBox.Show("Por favor forneça o telefone.");

            }
            else
            {
                try
                {
                    Conexao con = new Conexao();

                    con.ExecutarComando("insert into editoraa (telefone,descricao,endereco,email,responsavel) values('" + txtTelefone.Text + "','" + txtDescricao.Text + "','" + txtEndereco.Text + "','" + txtEmail.Text + "','" + txtResponsavel.Text + "')");

                    txtDescricao.Clear();
                    txtEmail.Clear();
                    txtEndereco.Clear();
                    txtResponsavel.Clear();
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
}
