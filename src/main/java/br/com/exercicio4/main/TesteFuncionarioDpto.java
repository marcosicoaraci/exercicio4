package br.com.exercicio4.main;


import br.com.exercicio4.dao.FabricaEntityManager;
import br.com.exercicio4.dto.FuncionarioDepartamentoDTO;
import br.com.exercicio4.entidades.Funcionario;
import br.com.exercicio4.service.FuncionarioSrv;
import br.com.exercicio4.util.FuncDptoUtil;

import java.util.List;

/**
 * Created by marcos on 25/08/15.
 */
public class TesteFuncionarioDpto {


    public static void main (String[] args){
        FuncionarioSrv funcionarioSrv = new FuncionarioSrv();

        List<Funcionario> funcionarios = funcionarioSrv.listarTodos();
        for (Funcionario funcionario : funcionarios) {
            System.out.println("Nome: "+funcionario.getNome()+"\nDepartamento: "
                    +funcionario.getDepartamento().getNome()+"\n-------------------------------------");
        }

        List<FuncionarioDepartamentoDTO> funcionariosDTO = funcionarioSrv.listarDTO();
        for (FuncionarioDepartamentoDTO funcionario : funcionariosDTO) {
            System.out.println("Nome: "+funcionario.getNome()+"\nDepartamento: "
                    +funcionario.getNomeDpto()+"\n-------------------------------------");
        }
    }
}
