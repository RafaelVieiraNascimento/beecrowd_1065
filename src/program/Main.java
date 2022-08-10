package program;

/*
beecrowd | 1065 - Pares entre Cinco Números

Faça um programa que leia 5 valores inteiros. Conte quantos destes valores digitados são pares
e mostre esta informação.

Entrada
O arquivo de entrada contém 5 valores inteiros quaisquer.

Saída
Imprima a mensagem conforme o exemplo fornecido, indicando a quantidade de valores pares lidos.
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int par = 0;
		
		for(int i = 0; i < 5; i++) {
			int valores = sc.nextInt();
			if(valores % 2 == 0) {
				par++;
			}
		}
		System.out.println(par + " valores pares");
		sc.close();
	}
}
