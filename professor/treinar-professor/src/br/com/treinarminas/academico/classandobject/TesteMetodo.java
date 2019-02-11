package br.com.treinarminas.academico.classandobject;

public class TesteMetodo {

	public static void main(String[] args) {
		Integer ordemServico = 10481;
		String nomeServico = "Aula Java";
		String nome1 = "Maria Sophia 1";
		String nome2 = "Maria Sophia 2";
		String nome3 = "Maria Sophia 3";
		imprir(ordemServico, nomeServico, nome1, nome2, nome3, "Gleidson");
	}
	
	private static void imprir(Integer a, String b, String... nomes) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(nomes[2]);
		for (String nome : nomes) {
			System.out.println(nome);
		}
	}
	
}
