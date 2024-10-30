package Homework_1;

public class Exercicio4 {

	public static void main(String[] args) {
		
		System.out.println("Números de 0 a 100, exceto o intervalo de 50 a 75:");

        for (int i = 0; i <= 100; i++) {
            
            if (i < 50 || i > 75) {
                System.out.println(i);
            }
        }

	}

}
