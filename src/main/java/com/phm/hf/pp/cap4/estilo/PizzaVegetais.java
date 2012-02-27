package com.phm.hf.pp.cap4.estilo;

import com.phm.hf.pp.cap4.Pizza;
import com.phm.hf.pp.cap4.TiposPizza;

public class PizzaVegetais extends Pizza {

	public PizzaVegetais() {
		super(TiposPizza.VEGETAIS);
		setNome("Pizza de Vegetais estilo Padrão");
		setMassa("Massa para pizza de Vegetais estilo Padrão");
		setMolho("Molho para pizza de Vegetais estilo Padrão");
		getCoberturas().add("Cobertura para pizza de Vegetais estilo Padrão");
	}
}
