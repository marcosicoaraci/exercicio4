package br.com.exercicio4.service;

import br.com.exercicio4.dao.FuncionarioDAO;
import br.com.exercicio4.dto.FuncionarioDepartamentoDTO;
import br.com.exercicio4.entidades.Funcionario;

import java.util.List;

/**
 * Created by marcos on 28/08/15.
 */
public class FuncionarioSrv {

    private FuncionarioDAO funcionarioDAO = new FuncionarioDAO();

    public void saveOrUpdate(Funcionario funcionario){
        if (funcionario.getId() == null) {
            if (salvar(funcionario)) {
                System.out.println("Salvou Funcionario");
            }else{
                System.out.println("Deu erro ao salvar");
            }
        }else{
            if (editar(funcionario)) {
                System.out.println("Editou funcionario");
            }else{
                System.out.println("Deu erro ao editar");
            }
        }
    }

    public boolean salvar(Funcionario funcionario){
        return funcionarioDAO.criar(funcionario);
    }

    public boolean editar(Funcionario funcionario){
        return funcionarioDAO.alterar(funcionario);
    }

    public Funcionario obter(Long id){
        return funcionarioDAO.obter(Funcionario.class, id);
    }

    public List<Funcionario> listarTodos(){
        return funcionarioDAO.obterTodos(Funcionario.class);
    }

    public List<FuncionarioDepartamentoDTO> listarDTO(){
        return funcionarioDAO.listarTodos();
    }

}
