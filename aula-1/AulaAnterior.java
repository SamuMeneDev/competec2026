import java.util.Scanner;

public class AulaAnterior
{
	public static void main(String[] args) {
	  var sc = new Scanner(System.in);
	     
		float pAbacaxi = 7.3f, pMaca = 2f, pPera = 3f, total = 0f;
		int qAbacaxi, qMaca, qPera = 0;
		
		/* Entradas */
		System.out.print("Digite a quantidade de abacaxis: ");
		qAbacaxi = sc.nextInt();
		
		System.out.print("Digite a quantidade de maças: ");
		qMaca = sc.nextInt();
	    
	  System.out.print("Digite a quantidade de peras: ");
		qPera = sc.nextInt();
		
		/*Calculo*/
		total = (pAbacaxi * qAbacaxi) + (pMaca * qMaca) + (pPera * qPera);
		
		/* Saida */
		System.out.println("O valor total da compra é R$"+total);
		
		sc.close();
	}
}
