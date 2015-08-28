package br.com.exercicio4.dao;

import br.com.exercicio4.dto.FuncionarioDepartamentoDTO;
import br.com.exercicio4.entidades.Funcionario;

import javax.persistence.Query;
import java.util.List;

/**
 * Created by marcos on 28/08/15.
 */
public class FuncionarioDAO extends GenericDAO<Funcionario> {

    public List<FuncionarioDepartamentoDTO> listarTodos(){
        try {
            Query query = getEntityManager().createQuery("select new br.com.exercicio4.dto.FuncionarioDepartamentoDTO" +
                    "(f.nome,f.departamento.nome) FROM Funcionario f");
            List<FuncionarioDepartamentoDTO> resposta = query.getResultList();
            return resposta;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }

    }


}
