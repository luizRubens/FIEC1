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

        private void cb_SelectionChanged(object sender, SelectionChangedEventArgs e)
        {
        }

        private void bt1_Click(object sender, RoutedEventArgs e)
        {
            cb.Items.Add(txtnome.Text + " - " + txtuf.Text);
            txtnome.Clear();
            txtuf.Clear();
        }
    }
}
