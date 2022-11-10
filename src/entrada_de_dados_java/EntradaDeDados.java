package entrada_de_dados_java;

import java.util.Scanner;

public class EntradaDeDados {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		String nome;
		System.out.println("Digite uma palavra");
		nome = sc.next();
		
		System.out.println("Voce digitou: "+ nome);
		sc.close();
	}
	

}
