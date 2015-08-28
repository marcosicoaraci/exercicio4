package br.com.exercicio4.service;

import br.com.exercicio4.dao.DepartamentoDAO;
import br.com.exercicio4.entidades.Departamento;
import br.com.exercicio4.entidades.Funcionario;

import java.util.List;

/**
 * Created by marcos on 28/08/15.
 */
public class DepartamentoSrv {

    private DepartamentoDAO departamentoDAO = new DepartamentoDAO();

    public void saveOrUpdate(Departamento departamento){
        if (departamento.getId() == null) {
            if (salvar(departamento)) {
                System.out.println("Salvou Departamento");
            }else{
                System.out.println("Deu erro ao salvar");
            }
        }else{
            if (editar(departamento)) {
                System.out.println("Editou departamento");
            }else{
                System.out.println("Deu erro ao editar");
            }
        }
    }

    public boolean salvar(Departamento departamento){
        return departamentoDAO.criar(departamento);
    }

    public boolean editar(Departamento departamento){
        return departamentoDAO.alterar(departamento);
    }

    public Departamento obter(Long id){
        return departamentoDAO.obter(Departamento.class, id);
    }

    public List<Departamento> listarTodos(){
        return departamentoDAO.obterTodos(Departamento.class);
    }

}
