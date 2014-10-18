using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Livraria
{
    static class Program
    {
        /// <summary>
        /// Ponto de entrada principal para o aplicativo.
        /// </summary>
        [STAThread]
        static void Main()
        {
            Application.EnableVisualStyles();
            Application.SetCompatibleTextRenderingDefault(false);

            Form_Login_Funcionario lo = new Form_Login_Funcionario();

            if(lo.ShowDialog()==DialogResult.OK){
                Application.Run(new Inicial());

            }

        }
    }
}
