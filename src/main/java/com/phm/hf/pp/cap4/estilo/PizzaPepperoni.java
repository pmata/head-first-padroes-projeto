package com.phm.hf.pp.cap4.estilo;

import com.phm.hf.pp.cap4.Pizza;
import com.phm.hf.pp.cap4.TiposPizza;

public class PizzaPepperoni extends Pizza {

	public PizzaPepperoni() {
		super(TiposPizza.PEPPERONI);
		setNome("Pizza de Pepperoni estilo Padrão");
		setMassa("Massa para pizza de Pepperoni estilo Padrão");
		setMolho("Molho para pizza de Pepperoni estilo Padrão");
		getCoberturas().add("Cobertura para pizza de Pepperoni estilo Padrão");
	}
}
