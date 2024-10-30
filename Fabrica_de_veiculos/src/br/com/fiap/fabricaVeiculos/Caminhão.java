package br.com.fiap.fabricaVeiculos;

public class Caminhão {
	
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
	    private int eixos;
	    private double cargaSuportada;
	    private double cargaAbastecida;
	    private String tipoCargaAbastecida;
	    private String nomeCondutor;
	    private boolean ligado;

	    public Caminhão(String marca, String modelo, String cor, int anoFabricacao, int anoModelo, String renavam,
	                    double motor, String tipoCambio, int aroRodas, int eixos, double cargaSuportada,
	                    String nomeCondutor) {
	        this.marca = marca;
	        this.modelo = modelo;
	        this.cor = cor;
	        this.anoFabricacao = anoFabricacao;
	        this.anoModelo = anoModelo;
	        this.renavam = renavam;
	        this.motor = motor;
	        this.tipoCambio = tipoCambio;
	        this.aroRodas = aroRodas;
	        this.velocidade = 0.0;
	        this.eixos = eixos;
	        this.cargaSuportada = cargaSuportada;
	        this.cargaAbastecida = 0.0;
	        this.nomeCondutor = nomeCondutor;
	        this.ligado = false;
	    }

	    public void ligar() {
	        if (!ligado) {
	            ligado = true;
	            System.out.println("Caminhão ligado.");
	        } else {
	            System.out.println("O caminhão já está ligado.");
	        }
	    }

	    public void desligar() {
	        if (velocidade == 0) {
	            ligado = false;
	            System.out.println("Caminhão desligado.");
	        } else {
	            System.out.println("O caminhão deve estar parado para desligar.");
	        }
	    }

	    public void acelerar(double incremento) {
	        if (ligado) {
	            velocidade += incremento;
	            System.out.println("Acelerando. Velocidade atual: " + velocidade + " km/h.");
	        } else {
	            System.out.println("O caminhão deve estar ligado para acelerar.");
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
	            System.out.println("O caminhão já está parado.");
	        }
	    }

	    public void carregar(double carga, String tipoCarga) {
	        if (cargaAbastecida + carga <= cargaSuportada) {
	            cargaAbastecida += carga;
	            tipoCargaAbastecida = tipoCarga;
	            System.out.println("Carga de " + carga + " toneladas adicionada. Tipo de carga: " + tipoCarga);
	        } else {
	            System.out.println("Carga excede o limite suportado. Carga atual: " + cargaAbastecida + " toneladas.");
	        }
	    }

	    public void descarregar(double carga) {
	        if (cargaAbastecida >= carga) {
	            cargaAbastecida -= carga;
	            System.out.println("Carga de " + carga + " toneladas descarregada.");
	        } else {
	            System.out.println("Carga a ser descarregada excede a carga atual. Carga atual: " + cargaAbastecida + " toneladas.");
	        }
	    }

	    public void exibirDados() {
	        System.out.println("Dados do Caminhão:");
	        System.out.println("Marca: " + marca);
	        System.out.println("Modelo: " + modelo);
	        System.out.println("Cor: " + cor);
	        System.out.println("Ano de Fabricação: " + anoFabricacao);
	        System.out.println("Ano Modelo: " + anoModelo);
	        System.out.println("RENAVAM: " + renavam);
	        System.out.println("Motor: " + motor + " L");
	        System.out.println("Tipo de Câmbio: " + tipoCambio);
	        System.out.println("Aro das Rodas: " + aroRodas + " polegadas");
	        System.out.println("Eixos: " + eixos);
	        System.out.println("Carga Suportada: " + cargaSuportada + " toneladas");
	        System.out.println("Carga Abastecida: " + cargaAbastecida + " toneladas");
	        System.out.println("Tipo de Carga: " + tipoCargaAbastecida);
	        System.out.println("Velocidade: " + velocidade + " km/h");
	        System.out.println("Condutor: " + nomeCondutor);
	    }

}
