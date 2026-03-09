package br.com.fiapride.model;

public class Veiculos {
	private String Nome;
	private String Placa;
	private int Gasolina;

	public Veiculos(String Nome, String Placa) {
		this.setNome(Nome);
		this.setPlaca(Placa);
		this.setGasolina(0);
		
	}
	
	public int getGasolina() {
		return this.Gasolina;
		
	}
	
	private void setGasolina(int valor) {
		if(valor < 0) {
			System.out.println("Erro: Não é possivel deixar uma quantia de combustível menor que 0");
		}
		else {
			this.Gasolina = valor;
			
		}
	}
	
	public void AdicionarGasolina(int adicionar) {
		if(adicionar <=0) {
			System.out.println("Erro: Não é possivel adicionar uma quantia de combustível menor ou igual a 0");
		} else {
			this.Gasolina += adicionar;
			
		}
	}		
	
	public void GasolinaGasta(int gasta) {
		if(gasta > Gasolina) {
			System.out.println("Erro: Não é possivel gastar mais gasolina do que o tanque do carro possui");
		} else {
			this.Gasolina -= gasta;
			
		}
	}
	
	public String getNome() {
		return this.Nome;
		
	}
	
	private void setNome(String Nome) {
		this.Nome = Nome;
		
	}
	
	public String getPlaca() {
		return this.Placa;
		
	}
	
	private void setPlaca(String Placa) {
		this.Placa = Placa;
		
	}
}