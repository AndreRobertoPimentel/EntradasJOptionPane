package testes;

import javax.swing.JOptionPane;

import classes.Viagem;

public class TestaViagem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaracao de Variaveis
		
		float velocidade,tempo;

		//Entradas
		
		velocidade = Float.parseFloat(JOptionPane.showInputDialog("entre com a velocidade da viagem em KM/h: "));
		tempo = Float.parseFloat(JOptionPane.showInputDialog("entre com o tempo de viagem em Horas: "));
		
		//Objeto da classe
		
		Viagem viagem = new Viagem(velocidade, tempo);
	
		//Processamento
		
		viagem.calcularDistancia();
		viagem.calcularLitrosUsados();
		
		//Saida
		
		JOptionPane.showMessageDialog(null, viagem.mostrarDados());
		
	}

}
