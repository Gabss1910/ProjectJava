package aula_1;

public class Exercicio3 {

	public static void main(String[] args) {
		
		  String nome = "Gabss";
	        String sobrenome = "Orta";

	       
	        System.out.println("Nome: " + nome);
	        System.out.println("Sobrenome: " + sobrenome);

	        String nomeCompleto = nome + " " + sobrenome;
	        System.out.println("Nome completo: " + nomeCompleto);

	        System.out.println("Nome em maiúsculas: " + nomeCompleto.toUpperCase());

	        System.out.println("Nome em minúsculas: " + nomeCompleto.toLowerCase());

	        System.out.println("Comprimento do nome completo: " + nomeCompleto.length());

	        System.out.println("Primeiro caractere do nome completo: " + nomeCompleto.charAt(0));

	        System.out.println("O nome completo começa com 'Gabss'? " + nomeCompleto.startsWith("Gabss"));

	        System.out.println("O nome completo termina com 'Orta'? " + nomeCompleto.endsWith("Orta"));

	}

}
