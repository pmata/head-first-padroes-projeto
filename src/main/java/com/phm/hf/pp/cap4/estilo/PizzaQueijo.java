package com.phm.hf.pp.cap4.estilo;

import com.phm.hf.pp.cap4.Pizza;
import com.phm.hf.pp.cap4.TiposPizza;

public class PizzaQueijo extends Pizza {

	public PizzaQueijo() {
		super(TiposPizza.QUEIJO);
		setNome("Pizza de Queijo estilo Padrão");
		setMassa("Massa para pizza de Queijo estilo Padrão");
		setMolho("Molho para pizza de Queijo estilo Padrão");
		getCoberturas().add("Cobertura para pizza de Queijo estilo Padrão");
	}
}
