package com.phm.hf.pp.cap4;

import com.phm.hf.pp.cap4.estilo.PizzaMoluscos;
import com.phm.hf.pp.cap4.estilo.PizzaPepperoni;
import com.phm.hf.pp.cap4.estilo.PizzaQueijo;
import com.phm.hf.pp.cap4.estilo.PizzaVegetais;

public class FabricaPizzaSimples {

	public Pizza criarPizza(final TiposPizza pTipo) {
		Pizza pizza = null;

		if (TiposPizza.QUEIJO == pTipo) {
			pizza = new PizzaQueijo();
		} if (TiposPizza.PEPPERONI == pTipo) {
			pizza = new PizzaPepperoni();
		} if (TiposPizza.MOLUSCOS == pTipo) {
			pizza = new PizzaMoluscos();
		} if (TiposPizza.VEGETAIS == pTipo) {
			pizza = new PizzaVegetais();
		}

		return pizza;
	}
}