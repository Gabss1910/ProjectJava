package Homework_1;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
		 
	        System.out.print("Digite o nome de usuário: ");
	        String usuario = scanner.nextLine();

	        System.out.print("Digite a senha: ");
	        String senha = scanner.nextLine();

	        if (usuario.equals("administrador") && senha.equals("123")) {
	            System.out.println("Acesso concedido.");
	        } else {
	            System.out.println("Acesso negado. Usuário ou senha incorretos.");
	        }


	}

}
