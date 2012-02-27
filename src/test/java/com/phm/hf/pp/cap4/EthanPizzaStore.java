package com.phm.hf.pp.cap4;

import com.phm.hf.pp.cap4.ingredientes.TiposPizza;
import com.phm.hf.pp.cap4.pizzarias.Pizzaria;
import com.phm.hf.pp.cap4.pizzarias.impl.PizzariaNY;

public class EthanPizzaStore {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Pizzaria mypizzaStore = new PizzariaNY();
		mypizzaStore.encomendaPizza(TiposPizza.QUEIJO);
	}
}
