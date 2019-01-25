package br.com.treinarminas.academico.classandobject;

import java.util.Scanner;

public class Principal2 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		Pessoa p = new Pessoa();
		System.out.print("Informe o nome da Pessoa: ");
		p.nome = leitor.nextLine();
		leitor.close();
		
		p.endereco = new Endereco();
		p.endereco.rua = "Da Paz";
		System.out.println(p.nome);
		System.out.println("Passos dados: " + p.numeroPassoaDados);
		p.caminhar(200);
//		for (int i = 0; i < 200; i++) {
//			p.caminhar();
//		}
		//p.caloriasPerdidas = 1000; privado em pessoa 
		System.out.println("Passos dados: " + p.numeroPassoaDados);
		int c = p.calcularCaloriasPerdidas();
		System.out.println("Calorias Perdidas: " + c);
		
	}
	
}
