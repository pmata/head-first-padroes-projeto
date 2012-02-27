package com.phm.hf.pp.cap4;

import com.phm.hf.pp.cap4.pizzarias.Pizzaria;
import com.phm.hf.pp.cap4.pizzarias.PizzariaCalifornia;
import com.phm.hf.pp.cap4.pizzarias.PizzariaChicago;
import com.phm.hf.pp.cap4.pizzarias.PizzariaNY;

public class PizzaTestDrive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final Pizzaria pizzariaNy = new PizzariaNY();
		Pizza pizza = pizzariaNy.encomendaPizza(TiposPizza.QUEIJO);
		System.out.println(pizza.getNome());

		final Pizzaria pizzariaChicago = new PizzariaChicago();
		pizza = pizzariaChicago.encomendaPizza(TiposPizza.QUEIJO);
		System.out.println(pizza.getNome());

		final Pizzaria pizzariaCalifornia = new PizzariaCalifornia();
		pizza = pizzariaCalifornia.encomendaPizza(TiposPizza.QUEIJO);
		System.out.println(pizza.getNome());
	}

}
