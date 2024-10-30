package br.com.fiap.banco;

public class Executavel {

	public static void main(String[] args) {
		
		 Conta conta1 = new Conta("Alice", "123.456.789-00", "0001");
	        Conta conta2 = new Conta("Bob", "987.654.321-00", "0002");
	        Conta conta3 = new Conta("Charlie", "111.222.333-44", "0003");

	       
	        conta1.depositar(500);
	        conta1.sacar(200);
	        conta1.consultarSaldo();

	        conta2.depositar(300);
	        conta2.transferir(conta1, 100);
	        conta2.consultarSaldo();
	        conta1.consultarSaldo();

	        conta3.depositar(600);
	        conta3.sacar(50);
	        conta3.transferir(conta1, 100);
	        conta3.consultarSaldo();
	        conta1.consultarSaldo();

	}

}
