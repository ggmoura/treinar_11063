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
		
		MetodosParaEnum M = new MetodosParaEnum();
		for (int i = 0; i < dias.length; i++) {			
			System.out.println("O dia "+ dias[i].ordinal()+ " da semana é:"+ M.RetornaDiaSemana(i));
			System.out.println("O dia "+ dias[i].ordinal()+ " da semana é fim de semana?:"+ M.RetornaDiaSemana(i).getFinalDeSemana());
		}
		

		
		
		
		
	}

}
