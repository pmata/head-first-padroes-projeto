package com.phm.hf.pp.cap4.pizzarias;

import com.phm.hf.pp.cap4.Pizza;
import com.phm.hf.pp.cap4.TiposPizza;

public abstract class Pizzaria {

	public Pizza encomendaPizza(final TiposPizza pTipo) {
		Pizza pizza = criarPizza(pTipo);

		pizza.preparar();
		pizza.assar();
		pizza.cortar();
		pizza.encaixotar();

		return pizza;
	}

	abstract Pizza criarPizza(final TiposPizza pTipo);
}