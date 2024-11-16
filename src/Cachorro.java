/**
 * Classe Cachorro que herda de Animal e adiciona informações específicas.
 */
public class Cachorro extends Animal {
    private boolean gostaDeBrincar;
    private String porte;


    public Cachorro(String nomePet, String nomeTutor, String codigoMicrochip, int idade, String sexo, double peso, String castracao, String planoSaude, boolean gostaDeBrincar, String porte) {
        super(nomePet, nomeTutor, codigoMicrochip, idade, sexo, peso, castracao, planoSaude);
        this.gostaDeBrincar = gostaDeBrincar;
        this.porte = porte;
    }

    public boolean isGostaDeBrincar() {
        return gostaDeBrincar;
    }

    public void setGostaDeBrincar(boolean gostaDeBrincar) {
        this.gostaDeBrincar = gostaDeBrincar;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

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
        } else if (getIdade() > 4 && getIdade() < 12) { // Entre 4 meses e 1 ano
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
    @Override
    public String pesoSaudavel() {
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


}