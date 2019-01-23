package academico.primitive.data.types;

public class Ex01FracaoHorasMinutos {
	public static void main(String[] args) {
		int n = 1942;
		int hora = 60;
		int resultadoH = n / hora;
		int resultadoM = n % hora;
		System.out.println("Quantide de horas: " + resultadoH + " Minutos: " + resultadoM);
	}

}
