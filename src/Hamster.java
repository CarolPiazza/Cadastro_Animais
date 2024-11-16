/**
 * Classe Hamster que herda de Animal e adiciona informações específicas.
 */
class Hamster extends Animal {
	private boolean possuiRoda;

	public Hamster(String nomePet, String nomeTutor, String codigoMicrochip, int idade, String sexo, double peso, boolean castracao, boolean planoSaude, boolean possuiRoda) {
		super(nomePet, nomeTutor, codigoMicrochip, idade, sexo, peso, castracao, planoSaude);
		this.possuiRoda = possuiRoda;
	}

	public Hamster(String nomePet, String nomeTutor, int idade, String sexo, double peso, boolean castracao, boolean planoSaude, boolean possuiRoda) {
		super(nomePet, nomeTutor, idade, sexo, peso, castracao, planoSaude);
		this.possuiRoda = possuiRoda;
	}

	public boolean getPossuiRoda() {
		return possuiRoda;
	}

	public void setPossuiRoda(boolean possuiRoda) {
		this.possuiRoda = possuiRoda;
	}

	@Override
	public String toString() {
		return super.toString() + String.format("\nTipo: Hamster\nPossui roda: %s", possuiRoda ? "Sim" : "Nao");
	}

	@Override
	public String calendarioVacinal() {
		return "Não há protocolo vacinal para Hamster!";
	}

	@Override
	public String avaliacaoPeso() {
		if (getPeso() >= 0.05 && getPeso() <= 0.2) {
			return "O peso do hamster está saudável.";
		}
		return "O peso do hamster está fora do intervalo saudável.";
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