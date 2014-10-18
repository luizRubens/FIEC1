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
    public partial class Form_Alterar_Funcionario : Form
    {
        Conexao c = new Conexao();

        public Form_Alterar_Funcionario()
        {
            InitializeComponent();
        }

        private void btnSair_Click(object sender, EventArgs e)
        {
            Close();
        }

        private void Form_Alterar_Funcionario_Load(object sender, EventArgs e)
        {
            // TODO: esta linha de código carrega dados na tabela 'livrariaDataSet2.funcionario'. Você pode movê-la ou removê-la conforme necessário.
            this.funcionarioTableAdapter.Fill(this.livrariaDataSet2.funcionario);

        }

        private void dataGridView1_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {
            txtBairro.Text = tabela_Funcionario.CurrentRow.Cells[3].Value.ToString();
            txtCargo.Text = tabela_Funcionario.CurrentRow.Cells[6].Value.ToString();
            txtCidade.Text = tabela_Funcionario.CurrentRow.Cells[4].Value.ToString();
            txtCod_Funcionario.Text = tabela_Funcionario.CurrentRow.Cells[0].Value.ToString();
            txtEmail.Text = tabela_Funcionario.CurrentRow.Cells[7].Value.ToString();
            txtEndereco.Text = tabela_Funcionario.CurrentRow.Cells[2].Value.ToString();
            txtNome.Text = tabela_Funcionario.CurrentRow.Cells[1].Value.ToString();
            txtSalario.Text = tabela_Funcionario.CurrentRow.Cells[8].Value.ToString();
   
        }

        private void btnCancelar_Click(object sender, EventArgs e)
        {

            this.DialogResult = DialogResult.Cancel;
            
        }

        private void txtBusca_nome_TextChanged(object sender, EventArgs e)
        {
            tabela_Funcionario.DataSource = c.criaTabelaComSelect("select * from funcionario where nome like '%" + txtBusca_nome.Text + "%'");

        }

        private void btnAplicar_Click(object sender, EventArgs e)
        {
            if (c.ExecutarComando("update funcionario set cidade='" + txtCidade.Text + "', bairro='" + txtBairro.Text + "', nome='" + txtNome.Text + "', endereco='" + txtEndereco.Text + "', cargo='" + txtCargo.Text + "', email='" + txtEmail.Text + "', salario='" + txtSalario.Text + "' where cod_funcionario='" + txtCod_Funcionario.Text + "'"))
            {
                MessageBox.Show("Alterado com sucesso.");

                txtBairro.Clear();
                txtBusca_nome.Clear();
                txtCargo.Clear();
                txtCidade.Clear();
                txtCod_Funcionario.Clear();
                txtEmail.Clear();
                txtEndereco.Clear();
                txtNome.Clear();
                txtSalario.Clear();
               
                c.Desconectar();

                tabela_Funcionario.DataSource = c.criaTabelaComSelect("select * from funcionario");

            }
            else
            {
                MessageBox.Show("Ocorreu um erro.");
            }

        }

        private void tabela_Funcionario_CellClick(object sender, DataGridViewCellEventArgs e)
        {
            txtBairro.Text = tabela_Funcionario.CurrentRow.Cells[3].Value.ToString();
            txtCargo.Text = tabela_Funcionario.CurrentRow.Cells[6].Value.ToString();
            txtCidade.Text = tabela_Funcionario.CurrentRow.Cells[4].Value.ToString();
            txtCod_Funcionario.Text = tabela_Funcionario.CurrentRow.Cells[0].Value.ToString();
            txtEmail.Text = tabela_Funcionario.CurrentRow.Cells[7].Value.ToString();
            txtEndereco.Text = tabela_Funcionario.CurrentRow.Cells[2].Value.ToString();
            txtNome.Text = tabela_Funcionario.CurrentRow.Cells[1].Value.ToString();
            txtSalario.Text = tabela_Funcionario.CurrentRow.Cells[8].Value.ToString();
            
        }

        private void btnDeletar_Click(object sender, EventArgs e)
        {
            if (MessageBox.Show("Deseja realmente deletar este funcionario?", "Confirmação", MessageBoxButtons.YesNo, MessageBoxIcon.Question) == DialogResult.Yes)
            {
                if (c.ExecutarComando("DELETE FROM funcionario WHERE cod_funcionario = '" + txtCod_Funcionario.Text+"'"))
                {
                    txtBairro.Clear();
                    txtBusca_nome.Clear();
                    txtCargo.Clear();
                    txtCidade.Clear();
                    txtCod_Funcionario.Clear();
                    txtEmail.Clear();
                    txtEndereco.Clear();
                    txtNome.Clear();
                    txtSalario.Clear();

                    c.Desconectar();

                    tabela_Funcionario.DataSource = c.ExecutarComando("select * from funcionario order by nome");
                }
                else
                {
                    MessageBox.Show("Ocorreu um erro.");
                }
            }
        }
    }
}
