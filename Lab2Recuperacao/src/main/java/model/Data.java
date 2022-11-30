package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Data {

	private int  dia;
	private int mes;
	private int ano;
	
	public String imprimirData() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Data [dia=");
		stringBuilder.append(dia);
		stringBuilder.append(", mes=");
		stringBuilder.append(mes);
		stringBuilder.append(", ano=");
		stringBuilder.append(ano);
		stringBuilder.append("]");
		return stringBuilder.toString();
	}


}
