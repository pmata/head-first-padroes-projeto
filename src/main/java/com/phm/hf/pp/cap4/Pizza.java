package com.phm.hf.pp.cap4;

import com.phm.hf.pp.cap4.ingredientes.Massa;
import com.phm.hf.pp.cap4.ingredientes.Molho;
import com.phm.hf.pp.cap4.ingredientes.Molusco;
import com.phm.hf.pp.cap4.ingredientes.Pepperoni;
import com.phm.hf.pp.cap4.ingredientes.Queijo;
import com.phm.hf.pp.cap4.ingredientes.TiposPizza;
import com.phm.hf.pp.cap4.ingredientes.Vegetal;

public abstract class Pizza {

	private TiposPizza tipo;
	private String nome;
	private Massa massa;
	private Molho molho;
	private Vegetal[] vegetals;
	private Queijo queijo;
	private Pepperoni pepperoni;
	private Molusco molusco;

	public abstract void preparar();

	public void assar() {
		System.out.println("Assando por 25 minutos a 360 graus");
	}

	public void cortar() {
		System.out.println("Cortando em 8 pedaços diagonais.");
	}

	public void encaixotar() {
		System.out.println("Encaixotar na caixa oficial da Loja de Pizza.");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TiposPizza getTipo() {
		return tipo;
	}

	public Massa getMassa() {
		return massa;
	}

	public void setMassa(Massa massa) {
		this.massa = massa;
	}

	public Molho getMolho() {
		return molho;
	}

	public void setMolho(Molho molho) {
		this.molho = molho;
	}

	public Vegetal[] getVegetals() {
		return vegetals;
	}

	public void setVegetals(Vegetal[] vegetals) {
		this.vegetals = vegetals;
	}

	public Queijo getQueijo() {
		return queijo;
	}

	public void setQueijo(Queijo queijo) {
		this.queijo = queijo;
	}

	public Pepperoni getPepperoni() {
		return pepperoni;
	}

	public void setPepperoni(Pepperoni pepperoni) {
		this.pepperoni = pepperoni;
	}

	public Molusco getMolusco() {
		return molusco;
	}

	public void setMolusco(Molusco molusco) {
		this.molusco = molusco;
	}

	public void setTipo(TiposPizza tipo) {
		this.tipo = tipo;
	}
}