package br.com.fiapride.model;

public class Veiculos {
	private String nome;
	private String placa;
	private int gasolina;

	public Veiculos(String Nome, String Placa) {
		this.setNome(nome);
		this.setPlaca(placa);
		this.setGasolina(0);
		
	}
	
	public int getGasolina() {
		return this.gasolina;
		
	}
	
	private void setGasolina(int valor) {
		if(valor < 0) {
			System.out.println("Erro: Não é possivel deixar uma quantia de combustível menor que 0");
		}
		else {
			this.gasolina = valor;
			
		}
	}
	
	public void AdicionarGasolina(int adicionar) {
		if(adicionar <=0) {
			System.out.println("Erro: Não é possivel adicionar uma quantia de combustível menor ou igual a 0");
		} else {
			this.gasolina += adicionar;
			
		}
	}		
	
	public void GasolinaGasta(int gasta) {
		if(gasta > Gasolina) {
			this.gasolina = 0;
		} else {
			this.gasolina -= gasta;
			
		}
	}
	
	public String getNome() {
		return this.nome;
		
	}
	
	private void setNome(String Nome) {
		this.nome = nome;
		
	}
	
	public String getPlaca() {
		return this.placa;
		
	}
	
	private void setPlaca(String Placa) {
		this.Placa = Placa;
		
	}
}
