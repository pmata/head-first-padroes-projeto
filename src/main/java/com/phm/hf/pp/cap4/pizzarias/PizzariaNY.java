package com.phm.hf.pp.cap4.pizzarias;

import com.phm.hf.pp.cap4.FabricaIngredientesPizza;
import com.phm.hf.pp.cap4.FabricaIngredientesPizzaNY;
import com.phm.hf.pp.cap4.Pizza;
import com.phm.hf.pp.cap4.TiposPizza;
import com.phm.hf.pp.cap4.estilo.PizzaQueijo;
import com.phm.hf.pp.cap4.estilo.ny.PizzaMoluscosEstiloNY;
import com.phm.hf.pp.cap4.estilo.ny.PizzaPepperoniEstiloNY;
import com.phm.hf.pp.cap4.estilo.ny.PizzaVegetaisEstiloNY;

public class PizzariaNY extends Pizzaria {

	@Override
	public Pizza criarPizza(final TiposPizza pTipo) {
		Pizza pizza = null;
		FabricaIngredientesPizza fabricaIngredientesPizza = new FabricaIngredientesPizzaNY();

		if (TiposPizza.QUEIJO == pTipo) {
			pizza = new PizzaQueijo(fabricaIngredientesPizza);
		} if (TiposPizza.PEPPERONI == pTipo) {
			pizza = new PizzaPepperoniEstiloNY();
		} if (TiposPizza.MOLUSCOS == pTipo) {
			pizza = new PizzaMoluscosEstiloNY();
		} if (TiposPizza.VEGETAIS == pTipo) {
			pizza = new PizzaVegetaisEstiloNY();
		}

		return pizza;
	}
}