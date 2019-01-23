
public class ComandoRepeticaoWhile {
	public static void main(String[] args) {
		int x = 10;
		while (x < 20) {
			if (x % 2 == 0) {
				System.out.println("value of x : " + x + " é Par");	
			} else {
				System.out.println("value of x : " + x + " é Impar");	
			}
			x = x + 1;
		}
		System.out.println("Fim");
	}

}
