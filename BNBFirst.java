package teste;

import java.util.Locale;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Referencias Bacen: ");
		String referenciasBacen = sc.nextLine();
//		System.out.println((int) referenciasBacen.charAt(0));
		for(int aux = 0; aux < referenciasBacen.length(); aux++) {
			if((int) referenciasBacen.charAt(aux) >= 48 && (int) referenciasBacen.charAt(aux) <= 57 || referenciasBacen.charAt(aux) == ',' || referenciasBacen.charAt(aux) == ';') {
				System.out.println("1");
			}else {
				System.out.println("2");
			}
		}
		
		sc.close();
	}

}
