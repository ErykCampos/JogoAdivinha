package Desafios;

import java.util.Random;
import java.util.Scanner;

public class JogoDaAdivinha��o {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int continuar;
		int numeroSorteado;
		int tentativas;
		int numero;
		
		do {
			System.out.println("Sorteando um numero entra 0 ... 100\n");
			Random numeroAleatorio = new Random();
			numeroSorteado = numeroAleatorio.nextInt(101);
			
			System.out.println("Come�ou o jogo...");
			tentativas = 0;
			
		do {
				tentativas++;
				System.out.printf("tentativa %d:", tentativas);
				numero = entrada.nextInt();
				
				if(numero > numeroSorteado) {
					System.out.printf("O numero � menor que %d \n\n", numero);
				} else if (numero < numeroSorteado) {
					System.out.printf("O numero � maior que %d \n\n", numero);
				} else {
					System.out.printf("\n\n Parab�ns voc� acertou em %d tentativas\n\n", tentativas);
				}
				
		}while (numero != numeroSorteado);
				System.out.println("Digite 0 para sair ou qualquer outro numero para continuar: ");
				continuar = entrada.nextInt();
				
		}while (continuar != 0);
		entrada.close();
	
		
		
		

		
	}

}
