package br.com.treinarminas.academico.classandobject;

public class TesteEnum {

	public static void main(String[] args) {
		DiaSemana dia = DiaSemana.SEGUNDA_FEIRA;
		
		System.out.println(dia);
		
		String diaStr = "DOMINGO";
		
		DiaSemana domingo = DiaSemana.valueOf(diaStr);
		
		System.out.println(domingo);

		DiaSemana[] dias = DiaSemana.values();
		System.out.println();
		for (int i = 0; i < dias.length; i++) {
			System.out.println("Dia: " + dias[i].ordinal() + " = " + dias[i]);
		}
		
		System.out.println("Ordinal Quinta Feira: " + DiaSemana.QUINTA_FEIRA.ordinal());
		
		
		System.out.println(dias[6].getFinalDeSemana());
		System.out.println(DiaSemana.SEGUNDA_FEIRA.getFinalDeSemana());
		
		
		System.out.println(DiaSemana.SEGUNDA_FEIRA.ehDiaDeFarra());
		System.out.println(DiaSemana.DOMINGO.ehDiaDeFarra());
		
	}

}
