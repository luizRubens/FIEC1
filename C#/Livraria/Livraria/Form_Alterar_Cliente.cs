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
    public partial class Form_Alterar_Cliente : Form
    {
        public Form_Alterar_Cliente()
        {
            InitializeComponent();
        }

        Conexao c = new Conexao();

        private void btnSair_Click(object sender, EventArgs e)
        {
            Close();
        }
     
        private void btnAplicar_Click(object sender, EventArgs e)
        {
            if(c.ExecutarComando("update cliente set nome='" + txtNome.Text + "', email='" + txtEMail.Text + "', telefone='" + txtTelefone.Text + "' where cod_cliente='" + txtCod_cliente.Text + "'"))
            {
                MessageBox.Show("Alterado com sucesso.");

                txtCod_cliente.Clear();
                txtEMail.Clear();
                txtNome.Clear();
                txtTelefone.Clear();
                txtBusca_nome.Clear();

                c.Desconectar();

                tabela_Cliente.DataSource = c.criaTabelaComSelect("select * from cliente");

            }
            else
            {
                MessageBox.Show("Ocorreu um erro.");
            }

        }

        private void Form_Alterar_Cliente_Load(object sender, EventArgs e)
        {
            // TODO: esta linha de código carrega dados na tabela 'livrariaDataSet2.cliente'. Você pode movê-la ou removê-la conforme necessário.
            this.clienteTableAdapter.Fill(this.livrariaDataSet2.cliente);

        }

        private void dataGridView1_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {
            txtCod_cliente.Text = tabela_Cliente.CurrentRow.Cells[0].Value.ToString();
            txtNome.Text = tabela_Cliente.CurrentRow.Cells[1].Value.ToString();
            txtEMail.Text = tabela_Cliente.CurrentRow.Cells[2].Value.ToString();
            txtTelefone.Text = tabela_Cliente.CurrentRow.Cells[3].Value.ToString();
        }

        
        private void btnCancelar_Click(object sender, EventArgs e)
        {
            this.DialogResult = DialogResult.Cancel;
        }

        private void txtBusca_nome_TextChanged(object sender, EventArgs e)
        {
            tabela_Cliente.DataSource = c.criaTabelaComSelect("select * from cliente where nome like '%" + txtBusca_nome.Text + "%'");

        }
      

        private void button1_Click(object sender, EventArgs e)
        {
            if (MessageBox.Show("Deseja realmente deletar este cliente?", "Confirmação", MessageBoxButtons.YesNo, MessageBoxIcon.Question) == DialogResult.Yes)
            {
            if(c.ExecutarComando("DELETE FROM cliente WHERE cod_cliente = "+ txtCod_cliente.Text)){

                txtBusca_nome.Clear();
                txtCod_cliente.Clear();
                txtEMail.Clear();
                txtNome.Clear();
                txtTelefone.Clear();

                c.Desconectar();

                tabela_Cliente.DataSource = c.ExecutarComando("select * from cliente order by nome");
            }
            else
            {
                MessageBox.Show("Ocorreu um erro.");
            }
          }
        }

        private void tabela_Cliente_CellClick(object sender, DataGridViewCellEventArgs e)
        {
            txtCod_cliente.Text = tabela_Cliente.CurrentRow.Cells[0].Value.ToString();
            txtNome.Text = tabela_Cliente.CurrentRow.Cells[1].Value.ToString();
            txtEMail.Text = tabela_Cliente.CurrentRow.Cells[2].Value.ToString();
            txtTelefone.Text = tabela_Cliente.CurrentRow.Cells[3].Value.ToString();
        }

        private void button1_Click_1(object sender, EventArgs e)
        {
            MessageBox.Show(txtTelefone.Text);
        }
    }
}
