package br.unipar.manipulacaocsv.views;

import br.unipar.manipulacaocsv.ManupulacaoCSV;
import br.unipar.manipulacaocsv.entities.PessoaEntity;
import br.unipar.manipulacaocsv.services.PessoaService;
import br.unipar.manipulacaocsv.tablemodels.PessoaTableModel;
import java.awt.FileDialog;
import java.awt.Frame;
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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Antony
 */
public class ManipulacaoCSVJFrame extends javax.swing.JFrame {

    public ManipulacaoCSVJFrame() {
        initComponents();
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
            jTablePessoas.getColumnModel().getColumn(2).setPreferredWidth(40);
            jTablePessoas.getColumnModel().getColumn(3).setPreferredWidth(80);
            jTablePessoas.getColumnModel().getColumn(4).setPreferredWidth(80);
            jTablePessoas.getColumnModel().getColumn(5).setPreferredWidth(80);
            jTablePessoas.getColumnModel().getColumn(6).setPreferredWidth(65);
            jTablePessoas.getColumnModel().getColumn(7).setPreferredWidth(65);
            jTablePessoas.getColumnModel().getColumn(8).setPreferredWidth(80);
            jTablePessoas.getColumnModel().getColumn(9).setPreferredWidth(80);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCaminho, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCarregar, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(jButtonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                
                String[] cabecario = buffer.readLine().split(",");
                String linhas;
                int id = 0;
                
                while ((linhas = buffer.readLine()) != null) {
                    String[] campos = linhas.split(",");
                    PessoaEntity pessoa = new PessoaEntity();
                    
                    pessoa.setId(id++);
                    pessoa.setNome(campos[0]);
                    pessoa.setIdade(Integer.parseInt(campos[1]));
                    pessoa.setCpf(campos[2]);
                    pessoa.setRg(campos[3]);

                    //data
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDate date = LocalDate.parse(campos[4], formatter);
                    pessoa.setData_nasc(Date.from(date.atStartOfDay(ZoneId.systemDefault()).toInstant()));

                    pessoa.setSexo(campos[5]);
                    pessoa.setSigno(campos[6]);
                    pessoa.setMae(campos[7]);
                    pessoa.setPai(campos[8]);
                    pessoa.setEmail(campos[9]);
                    pessoa.setSenha(campos[10]);
                    pessoa.setCep(campos[11]);
                    pessoa.setEndereco(campos[12]);
                    pessoa.setNumero(campos[13]);
                    pessoa.setBairro(campos[14]);
                    pessoa.setCidade(campos[15]);
                    pessoa.setEstado(campos[16]);
                    pessoa.setTelefone_fixo(campos[17]);
                    pessoa.setCelular(campos[18]);
                    pessoa.setAltura(Double.valueOf(campos[19]));
                    pessoa.setPeso(Double.valueOf(campos[20]));
                    pessoa.setTipo_sanguineo(campos[21]);
                    pessoa.setCor(campos[22]);

                    listPessoas.add(pessoa);
                }
            }
        } 
        catch(Exception ex) {
            Logger.getLogger(ManupulacaoCSV.class.getName()).severe(ex.getMessage());
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
    
    private void removeBanco() {
        PessoaService pessoaService = new PessoaService();
        int[] selecoes = jTablePessoas.getSelectedRows();
        
        if(selecoes.length == 0) {
            JOptionPane.showMessageDialog(null, "Selecione um item e tente novamente", "Nenhum item selecionado", JOptionPane.ERROR_MESSAGE);
            return;
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
            removeBanco();
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
    }

}
