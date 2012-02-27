package com.phm.hf.pp.cap4.sabores;

import com.phm.hf.pp.cap4.Pizza;
import com.phm.hf.pp.cap4.fabrica.FabricaIngredientesPizza;
import com.phm.hf.pp.cap4.ingredientes.TiposPizza;

public class PizzaMoluscos extends Pizza {

	FabricaIngredientesPizza fabricaIngredientesPizza;

	public PizzaMoluscos(FabricaIngredientesPizza pFabricaIngredientesPizza) {
		fabricaIngredientesPizza = pFabricaIngredientesPizza;
	}

	@Override
	public void preparar() {
		setTipo(TiposPizza.MOLUSCOS);
		setNome("Pizza de Moluscos");
		setMassa(fabricaIngredientesPizza.criarMassa());
		setMolho(fabricaIngredientesPizza.criarMolho());
		setVegetals(fabricaIngredientesPizza.criarVegetal());
		setQueijo(fabricaIngredientesPizza.criarQueijo());
		setPepperoni(fabricaIngredientesPizza.criarPepperoni());
		setMolusco(fabricaIngredientesPizza.criarMolusco());
	}
}
