package model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SeguroAuto extends Seguro{
	private int deducaoAutomovel;
	private int numLicenca;
	private String estado;
	private String modelo;
	private int ano;
	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("SeguroAuto [deducaoAutomovel=");
		stringBuilder.append(deducaoAutomovel);
		stringBuilder.append(", numLicenca=");
		stringBuilder.append(numLicenca);
		stringBuilder.append(", estado=");
		stringBuilder.append(estado);
		stringBuilder.append(", modelo=");
		stringBuilder.append(modelo);
		stringBuilder.append(", ano=");
		stringBuilder.append(ano);
		stringBuilder.append(", toString()=");
		stringBuilder.append(super.imprimirSeguro());
		stringBuilder.append("]");
		return stringBuilder.toString();
	}
	
	

}
