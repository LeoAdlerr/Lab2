package model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SeguroCasa extends Seguro{
	private int deducaoCasa;
	private int anoConstrucao;
	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("SeguroCasa [deducaoCasa=");
		stringBuilder.append(deducaoCasa);
		stringBuilder.append(", anoConstrucao=");
		stringBuilder.append(anoConstrucao);
		stringBuilder.append(", toString()=");
		stringBuilder.append(super.imprimirSeguro());
		stringBuilder.append("]");
		return stringBuilder.toString();
	}
	
	
}
