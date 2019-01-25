package br.com.treinarminas.academico.classandobject;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Mouse m = new Mouse();
//		m.cor = "preto";
//		m.marca = "Wise";
//		m.modelo = "N568";
//		m.numBotoes = 2;
//		m.fabricante = new Fabricante();
//		m.fabricante.endereco = new Endereco();
//		m.fabricante.endereco.bairro = "centro"; 
//		
//		m.fabricante.CNPJ = "01.123.4565/0001-12";
//		Mouse m2 = new Mouse();
//		m2 = m;
//		System.out.println("Dados do mouse: cor ->" + m2.cor + " Marca-> " + m2.marca);
//		System.out.println(m.fabricante.endereco.bairro);
//		
//		
//		
//		// --------------------------------------------------------------Exemplo 2 para emplificar instancias ---------------------------
//		
//		
//		Pessoa p = new Pessoa();
//		p.nome = "Maria sofia";
//		p.idade = 6;
//		p.sexo = 'F';
//		p.endereco = new Endereco();
//		p.endereco.cidade = "contagem";
//		p.endereco.bairro = "Santa Juliana";
//		
//		System.out.println(p.nome);
//		System.out.println(p.endereco.cidade);
//		System.out.println(p.endereco.bairro);
		
		
		//=====Atividade de metoodo ===
		
		Mouse m = new Mouse();
		for (int i = 0; i < 10; i++) {
			m.clicarBtnDireito();
		}
		for (int i = 0; i < 15; i++) {
			m.clicarBtnEsquerdo();
		}
		
		System.out.println("Quantidade de cliques no botao direito - >" +m.clkBtnBireito);
		System.out.println("Quantidade de cliques no botao esquerdo - >" +m.clkBtnEsquerdo);
		
	}

}

