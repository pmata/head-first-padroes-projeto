package com.phm.hf.pp.cap4.estilo.chicago;

import com.phm.hf.pp.cap4.Pizza;
import com.phm.hf.pp.cap4.TiposPizza;

public class PizzaMoluscosEstiloChicago extends Pizza {

	public PizzaMoluscosEstiloChicago() {
		super(TiposPizza.MOLUSCOS);
		setNome("Pizza de Moluscos estilo Chicago");
		setMassa("Massa para pizza de Moluscos estilo Chicago");
		setMolho("Molho para pizza de Moluscos estilo Chicago");
		getCoberturas().add("Cobertura para pizza de Moluscos estilo Chicago");
	}
}
