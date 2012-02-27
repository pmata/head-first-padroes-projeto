package com.phm.hf.pp.cap4.estilo.california;

import com.phm.hf.pp.cap4.Pizza;
import com.phm.hf.pp.cap4.TiposPizza;

public class PizzaMoluscosEstiloCalifornia extends Pizza {

	public PizzaMoluscosEstiloCalifornia() {
		super(TiposPizza.MOLUSCOS);
		setNome("Pizza de Moluscos estilo California");
		setMassa("Massa para pizza de Moluscos estilo California");
		setMolho("Molho para pizza de Moluscos estilo California");
		getCoberturas().add("Cobertura para pizza de Moluscos estilo California");
	}
}
