/**
 * Classe Hamster que herda de Animal e adiciona informações específicas.
 */
class Hamster extends Animal {
    private boolean possuiRoda;

    public Hamster(String nomePet, String nomeTutor, String codigoMicrochip, int idade, String sexo, double peso, String castracao, String planoSaude, boolean possuiRoda) {
        super(nomePet, nomeTutor, codigoMicrochip, idade, sexo, peso, castracao, planoSaude);
        this.possuiRoda = possuiRoda;
    }

    public boolean isPossuiRoda() {
        return possuiRoda;
    }

    public void setPossuiRoda(boolean possuiRoda) {
        this.possuiRoda = possuiRoda;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tipo: Hamster, Possui roda: " + (possuiRoda ? "Sim" : "Não");
    }

    @Override
    public String calendarioVacinal() {
        System.out.println("Não há protocolo vacinal para Hamster!");
    }

    @Override
    public String pesoSaudavel() {
        if (getPeso() >= 0.05 && getPeso() <= 0.2) {
            return "O peso do hamster está saudável.";
        }
        return "O peso do hamster está fora do intervalo saudável.";
    }
}