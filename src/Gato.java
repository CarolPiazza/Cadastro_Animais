/**
 * Classe Gato que herda de Animal e adiciona informações específicas.
 */
class Gato extends Animal {
	private boolean gostaDeArranhar;

	public Gato(String nomePet, String nomeTutor, String codigoMicrochip, int idade, String sexo, double peso, boolean castracao, boolean planoSaude, boolean gostaDeArranhar) {
		super(nomePet, nomeTutor, codigoMicrochip, idade, sexo, peso, castracao, planoSaude);
		this.gostaDeArranhar = gostaDeArranhar;
	}

	public Gato(String nomePet, String nomeTutor, int idade, String sexo, double peso, boolean castracao, boolean planoSaude, boolean gostaDeArranhar) {
		super(nomePet, nomeTutor, idade, sexo, peso, castracao, planoSaude);
		this.gostaDeArranhar = gostaDeArranhar;
	}

	public boolean getGostaDeArranhar() {
		return gostaDeArranhar;
	}

	public void setGostaDeArranhar(boolean gostaDeArranhar) {
		this.gostaDeArranhar = gostaDeArranhar;
	}

	@Override
	public String toString() {
		return super.toString() + String.format("\nTipo: Gato\nGosta de arranhar: %s", gostaDeArranhar ? "Sim" : "Nao");
	}

	@Override
	public String calendarioVacinal() {
		if (getIdade() < 0) {
			return "Erro: A idade do animal não pode ser negativa.";
		} else if (getIdade() <= 2) {
			return """
					Vacinas recomendadas para filhotes com até 2 meses:
					- Vacina Polivalente (V3, V4 ou V5) - 1ª dose: Proteção contra panleucopenia, rinotraqueíte e calicivirose.
					""";
		} else if (getIdade() <= 3) {
			return """
					Vacinas recomendadas para filhotes de 2 a 3 meses:
					- Vacina Polivalente (V3, V4 ou V5) - 2ª dose: Reforço contra panleucopenia, rinotraqueíte e calicivirose.
					- Vacina contra raiva (1ª dose): Proteção contra o vírus da raiva.
					""";
		} else if (getIdade() <= 4) {
			return """
					Vacinas recomendadas para filhotes de 3 a 4 meses:
					- Vacina Polivalente (V3, V4 ou V5) - 3ª dose: Último reforço do protocolo inicial.
					""";
		} else if (getIdade() < 12) {
			return """
					Vacinas recomendadas para gatos jovens (4 meses a 1 ano):
					- Verifique a conclusão do protocolo inicial de vacinas.
					- Possíveis vacinas opcionais, como Vacina contra leucemia felina (FeLV), dependendo do estilo de vida do gato.
					""";
		} else {
			return """
					Vacinas recomendadas para gatos adultos (1 ano ou mais):
					- Reforço anual da Vacina Polivalente (V3, V4 ou V5).
					- Reforço anual da Vacina contra raiva.
					- Vacinas opcionais, como Vacina contra leucemia felina (FeLV), conforme recomendado pelo veterinário.
					""";
		}
	}

	@Override
	public String avaliacaoPeso() {
		if (getPeso() >= 2.5 && getPeso() <= 6) {
			return "O peso do gato está saudável.";
		}
		return "O peso do gato está fora do intervalo saudável.";
	}

	@Override
	public String castrar() {
		double peso = getPeso();
		int idade = getIdade();
		boolean castrado = getCastracao();

		if (castrado) {
			return "O animal já está castrado!";
		} else if (idade < 4) {
			return "O animal é muito novo para a castração!";
		} else if (peso < 1.5) {
			return "O animal está com o peso abaixo do indicado para castração!";
		}

		setCastracao(true);
		
		double valor = 240.00;

		if (getPlanoSaude()) {
			valor -= valor * 0.7;
		}

		return String.format("O valor final da castração é de: R$%.2f", valor);
	}
}