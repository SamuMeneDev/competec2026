
import java.util.Scanner;

public class Lista20
{
	public static void main(String[] args) {
		
		// 1
		for(int i=1; i<=50; i++) {
		    if(i % 3 == 0) {
		        if(i % 5 == 0) {
		            System.out.println(i + " FizzBuzz");
		            
		        } else {
		            System.out.println(i + " Fizz");
		        }
		    } else if (i % 5 == 0) {
		        System.out.println(i + " Buzz");
		    }
		}
		
		// 2 
		
		Scanner sc = new Scanner(System.in);
		
		int numSecreto = 42;
		int chuteUsuario;
		
		// Primeira tentativa
		System.out.print("Chute um número que estou pensando: ");
		chuteUsuario = sc.nextInt();
		
		while(numSecreto != chuteUsuario) {
		    System.out.print("Errado. Tente outra vez: ");
		    chuteUsuario = sc.nextInt();
		}
		System.out.println("Acertou!! O numero era "+numSecreto);
		
		// 3
		
		int alturaTriangulo;
		
		System.out.print("Digite a altura do triangulo: ");
		alturaTriangulo = sc.nextInt();
		
		for(int i=1; i<=alturaTriangulo; i++) {
		    
		}
		
		
		
		
	}
}
