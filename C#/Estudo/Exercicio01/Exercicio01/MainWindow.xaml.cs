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

namespace Exercicio01
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        public MainWindow()
        {
            InitializeComponent();
        }

        private void btSair_Click(object sender, RoutedEventArgs e)
        {
            Close();
        }

        private void btConverter_Click(object sender, RoutedEventArgs e)
        {
            double dolar, cotacao, reais;
            dolar = Convert.ToDouble(txtDolares.Text);
            cotacao = Convert.ToDouble(txtCotacao.Text);

            reais = dolar * cotacao;

            list.Items.Add("R$ "+reais);

            if (txtCotacao.Text==""){
                MessageBox.Show("Por favor insira o valor da cotação.");

            }
            if (txtDolares.Text == "")
            {
                MessageBox.Show("Por favor insira o valor em dolares.");

            }

            txtCotacao.Clear();
            txtDolares.Clear();

          
        }
    }
}
