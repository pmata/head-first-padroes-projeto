package com.phm.hf.pp.cap4;

public class FabricaIngredientesPizzaNY implements FabricaIngredientesPizza {

	public Massa criarMassa() {
		return new MassaCrostaFina();
	}

	public Molho criarMolho() {
		return new MolhoMarinara();
	}

	public Queijo criarQueijo() {
		return new QueijoReggiano();
	}

	public Vegetal[] criarVegetal() {
		Vegetal [] vegetals = {new Alho(), new Cebola(), new Cogumelo(), new PimentaVermelha()};
		return vegetals;
	}

	public Pepperoni criarPepperoni() {
		return new PepperoniFatiado();
	}

	public Molusco criarMolusco() {
		return new MoluscoFresco();
	}

}
