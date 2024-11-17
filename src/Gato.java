/**
 * Classe Gato que herda de Animal e adiciona informações específicas.
 */
public class Gato extends Animal {
	/**
	 * Indica se o gato gosta de arranhar.
	 */
	public boolean gostaDeArranhar;
	/**
	 * Construtor da classe Gato que inclui o código do microchip.
	 *
	 * @param nomePet         Nome do gato.
	 * @param nomeTutor       Nome do tutor do gato.
	 * @param codigoMicrochip Código do microchip do gato.
	 * @param idade           Idade do gato em meses.
	 * @param sexo            Sexo do gato (M/F).
	 * @param peso            Peso do gato em quilogramas.
	 * @param castracao       Indica se o gato é castrado.
	 * @param planoSaude      Indica se o gato possui plano de saúde.
	 * @param gostaDeArranhar Indica se o gato gosta de arranhar.
	 */
	public Gato(String nomePet, String nomeTutor, String codigoMicrochip, int idade, String sexo, double peso, boolean castracao, boolean planoSaude, boolean gostaDeArranhar) {
		super(nomePet, nomeTutor, codigoMicrochip, idade, sexo, peso, castracao, planoSaude);
		this.gostaDeArranhar = gostaDeArranhar;
	}
	/**
	 * Construtor da classe Gato sem incluir o código do microchip.
	 *
	 * @param nomePet        Nome do gato.
	 * @param nomeTutor      Nome do tutor do gato.
	 * @param idade          Idade do gato em meses.
	 * @param sexo           Sexo do gato (M/F).
	 * @param peso           Peso do gato em quilogramas.
	 * @param castracao      Indica se o gato é castrado.
	 * @param planoSaude     Indica se o gato possui plano de saúde.
	 * @param gostaDeArranhar Indica se o gato gosta de arranhar.
	 */
	public Gato(String nomePet, String nomeTutor, int idade, String sexo, double peso, boolean castracao, boolean planoSaude, boolean gostaDeArranhar) {
		super(nomePet, nomeTutor, idade, sexo, peso, castracao, planoSaude);
		this.gostaDeArranhar = gostaDeArranhar;
	}
	/**
	 * Obtém a informação se o gato gosta de arranhar.
	 *
	 * @return true se o gato gosta de arranhar, false caso contrário.
	 */
	public boolean getGostaDeArranhar() {
		return gostaDeArranhar;
	}

	/**
	 * Define se o gato gosta de arranhar.
	 *
	 * @param gostaDeArranhar true se gosta de arranhar, false caso contrário.
	 */
	public void setGostaDeArranhar(boolean gostaDeArranhar) {
		this.gostaDeArranhar = gostaDeArranhar;
	}
	/**
	 * Retorna uma representação textual das informações do gato, incluindo as informações específicas.
	 *
	 * @return String com as informações do gato.
	 */
	@Override
	public String toString() {
		return super.toString() + String.format("\nTipo: Gato\nGosta de arranhar: %s", gostaDeArranhar ? "Sim" : "Nao");
	}
	/**
	 * Retorna o calendário vacinal recomendado com base na idade do gato.
	 *
	 * @return String com as recomendações de vacinação.
	 */
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
	/**
	 * Avalia se o peso do gato está dentro do intervalo saudável.
	 *
	 * @return String com a avaliação do peso.
	 */
	@Override
	public String avaliacaoPeso() {
		if (getPeso() >= 2.5 && getPeso() <= 6) {
			return "O peso do gato está saudável.";
		}
		return "O peso do gato está fora do intervalo saudável.";
	}

	/**
	 * Realiza a castração do gato caso seja viável, considerando idade, peso e plano de saúde.
	 *
	 * @return String com o resultado ou custo da castração.
	 */
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