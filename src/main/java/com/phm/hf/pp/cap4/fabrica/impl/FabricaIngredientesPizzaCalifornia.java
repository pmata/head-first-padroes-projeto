package com.phm.hf.pp.cap4.fabrica.impl;

import com.phm.hf.pp.cap4.fabrica.FabricaIngredientesPizza;
import com.phm.hf.pp.cap4.ingredientes.Alho;
import com.phm.hf.pp.cap4.ingredientes.Cebola;
import com.phm.hf.pp.cap4.ingredientes.Cogumelo;
import com.phm.hf.pp.cap4.ingredientes.Massa;
import com.phm.hf.pp.cap4.ingredientes.MassaCrostaGrossa;
import com.phm.hf.pp.cap4.ingredientes.Molho;
import com.phm.hf.pp.cap4.ingredientes.MolhoMarinara;
import com.phm.hf.pp.cap4.ingredientes.Molusco;
import com.phm.hf.pp.cap4.ingredientes.MoluscoFresco;
import com.phm.hf.pp.cap4.ingredientes.Pepperoni;
import com.phm.hf.pp.cap4.ingredientes.PepperoniFatiado;
import com.phm.hf.pp.cap4.ingredientes.PimentaVermelha;
import com.phm.hf.pp.cap4.ingredientes.Queijo;
import com.phm.hf.pp.cap4.ingredientes.QueijoReggiano;
import com.phm.hf.pp.cap4.ingredientes.Vegetal;

public class FabricaIngredientesPizzaCalifornia implements FabricaIngredientesPizza {

	public Massa criarMassa() {
		return new MassaCrostaGrossa();
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
