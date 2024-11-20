/**
 * Classe Animal que representa as informações básicas de um animal.
 */
abstract class Animal {

	/**
	 * Nome do animal de estimação.
	 */
	public String nomePet;

	/**
	 * Nome do tutor do animal.
	 */
	public String nomeTutor;

	/**
	 * Código do microchip do animal (opcional).
	 */
	public String codigoMicrochip;

	/**
	 * Idade do animal em meses.
	 */
	public int idade;

	/**
	 * Sexo do animal (M/F)
	 */
	public String sexo;

	/**
	 * Peso do animal em quilogramas.
	 */
	public double peso;

	/**
	 * Indica de o animla é cadastrado.
	 */
	public boolean castracao;

	/**
	 * Indica se o animal possui plano de saúde.
	 */
	public boolean planoSaude;

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
	 * Construtor principal da classe Animal sem o código do microchip.
	 *
	 * @param nomePet    Nome do animal de estimação.
	 * @param nomeTutor  Nome do tutor do animal.
	 * @param idade      Idade do animal em meses.
	 * @param sexo       Sexo do animal (M/F).
	 * @param peso       Peso do animal em quilogramas.
	 * @param castracao  Indica se o animal é castrado.
	 * @param planoSaude Indica se o animal possui plano de saúde.
	 */
	public Animal(String nomePet, String nomeTutor, int idade, String sexo, double peso, boolean castracao, boolean planoSaude) {
		this(nomePet, nomeTutor, null, idade, sexo, peso, castracao, planoSaude);
	}

	/**
	 * Obtém o nome do animal de estimação.
	 *
	 * @return Nome do animal.
	 */
	public String getNomePet() {
		return nomePet;
	}

	/**
	 * Define o nome do animal de estimação.
	 *
	 * @param nomePet Nome do animal.
	 */
	public void setNomePet(String nomePet) {
		this.nomePet = nomePet;
	}

	/**
	 * Obtém o nome do tutor do animal.
	 *
	 * @return Nome do tutor.
	 */
	public String getNomeTutor() {
		return nomeTutor;
	}

	/**
	 * Define o nome do tutor do animal.
	 *
	 * @param nomeTutor Nome do tutor.
	 */
	public void setNomeTutor(String nomeTutor) {
		this.nomeTutor = nomeTutor;
	}

	/**
	 * Obtém o código do microchip do animal.
	 *
	 * @return Código do microchip.
	 */

	public String getCodigoMicrochip() {
		return codigoMicrochip;
	}

	/**
	 * Define o código do microchip do animal.
	 *
	 * @param codigoMicrochip Código do microchip.
	 */

	public void setCodigoMicrochip(String codigoMicrochip) {
		this.codigoMicrochip = codigoMicrochip;
	}

	/**
	 * Obtém a idade do animal em meses.
	 *
	 * @return Idade do animal.
	 */

	public int getIdade() {
		return idade;
	}

	/**
	 * Define a idade do animal em meses.
	 *
	 * @param idade Idade do animal.
	 */
	public void setIdade(int idade) {
		this.idade = idade;
	}

	/**
	 * Obtém o sexo do animal.
	 *
	 * @return Sexo do animal (M/F).
	 */
	public String getSexo() {
		return sexo;
	}

	/**
	 * Define o sexo do animal.
	 *
	 * @param sexo Sexo do animal.
	 */
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	/**
	 * Obtém o peso do animal em quilogramas.
	 *
	 * @return Peso do animal.
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * Define o peso do animal em quilogramas.
	 *
	 * @param peso Peso do animal.
	 */

	public void setPeso(double peso) {
		this.peso = peso;
	}

	/**
	 * Verifica se o animal é castrado.
	 *
	 * @return true se o animal é castrado, false caso contrário.
	 */

	public boolean getCastracao() {
		return castracao;
	}

	/**
	 * Define a condição de castração do animal.
	 *
	 * @param castracao true se castrado, false caso contrário.
	 */

	public void setCastracao(boolean castracao) {
		this.castracao = castracao;
	}

	/**
	 * Verifica se o animal possui plano de saúde.
	 *
	 * @return true se possui plano de saúde, false caso contrário.
	 */

	public boolean getPlanoSaude() {
		return planoSaude;
	}

	/**
	 * Define se o animal possui plano de saúde.
	 *
	 * @param planoSaude true se possui plano de saúde, false caso contrário.
	 */

	public void setPlanoSaude(boolean planoSaude) {
		this.planoSaude = planoSaude;
	}

	/**
	 * Retorna uma representação textual das informações do animal.
	 *
	 * @return String com as informações do animal.
	 */

	public String toString() {
		return String.format("Nome: %s\nTutor: %s\nMicrochip: %s\nIdade: %d\nSexo: %s\nPeso: %.2f\nCastrado: %s\nPlano de Saude: %s",
				nomePet, nomeTutor, codigoMicrochip, idade, sexo, peso, castracao ? "Sim" : "Nao", planoSaude ? "Sim" : "Nao");
	}


	/**
	 * Método abstrato que define o comportamento para castrar o animal.
	 *
	 * @return String com o resultado da castração.
	 */
	public abstract String castrar();

	/**
	 * Método abstrato que define o comportamento para exibir o calendário vacinal do animal.
	 *
	 * @return String com o calendário vacinal.
	 */
	public abstract String calendarioVacinal();

	/**
	 * Método abstrato que avalia o peso do animal.
	 *
	 * @return String com a avaliação do peso.
	 */
	public abstract String avaliacaoPeso();
}