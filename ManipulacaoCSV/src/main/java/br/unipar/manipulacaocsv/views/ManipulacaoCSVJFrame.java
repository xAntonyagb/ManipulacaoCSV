package br.unipar.manipulacaocsv.views;

import br.unipar.manipulacaocsv.ManipulacaoCSV;
import br.unipar.manipulacaocsv.entities.PessoaEntity;
import br.unipar.manipulacaocsv.services.PessoaService;
import br.unipar.manipulacaocsv.tablemodels.PessoaTableModel;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Antony
 */
public class ManipulacaoCSVJFrame extends javax.swing.JFrame {

    public ManipulacaoCSVJFrame() {
        initComponents();
        
        //Add menu
        JMenuBar menuBar = new JMenuBar();
        JMenu ferramentasMenu = new JMenu("Ferramentas");
        JMenuItem exportarBancoItem = new JMenuItem("Exportar Banco");
        ferramentasMenu.add(exportarBancoItem);
        menuBar.add(ferramentasMenu);
        
        setJMenuBar(menuBar);
        
        //Listener do menuItem
         exportarBancoItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ExportacaoCSVJFrame exportacaoCSVJFrame = new ExportacaoCSVJFrame();
                exportacaoCSVJFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                
                // Hide this frame
                ManipulacaoCSVJFrame.this.setVisible(false);
                
                // When the new frame is closed, show this frame
                exportacaoCSVJFrame.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                        limparTabela();
                        ManipulacaoCSVJFrame.this.setVisible(true);
                    }
                });
                
                exportacaoCSVJFrame.setVisible(true);
                exportacaoCSVJFrame.requestFocus();
            }
        });
                
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jButtonConsultar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jTextFieldCaminho = new javax.swing.JTextField();
        TituloLabel = new java.awt.Label();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablePessoas = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        jButtonInserir = new javax.swing.JButton();
        jButtonCarregar = new javax.swing.JButton();
        jButtonAtualizar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        label1 = new java.awt.Label();
        labelEditando = new java.awt.Label();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonConsultar.setText("Consultar");
        jButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarActionPerformed(evt);
            }
        });

        jTextFieldCaminho.setEditable(false);
        jTextFieldCaminho.setText("Clique para selecionar um arquivo");
        jTextFieldCaminho.setEnabled(false);
        jTextFieldCaminho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldCaminhoMouseClicked(evt);
            }
        });

        TituloLabel.setText("Informe o caminho");

        jTablePessoas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Idade", "CPF", "RG", "Nascimento", "Sexo", "Signo", "Mãe", "Pai", "Email", "Senha", "CEP", "Endereço", "Número", "Bairro", "Cidade", "Estado", "Telefone", "Celular", "Altura", "Peso", "Tipo Sanguíneo", "Cor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTablePessoas.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTablePessoas);
        if (jTablePessoas.getColumnModel().getColumnCount() > 0) {
            jTablePessoas.getColumnModel().getColumn(0).setResizable(false);
            jTablePessoas.getColumnModel().getColumn(0).setPreferredWidth(40);
            jTablePessoas.getColumnModel().getColumn(0).setHeaderValue("ID");
            jTablePessoas.getColumnModel().getColumn(1).setHeaderValue("Nome");
            jTablePessoas.getColumnModel().getColumn(2).setPreferredWidth(40);
            jTablePessoas.getColumnModel().getColumn(2).setHeaderValue("Idade");
            jTablePessoas.getColumnModel().getColumn(3).setPreferredWidth(80);
            jTablePessoas.getColumnModel().getColumn(3).setHeaderValue("CPF");
            jTablePessoas.getColumnModel().getColumn(4).setPreferredWidth(80);
            jTablePessoas.getColumnModel().getColumn(4).setHeaderValue("RG");
            jTablePessoas.getColumnModel().getColumn(5).setPreferredWidth(80);
            jTablePessoas.getColumnModel().getColumn(5).setHeaderValue("Nascimento");
            jTablePessoas.getColumnModel().getColumn(6).setPreferredWidth(65);
            jTablePessoas.getColumnModel().getColumn(6).setHeaderValue("Sexo");
            jTablePessoas.getColumnModel().getColumn(7).setPreferredWidth(65);
            jTablePessoas.getColumnModel().getColumn(7).setHeaderValue("Signo");
            jTablePessoas.getColumnModel().getColumn(8).setPreferredWidth(80);
            jTablePessoas.getColumnModel().getColumn(8).setHeaderValue("Mãe");
            jTablePessoas.getColumnModel().getColumn(9).setPreferredWidth(80);
            jTablePessoas.getColumnModel().getColumn(9).setHeaderValue("Pai");
            jTablePessoas.getColumnModel().getColumn(10).setHeaderValue("Email");
            jTablePessoas.getColumnModel().getColumn(11).setHeaderValue("Senha");
            jTablePessoas.getColumnModel().getColumn(12).setHeaderValue("CEP");
            jTablePessoas.getColumnModel().getColumn(13).setHeaderValue("Endereço");
            jTablePessoas.getColumnModel().getColumn(14).setHeaderValue("Número");
            jTablePessoas.getColumnModel().getColumn(15).setHeaderValue("Bairro");
            jTablePessoas.getColumnModel().getColumn(16).setHeaderValue("Cidade");
            jTablePessoas.getColumnModel().getColumn(17).setHeaderValue("Estado");
            jTablePessoas.getColumnModel().getColumn(18).setHeaderValue("Telefone");
            jTablePessoas.getColumnModel().getColumn(19).setHeaderValue("Celular");
            jTablePessoas.getColumnModel().getColumn(20).setHeaderValue("Altura");
            jTablePessoas.getColumnModel().getColumn(21).setHeaderValue("Peso");
            jTablePessoas.getColumnModel().getColumn(22).setHeaderValue("Tipo Sanguíneo");
            jTablePessoas.getColumnModel().getColumn(23).setHeaderValue("Cor");
        }

        jButtonInserir.setText("Inserir no banco");
        jButtonInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInserirActionPerformed(evt);
            }
        });

        jButtonCarregar.setText("Carregar banco");
        jButtonCarregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCarregarActionPerformed(evt);
            }
        });

        jButtonAtualizar.setText("Atualizar banco");
        jButtonAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarActionPerformed(evt);
            }
        });

        jButtonLimpar.setText("Limpar");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        label1.setText("Atualmente editando:");

        labelEditando.setText("Arquivos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 940, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldCaminho, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonCarregar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TituloLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(labelEditando, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TituloLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEditando, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldCaminho, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonCarregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 712, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonInserir, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(jButtonAtualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private List<PessoaEntity> listPessoas;
    private File arquivo;
    
    private char tipoAcao = 'A';
    
    private void jButtonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarActionPerformed
        if(arquivo == null) {
            JOptionPane.showMessageDialog(null, "Nenhum arquivo foi selecionado", "Erro ao converter", JOptionPane.ERROR_MESSAGE);
            return;
        }
        alteraAcao('A'); // arquivo
        listPessoas = carregaArquivo(arquivo);
        
        PessoaTableModel model = new PessoaTableModel(listPessoas);
        jTablePessoas.setModel(model);
    }//GEN-LAST:event_jButtonConsultarActionPerformed

    private void jButtonInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInserirActionPerformed
        if(arquivo == null) {
            JOptionPane.showMessageDialog(null, "Nenhum arquivo foi selecionado", "Erro ao converter", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(listPessoas.size() == 0) {
            JOptionPane.showMessageDialog(null, "Nenhum registro carregado", "Não foi possivel executar a ação", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        
        try{
            PessoaService pessoaService = new PessoaService();
            List<PessoaEntity> listTabela = retornaTabela(true);

            for(PessoaEntity pessoa : listTabela) {
                pessoaService.insert(pessoa);
            }

            JOptionPane.showMessageDialog(null, "Todas os registros foram inseridos no banco de dados!", "Processo concluído", JOptionPane.INFORMATION_MESSAGE);
            limparTabela();
        }
        catch(Exception ex) {
            JOptionPane.showMessageDialog(null, "As alterações feitas impossibilitaram a converção!\n" + ex.getMessage(), "Erro ao converter", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonInserirActionPerformed

    private void jTextFieldCaminhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldCaminhoMouseClicked
        //Criar seletor para apenas .csv
        FileDialog janelaSelecao = new FileDialog((Frame) null, "Selecione um arquivo .CSV", FileDialog.LOAD);
        janelaSelecao.setFile("*.csv");
        janelaSelecao.setVisible(true);

        //se selecionou
        if (janelaSelecao.getFile() != null) {
            arquivo = new File(janelaSelecao.getDirectory(), janelaSelecao.getFile());
            jTextFieldCaminho.setText(arquivo.getAbsolutePath());
        } 
        else {
            JOptionPane.showMessageDialog(null, "Por favor tente novamente", "Nenhum arquivo foi selecionado", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jTextFieldCaminhoMouseClicked

    private void jButtonCarregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCarregarActionPerformed
        alteraAcao('B'); // banco
        limparTabela();
        
        PessoaService pessoaService = new PessoaService();
        listPessoas = pessoaService.findAll();
        
        PessoaTableModel model = new PessoaTableModel(listPessoas);
        jTablePessoas.setModel(model);
    }//GEN-LAST:event_jButtonCarregarActionPerformed

    private void jButtonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarActionPerformed
        try {
            PessoaService pessoaService = new PessoaService();
            List<PessoaEntity> listTabela = retornaTabela(false);

            for(PessoaEntity pessoa : retornaAlteracoes(listTabela)) {
                pessoaService.update(pessoa);
            }
            
            JOptionPane.showMessageDialog(null, "Todas as alterações foram feitas no banco de dados!", "Processo concluído", JOptionPane.INFORMATION_MESSAGE);
            limparTabela();
            alteraAcao('A'); //arquivo
        }
        catch(Exception ex) {
            JOptionPane.showMessageDialog(null, "As alterações feitas impossibilitaram a converção!\n" + ex.getMessage(), "Erro ao converter", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonAtualizarActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        limparTabela();
        alteraAcao('A'); //arquivo
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        excluirRow();
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label TituloLabel;
    private javax.swing.JButton jButtonAtualizar;
    private javax.swing.JButton jButtonCarregar;
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonInserir;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTablePessoas;
    private javax.swing.JTextField jTextFieldCaminho;
    private java.awt.Label label1;
    private java.awt.Label labelEditando;
    // End of variables declaration//GEN-END:variables

    public static List<PessoaEntity> carregaArquivo(File arquivo) {
        List<PessoaEntity> listPessoas = new ArrayList<>();
        
        try(FileReader leitor = new FileReader(arquivo)) {
            try(BufferedReader buffer = new BufferedReader(leitor)) {
                
                String[] cabecalho = buffer.readLine().split(";");
                String linhas;
                int id = 0;
                boolean temId = cabecalho[0].equalsIgnoreCase("id");

                
                while ((linhas = buffer.readLine()) != null) {
                    int ajuste = temId ? 1 : 0;  // Ajusta o índice se tiver id
                    
                    String[] campos = linhas.split(";");
                    PessoaEntity pessoa = new PessoaEntity();
                    
                    pessoa.setId(temId ? Integer.parseInt(campos[0]) : id++);
                    pessoa.setNome(campos[0 + ajuste]);
                    pessoa.setIdade(Integer.parseInt(campos[1 + ajuste]));
                    pessoa.setCpf(campos[2 + ajuste]);
                    pessoa.setRg(campos[3 + ajuste]);

                    // Processar a data
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDate date = LocalDate.parse(campos[4 + ajuste], formatter);
                    pessoa.setData_nasc(Date.from(date.atStartOfDay(ZoneId.systemDefault()).toInstant()));

                    pessoa.setSexo(campos[5 + ajuste]);
                    pessoa.setSigno(campos[6 + ajuste]);
                    pessoa.setMae(campos[7 + ajuste]);
                    pessoa.setPai(campos[8 + ajuste]);
                    pessoa.setEmail(campos[9 + ajuste]);
                    pessoa.setSenha(campos[10 + ajuste]);
                    pessoa.setCep(campos[11 + ajuste]);
                    pessoa.setEndereco(campos[12 + ajuste]);
                    pessoa.setNumero(campos[13 + ajuste]);
                    pessoa.setBairro(campos[14 + ajuste]);
                    pessoa.setCidade(campos[15 + ajuste]);
                    pessoa.setEstado(campos[16 + ajuste]);
                    pessoa.setTelefone_fixo(campos[17 + ajuste]);
                    pessoa.setCelular(campos[18 + ajuste]);
                    pessoa.setAltura(Double.valueOf(campos[19 + ajuste]));
                    pessoa.setPeso(Double.valueOf(campos[20 + ajuste]));
                    pessoa.setTipo_sanguineo(campos[21 + ajuste]);
                    pessoa.setCor(campos[22 + ajuste]);

                    listPessoas.add(pessoa);
                }
            }
        } 
        catch(Exception ex) {
            Logger.getLogger(ManipulacaoCSV.class.getName()).severe(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Um erro inesperado aconteceu:\n" + ex.getMessage(), "Erro ao transformar arquivo", JOptionPane.ERROR_MESSAGE);
            
        }
        
        return listPessoas;
    }
    
    public List<PessoaEntity> retornaTabela(boolean insert) throws Exception{
        List<PessoaEntity> pessoas = new ArrayList<>();
        
        int rowCount = jTablePessoas.getRowCount();
            for (int i = 0; i < rowCount; i++) {
                int id = (!insert) ? (int) jTablePessoas.getValueAt(i, 0) : 0;
                String nome = (String) jTablePessoas.getValueAt(i, 1);
                int idade = (int) jTablePessoas.getValueAt(i, 2);
                String cpf = (String) jTablePessoas.getValueAt(i, 3);
                String rg = (String) jTablePessoas.getValueAt(i, 4);

                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate date = LocalDate.parse((String) jTablePessoas.getValueAt(i, 5), formatter);
                Date dataNasc = Date.from(date.atStartOfDay(ZoneId.systemDefault()).toInstant());

                String sexo = (String) jTablePessoas.getValueAt(i, 6);
                String signo = (String) jTablePessoas.getValueAt(i, 7);
                String mae = (String) jTablePessoas.getValueAt(i, 8);
                String pai = (String) jTablePessoas.getValueAt(i, 9);
                String email = (String) jTablePessoas.getValueAt(i, 10);
                String senha = (String) jTablePessoas.getValueAt(i, 11);
                String cep = (String) jTablePessoas.getValueAt(i, 12);
                String endereco = (String) jTablePessoas.getValueAt(i, 13);
                String numero = (String) jTablePessoas.getValueAt(i, 14);
                String bairro = (String) jTablePessoas.getValueAt(i, 15);
                String cidade = (String) jTablePessoas.getValueAt(i, 16);
                String estado = (String) jTablePessoas.getValueAt(i, 17);
                String telefoneFixo = (String) jTablePessoas.getValueAt(i, 18);
                String celular = (String) jTablePessoas.getValueAt(i, 19);
                double altura = (double) jTablePessoas.getValueAt(i, 20);
                double peso = (double) jTablePessoas.getValueAt(i, 21);
                String tipoSanguineo = (String) jTablePessoas.getValueAt(i, 22);
                String cor = (String) jTablePessoas.getValueAt(i, 23);

                PessoaEntity pessoa;
                
                if(insert) {
                    pessoa = new PessoaEntity(nome, idade, cpf, rg, dataNasc, sexo, signo, mae, pai, email, senha,
                        cep, endereco, numero, bairro, cidade, estado, telefoneFixo, celular, altura, peso, tipoSanguineo, cor);
                }
                else {
                    pessoa = new PessoaEntity(id, nome, idade, cpf, rg, dataNasc, sexo, signo, mae, pai, email, senha,
                        cep, endereco, numero, bairro, cidade, estado, telefoneFixo, celular, altura, peso, tipoSanguineo, cor);
                }
                

                pessoas.add(pessoa);
            }
        return pessoas;
    }
    
    private void alteraAcao(char acao) {
        if(acao == 'A') {
            labelEditando.setText("Arquivo");
            tipoAcao = 'A';
            
            jButtonAtualizar.setEnabled(false);
            jButtonInserir.setEnabled(true);
        }
        else if(acao == 'B') {
            labelEditando.setText("Banco");
            tipoAcao = 'B';
            
            jButtonAtualizar.setEnabled(true);
            jButtonInserir.setEnabled(false);
        }
    }
    
    private void limparTabela() {
        listPessoas = new ArrayList<>();
        PessoaTableModel model = new PessoaTableModel(listPessoas);
        jTablePessoas.setModel(model);
    }
    
    private List<PessoaEntity> retornaAlteracoes(List<PessoaEntity> listAlterada) {
        List<PessoaEntity> alteracoes = new ArrayList<>();

        // Caso alguma deleção tenha sido feita
        if (listPessoas.size() != listAlterada.size()) {
            listPessoas = new PessoaService().findAll();
        }

        // Percorre listas e compara
        for (int i = 0; i < listPessoas.size(); i++) {
            PessoaEntity original = listPessoas.get(i);
            PessoaEntity alterada = listAlterada.get(i);

            if (!original.equals(alterada)) {
                alteracoes.add(alterada);
            }
        }

        return alteracoes;
    }
    
    private void removeBanco() throws IllegalArgumentException{
        PessoaService pessoaService = new PessoaService();
        int[] selecoes = jTablePessoas.getSelectedRows();
        
        if(selecoes.length == 0) {
            throw new IllegalArgumentException("Nenhum item informado");
        }

        // Obtém os IDs das pessoas selecionadas e adiciona à lista
        List<Integer> idsARemover = new ArrayList<>();
        
        for (int row : selecoes) {
            int id = (int) jTablePessoas.getValueAt(row, 0);
            idsARemover.add(id);
        }

        // Remover
        for (Integer id : idsARemover) {
            // Busca a pessoa na lista pelo ID
            for (Iterator<PessoaEntity> iterator = listPessoas.iterator(); iterator.hasNext();) {
                PessoaEntity pessoa = iterator.next();
                
                if (pessoa.getId() == id) { // se igual
                    pessoaService.delete(pessoa); // Remove do banco
                    iterator.remove(); // Remove da tabela
                    break;
                }
            }
        }
        
        PessoaTableModel model = new PessoaTableModel(listPessoas);
        jTablePessoas.setModel(model);
    }

    private void excluirRow() {
        if(tipoAcao == 'B') {
            try{
                removeBanco();
            } catch(IllegalArgumentException ex) {
                JOptionPane.showMessageDialog(null, "Selecione um item e tente novamente", "Nenhum item selecionado", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        else if(tipoAcao == 'A') {
            int[] selecoes = jTablePessoas.getSelectedRows();
            
            if(selecoes.length == 0) {
                JOptionPane.showMessageDialog(null, "Selecione um item e tente novamente", "Nenhum item selecionado", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            for (int i = selecoes.length - 1; i >= 0; i--) {
                int row = selecoes[i];
                ((DefaultTableModel) jTablePessoas.getModel()).removeRow(row);
            }
        }
        
        JOptionPane.showMessageDialog(null, "Item(s) removido(s) com sucesso!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
    }

}
