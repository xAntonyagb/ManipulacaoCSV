package br.unipar.manipulacaocsv.views;

import br.unipar.manipulacaocsv.entities.PessoaEntity;
import br.unipar.manipulacaocsv.services.PessoaService;
import br.unipar.manipulacaocsv.tablemodels.PessoaTableModel;
import br.unipar.manipulacaocsv.util.PessoaUtils;
import java.awt.FileDialog;
import java.awt.Frame;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Antony
 */
public class ExportacaoCSVJFrame extends javax.swing.JFrame {

    public ExportacaoCSVJFrame() {
        initComponents();
        
        //Listener na tabela pra atualizar a label
        jTableBanco.getModel().addTableModelListener(new TableModelListener() {
            @Override
            public void tableChanged(TableModelEvent e) {
                atualizarLabelLinhas();
            }
        });
    }

    private List<PessoaEntity> listPessoas;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableBanco = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jButtonConsultar = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        labelNumLinhas = new java.awt.Label();
        label1 = new java.awt.Label();
        jButtonGerar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTableBanco.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableBanco.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTableBanco);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jButtonConsultar.setText("Consultar Banco");
        jButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 63;
        gridBagConstraints.ipady = 22;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 6, 6, 0);
        jPanel1.add(jButtonConsultar, gridBagConstraints);

        labelNumLinhas.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        labelNumLinhas.setText("0");

        label1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        label1.setText("Numero de linhas:");

        jLayeredPane1.setLayer(labelNumLinhas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(label1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(labelNumLinhas, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNumLinhas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 6, 0);
        jPanel1.add(jLayeredPane1, gridBagConstraints);

        jButtonGerar.setText("Gerar Arquivo");
        jButtonGerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGerarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 77;
        gridBagConstraints.ipady = 22;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 0, 6, 6);
        jPanel1.add(jButtonGerar, gridBagConstraints);

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 691, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarActionPerformed
        limparTabela();
        
        PessoaService pessoaService = new PessoaService();
        listPessoas = pessoaService.findAll();
        
        PessoaTableModel model = new PessoaTableModel(listPessoas);
        jTableBanco.setModel(model);
        atualizarLabelLinhas();
    }//GEN-LAST:event_jButtonConsultarActionPerformed

    private void limparTabela() {
        listPessoas = new ArrayList<>();
        PessoaTableModel model = new PessoaTableModel(listPessoas);
        jTableBanco.setModel(model);
        atualizarLabelLinhas();
    }
    
    private void jButtonGerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGerarActionPerformed
        //Conteudo do arquivo
        List<PessoaEntity> listTabela = new ArrayList<>();

        try {
            listTabela = retornaTabela();
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null, "As alterações feitas impossibilitaram o processo. Por favor arrume ou tente novamente!", "Erro ao converter alterações", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // Validação para verificar se tem conteúdo
        if(listTabela.size() == 0) {
            JOptionPane.showMessageDialog(null, "Nenhum dado foi encontrado para gerar o arquivo!", "Erro ao gerar arquivo", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // Selecionar o caminho aonde será gerado
        FileDialog janelaSelecao = new FileDialog((Frame) null, "Salvar como", FileDialog.SAVE);
        janelaSelecao.setFile("relatório.csv");
        janelaSelecao.setVisible(true);
        
        String diretorio = janelaSelecao.getDirectory();
        String nomeArquivo = janelaSelecao.getFile();
        
        // se nao tem .csv -> adicionar
        if ((diretorio != null && nomeArquivo != null) && 
                !nomeArquivo.toLowerCase().endsWith(".csv")) {
            nomeArquivo += ".csv";
        }
        
        // Validação para ver se selecionou
        if(diretorio == null || nomeArquivo == null) {
            JOptionPane.showMessageDialog(null, "Por favor, tente novamente", "Nenhum diretório foi selecionado", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String caminhoCompleto = diretorio + File.separator + nomeArquivo;

        // Gerar o arquivo
        try(FileWriter fileWriter = new FileWriter(caminhoCompleto)) {
            try(BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
                bufferedWriter.write("id;nome;idade;cpf;rg;data_nasc;sexo;signo;mae;pai;email;senha;cep;endereco;numero;bairro;cidade;estado;telefone_fixo;celular;altura;peso;tipo_sanguineo;cor");
                bufferedWriter.newLine();
                
                for (PessoaEntity pessoa : listTabela) {
                    pessoa = PessoaUtils.arrumarPessoa(pessoa);
                    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                    
                    bufferedWriter.write(
                            pessoa.getId()+ ";" +
                            pessoa.getNome() + ";" +
                            pessoa.getIdade() + ";" +
                            pessoa.getCpf() + ";" +
                            pessoa.getRg() + ";" +
                            dateFormat.format(pessoa.getData_nasc())+ ";" +
                            pessoa.getSexo() + ";" +
                            pessoa.getSigno() + ";" +
                            pessoa.getMae() + ";" +
                            pessoa.getPai() + ";" +
                            pessoa.getEmail() + ";" +
                            pessoa.getSenha() + ";" +
                            pessoa.getCep() + ";" +
                            pessoa.getEndereco() + ";" +
                            pessoa.getNumero() + ";" +
                            pessoa.getBairro() + ";" +
                            pessoa.getCidade() + ";" +
                            pessoa.getEstado() + ";" +
                            pessoa.getTelefone_fixo()+ ";" +
                            pessoa.getCelular() + ";" +
                            pessoa.getAltura() + ";" +
                            pessoa.getPeso() + ";" +
                            pessoa.getTipo_sanguineo()+ ";" +
                            pessoa.getCor()
                    );
                    bufferedWriter.newLine();
                }
            }
        } 
        catch(Exception ex) {
            JOptionPane.showMessageDialog(null, "Um erro aconteceu gerando o arquivo:\n"+ex.getMessage(), "Erro ao gerar o arquivo", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        JOptionPane.showMessageDialog(null, "O arquivo foi gerado com sucesso em:\n"+ caminhoCompleto, "Arquivo gerado com sucesso", JOptionPane.INFORMATION_MESSAGE);
        this.dispose();
    }//GEN-LAST:event_jButtonGerarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        int[] selecoes = jTableBanco.getSelectedRows();
            
        if(selecoes.length == 0) {
            JOptionPane.showMessageDialog(null, "Selecione um item e tente novamente", "Nenhum item selecionado", JOptionPane.ERROR_MESSAGE);
            return;
        }

        for (int i = selecoes.length - 1; i >= 0; i--) {
            int row = selecoes[i];
            ((DefaultTableModel) jTableBanco.getModel()).removeRow(row);
        }
        atualizarLabelLinhas();
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    public List<PessoaEntity> retornaTabela() throws Exception{
        List<PessoaEntity> pessoas = new ArrayList<>();
        
        int rowCount = jTableBanco.getRowCount();
            for (int i = 0; i < rowCount; i++) {
                int id = (int) jTableBanco.getValueAt(i, 0);
                String nome = (String) jTableBanco.getValueAt(i, 1);
                int idade = (int) jTableBanco.getValueAt(i, 2);
                String cpf = (String) jTableBanco.getValueAt(i, 3);
                String rg = (String) jTableBanco.getValueAt(i, 4);

                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate date = LocalDate.parse((String) jTableBanco.getValueAt(i, 5), formatter);
                Date dataNasc = Date.from(date.atStartOfDay(ZoneId.systemDefault()).toInstant());

                String sexo = (String) jTableBanco.getValueAt(i, 6);
                String signo = (String) jTableBanco.getValueAt(i, 7);
                String mae = (String) jTableBanco.getValueAt(i, 8);
                String pai = (String) jTableBanco.getValueAt(i, 9);
                String email = (String) jTableBanco.getValueAt(i, 10);
                String senha = (String) jTableBanco.getValueAt(i, 11);
                String cep = (String) jTableBanco.getValueAt(i, 12);
                String endereco = (String) jTableBanco.getValueAt(i, 13);
                String numero = (String) jTableBanco.getValueAt(i, 14);
                String bairro = (String) jTableBanco.getValueAt(i, 15);
                String cidade = (String) jTableBanco.getValueAt(i, 16);
                String estado = (String) jTableBanco.getValueAt(i, 17);
                String telefoneFixo = (String) jTableBanco.getValueAt(i, 18);
                String celular = (String) jTableBanco.getValueAt(i, 19);
                double altura = (double) jTableBanco.getValueAt(i, 20);
                double peso = (double) jTableBanco.getValueAt(i, 21);
                String tipoSanguineo = (String) jTableBanco.getValueAt(i, 22);
                String cor = (String) jTableBanco.getValueAt(i, 23);

                PessoaEntity pessoa;
                
                    pessoa = new PessoaEntity(id, nome, idade, cpf, rg, dataNasc, sexo, signo, mae, pai, email, senha,
                        cep, endereco, numero, bairro, cidade, estado, telefoneFixo, celular, altura, peso, tipoSanguineo, cor);

                pessoas.add(pessoa);
            }
        return pessoas;
    }
    
    private void atualizarLabelLinhas() {
        int rowCount = jTableBanco.getRowCount();
        labelNumLinhas.setText(String.valueOf(rowCount));
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ExportacaoCSVJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExportacaoCSVJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExportacaoCSVJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExportacaoCSVJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExportacaoCSVJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonGerar;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableBanco;
    private java.awt.Label label1;
    private java.awt.Label labelNumLinhas;
    // End of variables declaration//GEN-END:variables
}
