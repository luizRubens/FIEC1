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
    public partial class frmVenda : Form
    {
        public frmVenda()
        {
            InitializeComponent();
            ListaProduto();

        }

        public void ListaProduto()
        {
            Conexao conexao = new Conexao();

            cbxProduto.DataSource = conexao.selecionaRegistros("SELECT id, nome FROM produtos ORDER BY nome");

            cbxProduto.DisplayMember = "nome";

            cbxProduto.ValueMember = "id";

        }

        private void frmVenda_Load(object sender, EventArgs e)
        {
            ListaProduto();
        }
        private void GetValorUnitario()
        {
            Conexao conexao = new Conexao();
            txtVlrUnit.Text = conexao.selecionaUmRegistro("SELECT valor FROM produtos WHERE id = " + cbxProduto.SelectedValue.ToString());
            
        }

        private void btnCalcular_Click(object sender, EventArgs e)
        {
            GetValorUnitario();

            string valor = txtVlrUnit.Text;

            float valor_total = float.Parse(valor) * int.Parse(txtQtde.Text);

            txtVlrTotal.Text = valor_total.ToString();
        }

        private void cbxProduto_SelectedValueChanged(object sender, EventArgs e)
        {
            txtQtde.Clear();
            txtVlrUnit.Clear();
            txtVlrTotal.Clear();
        }
    }
}
