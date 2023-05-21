package testes;

import javax.swing.JOptionPane;

import classes.Circulo;

public class TestaCirculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declarar as Variaveis
		
		float raio;
		
		//entradas
		
		raio = Float.parseFloat(JOptionPane.showInputDialog("Entre com o raio do circulo :"));
		
		//Passando Construtor
		Circulo circulo = new Circulo(raio);
	
		circulo.Raio();
		
		//Saida
		
		JOptionPane.showMessageDialog(null, circulo.mostrarDados());
		
	}

}
