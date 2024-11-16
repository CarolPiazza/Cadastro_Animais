import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class CadastroAnimaisUI {
	private static final ArrayList<Animal> animais = new ArrayList<>();

	public static void main(String[] args) {

		JFrame frame = new JFrame("Cadastro de Animais");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(640, 640);

		JPanel telaInicial = criaTelaInicial(frame);

		frame.getContentPane().add(telaInicial);
		frame.setVisible(true);
	}

	private static JPanel criaTelaInicial(JFrame frame) {
		GridLayout layout = new GridLayout(0, 1, 16, 16);

		// Cria um JPanel para abrigar o conteúdo do programa e define a cor de fundo
		JPanel conteudo = new JPanel();
		conteudo.setBackground(Color.decode("#f7b2e2"));
		conteudo.setLayout(layout);

		// Define bordas de 16px para a janela
		Border padding = BorderFactory.createEmptyBorder(16, 16, 16, 16);
		conteudo.setBorder(padding);

		// Cria um título do programa
		JLabel titulo = criaTitulo("Cadastro de Animais");
		conteudo.add(titulo);

		// Cria botões de ação
		JButton novoGato = criaBotao("Cadastrar novo gato");
		novoGato.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.getContentPane().removeAll();
				frame.getContentPane().add(criaTelaCadastroGato(frame));
				frame.revalidate();
				frame.repaint();
			}
		});
		conteudo.add(novoGato);

		JButton novoCachorro = criaBotao("Cadastrar novo cachorro");
		novoCachorro.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.getContentPane().removeAll();
				frame.getContentPane().add(criaTelaCadastroCachorro(frame));
				frame.revalidate();
				frame.repaint();
			}
		});
		conteudo.add(novoCachorro);

		JButton novoHamster = criaBotao("Cadastrar novo hamster");
		novoHamster.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.getContentPane().removeAll();
				frame.getContentPane().add(criaTelaCadastroHamster(frame));
				frame.revalidate();
				frame.repaint();
			}
		});
		conteudo.add(novoHamster);

		JButton listar = criaBotao("Listar todos os animais");
		listar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.getContentPane().removeAll();
				frame.getContentPane().add(criaTelaListaAnimais(frame));
				frame.revalidate();
				frame.repaint();
			}
		});
		conteudo.add(listar);

		return conteudo;
	}

	private static JPanel criaTelaCadastroGato(JFrame frame) {
		GridLayout layout = new GridLayout(0, 1, 16, 16);

		// Cria um JPanel para abrigar o conteúdo do programa e define a cor de fundo
		JPanel conteudo = new JPanel();
		conteudo.setBackground(Color.decode("#f7b2e2"));
		conteudo.setLayout(layout);

		// Cria um título do programa
		JLabel titulo = criaTitulo("Cadastrar Gato");
		conteudo.add(titulo);

		// Define bordas de 16px para a janela
		Border padding = BorderFactory.createEmptyBorder(16, 16, 16, 16);
		conteudo.setBorder(padding);

		JPanel nomePanel = new JPanel();
		nomePanel.setOpaque(false);
		nomePanel.setLayout(new BoxLayout(nomePanel, BoxLayout.X_AXIS));
		JLabel labelNome = new JLabel("Nome do Gato:");
		JTextField inputNome = new JTextField();
		inputNome.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30));
		nomePanel.add(labelNome);
		nomePanel.add(Box.createRigidArea(new Dimension(16, 0)));
		nomePanel.add(inputNome);
		conteudo.add(nomePanel);

		JPanel tutorPanel = new JPanel();
		tutorPanel.setOpaque(false);
		tutorPanel.setLayout(new BoxLayout(tutorPanel, BoxLayout.X_AXIS));
		JLabel labelTutor = new JLabel("Tutor:");
		JTextField inputTutor = new JTextField();
		inputTutor.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30));
		tutorPanel.add(labelTutor);
		tutorPanel.add(Box.createRigidArea(new Dimension(16, 0)));
		tutorPanel.add(inputTutor);
		conteudo.add(tutorPanel);

		JPanel idadePanel = new JPanel();
		idadePanel.setOpaque(false);
		idadePanel.setLayout(new BoxLayout(idadePanel, BoxLayout.X_AXIS));
		JLabel labelIdade = new JLabel("Idade (em meses):");
		JTextField inputIdade = new JTextField();
		inputIdade.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30));
		idadePanel.add(labelIdade);
		idadePanel.add(Box.createRigidArea(new Dimension(16, 0)));
		idadePanel.add(inputIdade);
		conteudo.add(idadePanel);

		JPanel sexoPanel = new JPanel();
		sexoPanel.setOpaque(false);
		sexoPanel.setLayout(new BoxLayout(sexoPanel, BoxLayout.X_AXIS));
		JLabel labelSexo = new JLabel("Sexo (macho/femea):");
		JTextField inputSexo = new JTextField();
		inputSexo.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30));
		sexoPanel.add(labelSexo);
		sexoPanel.add(Box.createRigidArea(new Dimension(16, 0)));
		sexoPanel.add(inputSexo);
		conteudo.add(sexoPanel);

		JPanel pesoPanel = new JPanel();
		pesoPanel.setOpaque(false);
		pesoPanel.setLayout(new BoxLayout(pesoPanel, BoxLayout.X_AXIS));
		JLabel labelPeso = new JLabel("Peso (em quilos):");
		JTextField inputPeso = new JTextField();
		inputPeso.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30));
		pesoPanel.add(labelPeso);
		pesoPanel.add(Box.createRigidArea(new Dimension(16, 0)));
		pesoPanel.add(inputPeso);
		conteudo.add(pesoPanel);

		JPanel chipPanel = new JPanel();
		chipPanel.setOpaque(false);
		chipPanel.setLayout(new BoxLayout(chipPanel, BoxLayout.X_AXIS));
		JLabel labelChip = new JLabel("Microchip (se não houver, deixe o campo em branco):");
		JTextField inputChip = new JTextField();
		inputChip.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30));
		chipPanel.add(labelChip);
		chipPanel.add(Box.createRigidArea(new Dimension(16, 0)));
		chipPanel.add(inputChip);
		conteudo.add(chipPanel);

		JPanel castradoPanel = new JPanel();
		castradoPanel.setOpaque(false);
		castradoPanel.setLayout(new BoxLayout(castradoPanel, BoxLayout.X_AXIS));
		JLabel labelCastrado = new JLabel("Castrado? (sim/nao):");
		JTextField inputCastrado = new JTextField();
		inputCastrado.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30));
		castradoPanel.add(labelCastrado);
		castradoPanel.add(Box.createRigidArea(new Dimension(16, 0)));
		castradoPanel.add(inputCastrado);
		conteudo.add(castradoPanel);

		JPanel planoPanel = new JPanel();
		planoPanel.setOpaque(false);
		planoPanel.setLayout(new BoxLayout(planoPanel, BoxLayout.X_AXIS));
		JLabel labelPlano = new JLabel("Plano de Saúde? (sim/nao):");
		JTextField inputPlano = new JTextField();
		inputPlano.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30));
		planoPanel.add(labelPlano);
		planoPanel.add(Box.createRigidArea(new Dimension(16, 0)));
		planoPanel.add(inputPlano);
		conteudo.add(planoPanel);

		JPanel arranhaPanel = new JPanel();
		arranhaPanel.setOpaque(false);
		arranhaPanel.setLayout(new BoxLayout(arranhaPanel, BoxLayout.X_AXIS));
		JLabel labelArranha = new JLabel("Gosta de arranhar? (sim/nao):");
		JTextField inputArranha = new JTextField();
		inputArranha.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30));
		arranhaPanel.add(labelArranha);
		arranhaPanel.add(Box.createRigidArea(new Dimension(16, 0)));
		arranhaPanel.add(inputArranha);
		conteudo.add(arranhaPanel);

		GridLayout layoutAcoes = new GridLayout(0, 2, 16, 0);
		JPanel acoes = new JPanel();
		acoes.setOpaque(false);
		acoes.setLayout(layoutAcoes);

		JButton cancelar = criaBotao("Cancelar");
		cancelar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.getContentPane().removeAll();
				frame.getContentPane().add(criaTelaInicial(frame));
				frame.revalidate();
				frame.repaint();
			}
		});
		acoes.add(cancelar);

		JButton salvar = criaBotao("Salvar");
		salvar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String nome = inputNome.getText();
				String tutor = inputTutor.getText();
				String idade = inputIdade.getText();
				String sexo = inputSexo.getText();
				String peso = inputPeso.getText();
				String chip = inputChip.getText();
				String castrado = inputCastrado.getText();
				String planoSaude = inputPlano.getText();
				String gostaArranhar = inputArranha.getText();

				if (nome.isBlank()) {
					JOptionPane.showMessageDialog(null, "Nome é obrigatório");
					return;
				}

				if (tutor.isBlank()) {
					JOptionPane.showMessageDialog(null, "Tutor é obrigatório");
					return;
				}

				if (idade.isBlank()) {
					JOptionPane.showMessageDialog(null, "Idade é obrigatório");
					return;
				}

				int idadeNumero;
				try {
					idadeNumero = Integer.parseInt(idade);
				} catch (NumberFormatException error) {
					JOptionPane.showMessageDialog(null, "Valor da idade inválido, use apenas números");
					return;
				}

				if (sexo.isBlank()) {
					JOptionPane.showMessageDialog(null, "Sexo é obrigatório");
					return;
				} else if (!sexo.equalsIgnoreCase("macho") && !sexo.equalsIgnoreCase("femea")) {
					JOptionPane.showMessageDialog(null, "Valor do sexo inválido, use \"macho\" ou \"femea\"");
					return;
				}

				if (peso.isBlank()) {
					JOptionPane.showMessageDialog(null, "Peso é obrigatório");
					return;
				}

				int pesoNumero;
				try {
					pesoNumero = Integer.parseInt(peso);
				} catch (NumberFormatException error) {
					JOptionPane.showMessageDialog(null, "Valor do Peso inválido, use apenas números");
					return;
				}

				if (castrado.isBlank()) {
					JOptionPane.showMessageDialog(null, "Castrado é obrigatório");
					return;
				} else if (!castrado.equalsIgnoreCase("sim") && !castrado.equalsIgnoreCase("nao")) {
					JOptionPane.showMessageDialog(null, "Valor de Castrado inválido, use \"sim\" ou \"nao\"");
					return;
				}

				if (planoSaude.isBlank()) {
					JOptionPane.showMessageDialog(null, "Plano de Saúde é obrigatório");
					return;
				} else if (!planoSaude.equalsIgnoreCase("sim") && !planoSaude.equalsIgnoreCase("nao")) {
					JOptionPane.showMessageDialog(null, "Valor de Plano de Saúde inválido, use \"sim\" ou \"nao\"");
					return;
				}

				if (gostaArranhar.isBlank()) {
					JOptionPane.showMessageDialog(null, "Gosta de Arranhar é obrigatório");
					return;
				} else if (!gostaArranhar.equalsIgnoreCase("sim") && !gostaArranhar.equalsIgnoreCase("nao")) {
					JOptionPane.showMessageDialog(null, "Valor de Gosta de Arranhar inválido, use \"sim\" ou \"nao\"");
					return;
				}

				Gato gato = new Gato(
						nome,
						tutor,
						chip,
						idadeNumero,
						sexo,
						pesoNumero,
						castrado.equalsIgnoreCase("sim"),
						planoSaude.equalsIgnoreCase("sim"),
						gostaArranhar.equalsIgnoreCase("sim")
				);
				animais.add(gato);
				JOptionPane.showMessageDialog(null, "Gato cadastrado com sucesso!");
				frame.getContentPane().removeAll();
				frame.getContentPane().add(criaTelaInicial(frame));
				frame.revalidate();
				frame.repaint();
			}
		});
		acoes.add(salvar);

		conteudo.add(acoes);

		return conteudo;
	}

	private static JPanel criaTelaCadastroCachorro(JFrame frame) {
		GridLayout layout = new GridLayout(0, 1, 16, 16);

		// Cria um JPanel para abrigar o conteúdo do programa e define a cor de fundo
		JPanel conteudo = new JPanel();
		conteudo.setBackground(Color.decode("#f7b2e2"));
		conteudo.setLayout(layout);

		// Cria um título do programa
		JLabel titulo = criaTitulo("Cadastrar Cachorro");
		conteudo.add(titulo);

		// Define bordas de 16px para a janela
		Border padding = BorderFactory.createEmptyBorder(16, 16, 16, 16);
		conteudo.setBorder(padding);

		JPanel nomePanel = new JPanel();
		nomePanel.setOpaque(false);
		nomePanel.setLayout(new BoxLayout(nomePanel, BoxLayout.X_AXIS));
		JLabel labelNome = new JLabel("Nome do Cachorro:");
		JTextField inputNome = new JTextField();
		inputNome.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30));
		nomePanel.add(labelNome);
		nomePanel.add(Box.createRigidArea(new Dimension(16, 0)));
		nomePanel.add(inputNome);
		conteudo.add(nomePanel);

		JPanel tutorPanel = new JPanel();
		tutorPanel.setOpaque(false);
		tutorPanel.setLayout(new BoxLayout(tutorPanel, BoxLayout.X_AXIS));
		JLabel labelTutor = new JLabel("Tutor:");
		JTextField inputTutor = new JTextField();
		inputTutor.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30));
		tutorPanel.add(labelTutor);
		tutorPanel.add(Box.createRigidArea(new Dimension(16, 0)));
		tutorPanel.add(inputTutor);
		conteudo.add(tutorPanel);

		JPanel idadePanel = new JPanel();
		idadePanel.setOpaque(false);
		idadePanel.setLayout(new BoxLayout(idadePanel, BoxLayout.X_AXIS));
		JLabel labelIdade = new JLabel("Idade (em meses):");
		JTextField inputIdade = new JTextField();
		inputIdade.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30));
		idadePanel.add(labelIdade);
		idadePanel.add(Box.createRigidArea(new Dimension(16, 0)));
		idadePanel.add(inputIdade);
		conteudo.add(idadePanel);

		JPanel sexoPanel = new JPanel();
		sexoPanel.setOpaque(false);
		sexoPanel.setLayout(new BoxLayout(sexoPanel, BoxLayout.X_AXIS));
		JLabel labelSexo = new JLabel("Sexo (macho/femea):");
		JTextField inputSexo = new JTextField();
		inputSexo.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30));
		sexoPanel.add(labelSexo);
		sexoPanel.add(Box.createRigidArea(new Dimension(16, 0)));
		sexoPanel.add(inputSexo);
		conteudo.add(sexoPanel);

		JPanel pesoPanel = new JPanel();
		pesoPanel.setOpaque(false);
		pesoPanel.setLayout(new BoxLayout(pesoPanel, BoxLayout.X_AXIS));
		JLabel labelPeso = new JLabel("Peso (em quilos):");
		JTextField inputPeso = new JTextField();
		inputPeso.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30));
		pesoPanel.add(labelPeso);
		pesoPanel.add(Box.createRigidArea(new Dimension(16, 0)));
		pesoPanel.add(inputPeso);
		conteudo.add(pesoPanel);

		JPanel portePanel = new JPanel();
		portePanel.setOpaque(false);
		portePanel.setLayout(new BoxLayout(portePanel, BoxLayout.X_AXIS));
		JLabel labelPorte = new JLabel("Porte (pequeno/medio/grande):");
		JTextField inputPorte = new JTextField();
		inputPeso.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30));
		portePanel.add(labelPorte);
		portePanel.add(Box.createRigidArea(new Dimension(16, 0)));
		portePanel.add(inputPorte);
		conteudo.add(portePanel);

		JPanel chipPanel = new JPanel();
		chipPanel.setOpaque(false);
		chipPanel.setLayout(new BoxLayout(chipPanel, BoxLayout.X_AXIS));
		JLabel labelChip = new JLabel("Microchip (se não houver, deixe o campo em branco):");
		JTextField inputChip = new JTextField();
		inputChip.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30));
		chipPanel.add(labelChip);
		chipPanel.add(Box.createRigidArea(new Dimension(16, 0)));
		chipPanel.add(inputChip);
		conteudo.add(chipPanel);

		JPanel castradoPanel = new JPanel();
		castradoPanel.setOpaque(false);
		castradoPanel.setLayout(new BoxLayout(castradoPanel, BoxLayout.X_AXIS));
		JLabel labelCastrado = new JLabel("Castrado? (sim/nao):");
		JTextField inputCastrado = new JTextField();
		inputCastrado.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30));
		castradoPanel.add(labelCastrado);
		castradoPanel.add(Box.createRigidArea(new Dimension(16, 0)));
		castradoPanel.add(inputCastrado);
		conteudo.add(castradoPanel);

		JPanel planoPanel = new JPanel();
		planoPanel.setOpaque(false);
		planoPanel.setLayout(new BoxLayout(planoPanel, BoxLayout.X_AXIS));
		JLabel labelPlano = new JLabel("Plano de Saúde? (sim/nao):");
		JTextField inputPlano = new JTextField();
		inputPlano.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30));
		planoPanel.add(labelPlano);
		planoPanel.add(Box.createRigidArea(new Dimension(16, 0)));
		planoPanel.add(inputPlano);
		conteudo.add(planoPanel);

		JPanel brincarPanel = new JPanel();
		brincarPanel.setOpaque(false);
		brincarPanel.setLayout(new BoxLayout(brincarPanel, BoxLayout.X_AXIS));
		JLabel labelArranha = new JLabel("Gosta de brincar? (sim/nao):");
		JTextField inputArranha = new JTextField();
		inputArranha.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30));
		brincarPanel.add(labelArranha);
		brincarPanel.add(Box.createRigidArea(new Dimension(16, 0)));
		brincarPanel.add(inputArranha);
		conteudo.add(brincarPanel);

		GridLayout layoutAcoes = new GridLayout(0, 2, 16, 0);
		JPanel acoes = new JPanel();
		acoes.setOpaque(false);
		acoes.setLayout(layoutAcoes);

		JButton cancelar = criaBotao("Cancelar");
		cancelar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.getContentPane().removeAll();
				frame.getContentPane().add(criaTelaInicial(frame));
				frame.revalidate();
				frame.repaint();
			}
		});
		acoes.add(cancelar);

		JButton salvar = criaBotao("Salvar");
		salvar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});
		acoes.add(salvar);

		conteudo.add(acoes);

		return conteudo;
	}

	private static JPanel criaTelaCadastroHamster(JFrame frame) {
		GridLayout layout = new GridLayout(0, 1, 16, 16);

		// Cria um JPanel para abrigar o conteúdo do programa e define a cor de fundo
		JPanel conteudo = new JPanel();
		conteudo.setBackground(Color.decode("#f7b2e2"));
		conteudo.setLayout(layout);

		// Cria um título do programa
		JLabel titulo = criaTitulo("Cadastrar Hamster");
		conteudo.add(titulo);

		// Define bordas de 16px para a janela
		Border padding = BorderFactory.createEmptyBorder(16, 16, 16, 16);
		conteudo.setBorder(padding);

		JPanel nomePanel = new JPanel();
		nomePanel.setOpaque(false);
		nomePanel.setLayout(new BoxLayout(nomePanel, BoxLayout.X_AXIS));
		JLabel labelNome = new JLabel("Nome do Hamster:");
		JTextField inputNome = new JTextField();
		inputNome.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30));
		nomePanel.add(labelNome);
		nomePanel.add(Box.createRigidArea(new Dimension(16, 0)));
		nomePanel.add(inputNome);
		conteudo.add(nomePanel);

		JPanel tutorPanel = new JPanel();
		tutorPanel.setOpaque(false);
		tutorPanel.setLayout(new BoxLayout(tutorPanel, BoxLayout.X_AXIS));
		JLabel labelTutor = new JLabel("Tutor:");
		JTextField inputTutor = new JTextField();
		inputTutor.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30));
		tutorPanel.add(labelTutor);
		tutorPanel.add(Box.createRigidArea(new Dimension(16, 0)));
		tutorPanel.add(inputTutor);
		conteudo.add(tutorPanel);

		JPanel idadePanel = new JPanel();
		idadePanel.setOpaque(false);
		idadePanel.setLayout(new BoxLayout(idadePanel, BoxLayout.X_AXIS));
		JLabel labelIdade = new JLabel("Idade (em meses):");
		JTextField inputIdade = new JTextField();
		inputIdade.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30));
		idadePanel.add(labelIdade);
		idadePanel.add(Box.createRigidArea(new Dimension(16, 0)));
		idadePanel.add(inputIdade);
		conteudo.add(idadePanel);

		JPanel sexoPanel = new JPanel();
		sexoPanel.setOpaque(false);
		sexoPanel.setLayout(new BoxLayout(sexoPanel, BoxLayout.X_AXIS));
		JLabel labelSexo = new JLabel("Sexo (macho/femea):");
		JTextField inputSexo = new JTextField();
		inputSexo.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30));
		sexoPanel.add(labelSexo);
		sexoPanel.add(Box.createRigidArea(new Dimension(16, 0)));
		sexoPanel.add(inputSexo);
		conteudo.add(sexoPanel);

		JPanel pesoPanel = new JPanel();
		pesoPanel.setOpaque(false);
		pesoPanel.setLayout(new BoxLayout(pesoPanel, BoxLayout.X_AXIS));
		JLabel labelPeso = new JLabel("Peso (em quilos):");
		JTextField inputPeso = new JTextField();
		inputPeso.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30));
		pesoPanel.add(labelPeso);
		pesoPanel.add(Box.createRigidArea(new Dimension(16, 0)));
		pesoPanel.add(inputPeso);
		conteudo.add(pesoPanel);

		JPanel chipPanel = new JPanel();
		chipPanel.setOpaque(false);
		chipPanel.setLayout(new BoxLayout(chipPanel, BoxLayout.X_AXIS));
		JLabel labelChip = new JLabel("Microchip (se não houver, deixe o campo em branco):");
		JTextField inputChip = new JTextField();
		inputChip.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30));
		chipPanel.add(labelChip);
		chipPanel.add(Box.createRigidArea(new Dimension(16, 0)));
		chipPanel.add(inputChip);
		conteudo.add(chipPanel);

		JPanel castradoPanel = new JPanel();
		castradoPanel.setOpaque(false);
		castradoPanel.setLayout(new BoxLayout(castradoPanel, BoxLayout.X_AXIS));
		JLabel labelCastrado = new JLabel("Castrado? (sim/nao):");
		JTextField inputCastrado = new JTextField();
		inputCastrado.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30));
		castradoPanel.add(labelCastrado);
		castradoPanel.add(Box.createRigidArea(new Dimension(16, 0)));
		castradoPanel.add(inputCastrado);
		conteudo.add(castradoPanel);

		JPanel planoPanel = new JPanel();
		planoPanel.setOpaque(false);
		planoPanel.setLayout(new BoxLayout(planoPanel, BoxLayout.X_AXIS));
		JLabel labelPlano = new JLabel("Plano de Saúde? (sim/nao):");
		JTextField inputPlano = new JTextField();
		inputPlano.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30));
		planoPanel.add(labelPlano);
		planoPanel.add(Box.createRigidArea(new Dimension(16, 0)));
		planoPanel.add(inputPlano);
		conteudo.add(planoPanel);

		JPanel rodaPanel = new JPanel();
		rodaPanel.setOpaque(false);
		rodaPanel.setLayout(new BoxLayout(rodaPanel, BoxLayout.X_AXIS));
		JLabel labelRoda = new JLabel("Possui roda? (sim/nao):");
		JTextField inputRoda = new JTextField();
		inputRoda.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30));
		rodaPanel.add(labelRoda);
		rodaPanel.add(Box.createRigidArea(new Dimension(16, 0)));
		rodaPanel.add(inputRoda);
		conteudo.add(rodaPanel);

		GridLayout layoutAcoes = new GridLayout(0, 2, 16, 0);
		JPanel acoes = new JPanel();
		acoes.setOpaque(false);
		acoes.setLayout(layoutAcoes);

		JButton cancelar = criaBotao("Cancelar");
		cancelar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.getContentPane().removeAll();
				frame.getContentPane().add(criaTelaInicial(frame));
				frame.revalidate();
				frame.repaint();
			}
		});
		acoes.add(cancelar);

		JButton salvar = criaBotao("Salvar");
		salvar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

			}
		});
		acoes.add(salvar);

		conteudo.add(acoes);

		return conteudo;
	}

	private static JPanel criaTelaListaAnimais(JFrame frame) {
		GridLayout layout = new GridLayout(0, 1, 16, 16);

		// Cria um JPanel para abrigar o conteúdo do programa e define a cor de fundo
		JPanel conteudo = new JPanel();
		conteudo.setBackground(Color.decode("#f7b2e2"));
		conteudo.setLayout(layout);

		// Cria um título do programa
		JLabel titulo = criaTitulo("Animais Cadastrados");
		conteudo.add(titulo);

		// Define bordas de 16px para a janela
		Border padding = BorderFactory.createEmptyBorder(16, 16, 16, 16);
		conteudo.setBorder(padding);

		JButton voltar = criaBotao("Voltar");
		voltar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.getContentPane().removeAll();
				frame.getContentPane().add(criaTelaInicial(frame));
				frame.revalidate();
				frame.repaint();
			}
		});
		conteudo.add(voltar);

		return conteudo;
	}


	private static JLabel criaTitulo(String texto) {
		JLabel titulo = new JLabel(texto);
		titulo.setVerticalAlignment(SwingConstants.TOP);
		titulo.setHorizontalAlignment(SwingConstants.CENTER);

		// Define o tamanho e cor do título
		Font fonteTitulo = titulo.getFont();
		Font novaFonteTitulo = fonteTitulo.deriveFont(24f);
		titulo.setFont(novaFonteTitulo);
		titulo.setForeground(Color.decode("#ffffff"));

		return titulo;
	}

	private static JButton criaBotao(String titulo) {
		JButton botao = new JButton(titulo);
		botao.setAlignmentX(Component.CENTER_ALIGNMENT);
		botao.setBackground(Color.decode("#ffffff"));
		botao.setFocusPainted(false);
		botao.setForeground(Color.decode("#eb86cc"));
		botao.setBorder(BorderFactory.createEmptyBorder());
		return botao;
	}
}