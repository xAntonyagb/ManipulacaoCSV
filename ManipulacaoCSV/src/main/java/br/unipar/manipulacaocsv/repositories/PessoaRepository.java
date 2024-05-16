package br.unipar.manipulacaocsv.repositories;

import br.unipar.manipulacaocsv.entities.PessoaEntity;
import java.util.List;

/**
 *
 * @author Antony
 */

public interface PessoaRepository {
    PessoaEntity insert(PessoaEntity pessoa);
    PessoaEntity findById(Integer id); 
    List<PessoaEntity> findAll();
    PessoaEntity update(PessoaEntity pessoa);
    boolean delete(PessoaEntity pessoa);
}

