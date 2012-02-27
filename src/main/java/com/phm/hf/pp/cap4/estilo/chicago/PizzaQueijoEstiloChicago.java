package com.phm.hf.pp.cap4.estilo.chicago;

import com.phm.hf.pp.cap4.Pizza;
import com.phm.hf.pp.cap4.TiposPizza;

public class PizzaQueijoEstiloChicago extends Pizza {

	public PizzaQueijoEstiloChicago() {
		super(TiposPizza.QUEIJO);
		setNome("Pizza de Queijo estilo Chicago");
		setMassa("Massa para pizza de Queijo estilo Chicago");
		setMolho("Molho para pizza de Queijo estilo Chicago");
		getCoberturas().add("Cobertura para pizza de Queijo estilo Chicago");
	}
}
