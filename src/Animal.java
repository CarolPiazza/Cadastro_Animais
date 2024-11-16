/**
 * Classe Animal que representa as informações básicas de um animal.
 */
abstract class Animal {
	private String nomePet;
	private String nomeTutor;
	private String codigoMicrochip;
	private int idade;
	private String sexo;
	private double peso;
	private boolean castracao;
	private boolean planoSaude;

	/**
	 * Construtor principal da classe Animal.
	 *
	 * @param nomePet         Nome do animal de estimação.
	 * @param nomeTutor       Nome do tutor do animal.
	 * @param codigoMicrochip Código do microchip do animal.
	 * @param idade           Idade do animal em meses;
	 * @param sexo            Sexo do animal (M/F).
	 * @param peso            Peso do animal (em kg).
	 * @param castracao       Condição de castração do animal (Sim/Não).
	 * @param planoSaude      Se há plano de saúde vigente (Sim/Não)
	 */
	public Animal(String nomePet, String nomeTutor, String codigoMicrochip, int idade, String sexo, double peso, boolean castracao, boolean planoSaude) {
		this.nomePet = nomePet;
		this.nomeTutor = nomeTutor;
		this.codigoMicrochip = codigoMicrochip;
		this.idade = idade;
		this.sexo = sexo;
		this.peso = peso;
		this.castracao = castracao;
		this.planoSaude = planoSaude;
	}


	/**
	 * Construtor principal da classe Animal.
	 *
	 * @param nomePet    Nome do animal de estimação.
	 * @param nomeTutor  Nome do tutor do animal.
	 * @param idade      Idade do animal em meses;
	 * @param sexo       Sexo do animal (M/F).
	 * @param peso       Peso do animal (em kg).
	 * @param castracao  Condição de castração do animal (Sim/Não).
	 * @param planoSaude Se há plano de saúde vigente (Sim/Não)
	 */
	public Animal(String nomePet, String nomeTutor, int idade, String sexo, double peso, boolean castracao, boolean planoSaude) {
		this.nomePet = nomePet;
		this.nomeTutor = nomeTutor;
		this.idade = idade;
		this.sexo = sexo;
		this.peso = peso;
		this.castracao = castracao;
		this.planoSaude = planoSaude;
	}

	public String getNomePet() {
		return nomePet;
	}

	public void setNomePet(String nomePet) {
		this.nomePet = nomePet;
	}

	public String getNomeTutor() {
		return nomeTutor;
	}

	public void setNomeTutor(String nomeTutor) {
		this.nomeTutor = nomeTutor;
	}

	public String getCodigoMicrochip() {
		return codigoMicrochip;
	}

	public void setCodigoMicrochip(String codigoMicrochip) {
		this.codigoMicrochip = codigoMicrochip;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public boolean getCastracao() {
		return castracao;
	}

	public void setCastracao(boolean castracao) {
		this.castracao = castracao;
	}

	public boolean getPlanoSaude() {
		return planoSaude;
	}

	public void setPlanoSaude(boolean planoSaude) {
		this.planoSaude = planoSaude;
	}

	public String toString() {
		return String.format("Nome: %s\nTutor: %s\nMicrochip: %s\nIdade: %d\nSexo: %s\nPeso: %.2f\nCastrado: %s\nPlano de Saude: %s",
				nomePet, nomeTutor, codigoMicrochip, idade, sexo, peso, castracao ? "Sim" : "Nao", planoSaude ? "Sim" : "Nao");
	}

	public abstract String castrar();

	public abstract String calendarioVacinal();

	public abstract String avaliacaoPeso();
}