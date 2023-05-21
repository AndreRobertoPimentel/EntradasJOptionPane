package testes;

import javax.swing.JOptionPane;

import classes.Aluno;

public class TestaAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declaracao das variaveis
		
		String nome;
		float nota1,nota2;
				
		//entradas
		
		nome = JOptionPane.showInputDialog("entre com o nome do Aluno : ");
		nota1 = Float.parseFloat(JOptionPane.showInputDialog("Entre coma primeira nota do aluno: "));
		nota2 = Float.parseFloat(JOptionPane.showInputDialog("Entre com a segunda nota do alino: "));
		
		//objeto da classe
		
		Aluno aluno = new Aluno(nome, nota1, nota2);
		
		
		//Processamentos
		
		aluno.calcularMedia();
		aluno.verificarStatusAluno();
		
		//Saida
		
		JOptionPane.showMessageDialog(null, aluno.mostrarDados());
	}

}
