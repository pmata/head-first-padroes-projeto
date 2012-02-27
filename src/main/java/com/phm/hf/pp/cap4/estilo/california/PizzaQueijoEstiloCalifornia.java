package com.phm.hf.pp.cap4.estilo.california;

import com.phm.hf.pp.cap4.Pizza;
import com.phm.hf.pp.cap4.TiposPizza;

public class PizzaQueijoEstiloCalifornia extends Pizza {

	public PizzaQueijoEstiloCalifornia() {
		super(TiposPizza.QUEIJO);
		setNome("Pizza de Queijo estilo California");
		setMassa("Massa para pizza de Queijo estilo California");
		setMolho("Molho para pizza de Queijo estilo California");
		getCoberturas().add("Cobertura para pizza de Queijo estilo California");
	}
}
