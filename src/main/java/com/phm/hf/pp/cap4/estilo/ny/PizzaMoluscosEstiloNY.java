package com.phm.hf.pp.cap4.estilo.ny;

import com.phm.hf.pp.cap4.Pizza;
import com.phm.hf.pp.cap4.TiposPizza;

public class PizzaMoluscosEstiloNY extends Pizza {

	public PizzaMoluscosEstiloNY() {
		super(TiposPizza.MOLUSCOS);
		setNome("Pizza de Moluscos estilo NY");
		setMassa("Massa para pizza de Moluscos estilo NY");
		setMolho("Molho para pizza de Moluscos estilo NY");
		getCoberturas().add("Cobertura para pizza de Moluscos estilo NY");
	}
}
