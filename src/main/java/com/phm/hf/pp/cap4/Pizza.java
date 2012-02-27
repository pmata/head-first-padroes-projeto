package com.phm.hf.pp.cap4;

public abstract class Pizza {

	private TiposPizza tipo;
	private String nome;
	/*
	 * private String massa; private String molho; private List<String>
	 * coberturas = new ArrayList<String>();
	 */

	private Massa massa;
	private Molho molho;
	private Vegetal[] vegetals;
	private Queijo queijo;
	private Pepperoni pepperoni;
	private Molusco molusco;

	public abstract void preparar();

	/*
	 * public void preparar() { System.out.println("Preparando pizza " +
	 * getNome()); System.out.println("Do sabor " + getTipo());
	 * System.out.println("Esticando a massa " + getMassa());
	 * System.out.println("Adicionando molho " + getMolho());
	 * System.out.println("Adicionando cobertura ");
	 * 
	 * for (final String cobertura : getCoberturas()) {
	 * System.out.println(cobertura + " "); } }
	 */

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

	/*
	 * public String getMassa() { return massa; }
	 * 
	 * public void setMassa(String massa) { this.massa = massa; }
	 * 
	 * public String getMolho() { return molho; }
	 * 
	 * public void setMolho(String molho) { this.molho = molho; }
	 * 
	 * public List<String> getCoberturas() { return coberturas; }
	 * 
	 * public void setCoberturas(List<String> coberturas) { this.coberturas =
	 * coberturas; }
	 */

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