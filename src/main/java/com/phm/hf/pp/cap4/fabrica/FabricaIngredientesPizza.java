package com.phm.hf.pp.cap4.fabrica;

import com.phm.hf.pp.cap4.ingredientes.Massa;
import com.phm.hf.pp.cap4.ingredientes.Molho;
import com.phm.hf.pp.cap4.ingredientes.Molusco;
import com.phm.hf.pp.cap4.ingredientes.Pepperoni;
import com.phm.hf.pp.cap4.ingredientes.Queijo;
import com.phm.hf.pp.cap4.ingredientes.Vegetal;

public interface FabricaIngredientesPizza {

	Massa criarMassa();
	Molho criarMolho();
	Queijo criarQueijo();
	Vegetal[] criarVegetal();
	Pepperoni criarPepperoni();
	Molusco criarMolusco();
}
