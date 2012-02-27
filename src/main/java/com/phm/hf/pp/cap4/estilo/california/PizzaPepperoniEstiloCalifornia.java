package com.phm.hf.pp.cap4.estilo.california;

import com.phm.hf.pp.cap4.Pizza;
import com.phm.hf.pp.cap4.TiposPizza;

public class PizzaPepperoniEstiloCalifornia extends Pizza {

	public PizzaPepperoniEstiloCalifornia() {
		super(TiposPizza.PEPPERONI);
		setNome("Pizza de Pepperoni estilo California");
		setMassa("Massa para pizza de Pepperoni estilo California");
		setMolho("Molho para pizza de Pepperoni estilo California");
		getCoberturas().add("Cobertura para pizza de Pepperoni estilo California");
	}
}
