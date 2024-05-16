package br.unipar.manipulacaocsv.services;

import br.unipar.manipulacaocsv.entities.PessoaEntity;
import br.unipar.manipulacaocsv.repositories.PessoaRepository;
import br.unipar.manipulacaocsv.repositories.PessoaRepositoryImp;
import br.unipar.manipulacaocsv.util.EntityManagerUtil;
import java.util.List;

public class PessoaService {
    
    private final PessoaRepository pessoaRepository;

    public PessoaService() {
        this.pessoaRepository = new PessoaRepositoryImp(EntityManagerUtil.getManager());
    }
    
    public PessoaEntity insert(PessoaEntity pessoa){
        return pessoaRepository.insert(pessoa);
    }
    
    public PessoaEntity findById(Integer id){
        return pessoaRepository.findById(id);
    }

    public List<PessoaEntity> findAll(){
        return pessoaRepository.findAll();
    }

    public PessoaEntity update(PessoaEntity pessoa){
        return pessoaRepository.update(pessoa);
    }
    
    public boolean delete(PessoaEntity pessoa){
        return pessoaRepository.delete(pessoa);
    }
}
