package testes;

import javax.swing.JOptionPane;

import classes.Pessoa;

public class TestaPessoa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declaracao das variaveis
		
				String nome;
				float altura;
				int idade;
						
				//entradas
				
				nome = JOptionPane.showInputDialog("entre com o nome da Pessoa : ");
				altura = Float.parseFloat(JOptionPane.showInputDialog("Entre com a altura de " + nome + " :"));
				idade = Integer.parseInt(JOptionPane.showInputDialog("Entre com a idade de " + nome + " :"));
						
				//objeto da classe
				
				Pessoa pessoa = new Pessoa(nome, altura, idade);
				
				
				//Processamentos
				
				
				
				//Saida
				
				JOptionPane.showMessageDialog(null, pessoa.mostrarDados());
			}
	}


