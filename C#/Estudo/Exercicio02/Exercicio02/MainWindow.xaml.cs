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
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        public MainWindow()
        {
            InitializeComponent();
        }

        private void ListBox_SelectionChanged(object sender, SelectionChangedEventArgs e)
        {

        }

        private void btSair_Click(object sender, RoutedEventArgs e)
        {
            Close();
        }

        private void btCalcular_Click(object sender, RoutedEventArgs e)
        {
            double x, a, b, c, d, ee, f, g, h, i, j, r1, r2, r3, r4;

            a = Convert.ToDouble(txtA.Text);
            b = Convert.ToDouble(txtB.Text);
            c = Convert.ToDouble(txtC.Text);
            d = Convert.ToDouble(txtD.Text);
            ee = Convert.ToDouble(txtE.Text);
            f = Convert.ToDouble(txtF.Text);
            g = Convert.ToDouble(txtG.Text);
            h = Convert.ToDouble(txtH.Text);
            i = Convert.ToDouble(txtI.Text);
            j = Convert.ToDouble(txtJ.Text);

            r1=(a-b)+(ee+f);
            r2=(c-d)+(g+h);
            r3 = r1 * i;
            r4 = r2 * j;
            x = r3 / r4;

            list.Items.Add(x);

            txtA.Clear();
            txtB.Clear();
            txtC.Clear();
            txtD.Clear();
            txtE.Clear();
            txtF.Clear();
            txtG.Clear();
            txtH.Clear();
            txtI.Clear();
            txtJ.Clear();
            
        }
    }
}
