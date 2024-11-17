import java.util.ArrayList;
import java.util.Scanner;
/**
 * Classe CadastroAnimaisCLI que implementa uma interface de linha de comando (CLI)
 * para gerenciar o cadastro de animais, permitindo operações como adicionar, listar,
 * excluir, e realizar ações específicas para cada animal.
 */
public class CadastroAnimaisCLI {
	// Lista estática para armazenar todos os animais cadastrados.
	private static final ArrayList<Animal> animais = new ArrayList<>();
	/**
	 * Metodo principal que inicia o menu interativo da aplicação.
	 *
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcao;
		do {
			System.out.println("\nEscolha uma opção:");
			System.out.println("1. Cadastrar novo gato");
			System.out.println("2. Cadastrar novo cachorro");
			System.out.println("3. Cadastrar novo hamster");
			System.out.println("4. Listar todos os animais");
			System.out.println("5. Excluir animal");
			System.out.println("6. Castrar animal");
			System.out.println("7. Verificar indicação de vacinas");
			System.out.println("8. Verificar peso");
			System.out.println("0. Sair");
			opcao = sc.nextInt();
			sc.nextLine();  // Consumir a quebra de linha
			// Trata a opção escolhida pelo usuário.
			switch (opcao) {
				case 1:
					cadastrarGato(sc);
					break;
				case 2:
					cadastrarCachorro(sc);
					break;
				case 3:
					cadastrarHamster(sc);
					break;
				case 4:
					listarAnimais();
					break;
				case 5:
					excluirAnimal(sc);
					break;
				case 6:
					castrarAnimal(sc);
					break;
				case 7:
					verificarVacina(sc);
					break;
				case 8:
					verificarPeso(sc);
					break;
				case 0:
					System.out.println("Saindo...");
					break;
				default:
					System.out.println("Opção inválida!");
					break;
			}
		} while (opcao != 0);

		sc.close();
	}
	/**
	 * Cadastra um novo gato solicitando informações do usuário.
	 *
	 * @param sc Scanner para leitura de dados do usuário.
	 */

	private static void cadastrarGato(Scanner sc) {
		System.out.println("\n\n--- Cadastro de Gato ---");
		// Coleta as informações necessárias para cadastrar um gato.
		System.out.println("Nome do tutor:");
		String tutor = sc.nextLine();

		System.out.println("Nome do gato:");
		String nome = sc.nextLine();

		System.out.println("Idade do gato: (em meses)");
		int idade = sc.nextInt();
		sc.nextLine();  // Consumir a quebra de linha

		System.out.println("Sexo do gato: (macho/femea)");
		String sexo = sc.nextLine();

		System.out.println("Peso do gato: (em quilos)");
		double peso = sc.nextDouble();
		sc.nextLine();  // Consumir a quebra de linha

		System.out.println("Digite o numero do microchip: (deixe em branco se nao possuir)");
		String microchip = sc.nextLine();

		System.out.println("O gato é castrado? (sim/nao)");
		String castrado = sc.nextLine();

		System.out.println("O gato possui plano de saude? (sim/nao)");
		String planoSaude = sc.nextLine();

		System.out.println("O gato gosta de arranhar? (sim/nao)");
		String gostaDeArranhar = sc.nextLine();
		// Cria um objeto Gato e adiciona à lista de animais.
		Gato gato = new Gato(
				nome,
				tutor,
				microchip,
				idade,
				sexo,
				peso,
				castrado.equalsIgnoreCase("sim"),
				planoSaude.equalsIgnoreCase("sim"),
				gostaDeArranhar.equalsIgnoreCase("sim")
		);
		animais.add(gato);
		System.out.println("Gato cadastrado com sucesso!");
	}
	/**
	 * Cadastra um novo cachorro solicitando informações do usuário.
	 *
	 * @param sc Scanner para leitura de dados do usuário.
	 */
	private static void cadastrarCachorro(Scanner sc) {
		System.out.println("\n\n--- Cadastro de Cachorro ---");
		// Coleta as informações necessárias para cadastrar um cachorro.
		System.out.println("Nome do tutor:");
		String tutor = sc.nextLine();

		System.out.println("Nome do cachorro:");
		String nome = sc.nextLine();

		System.out.println("Idade do cachorro: (em meses)");
		int idade = sc.nextInt();
		sc.nextLine();  // Consumir a quebra de linha

		System.out.println("Sexo do cachorro: (macho/femea)");
		String sexo = sc.nextLine();

		System.out.println("Peso do cachorro: (em quilos)");
		double peso = sc.nextDouble();
		sc.nextLine();  // Consumir a quebra de linha

		System.out.println("Digite o numero do microchip: (deixe em branco se nao possuir)");
		String microchip = sc.nextLine();

		System.out.println("O cachorro é castrado? (sim/nao)");
		String castrado = sc.nextLine();

		System.out.println("O cachorro possui plano de saude? (sim/nao)");
		String planoSaude = sc.nextLine();

		System.out.println("O cachorro gosta de brincar? (sim/nao)");
		String gostaDeBrincar = sc.nextLine();

		String porte = "";
		boolean porteCorreto = false;
		// Solicita o porte do cachorro até uma entrada válida ser fornecida.
		while (!porteCorreto) {
			System.out.println("Qual o porte do cachorro? (pequeno/medio/grande)");
			porte = sc.nextLine();
			if (porte.equalsIgnoreCase("pequeno") || porte.equalsIgnoreCase("medio") || porte.equalsIgnoreCase("grande")) {
				porteCorreto = true;
			}
		}
		// Cria um objeto Cachorro e adiciona à lista de animais.
		Cachorro cachorro = new Cachorro(
				nome,
				tutor,
				microchip,
				idade,
				sexo,
				peso,
				castrado.equalsIgnoreCase("sim"),
				planoSaude.equalsIgnoreCase("sim"),
				gostaDeBrincar.equalsIgnoreCase("sim"),
				porte
		);
		animais.add(cachorro);
		System.out.println("Cachorro cadastrado com sucesso!");
	}
	/**
	 * Cadastra um novo hamster solicitando informações do usuário.
	 *
	 * @param sc Scanner para leitura de dados do usuário.
	 */
	private static void cadastrarHamster(Scanner sc) {

		System.out.println("\n\n--- Cadastro de Hamster ---");

		System.out.println("Nome do tutor:");
		String tutor = sc.nextLine();

		System.out.println("Nome do hamster:");
		String nome = sc.nextLine();

		System.out.println("Idade do hamster: (em meses)");
		int idade = sc.nextInt();
		sc.nextLine();  // Consumir a quebra de linha

		System.out.println("Sexo do hamster: (macho/femea)");
		String sexo = sc.nextLine();

		System.out.println("Peso do hamster: (em quilos)");
		double peso = sc.nextDouble();
		sc.nextLine();  // Consumir a quebra de linha

		System.out.println("Digite o numero do microchip: (deixe em branco se nao possuir)");
		String microchip = sc.nextLine();

		System.out.println("O hamster é castrado? (sim/nao)");
		String castrado = sc.nextLine();

		System.out.println("O hamster possui plano de saude? (sim/nao)");
		String planoSaude = sc.nextLine();

		System.out.println("O hamster possui roda no habitat? (sim/nao)");
		String possuiRoda = sc.nextLine();
		// Cria um objeto Hamster e adiciona à lista de animais.
		Hamster hamster = new Hamster(
				nome,
				tutor,
				microchip,
				idade,
				sexo,
				peso,
				castrado.equalsIgnoreCase("sim"),
				planoSaude.equalsIgnoreCase("sim"),
				possuiRoda.equalsIgnoreCase("sim")
		);
		animais.add(hamster);
		System.out.println("Hamster cadastrado com sucesso!");
	}
	/**
	 * Lista todos os animais cadastrados.
	 * Exibe uma mensagem caso a lista esteja vazia.
	 */
	private static void listarAnimais() {
		if (animais.isEmpty()) {
			System.out.println("Nenhum animal cadastrado.");
		} else {
			System.out.println("\n\n--- Animais Cadastrados ---\n");
			for (Animal animal : animais) {
				System.out.println(animal);
				System.out.println("------------------------");
			}
			System.out.println("\n");
		}
	}
	/**
	 * Exclui um animal cadastrado com base na seleção do usuário.
	 *
	 * @param sc Scanner para leitura de dados do usuário.
	 */
	private static void excluirAnimal(Scanner sc) {
		int opcao = selecionarAnimal(sc);
		if (opcao == 0) {
			return;
		}

		animais.remove(opcao - 1);
		System.out.println("Animal removido com sucesso!\n");
	}
	/**
	 * Realiza a castração de um animal previamente cadastrado.
	 * O usuário deve selecionar o animal que deseja castrar.
	 *
	 * @param sc Scanner para leitura de dados do usuário.
	 */
	private static void castrarAnimal(Scanner sc) {
		int opcao = selecionarAnimal(sc);
		if (opcao == 0) {
			return;
		}
		Animal animal = animais.get(opcao - 1);
		String resultado = animal.castrar();
		System.out.println(resultado);
	}
	/**
	 * Verifica o calendário vacinal de um animal previamente cadastrado.
	 * O usuário deve selecionar o animal para visualizar a indicação de vacinas.
	 *
	 * @param sc Scanner para leitura de dados do usuário.
	 */
	private static void verificarVacina(Scanner sc) {
		int opcao = selecionarAnimal(sc);
		if (opcao == 0) {
			return;
		}
		Animal animal = animais.get(opcao - 1);
		String resultado = animal.calendarioVacinal();
		System.out.println(resultado);
	}
	/**
	 * Realiza a avaliação de peso de um animal previamente cadastrado.
	 * O usuário deve selecionar o animal que deseja avaliar.
	 *
	 * @param sc Scanner para leitura de dados do usuário.
	 */
	private static void verificarPeso(Scanner sc) {
		int opcao = selecionarAnimal(sc);
		if (opcao == 0) {
			return;
		}
		Animal animal = animais.get(opcao - 1);
		String resultado = animal.avaliacaoPeso();
		System.out.println(resultado);
	}
	/**
	 * Exibe uma lista de animais cadastrados e permite que o usuário selecione um deles.
	 * Caso não haja animais cadastrados, informa ao usuário e retorna 0.
	 *
	 * @param sc Scanner para leitura de dados do usuário.
	 * @return O índice do animal selecionado na lista (1 baseado) ou 0 caso o usuário cancele a operação.
	 */
	private static int selecionarAnimal(Scanner sc) {
		if (animais.isEmpty()) {
			System.out.println("Nenhuma animal cadastrado.");
			return 0;
		}
		System.out.println("\n\n--- Selecione o Animal ---");
		for (int i = 0; i < animais.size(); i++) {
			Animal animal = animais.get(i);
			System.out.printf("%d - %s\n", i + 1, animal.getNomePet());
		}
		System.out.println("0 - Cancelar");

		int opcao = sc.nextInt();
		if (opcao == 0) {
			System.out.println("Cancelando...\n");
			return 0;
		}
		return opcao;
	}
}