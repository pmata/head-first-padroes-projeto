package com.phm.hf.pp.cap4.estilo.ny;

import com.phm.hf.pp.cap4.Pizza;
import com.phm.hf.pp.cap4.TiposPizza;

public class PizzaQueijoEstiloNY extends Pizza {

	public PizzaQueijoEstiloNY() {
		super(TiposPizza.QUEIJO);
		setNome("Pizza de Queijo estilo NY");
		setMassa("Massa para pizza de Queijo estilo NY");
		setMolho("Molho para pizza de Queijo estilo NY");
		getCoberturas().add("Cobertura para pizza de Queijo estilo NY");
	}
}
