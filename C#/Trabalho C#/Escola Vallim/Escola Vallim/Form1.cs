using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Escola_Vallim
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void toolAluno_Click(object sender, EventArgs e)
        {
            Forms_Aluno aluno = new Forms_Aluno();
            aluno.ShowDialog();
        }

        private void toolProfessor_Click(object sender, EventArgs e)
        {
            Form_Professor Professor = new Form_Professor();
            Professor.ShowDialog();
        }

        private void toolStripButton3_Click(object sender, EventArgs e)
        {
            Form_disciplina Disciplina = new Form_disciplina();
            Disciplina.ShowDialog();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Close();
        }

        private void toolStripButton1_Click(object sender, EventArgs e)
        {
            Form_curso Curso = new Form_curso();
            Curso.ShowDialog();
        }

        private void btBuscar_professor_Click(object sender, EventArgs e)
        {
            Busca_professor buscar_professor = new Busca_professor();
            buscar_professor.ShowDialog();
        }

    }
}
