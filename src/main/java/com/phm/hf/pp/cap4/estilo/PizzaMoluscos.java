package com.phm.hf.pp.cap4.estilo;

import com.phm.hf.pp.cap4.Pizza;
import com.phm.hf.pp.cap4.TiposPizza;

public class PizzaMoluscos extends Pizza {

	public PizzaMoluscos() {
		super(TiposPizza.MOLUSCOS);
		setNome("Pizza de Moluscos estilo Padrão");
		setMassa("Massa para pizza de Moluscos estilo Padrão");
		setMolho("Molho para pizza de Moluscos estilo Padrão");
		getCoberturas().add("Cobertura para pizza de Moluscos estilo Padrão");
	}
}
