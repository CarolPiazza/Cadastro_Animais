import java.util.ArrayList;
/**
 * Classe Animal que representa as informações básicas de um animal.
 */
class Animal {
    private String nome;
    private int idade;
    private String sexo;

    /**
     * Construtor da classe Animal.
     * @para nome Nome do animal
     * @para idade Idade do animal
     * @para sexo Sexo do animal (M/F)
     */
    public Animal(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getSexo() {
        return sexo;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade + " anos, Sexo: " + sexo;
    }
}

/**
 * Classe Gato que herda de Animal e adiciona informações específicas.
 */
class Gato extends Animal {
    private boolean gostaDeArranhar;

    public Gato(String nome, int idade, String sexo, boolean gostaDeArranhar) {
        super(nome, idade, sexo);
        this.gostaDeArranhar = gostaDeArranhar;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tipo: Gato, Gosta de arranhar: " + (gostaDeArranhar ? "Sim" : "Não");
    }
}

/**
 * Classe Cachorro que herda de Animal e adiciona informações específicas.
 */
class Cachorro extends Animal {
    private boolean gostaDeBrincar;

    public Cachorro(String nome, int idade, String sexo, boolean gostaDeBrincar) {
        super(nome, idade, sexo);
        this.gostaDeBrincar = gostaDeBrincar;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tipo: Cachorro, Gosta de brincar: " + (gostaDeBrincar ? "Sim" : "Não");
    }
}

/**
 * Classe Hamster que herda de Animal e adiciona informações específicas.
 */
class Hamster extends Animal {
    private boolean possuiRoda;

    public Hamster(String nome, int idade, String sexo, boolean possuiRoda) {
        super(nome, idade, sexo);
        this.possuiRoda = possuiRoda;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tipo: Hamster, Possui roda: " + (possuiRoda ? "Sim" : "Não");
    }
}

/**
 * Classe Passaro que herda de Animal e adiciona informações específicas.
 */
class Passaro extends Animal {
    private boolean podeVoar;

    public Passaro(String nome, int idade, String sexo, boolean podeVoar) {
        super(nome, idade, sexo);
        this.podeVoar = podeVoar;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tipo: Pássaro, Pode voar: " + (podeVoar ? "Sim" : "Não");
    }
}

/**
 * Classe Tartaruga que herda de Animal e adiciona informações específicas.
 */
class Tartaruga extends Animal {
    private boolean viveNaAgua;

    public Tartaruga(String nome, int idade, String sexo, boolean viveNaAgua) {
        super(nome, idade, sexo);
        this.viveNaAgua = viveNaAgua;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tipo: Tartaruga, Vive na água: " + (viveNaAgua ? "Sim" : "Não");
    }
}