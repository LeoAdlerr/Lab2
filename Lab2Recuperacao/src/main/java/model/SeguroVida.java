package model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
public class SeguroVida extends Seguro {

	private String beneficiario;
	private Data datanasc;

	@Override
	public String imprimirSeguro() {

		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("SeguroVida [beneficiario=");
		stringBuilder.append(beneficiario);
		stringBuilder.append(", datanasc=");
		stringBuilder.append(datanasc.imprimirData());
		stringBuilder.append(", toString()=");
		stringBuilder.append(super.imprimirSeguro());
		return stringBuilder.toString();
	}

	public SeguroVida(int i, String beneficiario, double d, double e, Endereco endereco, String string, Data datanasc) {
		super();
		setBeneficiario(beneficiario);
		setDatanasc(datanasc);
	} 

}
