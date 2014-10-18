using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;

namespace Exercicio3
{
    /// <summary>
    /// Interação lógica para MainWindow.xam
    /// </summary>
    public partial class MainWindow : Window
    {
        public MainWindow()
        {
            InitializeComponent();
        }

        private void btgerar_Click(object sender, RoutedEventArgs e)
        {
            if(txtParcelas.Text==""){
                MessageBox.Show("Digite o numero de parcelas.");

            }
            if (txtValor.Text == "")
            {
                MessageBox.Show("Digite o valor total da compra.");

            }
            double compra, parcela, quantidade;
            

             compra= Convert.ToDouble(txtValor.Text);

             quantidade= Convert.ToDouble(txtParcelas.Text);
             parcela = compra / quantidade;

             quantidade = Convert.ToDouble(txtParcelas.Text);
             for (int i = 1; i <= quantidade;i++)
             {
                 list.Items.Add("Parcela "+i+ " = R$ "+parcela);
             }
             txtParcelas.Clear();
             txtValor.Clear();
                   
        }
    }
}
