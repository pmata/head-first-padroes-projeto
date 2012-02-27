package com.phm.hf.pp.cap4.pizzarias.impl;

import com.phm.hf.pp.cap4.Pizza;
import com.phm.hf.pp.cap4.fabrica.FabricaIngredientesPizza;
import com.phm.hf.pp.cap4.fabrica.impl.FabricaIngredientesPizzaNY;
import com.phm.hf.pp.cap4.ingredientes.TiposPizza;
import com.phm.hf.pp.cap4.pizzarias.Pizzaria;
import com.phm.hf.pp.cap4.sabores.PizzaMoluscos;
import com.phm.hf.pp.cap4.sabores.PizzaPepperoni;
import com.phm.hf.pp.cap4.sabores.PizzaQueijo;
import com.phm.hf.pp.cap4.sabores.PizzaVegetais;

public class PizzariaNY extends Pizzaria {

	@Override
	protected Pizza criarPizza(final TiposPizza pTipo) {
		Pizza pizza = null;
		final FabricaIngredientesPizza fabricaIngredientesPizza = new FabricaIngredientesPizzaNY();

		if (TiposPizza.QUEIJO == pTipo) {
			pizza = new PizzaQueijo(fabricaIngredientesPizza);
		} if (TiposPizza.PEPPERONI == pTipo) {
			pizza = new PizzaPepperoni(fabricaIngredientesPizza);
		} if (TiposPizza.MOLUSCOS == pTipo) {
			pizza = new PizzaMoluscos(fabricaIngredientesPizza);
		} if (TiposPizza.VEGETAIS == pTipo) {
			pizza = new PizzaVegetais(fabricaIngredientesPizza);
		}

		return pizza;
	}
}