import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Main {
    private static final ArrayList<Animal> animais = new ArrayList<>();

    public static void main(String[] args) {
        TelaInicial telaInicial = new TelaInicial();
        TelaCadastroCachorro telaCachorro = new TelaCadastroCachorro();
        TelaCadastroGato telaGato = new TelaCadastroGato();
        TelaCadastroHamster telaHamster = new TelaCadastroHamster();
        TelaLista telaListar = new TelaLista();

        JFrame frame = new JFrame("Cadastro de Animais");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(640, 738);
        frame.getContentPane().add(telaInicial.getContent());
        frame.setResizable(false);
        frame.setVisible(true);

		/*
			Tela Gato
		 */

        JButton botaoGato = telaInicial.getBotaoGato();
        botaoGato.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().removeAll();
                frame.getContentPane().add(telaGato.getContent());
                frame.revalidate();
                frame.repaint();
            }
        });

        JButton cancelarGato = telaGato.getCancelarBotao();
        cancelarGato.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().removeAll();
                frame.getContentPane().add(telaInicial.getContent());
                frame.revalidate();
                frame.repaint();
            }
        });

        JButton salvarGato = telaGato.getSalvarBotao();
        salvarGato.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = telaGato.getNomeInput().getText();
                String tutor = telaGato.getTutorInput().getText();
                String idade = telaGato.getIdadeInput().getText();
                String sexo = telaGato.getSexoInput().getText();
                String peso = telaGato.getPesoInput().getText();
                String microchip = telaGato.getMicrochipInput().getText();
                String castrado = telaGato.getCastradoInput().getText();
                String plano = telaGato.getPlanoInput().getText();
                String arranhar = telaGato.getArranharInput().getText();

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

                if (plano.isBlank()) {
                    JOptionPane.showMessageDialog(null, "Plano de Saúde é obrigatório");
                    return;
                } else if (!plano.equalsIgnoreCase("sim") && !plano.equalsIgnoreCase("nao")) {
                    JOptionPane.showMessageDialog(null, "Valor de Plano de Saúde inválido, use \"sim\" ou \"nao\"");
                    return;
                }

                if (arranhar.isBlank()) {
                    JOptionPane.showMessageDialog(null, "Gosta de Arranhar é obrigatório");
                    return;
                } else if (!arranhar.equalsIgnoreCase("sim") && !arranhar.equalsIgnoreCase("nao")) {
                    JOptionPane.showMessageDialog(null, "Valor de Gosta de Arranhar inválido, use \"sim\" ou \"nao\"");
                    return;
                }

                Gato gato = new Gato(
                        nome,
                        tutor,
                        microchip,
                        idadeNumero,
                        sexo,
                        pesoNumero,
                        castrado.equalsIgnoreCase("sim"),
                        plano.equalsIgnoreCase("sim"),
                        arranhar.equalsIgnoreCase("sim")
                );
                animais.add(gato);
                JOptionPane.showMessageDialog(null, "Gato cadastrado com sucesso!");
                frame.getContentPane().removeAll();
                frame.getContentPane().add(telaInicial.getContent());
                frame.revalidate();
                frame.repaint();
            }
        });

		/*
			Tela Cachorro
		 */

        JButton botaoCachorro = telaInicial.getBotaoCachorro();
        botaoCachorro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().removeAll();
                frame.getContentPane().add(telaCachorro.getContent());
                frame.revalidate();
                frame.repaint();
            }
        });

        JButton cancelarCachorro = telaCachorro.getCancelarBotao();
        cancelarCachorro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().removeAll();
                frame.getContentPane().add(telaInicial.getContent());
                frame.revalidate();
                frame.repaint();
            }
        });

        JButton salvarCachorro = telaCachorro.getSalvarBotao();
        salvarCachorro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = telaCachorro.getNomeInput().getText();
                String tutor = telaCachorro.getTutorInput().getText();
                String idade = telaCachorro.getIdadeInput().getText();
                String sexo = telaCachorro.getSexoInput().getText();
                String peso = telaCachorro.getPesoInput().getText();
                String chip = telaCachorro.getMicrochipInput().getText();
                String castrado = telaCachorro.getCastradoInput().getText();
                String planoSaude = telaCachorro.getPlanoInput().getText();
                String gostaBrincar = telaCachorro.getBrincarInput().getText();
                String porte = telaCachorro.getPorteInput().getText();

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

                if (gostaBrincar.isBlank()) {
                    JOptionPane.showMessageDialog(null, "Gosta de Arranhar é obrigatório");
                    return;
                } else if (!gostaBrincar.equalsIgnoreCase("sim") && !gostaBrincar.equalsIgnoreCase("nao")) {
                    JOptionPane.showMessageDialog(null, "Valor de Gosta de Arranhar inválido, use \"sim\" ou \"nao\"");
                    return;
                }

                if (porte.isBlank()) {
                    JOptionPane.showMessageDialog(null, "Porte é obrigatório");
                    return;
                } else if (!porte.equalsIgnoreCase("pequeno") && !porte.equalsIgnoreCase("medio") && !porte.equalsIgnoreCase("grande")) {
                    JOptionPane.showMessageDialog(null, "Valor de Porte inválido, use \"pequeno\", \"medio\" ou \"nao\"");
                    return;
                }

                Cachorro cachorro = new Cachorro(
                        nome,
                        tutor,
                        chip,
                        idadeNumero,
                        sexo,
                        pesoNumero,
                        castrado.equalsIgnoreCase("sim"),
                        planoSaude.equalsIgnoreCase("sim"),
                        gostaBrincar.equalsIgnoreCase("sim"),
                        porte
                );
                animais.add(cachorro);
                JOptionPane.showMessageDialog(null, "Cachorro cadastrado com sucesso!");
                frame.getContentPane().removeAll();
                frame.getContentPane().add(telaInicial.getContent());
                frame.revalidate();
                frame.repaint();
            }
        });

		/*
			Tela Hamster
		 */

        JButton botaoHamster = telaInicial.getBotaoHamster();
        botaoHamster.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().removeAll();
                frame.getContentPane().add(telaHamster.getContent());
                frame.revalidate();
                frame.repaint();
            }
        });

        JButton cancelarHamster = telaHamster.getCancelarBotao();
        cancelarHamster.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().removeAll();
                frame.getContentPane().add(telaInicial.getContent());
                frame.revalidate();
                frame.repaint();
            }
        });

        JButton salvarHamster = telaHamster.getSalvarBotao();
        salvarHamster.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = telaHamster.getNomeInput().getText();
                String tutor = telaHamster.getTutorInput().getText();
                String idade = telaHamster.getIdadeInput().getText();
                String sexo = telaHamster.getSexoInput().getText();
                String peso = telaHamster.getPesoInput().getText();
                String chip = telaHamster.getMicrochipInput().getText();
                String castrado = telaHamster.getCastradoInput().getText();
                String planoSaude = telaHamster.getPlanoInput().getText();
                String possuiRoda = telaHamster.getRodaInput().getText();

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

                if (possuiRoda.isBlank()) {
                    JOptionPane.showMessageDialog(null, "Possui Roda é obrigatório");
                    return;
                } else if (!possuiRoda.equalsIgnoreCase("sim") && !possuiRoda.equalsIgnoreCase("nao")) {
                    JOptionPane.showMessageDialog(null, "Valor de Possui Roda inválido, use \"sim\" ou \"nao\"");
                    return;
                }

                Hamster hamster = new Hamster(
                        nome,
                        tutor,
                        chip,
                        idadeNumero,
                        sexo,
                        pesoNumero,
                        castrado.equalsIgnoreCase("sim"),
                        planoSaude.equalsIgnoreCase("sim"),
                        possuiRoda.equalsIgnoreCase("sim")
                );
                animais.add(hamster);
                JOptionPane.showMessageDialog(null, "Hamster cadastrado com sucesso!");
                frame.getContentPane().removeAll();
                frame.getContentPane().add(telaInicial.getContent());
                frame.revalidate();
                frame.repaint();
            }
        });

		/*
			Tela Lista
		 */
        JButton botaoListar = telaInicial.getBotaoListar();
        botaoListar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object[][] dataGatos = new Object[0][];
                Object[][] dataCachorros = new Object[0][];
                Object[][] dataHamsters = new Object[0][];
                for (Animal animal : animais) {
                    if (animal instanceof Gato) {
                        Object[] rowGato = {animal.nomePet, animal.nomeTutor, animal.idade, animal.sexo, animal.castracao};
                        Object[][] newDataGatos = new Object[dataGatos.length + 1][];
                        System.arraycopy(dataGatos, 0, newDataGatos, 0, dataGatos.length);
                        newDataGatos[dataGatos.length] = rowGato;
                        dataGatos = newDataGatos;
                    } else if (animal instanceof Cachorro) {
                        Object[] rowCachorro = {animal.nomePet, animal.nomeTutor, animal.idade, animal.sexo, animal.castracao};
                        Object[][] newDataCachorros = new Object[dataCachorros.length + 1][];
                        System.arraycopy(dataCachorros, 0, newDataCachorros, 0, dataCachorros.length);
                        newDataCachorros[dataCachorros.length] = rowCachorro;
                        dataCachorros = newDataCachorros;
                    } else if (animal instanceof Hamster) {
                        Object[] rowHamster = {animal.nomePet, animal.nomeTutor, animal.idade, animal.sexo, animal.castracao};
                        Object[][] newDataHamsters = new Object[dataHamsters.length + 1][];
                        System.arraycopy(dataHamsters, 0, newDataHamsters, 0, dataHamsters.length);
                        newDataHamsters[dataHamsters.length] = rowHamster;
                        dataHamsters = newDataHamsters;
                    }
                }

                String[] colunas = {"Nome", "Tutor", "Idade", "Sexo", "Castrado"};

                JTable tabelaGatos = new JTable(dataGatos, colunas);
                JScrollPane scroll = new JScrollPane(tabelaGatos);
                JPanel panel = new JPanel();
                panel.setName("Gatos");
                panel.add(scroll);
                telaListar.getTabs().add(panel);

                JTable tabelaCachorros = new JTable(dataCachorros, colunas);
                JScrollPane scroll2 = new JScrollPane(tabelaCachorros);
                JPanel panel2 = new JPanel();
                panel2.setName("Cachorros");
                panel2.add(scroll2);
                telaListar.getTabs().add(panel2);

                JTable tabelaHamsters = new JTable(dataHamsters, colunas);
                JScrollPane scroll3 = new JScrollPane(tabelaHamsters);
                JPanel panel3 = new JPanel();
                panel3.setName("Hamsters");
                panel3.add(scroll3);
                telaListar.getTabs().add(panel3);

                JButton vacinaButton = telaListar.getVacinaButton();
                vacinaButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        int tab = telaListar.getTabs().getSelectedIndex();
                        if (tab == 0) {
                            int gato = tabelaGatos.getSelectedRow();
                            int count = 0;
                            for (int i = 0; i < animais.size(); i++) {
                                if (animais.get(i) instanceof Gato) {
                                    if (count == gato) {
                                        Animal esseGato = animais.get(i);
                                        String vacina = esseGato.calendarioVacinal();
                                        JOptionPane.showMessageDialog(null, vacina);
                                        break;
                                    }
                                    count++;
                                }
                            }
                        } else if (tab == 1) {
                            int cachorro = tabelaCachorros.getSelectedRow() - 1;
                            int count = 0;
                            for (int i = 0; i < animais.size(); i++) {
                                if (animais.get(i) instanceof Cachorro) {
                                    if (count == cachorro) {
                                        Animal esseCachorro = animais.get(i);
                                        String vacina = esseCachorro.calendarioVacinal();
                                        JOptionPane.showMessageDialog(null, vacina);
                                        break;
                                    }
                                    count++;
                                }
                            }
                        } else {
                            int hamster = tabelaHamsters.getSelectedRow() - 1;
                            int count = 0;
                            for (int i = 0; i < animais.size(); i++) {
                                if (animais.get(i) instanceof Hamster) {
                                    if (count == hamster) {
                                        Animal esseHamster = animais.get(i);
                                        String vacina = esseHamster.calendarioVacinal();
                                        JOptionPane.showMessageDialog(null, vacina);
                                        break;
                                    }
                                    count++;
                                }
                            }
                        }
                    }
                });

                JButton pesoBotao = telaListar.getPesoButton();
                pesoBotao.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        int tab = telaListar.getTabs().getSelectedIndex();
                        if (tab == 0) {
                            int gato = tabelaGatos.getSelectedRow();
                            int count = 0;
                            for (int i = 0; i < animais.size(); i++) {
                                if (animais.get(i) instanceof Gato) {
                                    if (count == gato) {
                                        Animal esseGato = animais.get(i);
                                        String peso = esseGato.avaliacaoPeso();
                                        JOptionPane.showMessageDialog(null, peso);
                                        break;
                                    }
                                    count++;
                                }
                            }
                        } else if (tab == 1) {
                            int cachorro = tabelaCachorros.getSelectedRow();
                            int count = 0;
                            for (int i = 0; i < animais.size(); i++) {
                                if (animais.get(i) instanceof Cachorro) {
                                    if (count == cachorro) {
                                        Animal esseCachorro = animais.get(i);
                                        String peso = esseCachorro.avaliacaoPeso();
                                        JOptionPane.showMessageDialog(null, peso);
                                        break;
                                    }
                                    count++;
                                }
                            }
                        } else {
                            int hamster = tabelaHamsters.getSelectedRow();
                            int count = 0;
                            for (int i = 0; i < animais.size(); i++) {
                                if (animais.get(i) instanceof Hamster) {
                                    if (count == hamster) {
                                        Animal esseHamster = animais.get(i);
                                        String peso = esseHamster.avaliacaoPeso();
                                        JOptionPane.showMessageDialog(null, peso);
                                        break;
                                    }
                                    count++;
                                }
                            }
                        }
                    }
                });

                JButton castracaoBotao = telaListar.getCastrarButton();
                castracaoBotao.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        int tab = telaListar.getTabs().getSelectedIndex();
                        if (tab == 0) {
                            int gato = tabelaGatos.getSelectedRow();
                            int count = 0;
                            for (int i = 0; i < animais.size(); i++) {
                                if (animais.get(i) instanceof Gato) {
                                    if (count == gato) {
                                        Animal esseGato = animais.get(i);
                                        if (esseGato.castracao) {
                                            JOptionPane.showMessageDialog(null, "Esse animal já está castrado!");
                                        } else {
                                            esseGato.castrar();
                                            JOptionPane.showMessageDialog(null, "Animal castrado com sucesso!");
                                        }
                                        break;
                                    }
                                    count++;
                                }
                            }
                        } else if (tab == 1) {
                            int cachorro = tabelaCachorros.getSelectedRow();
                            int count = 0;
                            for (int i = 0; i < animais.size(); i++) {
                                if (animais.get(i) instanceof Cachorro) {
                                    if (count == cachorro) {
                                        Animal esseCachorro = animais.get(i);
                                        if (esseCachorro.castracao) {
                                            JOptionPane.showMessageDialog(null, "Esse animal já está castrado!");
                                        } else {
                                            esseCachorro.castrar();
                                            JOptionPane.showMessageDialog(null, "Animal castrado com sucesso!");
                                        }
                                        break;
                                    }
                                    count++;
                                }
                            }
                        } else {
                            int hamster = tabelaHamsters.getSelectedRow();
                            int count = 0;
                            for (int i = 0; i < animais.size(); i++) {
                                if (animais.get(i) instanceof Hamster) {
                                    if (count == hamster) {
                                        Animal esseHamster = animais.get(i);
                                        if (esseHamster.castracao) {
                                            JOptionPane.showMessageDialog(null, "Esse animal já está castrado!");
                                        } else {
                                            esseHamster.castrar();
                                            JOptionPane.showMessageDialog(null, "Animal castrado com sucesso!");
                                        }
                                        break;
                                    }
                                    count++;
                                }
                            }
                        }
                    }
                });

                frame.getContentPane().removeAll();
                frame.getContentPane().add(telaListar.getContent());
                frame.revalidate();
                frame.repaint();
            }
        });

        JButton voltarListar = telaListar.getVoltarBotao();
        voltarListar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                telaListar.getTabs().removeAll();
                frame.getContentPane().removeAll();
                frame.getContentPane().add(telaInicial.getContent());
                frame.revalidate();
                frame.repaint();
            }
        });
    }
}
