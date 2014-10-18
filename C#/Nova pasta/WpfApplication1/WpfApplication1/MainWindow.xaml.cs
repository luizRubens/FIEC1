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

        private void btOk_Click(object sender, RoutedEventArgs e)
        {



            if (comboEstado.SelectionBoxItem == "")
            {
                MessageBox.Show("Selecione qual é o seu estado.");

            }
            if (comboCivil.SelectionBoxItem == "")
            {
                MessageBox.Show("Selecione qual é o seu estado civil.");

            }
            if (txtEndereço.Text == "")
            {
                MessageBox.Show("Forneça seu endereço.");

            }
            if (txtcpf.Text == "")
            {
                MessageBox.Show("Forneça seu CPF");

            }
            if (txtNome.Text == "")
            {
                MessageBox.Show("Forneça seu nome.");

            }
            if (txtCidade.Text==""){
                MessageBox.Show("Forneça o nome da cidade.");

            }
            
            if (!(Boolean)radioNao.IsChecked || (Boolean)radioSim.IsChecked){
                MessageBox.Show("Marque se possui defiencia ou não");
             }

            if ( (Boolean)radioNao.IsChecked){
                list.Items.Add("Nome: "+txtNome.Text+" - CPF: "+txtcpf.Text+" - Endereço: "+txtEndereço.Text+" - Cidade: "+txtCidade.Text+" - UF: "+comboEstado.SelectionBoxItem+" - Estado civil: "+comboCivil.SelectionBoxItem+" - Não possui defiencia fisica.");

                txtCidade.Clear();
                txtcpf.Clear();
                txtEndereço.Clear();
                txtNome.Clear();
                
            }

            if ((Boolean)radioSim.IsChecked)
            {
                list.Items.Add("Nome: " + txtNome.Text + " - CPF: " + txtcpf.Text + " - Endereço: " + txtEndereço.Text + " - Cidade: " + txtCidade.Text + " - UF: " + comboEstado.SelectionBoxItem + " - Estado civil: " + comboCivil.SelectionBoxItem + " - Possui defiencia fisica.");

                txtCidade.Clear();
                txtcpf.Clear();
                txtEndereço.Clear();
                txtNome.Clear();

            }
         }

        private void comboCivil_SelectionChanged(object sender, SelectionChangedEventArgs e)
        {

        }
           
    }
}
