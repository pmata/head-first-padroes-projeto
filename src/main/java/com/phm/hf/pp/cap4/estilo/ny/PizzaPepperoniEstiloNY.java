package com.phm.hf.pp.cap4.estilo.ny;

import com.phm.hf.pp.cap4.Pizza;
import com.phm.hf.pp.cap4.TiposPizza;

public class PizzaPepperoniEstiloNY extends Pizza {

	public PizzaPepperoniEstiloNY() {
		super(TiposPizza.PEPPERONI);
		setNome("Pizza de Pepperoni estilo NY");
		setMassa("Massa para pizza de Pepperoni estilo NY");
		setMolho("Molho para pizza de Pepperoni estilo NY");
		getCoberturas().add("Cobertura para pizza de Pepperoni estilo NY");
	}
}
