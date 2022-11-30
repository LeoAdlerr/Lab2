package main;

import java.util.ArrayList;
import java.util.List;

import model.Data;
import model.Endereco;
import model.Seguro;
import model.SeguroAuto;
import model.SeguroCasa;
import model.SeguroVida;

public class MainSeguro {

	public String insereSeguro(Seguro seguro) {
		List<Seguro> S = new ArrayList<Seguro>();
		S.add(seguro);
		
		return seguro.imprimirSeguro();
		
	}
	
	
	public static void main(String[] args) {
		Data data = new Data(11, 10, 2002);
		Endereco endereco = new Endereco("Av.JK n°1000", "SJC", "SP", "12220220");
		
		Seguro seguroAuto = new SeguroAuto();
		
		Seguro seguroImobiliaro = new SeguroCasa();
		
		Seguro seguroVida = new SeguroVida("beneficiario", data);
		
		MainSeguro main =new MainSeguro();
		System.out.println(main.insereSeguro(seguroAuto));
		System.out.println(main.insereSeguro(seguroImobiliaro));
		System.out.println(main.insereSeguro(seguroVida));

	}

}
