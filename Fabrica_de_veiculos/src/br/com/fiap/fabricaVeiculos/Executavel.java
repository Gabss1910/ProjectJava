package br.com.fiap.fabricaVeiculos;

public class Executavel {

	public static void main(String[] args) {
		 Carro carro1 = new Carro("Toyota", "Corolla", "Prata", 2022, 2023, "123456789", 2.0, "Automático", 17, "João");

	       
	        carro1.exibirDados();
	        carro1.ligar();
	        carro1.acelerar(20);
	        carro1.acelerar(30);
	        carro1.frear(10);
	        carro1.desligar();
	        carro1.frear(10); 
	        carro1.desligar();
	        
	        Caminhão caminhão1 = new Caminhão("Mercedes-Benz", "Actros", "Branco", 2021, 2022, "987654321", 
                    12.0, "Automático", 22, 3, 30.0, "Carlos");



	        caminhão1.exibirDados();
	        caminhão1.ligar();
	        caminhão1.acelerar(40);
	        caminhão1.carregar(25, "Grãos");
	        caminhão1.carregar(10, "Grãos"); 
	        caminhão1.descarregar(30);
	        caminhão1.frear(40);
	        caminhão1.desligar();

	}

}
