package com.phm.hf.pp.cap4.pizzarias;

import com.phm.hf.pp.cap4.Pizza;
import com.phm.hf.pp.cap4.TiposPizza;
import com.phm.hf.pp.cap4.estilo.california.PizzaMoluscosEstiloCalifornia;
import com.phm.hf.pp.cap4.estilo.california.PizzaPepperoniEstiloCalifornia;
import com.phm.hf.pp.cap4.estilo.california.PizzaQueijoEstiloCalifornia;
import com.phm.hf.pp.cap4.estilo.california.PizzaVegetaisEstiloCalifornia;

public class PizzariaCalifornia extends Pizzaria {

	@Override
	public Pizza criarPizza(final TiposPizza pTipo) {
		Pizza pizza = null;

		if (TiposPizza.QUEIJO == pTipo) {
			pizza = new PizzaQueijoEstiloCalifornia();
		} if (TiposPizza.PEPPERONI == pTipo) {
			pizza = new PizzaPepperoniEstiloCalifornia();
		} if (TiposPizza.MOLUSCOS == pTipo) {
			pizza = new PizzaMoluscosEstiloCalifornia();
		} if (TiposPizza.VEGETAIS == pTipo) {
			pizza = new PizzaVegetaisEstiloCalifornia();
		}

		return pizza;
	}
}