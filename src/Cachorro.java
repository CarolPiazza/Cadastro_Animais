/**
 * Classe Cachorro que herda da classe Animal e adiciona informações específicas sobre cães.
 */
public class Cachorro extends Animal {
	/**
	 * Indica se o cachorro gosta de brincar.
	 */
	private boolean gostaDeBrincar;
	/**
	 * Porte do cachorro (pequeno, médio ou grande).
	 */
	private String porte;
	/**
	 * Construtor da classe Cachorro que inclui o código do microchip.
	 *
	 * @param nomePet         Nome do cachorro.
	 * @param nomeTutor       Nome do tutor do cachorro.
	 * @param codigoMicrochip Código do microchip do cachorro.
	 * @param idade           Idade do cachorro em meses.
	 * @param sexo            Sexo do cachorro (M/F).
	 * @param peso            Peso do cachorro em quilogramas.
	 * @param castracao       Indica se o cachorro é castrado.
	 * @param planoSaude      Indica se o cachorro possui plano de saúde.
	 * @param gostaDeBrincar  Indica se o cachorro gosta de brincar.
	 * @param porte           Porte do cachorro (pequeno, médio ou grande).
	 */
	public Cachorro(String nomePet, String nomeTutor, String codigoMicrochip, int idade, String sexo, double peso, boolean castracao, boolean planoSaude, boolean gostaDeBrincar, String porte) {
		super(nomePet, nomeTutor, codigoMicrochip, idade, sexo, peso, castracao, planoSaude);
		this.gostaDeBrincar = gostaDeBrincar;
		this.porte = porte;
	}
	/**
	 * Construtor da classe Cachorro sem incluir o código do microchip.
	 *
	 * @param nomePet        Nome do cachorro.
	 * @param nomeTutor      Nome do tutor do cachorro.
	 * @param idade          Idade do cachorro em meses.
	 * @param sexo           Sexo do cachorro (M/F).
	 * @param peso           Peso do cachorro em quilogramas.
	 * @param castracao      Indica se o cachorro é castrado.
	 * @param planoSaude     Indica se o cachorro possui plano de saúde.
	 * @param gostaDeBrincar Indica se o cachorro gosta de brincar.
	 * @param porte          Porte do cachorro (pequeno, médio ou grande).
	 */
	public Cachorro(String nomePet, String nomeTutor, int idade, String sexo, double peso, boolean castracao, boolean planoSaude, boolean gostaDeBrincar, String porte) {
		super(nomePet, nomeTutor, idade, sexo, peso, castracao, planoSaude);
		this.gostaDeBrincar = gostaDeBrincar;
		this.porte = porte;
	}
	/**
	 * Obtém a informação se o cachorro gosta de brincar.
	 *
	 * @return true se o cachorro gosta de brincar, false caso contrário.
	 */

	public boolean getGostaDeBrincar() {
		return gostaDeBrincar;
	}
	/**
	 * Define se o cachorro gosta de brincar.
	 *
	 * @param gostaDeBrincar true se gosta de brincar, false caso contrário.
	 */

	public void setGostaDeBrincar(boolean gostaDeBrincar) {
		this.gostaDeBrincar = gostaDeBrincar;
	}
	/**
	 * Obtém o porte do cachorro.
	 *
	 * @return Porte do cachorro (pequeno, médio ou grande).
	 */
	public String getPorte() {
		return porte;
	}
	/**
	 * Define o porte do cachorro.
	 *
	 * @param porte Porte do cachorro (pequeno, médio ou grande).
	 */
	public void setPorte(String porte) {
		this.porte = porte;
	}
	/**
	 * Retorna uma representação textual das informações do cachorro, incluindo as informações específicas.
	 *
	 * @return String com as informações do cachorro.
	 */
	@Override
	public String toString() {
		return super.toString() + String.format("\nTipo: Cachorro\nPorte: %s\nGosta de brincar: %s", porte, gostaDeBrincar ? "Sim" : "Nao");
	}
	/**
	 * Retorna o calendário vacinal recomendado com base na idade do cachorro.
	 *
	 * @return String com as recomendações de vacinação.
	 */

	@Override
	public String calendarioVacinal() {
		if (getIdade() < 0) {
			return "Erro: A idade do animal não pode ser negativa.";
		} else if (getIdade() <= 2) { // Até 2 meses
			return """
					Vacinas recomendadas para filhotes com até 2 meses:
					- Vacina V8 ou V10 (1ª dose): Proteção contra cinomose, parvovirose, leptospirose, entre outras
					""";
		} else if (getIdade() <= 3) { // 2 a 3 meses
			return """
					Vacinas recomendadas para filhotes de 2 a 3 meses:
					- Vacina V8 ou V10 (2ª dose): Reforço contra cinomose, parvovirose, leptospirose, entre outras
					- Vacina contra raiva (1ª dose): Proteção contra o vírus da raiva
					""";
		} else if (getIdade() <= 4) { // 3 a 4 meses
			return """
					Vacinas recomendadas para filhotes de 3 a 4 meses:
					- Vacina V8 ou V10 (3ª dose): Último reforço do protocolo inicial
					""";
		} else if (getIdade() < 12) { // Entre 4 meses e 1 ano
			return """
					Vacinas recomendadas para cães jovens (4 meses a 1 ano):
					- Verifique a conclusão do protocolo inicial de vacinas
					- Possíveis vacinas opcionais, como Giárdia e Gripe Canina
					""";
		} else { // 1 ano ou mais
			return """
					Vacinas recomendadas para cães adultos (1 ano ou mais):
					- Reforço anual da Vacina V8 ou V10
					- Reforço anual da Vacina contra raiva
					- Vacinas opcionais, como Giárdia e Gripe Canina, conforme recomendado pelo veterinário
					""";
		}
	}
	/**
	 * Avalia se o peso do cachorro está dentro do intervalo saudável para o seu porte.
	 *
	 * @return String com a avaliação do peso.
	 */

	@Override
	public String avaliacaoPeso() {
		switch (porte.toLowerCase()) {
			case "pequeno":
				if (getPeso() >= 3 && getPeso() <= 10) {
					return "O peso do cachorro está saudável para um porte pequeno!";
				}
				return "O peso do cachorro está fora do intervalo saudável para um porte pequeno!";
			case "medio":
				if (getPeso() >= 10 && getPeso() <= 25) {
					return "O peso do cachorro está saudável para um porte médio!";
				}
				return "O peso do cachorro está fora do intervalo saudável para um porte médio!";
			case "grande":
				if (getPeso() >= 25 && getPeso() <= 50) {
					return "O peso do cachorro está saudável para um porte grande!";
				}
				return "O peso do cachorro está fora do intervalo saudável para um porte grande!";
			default:
				return "Porte inválido. Informe 'pequeno', 'medio' ou 'grande'!";
		}
	}
	/**
	 * Realiza a castração do cachorro caso seja viável, considerando idade, peso e plano de saúde.
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
		} else if (peso < 3) {
			return "O animal está com o peso abaixo do indicado para castração!";
		}

		setCastracao(true);

		double valor;
		if (peso <= 10) {
			valor = 240.00;
		} else if (peso <= 20) {
			valor = 270.00;
		} else if (peso <= 30) {
			valor = 360.00;
		} else {
			valor = 440.00;
		}

		if (getPlanoSaude()) {
			valor -= valor * 0.7;
		}

		return String.format("O valor final da castração é de: R$%.2f", valor);
	}
}