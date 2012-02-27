package com.phm.hf.pp.cap4;

public interface FabricaIngredientesPizza {

	public Massa criarMassa();

	public Molho criarMolho();

	public Queijo criarQueijo();

	public Vegetal[] criarVegetal();

	public Pepperoni criarPepperoni();

	public Molusco criarMolusco();
}
