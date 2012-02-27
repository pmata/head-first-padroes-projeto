package com.phm.hf.pp.cap4.estilo.ny;

import com.phm.hf.pp.cap4.Pizza;
import com.phm.hf.pp.cap4.TiposPizza;

public class PizzaVegetaisEstiloNY extends Pizza {

	public PizzaVegetaisEstiloNY() {
		super(TiposPizza.VEGETAIS);
		setNome("Pizza de Vegetais estilo NY");
		setMassa("Massa para pizza de Vegetais estilo NY");
		setMolho("Molho para pizza de Vegetais estilo NY");
		getCoberturas().add("Cobertura para pizza de Vegetais estilo NY");
	}
}
