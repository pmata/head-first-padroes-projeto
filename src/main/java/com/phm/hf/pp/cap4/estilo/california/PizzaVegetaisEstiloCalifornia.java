package com.phm.hf.pp.cap4.estilo.california;

import com.phm.hf.pp.cap4.Pizza;
import com.phm.hf.pp.cap4.TiposPizza;

public class PizzaVegetaisEstiloCalifornia extends Pizza {

	public PizzaVegetaisEstiloCalifornia() {
		super(TiposPizza.VEGETAIS);
		setNome("Pizza de Vegetais estilo California");
		setMassa("Massa para pizza de Vegetais estilo California");
		setMolho("Molho para pizza de Vegetais estilo California");
		getCoberturas().add("Cobertura para pizza de Vegetais estilo California");
	}
}
