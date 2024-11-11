import java.util.ArrayList;
import java.util.Scanner;

public class CadastroAnimais {
    private static ArrayList<Animal> animais = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("1. Cadastrar novo gato");
            System.out.println("2. Cadastrar novo cachorro");
            System.out.println("3. Cadastrar novo hamster");
            System.out.println("4. Cadastrar novo pássaro");
            System.out.println("5. Cadastrar nova tartaruga");
            System.out.println("6. Listar todos os animais");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();  // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    cadastrarGato(scanner);
                    break;
                case 2:
                    cadastrarCachorro(scanner);
                    break;
                case 3:
                    cadastrarHamster(scanner);
                    break;
                case 4:
                    cadastrarPassaro(scanner);
                    break;
                case 5:
                    cadastrarTartaruga(scanner);
                    break;
                case 6:
                    listarAnimais();
                    break;
                case 7:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 7);

        scanner.close();
    }

    private static void cadastrarGato(Scanner scanner) {
        System.out.print("Nome do gato: ");
        String nome = scanner.nextLine();

        System.out.print("Idade do gato: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Sexo do gato (M/F): ");
        String sexo = scanner.nextLine();

        System.out.print("O gato gosta de arranhar? (true/false): ");
        boolean gostaDeArranhar = scanner.nextBoolean();
        scanner.nextLine();

        Gato gato = new Gato(nome, idade, sexo, gostaDeArranhar);
        animais.add(gato);
        System.out.println("Gato cadastrado com sucesso!");
    }

    private static void cadastrarCachorro(Scanner scanner) {
        System.out.print("Nome do cachorro: ");
        String nome = scanner.nextLine();

        System.out.print("Idade do cachorro: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Sexo do cachorro (M/F): ");
        String sexo = scanner.nextLine();

        System.out.print("O cachorro gosta de brincar? (true/false): ");
        boolean gostaDeBrincar = scanner.nextBoolean();
        scanner.nextLine();

        Cachorro cachorro = new Cachorro(nome, idade, sexo, gostaDeBrincar);
        animais.add(cachorro);
        System.out.println("Cachorro cadastrado com sucesso!");
    }

    private static void cadastrarHamster(Scanner scanner) {
        System.out.print("Nome do hamster: ");
        String nome = scanner.nextLine();

        System.out.print("Idade do hamster: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Sexo do hamster (M/F): ");
        String sexo = scanner.nextLine();

        System.out.print("O hamster possui roda? (true/false): ");
        boolean possuiRoda = scanner.nextBoolean();
        scanner.nextLine();

        Hamster hamster = new Hamster(nome, idade, sexo, possuiRoda);
        animais.add(hamster);
        System.out.println("Hamster cadastrado com sucesso!");
    }

    private static void cadastrarPassaro(Scanner scanner) {
        System.out.print("Nome do pássaro: ");
        String nome = scanner.nextLine();

        System.out.print("Idade do pássaro: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Sexo do pássaro (M/F): ");
        String sexo = scanner.nextLine();

        System.out.print("O pássaro pode voar? (true/false): ");
        boolean podeVoar = scanner.nextBoolean();
        scanner.nextLine();

        Passaro passaro = new Passaro(nome, idade, sexo, podeVoar);
        animais.add(passaro);
        System.out.println("Pássaro cadastrado com sucesso!");
    }

    private static void cadastrarTartaruga(Scanner scanner) {
        System.out.print("Nome da tartaruga: ");
        String nome = scanner.nextLine();

        System.out.print("Idade da tartaruga: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Sexo da tartaruga (M/F): ");
        String sexo = scanner.nextLine();

        System.out.print("A tartaruga vive na água? (true/false): ");
        boolean viveNaAgua = scanner.nextBoolean();
        scanner.nextLine();

        Tartaruga tartaruga = new Tartaruga(nome, idade, sexo, viveNaAgua);
        animais.add(tartaruga);
        System.out.println("Tartaruga cadastrada com sucesso!");
    }

    private static void listarAnimais() {
        if (animais.isEmpty()) {
            System.out.println("Nenhum animal cadastrado.");
        } else {
            System.out.println("Animais cadastrados:");
            for (Animal animal : animais) {
                System.out.println(animal);
            }
        }
    }
}