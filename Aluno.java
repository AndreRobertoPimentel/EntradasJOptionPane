package classes;

public class Aluno {
	//Atributos
	
		public String nome;
		public float nota1;
		public float nota2;
		public float media;
		public String statusAluno;
		
			//Construtor
		
		public Aluno(String nome, float nota1, float nota2) {
			super();
			this.nome = nome;
			this.nota1 = nota1;
			this.nota2 = nota2;
			
		}
			//Metodos
		
		public String mostrarDados() {
			return "Nome: " + this.nome + 
					"\nNota1: " +  this.nota1 + 
					"\nNota2: " + this.nota2+
					"\nMedia: "+this.media+
					"\nO aluno está : "+this.statusAluno;

		}
			
		public void calcularMedia() {
			
			this.media = (this.nota1+this.nota2)/2;
		}
		public void verificarStatusAluno(){
			if(this.media>=5) {
				this.statusAluno = "Aprovado";
			}
			if (this.media<5) {
				this.statusAluno = "Reprovado";
			}
		}
	
}
