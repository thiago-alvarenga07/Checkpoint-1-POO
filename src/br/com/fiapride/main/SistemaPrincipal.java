package br.com.fiapride.main;

import br.com.fiapride.model.Veiculos;

public class SistemaPrincipal{
	
	public static void main(String[] args) {
		//Primeiro Veiculo
		System.out.println("Iniciando sistema de veiculos FiapRide...\n");
		Veiculos veiculo = new Veiculos("Carlos", "ABC-1234");
		veiculo.AdicionarGasolina(30);
		veiculo.GasolinaGasta(20);
		
		System.out.println("Sistema FiapRide:\n");
		System.out.println("Nome do dono: " + veiculo.getNome() + " | Placa do carro: " + veiculo.getPlaca() + " | Gasolina atual do veiculo: " + veiculo.getGasolina() +"L");
		}
	}

