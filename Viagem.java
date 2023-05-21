package classes;

public class Viagem {
	
				//Atributos
	
	public float velocidade;
	public float tempo;
	public float distancia;
	public float litrosUsados;
			
			
				//Construtor
			
	public Viagem(float velocidade, float tempo) {
		super();
		this.velocidade = velocidade;
		this.tempo = tempo;
	}
				//Metodos
			
	public String mostrarDados() {
		return "Velocidade: " + this.velocidade + 
				" Km/h " + "\nTempo: " +  this.tempo + 
				" horas\nDistancia: " + this.distancia +
				" km\nLitros Usados : "+this.litrosUsados +" L";

	}
				
	public void calcularDistancia() {
				
		this.distancia = (this.tempo*this.velocidade);
	}
	public void calcularLitrosUsados() {
		this.litrosUsados = (this.distancia/12);
		
	}

}
