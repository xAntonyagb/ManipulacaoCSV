package br.unipar.manipulacaocsv.repositories;

import br.unipar.manipulacaocsv.entities.PessoaEntity;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class PessoaRepositoryImp implements PessoaRepository {
    private final EntityManager entityManager;

    public PessoaRepositoryImp(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public PessoaEntity findById(Integer id) {
        return entityManager.find(PessoaEntity.class, id);
    }

    @Override
    public List<PessoaEntity> findAll() {
        return entityManager.createQuery("SELECT p FROM PessoaEntity p ORDER BY id", PessoaEntity.class).getResultList();
    }

    @Override
    public PessoaEntity insert(PessoaEntity pessoa) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(pessoa);
        transaction.commit();
        
        System.out.println("Pessoa salva com sucesso!");
        return pessoa;
    }

    @Override
    public PessoaEntity update(PessoaEntity pessoa) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.merge(pessoa);
        transaction.commit();
        
        System.out.println("Pessoa atualizada com sucesso!");
        return pessoa;
    }

    @Override
    public boolean delete(PessoaEntity pessoa) {
        EntityTransaction transaction = entityManager.getTransaction();
        
        try {
            transaction.begin();
            entityManager.remove(entityManager.merge(pessoa));
            transaction.commit();

            System.out.println("Pessoa removida com sucesso!");
            return true;
        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            System.out.println("Erro ao remover a pessoa: " + e.getMessage());
            return false;
        }
    }
}
