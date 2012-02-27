package com.phm.hf.pp.cap4.estilo.chicago;

import com.phm.hf.pp.cap4.Pizza;
import com.phm.hf.pp.cap4.TiposPizza;

public class PizzaVegetaisEstiloChicago extends Pizza {

	public PizzaVegetaisEstiloChicago() {
		super(TiposPizza.VEGETAIS);
		setNome("Pizza de Vegetais estilo Chicago");
		setMassa("Massa para pizza de Vegetais estilo Chicago");
		setMolho("Molho para pizza de Vegetais estilo Chicago");
		getCoberturas().add("Cobertura para pizza de Vegetais estilo Chicago");
	}
}