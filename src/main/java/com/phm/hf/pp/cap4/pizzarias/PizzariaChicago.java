package com.phm.hf.pp.cap4.pizzarias;

import com.phm.hf.pp.cap4.Pizza;
import com.phm.hf.pp.cap4.TiposPizza;
import com.phm.hf.pp.cap4.estilo.chicago.PizzaMoluscosEstiloChicago;
import com.phm.hf.pp.cap4.estilo.chicago.PizzaPepperoniEstiloChicago;
import com.phm.hf.pp.cap4.estilo.chicago.PizzaQueijoEstiloChicago;
import com.phm.hf.pp.cap4.estilo.chicago.PizzaVegetaisEstiloChicago;

public class PizzariaChicago extends Pizzaria {

	@Override
	public Pizza criarPizza(final TiposPizza pTipo) {
		Pizza pizza = null;

		if (TiposPizza.QUEIJO == pTipo) {
			pizza = new PizzaQueijoEstiloChicago();
		} if (TiposPizza.PEPPERONI == pTipo) {
			pizza = new PizzaPepperoniEstiloChicago();
		} if (TiposPizza.MOLUSCOS == pTipo) {
			pizza = new PizzaMoluscosEstiloChicago();
		} if (TiposPizza.VEGETAIS == pTipo) {
			pizza = new PizzaVegetaisEstiloChicago();
		}

		return pizza;
	}
}