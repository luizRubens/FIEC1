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

namespace Exercicio02
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

        private void Button_Click(object sender, RoutedEventArgs e)
        {
            if(txtMusica.Text==""){
                MessageBox.Show("Digite o nome da musica.");
                }
            if (txtAlbum.Text == "")
            {
                MessageBox.Show("Digite o nome do album.");
            }

            if (txtBanda.Text == "")
            {
                MessageBox.Show("Digite o nome da banda.");
            }
            list.Items.Add(txtMusica.Text+" - "+txtAlbum.Text+" - "+txtBanda.Text);
            txtAlbum.Clear();
            txtBanda.Clear();
            txtMusica.Clear();
         }
    }
}
