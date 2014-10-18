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

namespace WpfApplication1
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

        private void bt_Click(object sender, RoutedEventArgs e)
        {
            double salario;
      
           if ((Boolean)radioSim.IsChecked)
            {
                salario = Double.Parse(txtBruto.Text) - Double.Parse(txtDesconto.Text);
                listSalario.Items.Add(txtNome.Text + " - R$ " + salario+" (Aposentado).");

                txtNome.Clear();
                txtBruto.Clear();
                txtDesconto.Clear();
           }
            else if ((Boolean)radioNao.IsChecked)
            {
                salario = Double.Parse(txtBruto.Text);
                listSalario.Items.Add(txtNome.Text + " - R$ " + salario);

                txtNome.Clear();
                txtBruto.Clear();
                txtDesconto.Clear();
            }

        }
    }
}
