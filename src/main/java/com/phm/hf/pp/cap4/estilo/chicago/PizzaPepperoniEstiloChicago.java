package com.phm.hf.pp.cap4.estilo.chicago;

import com.phm.hf.pp.cap4.Pizza;
import com.phm.hf.pp.cap4.TiposPizza;

public class PizzaPepperoniEstiloChicago extends Pizza {

	public PizzaPepperoniEstiloChicago() {
		super(TiposPizza.PEPPERONI);
		setNome("Pizza de Pepperoni estilo Chicago");
		setMassa("Massa para pizza de Pepperoni estilo Chicago");
		setMolho("Molho para pizza de Pepperoni estilo Chicago");
		getCoberturas().add("Cobertura para pizza de Pepperoni estilo Chicago");
	}
}
