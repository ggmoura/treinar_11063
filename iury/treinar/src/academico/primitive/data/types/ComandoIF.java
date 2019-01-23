package academico.primitive.data.types;

public class ComandoIF {
/**
 * @param args
 */
public static void main(String[] args) {
	int a =10; 
    int b =20;
    if (a < b) {
		System.out.println("a eh menor que b ");
		if (b == 21) 
		{
			System.out.println("b eh igual a 20 ");
		}
		else 
		{	
			if(b == a ) 
			{
			System.out.println("b não eh igual a 21");
			}
		}
	}
    System.out.println("Fim do meu programa");
    
}
}
