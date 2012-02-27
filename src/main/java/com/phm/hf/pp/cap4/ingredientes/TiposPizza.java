package com.phm.hf.pp.cap4.ingredientes;

public enum TiposPizza {

	QUEIJO("queijo") {
		@Override
		public String toString() {
			return this.getTipo();
		}
	},
	PEPPERONI("pepperoni") {
		@Override
		public String toString() {
			return this.getTipo();
		}
	},
	MOLUSCOS("moluscos") {
		@Override
		public String toString() {
			return this.getTipo();
		}
	},
	VEGETAIS("vegetais") {
		@Override
		public String toString() {
			return this.getTipo();
		}
	};

	private String tipo;

	TiposPizza(final String pTipo) {
		String tipoTemp = null;

		if (pTipo != null) {
			tipoTemp = pTipo.toLowerCase();
		}

		this.tipo = tipoTemp;
	}

	public String getTipo() {
		return this.tipo;
	}
}