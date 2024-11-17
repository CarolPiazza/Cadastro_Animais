/**
 * Classe Hamster que herda de Animal e adiciona informações específicas.
 */
public class Hamster extends Animal {
	public boolean possuiRoda;// Indica se o hamster possui uma roda no habitat.
	/**
	 * Construtor completo da classe Hamster.
	 *
	 * @param nomePet         Nome do hamster.
	 * @param nomeTutor       Nome do tutor do hamster.
	 * @param codigoMicrochip Código do microchip do hamster (opcional).
	 * @param idade           Idade do hamster em meses.
	 * @param sexo            Sexo do hamster (M/F).
	 * @param peso            Peso do hamster em quilogramas.
	 * @param castracao       Condição de castração do hamster (Sim/Não).
	 * @param planoSaude      Indica se o hamster possui plano de saúde (Sim/Não).
	 * @param possuiRoda      Indica se o hamster possui uma roda em seu habitat.
	 */
	public Hamster(String nomePet, String nomeTutor, String codigoMicrochip, int idade, String sexo, double peso, boolean castracao, boolean planoSaude, boolean possuiRoda) {
		super(nomePet, nomeTutor, codigoMicrochip, idade, sexo, peso, castracao, planoSaude);
		this.possuiRoda = possuiRoda;
	}
	/**
	 * Construtor simplificado da classe Hamster (sem código de microchip).
	 *
	 * @param nomePet    Nome do hamster.
	 * @param nomeTutor  Nome do tutor do hamster.
	 * @param idade      Idade do hamster em meses.
	 * @param sexo       Sexo do hamster (M/F).
	 * @param peso       Peso do hamster em quilogramas.
	 * @param castracao  Condição de castração do hamster (Sim/Não).
	 * @param planoSaude Indica se o hamster possui plano de saúde (Sim/Não).
	 * @param possuiRoda Indica se o hamster possui uma roda em seu habitat.
	 */
	public Hamster(String nomePet, String nomeTutor, int idade, String sexo, double peso, boolean castracao, boolean planoSaude, boolean possuiRoda) {
		super(nomePet, nomeTutor, idade, sexo, peso, castracao, planoSaude);
		this.possuiRoda = possuiRoda;
	}
	/**
	 * Obtém a informação se o hamster possui uma roda em seu habitat.
	 *
	 * @return true se possui uma roda, false caso contrário.
	 */
	public boolean getPossuiRoda() {
		return possuiRoda;
	}
	/**
	 * Define se o hamster possui uma roda em seu habitat.
	 *
	 * @param possuiRoda true se possuir uma roda, false caso contrário.
	 */
	public void setPossuiRoda(boolean possuiRoda) {
		this.possuiRoda = possuiRoda;
	}
	/**
	 * Retorna uma representação textual do hamster, incluindo seus atributos e tipo.
	 *
	 * @return String contendo as informações detalhadas do hamster.
	 */
	@Override
	public String toString() {
		return super.toString() + String.format("\nTipo: Hamster\nPossui roda em seu habitat: %s", possuiRoda ? "Sim" : "Nao");
	}
	/**
	 * Retorna o protocolo vacinal específico para hamsters.
	 *
	 * @return Mensagem indicando que não há protocolo vacinal definido.
	 */
	@Override
	public String calendarioVacinal() {
		return "Não há protocolo vacinal para Hamster!";
	}
	/**
	 * Avalia o peso do hamster com base nos intervalos saudáveis.
	 *
	 * @return Mensagem indicando se o peso está dentro do intervalo saudável.
	 */
	@Override
	public String avaliacaoPeso() {
		if (getPeso() >= 0.05 && getPeso() <= 0.2) {
			return "O peso do hamster está saudável.";
		}
		return "O peso do hamster está fora do intervalo saudável.";
	}

	/**
	 * Realiza a castração do hamster, se elegível, e calcula o custo do procedimento.
	 *
	 * @return Mensagem indicando o status da castração ou o custo final.
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
		} else if (peso < 0.05) {
			return "O animal está com o peso abaixo do indicado para castração!";
		}

		setCastracao(true);

		double valor = 80.00;
		if (getSexo().equalsIgnoreCase("femea")) {
			valor = 120.00;
		}

		if (getPlanoSaude()) {
			valor -= valor * 0.7;
		}

		return String.format("O valor final da castração é de: R$%.2f", valor);
	}
}