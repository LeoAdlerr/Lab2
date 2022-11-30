package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Endereco {

	private String enderecoCompleto;
	private String cidade;
	private String estado;
	private String cep;
	
	public String imprimirEndereco() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Endereco [enderecoCompleto=");
		stringBuilder.append(enderecoCompleto);
		stringBuilder.append(", cidade=");
		stringBuilder.append(cidade);
		stringBuilder.append(", estado=");
		stringBuilder.append(estado);
		stringBuilder.append(", cep=");
		stringBuilder.append(cep);
		stringBuilder.append("]");
		return stringBuilder.toString();
	}

	

}
