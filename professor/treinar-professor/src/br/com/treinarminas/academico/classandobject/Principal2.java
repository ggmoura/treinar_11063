package br.com.treinarminas.academico.classandobject;

public class Principal2 {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.nome = "Maria Sophia";
		p.endereco = new Endereco();
		p.endereco.rua = "Da Paz";
		
		System.out.println("Passos dados: " + p.numeroPassoaDados);
		p.caminhar(200);
//		for (int i = 0; i < 200; i++) {
//			p.caminhar();
//		}
		
		System.out.println("Passos dados: " + p.numeroPassoaDados);
		int c = p.calcularCaloriasPerdidas();
		System.out.println("Calorias Perdidas: " + c);
		
	}
	
}
