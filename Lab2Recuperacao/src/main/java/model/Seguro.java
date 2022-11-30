package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class Seguro {

	private int numApolice;
	private String nome;
	private float valor;
	private float premio;
	private Endereco endereco;

	public String imprimirSeguro() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Seguro [numApolice=");
		stringBuilder.append(numApolice);
		stringBuilder.append(", nome=");
		stringBuilder.append(nome);
		stringBuilder.append(", valor=");
		stringBuilder.append(valor);
		stringBuilder.append(", premio=");
		stringBuilder.append(premio);
		stringBuilder.append(", endereco=");
		stringBuilder.append(getEndereco().imprimirEndereco());
		stringBuilder.append("]");
		return stringBuilder.toString();
	}

}
