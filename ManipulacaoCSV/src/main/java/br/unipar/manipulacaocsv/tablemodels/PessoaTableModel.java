package br.unipar.manipulacaocsv.tablemodels;

import br.unipar.manipulacaocsv.entities.PessoaEntity;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PessoaTableModel extends DefaultTableModel {

    public PessoaTableModel() {
        this.addColumn("ID");
        this.addColumn("Nome");
        this.addColumn("Idade");
        this.addColumn("CPF");
        this.addColumn("RG");
        this.addColumn("Nascimento");
        this.addColumn("Sexo");
        this.addColumn("Signo");
        this.addColumn("Mãe");
        this.addColumn("Pai");
        this.addColumn("Email");
        this.addColumn("Senha");
        this.addColumn("CEP");
        this.addColumn("Endereço");
        this.addColumn("Número");
        this.addColumn("Bairro");
        this.addColumn("Cidade");
        this.addColumn("Estado");
        this.addColumn("Telefone Fixo");
        this.addColumn("Celular");
        this.addColumn("Altura");
        this.addColumn("Peso");
        this.addColumn("Tipo Sanguíneo");
        this.addColumn("Cor");
    }
    
    public PessoaTableModel(List<PessoaEntity> listPessoa) {
        this();
        for (PessoaEntity pessoa : listPessoa) {
            addPessoa(pessoa);
        }
    }
    
    public void addPessoa(PessoaEntity pessoa) {
        addRow(new Object[] {
            pessoa.getId(),
            pessoa.getNome(),
            pessoa.getIdade(),
            pessoa.getCpf(),
            pessoa.getRg(),
            new SimpleDateFormat("dd/MM/yyyy").format(pessoa.getData_nasc()),
            pessoa.getSexo(),
            pessoa.getSigno(),
            pessoa.getMae(),
            pessoa.getPai(),
            pessoa.getEmail(),
            pessoa.getSenha(),
            pessoa.getCep(),
            pessoa.getEndereco(),
            pessoa.getNumero(),
            pessoa.getBairro(),
            pessoa.getCidade(),
            pessoa.getEstado(),
            pessoa.getTelefone_fixo(),
            pessoa.getCelular(),
            pessoa.getAltura(),
            pessoa.getPeso(),
            pessoa.getTipo_sanguineo(),
            pessoa.getCor()
        });
    }
    
    //Fazer id não ser editavel
    @Override
    public boolean isCellEditable(int row, int column) {
        return column != 0;
    }
    
    public PessoaEntity getSelectedPessoa(JTable table, List<PessoaEntity> pessoas) {
        int selectedRow = table.getSelectedRow();

        if (selectedRow != -1) {
            int id = (int) table.getValueAt(selectedRow, 0);
            for (PessoaEntity pessoa : pessoas) {
                if (pessoa.getId() == id) {
                    return pessoa;
                }
            }
        }

        return null;
    }
    
}
