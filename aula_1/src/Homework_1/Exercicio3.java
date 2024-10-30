package Homework_1;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o peso do ouro");
		double peso1 = sc.nextDouble();
		
		System.out.println("Digite o peso da prata");
		double peso2 = sc.nextDouble();
		
		System.out.println("Digite o peso do cobre");
		double peso3 = sc.nextDouble();
		
		double maiorPeso;
		
		if (peso1 >= peso2 && peso1 >= peso3) {
			maiorPeso = peso1;
		 } else if (peso2 >= peso1 && peso2 >= peso3) {
	            maiorPeso = peso2;
		  } else {
	            maiorPeso = peso3;
	        }
		
		System.out.println("o maior peso é = " + maiorPeso);
		
		}

	}


