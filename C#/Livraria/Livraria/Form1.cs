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
    public partial class Inicial : Form
    {
        public Inicial()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Close();
        }

        private void toolStripMenuItem1_Click(object sender, EventArgs e)
        {
            Form_Cadastro_Editora cedi = new Form_Cadastro_Editora();
            cedi.ShowDialog();
        }

        private void toolStripMenuItem2_Click(object sender, EventArgs e)
        {
            Form_Cadastro_Cliente ccli = new Form_Cadastro_Cliente();
            ccli.ShowDialog();
        }

        private void toolStripMenuItem3_Click(object sender, EventArgs e)
        {
            Form_Cadastrar_Funcionario cfun = new Form_Cadastrar_Funcionario();
            cfun.ShowDialog();
        }

        private void toolStripMenuItem4_Click(object sender, EventArgs e)
        {
            Form_Cadastro_Livro cliv = new Form_Cadastro_Livro();
            cliv.ShowDialog();
        }

        private void toolStripMenuItem5_Click(object sender, EventArgs e)
        {
            Form_Alterar_Editora aedi = new Form_Alterar_Editora();
            aedi.ShowDialog();
        }

        private void toolStripMenuItem6_Click(object sender, EventArgs e)
        {
            Form_Alterar_Cliente acli = new Form_Alterar_Cliente();
            acli.ShowDialog();
        }

        private void toolStripMenuItem7_Click(object sender, EventArgs e)
        {
            Form_Alterar_Funcionario afun = new Form_Alterar_Funcionario();
            afun.ShowDialog();
        }

        private void toolStripMenuItem8_Click(object sender, EventArgs e)
        {
            Form_Alterar_Livro aliv = new Form_Alterar_Livro();
            aliv.ShowDialog();
        }

        private void toolStripMenuItem9_Click(object sender, EventArgs e)
        {
            Form_Nova_Venda nnov_ven = new Form_Nova_Venda();
            nnov_ven.ShowDialog();
        }

        private void toolStripMenuItem10_Click(object sender, EventArgs e)
        {
            Form_Venda_Alterar alven = new Form_Venda_Alterar();
            alven.ShowDialog();
        }

        private void toolStripMenuItem11_Click(object sender, EventArgs e)
        {
            Form_Venda_deletar delven = new Form_Venda_deletar();
            delven.ShowDialog();
        }

        private void button1_Click_1(object sender, EventArgs e)
        {
            Form_Nova_Venda nnov_ven = new Form_Nova_Venda();
            nnov_ven.ShowDialog();
        }
    }
}
