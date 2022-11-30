package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class SeguroVida extends Seguro {

	private String beneficiario;
	private Data datanasc;

	@Override
	public String toString() {

		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("SeguroVida [beneficiario=");
		stringBuilder.append(beneficiario);
		stringBuilder.append(", datanasc=");
		stringBuilder.append(datanasc.imprimirData());
		stringBuilder.append(", toString()=");
		stringBuilder.append(super.imprimirSeguro());
		return stringBuilder.toString();
	} 

}
