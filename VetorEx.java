import java.util.Arrays;
public class VetorEx {
	public static void main(String[] args) {
	    int[] numeros = {2, 3, 5};
	
	    int soma=0;
	    for(int numero : numeros) {
	        soma= soma + numero; 
	    }
	    System.out.println("A soma dos numeros "+Arrays.toString(numeros)+" é igual a: "+soma);
	}
}

/*
 * 
 * System.out.println("--------- Multiplos de 10 até 1000 ----------");
		for(int i=1; i<=1000; i++) {
		    if(i % 10 == 0) System.out.println(i);
		}
 * 
 */
