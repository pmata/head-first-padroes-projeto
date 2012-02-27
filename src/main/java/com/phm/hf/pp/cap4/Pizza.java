package com.phm.hf.pp.cap4;

import java.util.ArrayList;
import java.util.List;


public abstract class Pizza {

	private TiposPizza tipo;
	private String nome;
	private String massa;
	private String molho;
	private List<String> coberturas = new ArrayList<String>();

	public Pizza(TiposPizza pTipo) {
		this.tipo = pTipo;
	}

	public void preparar() {
		System.out.println("Preparando pizza " + getNome());
		System.out.println("Do sabor " + getTipo());
		System.out.println("Esticando a massa " + getMassa());
		System.out.println("Adicionando molho " + getMolho());
		System.out.println("Adicionando cobertura ");

		for (final String cobertura : getCoberturas()) {
			System.out.println(cobertura + " ");
		}
	}

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

	public String getMassa() {
		return massa;
	}

	public void setMassa(String massa) {
		this.massa = massa;
	}

	public String getMolho() {
		return molho;
	}

	public void setMolho(String molho) {
		this.molho = molho;
	}

	public List<String> getCoberturas() {
		return coberturas;
	}

	public void setCoberturas(List<String> coberturas) {
		this.coberturas = coberturas;
	}

	public TiposPizza getTipo() {
		return tipo;
	}
}