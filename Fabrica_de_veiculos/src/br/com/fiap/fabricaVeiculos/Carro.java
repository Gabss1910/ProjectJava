package br.com.fiap.fabricaVeiculos;

public class Carro {
	
	 private String marca;
	    private String modelo;
	    private String cor;
	    private int anoFabricacao;
	    private int anoModelo;
	    private String renavam;
	    private double motor;
	    private String tipoCambio;
	    private int aroRodas;
	    private double velocidade;
	    private String nomeCondutor;
	    private boolean ligado;

	    public Carro(String marca, String modelo, String cor, int anoFabricacao, int anoModelo, String renavam,
	                 double motor, String tipoCambio, int aroRodas, String nomeCondutor) {
	        this.marca = marca;
	        this.modelo = modelo;
	        this.cor = cor;
	        this.anoFabricacao = anoFabricacao;
	        this.anoModelo = anoModelo;
	        this.renavam = renavam;
	        this.motor = motor;
	        this.tipoCambio = tipoCambio;
	        this.aroRodas = aroRodas;
	        this.nomeCondutor = nomeCondutor;
	        this.velocidade = 0.0;
	        this.ligado = false;
	    }

	    public void ligar() {
	        if (!ligado) {
	            ligado = true;
	            System.out.println("Carro ligado.");
	        } else {
	            System.out.println("O carro já está ligado.");
	        }
	    }

	    public void desligar() {
	        if (velocidade == 0) {
	            ligado = false;
	            System.out.println("Carro desligado.");
	        } else {
	            System.out.println("O carro deve estar parado para desligar.");
	        }
	    }

	    public void acelerar(double incremento) {
	        if (ligado) {
	            velocidade += incremento;
	            System.out.println("Acelerando. Velocidade atual: " + velocidade + " km/h.");
	        } else {
	            System.out.println("O carro deve estar ligado para acelerar.");
	        }
	    }

	    public void frear(double decremento) {
	        if (velocidade > 0) {
	            velocidade -= decremento;
	            if (velocidade < 0) {
	                velocidade = 0;
	            }
	            System.out.println("Freiando. Velocidade atual: " + velocidade + " km/h.");
	        } else {
	            System.out.println("O carro já está parado.");
	        }
	    }

	    public void exibirDados() {
	        System.out.println("Dados do Carro:");
	        System.out.println("Marca: " + marca);
	        System.out.println("Modelo: " + modelo);
	        System.out.println("Cor: " + cor);
	        System.out.println("Ano de Fabricação: " + anoFabricacao);
	        System.out.println("Ano Modelo: " + anoModelo);
	        System.out.println("RENAVAM: " + renavam);
	        System.out.println("Motor: " + motor + " L");
	        System.out.println("Tipo de Câmbio: " + tipoCambio);
	        System.out.println("Aro das Rodas: " + aroRodas + " polegadas");
	        System.out.println("Velocidade: " + velocidade + " km/h");
	        System.out.println("Condutor: " + nomeCondutor);

	    }
}
