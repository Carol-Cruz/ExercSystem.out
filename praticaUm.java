package pratica;

import java.util.Scanner;

public class praticaUm {

	public static void main(String[] args) {
		
     Scanner captura = new Scanner(System.in);
		
     float n1,n2,n3,n4,diferenca;
     
     System.out.println("Digite um número decimal e use a vírgula ex: 1,5");
     n1 = captura.nextFloat();
     System.out.println("Digite um número decimal e use a vírgula ex: 1,5");
     n2 = captura.nextFloat();
     System.out.println("Digite um número decimal e use a vírgula ex: 1,5");
     n3 = captura.nextFloat();
     System.out.println("Digite um número decimal e use a vírgula ex: 1,5");
     n4 = captura.nextFloat();
		
      
	diferenca = (n1 * n2) - (n3 * n4);
 
	
     System.out.println("A diferença é : " + diferenca);
	
		
	}

}
