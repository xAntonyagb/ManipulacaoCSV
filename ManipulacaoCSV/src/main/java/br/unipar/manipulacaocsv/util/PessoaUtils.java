package br.unipar.manipulacaocsv.util;

import java.text.Normalizer;
import br.unipar.manipulacaocsv.entities.PessoaEntity;

/**
 *
 * @author Antony
 */
public class PessoaUtils {
    
    public static PessoaEntity arrumarPessoa(PessoaEntity pessoa) {
        pessoa.setNome(normalizaString(pessoa.getNome()));
        pessoa.setEndereco(normalizaString(pessoa.getEndereco()));
        pessoa.setSexo(normalizaString(pessoa.getSexo()));
        pessoa.setSigno(normalizaString(pessoa.getSigno()));
        pessoa.setMae(normalizaString(pessoa.getMae()));
        pessoa.setPai(normalizaString(pessoa.getPai()));
        pessoa.setCep(normalizaString(pessoa.getCep()));
        pessoa.setNumero(normalizaString(pessoa.getNumero()));
        pessoa.setBairro(normalizaString(pessoa.getBairro()));
        pessoa.setCidade(normalizaString(pessoa.getCidade()));
        pessoa.setEstado(normalizaString(pessoa.getEstado()));
        pessoa.setCor(normalizaString(pessoa.getCor()));
        
        return pessoa;
    }

    private static String normalizaString(String input) {
        if (input == null) {
            return null;
        }
        
        String inputNormalizado = Normalizer.normalize(input, Normalizer.Form.NFD);
        String inputSemAscento = inputNormalizado.replaceAll("\\p{M}", "");
        String retorno = inputSemAscento.replaceAll("[^\\p{Alnum}\\s]", "");
        return retorno;
    }

}
