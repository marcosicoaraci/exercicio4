package br.com.exercicio4.util;


import br.com.exercicio4.entidades.Departamento;
import br.com.exercicio4.entidades.Funcionario;
import br.com.exercicio4.service.DepartamentoSrv;
import br.com.exercicio4.service.FuncionarioSrv;

/**
 * Created by marcos on 27/08/15.
 */
public class FuncDptoUtil {

    /**
     * Método responsável por inserir vários Funcionarios e Departamentos
     */
    private FuncionarioSrv funcionarioSrv = new FuncionarioSrv();
    private DepartamentoSrv departamentoSrv = new DepartamentoSrv();

    public void adicionarRegistros(){
        Departamento departamento1 = new Departamento();
        departamento1.setNome("PRESIDENCIA");

        Departamento departamento2 = new Departamento();
        departamento2.setNome("AUMOXARIFADO");

        Departamento departamento3 = new Departamento();
        departamento3.setNome("RECURSOS HUMANOS");


        Funcionario funcionario1 = new Funcionario();
        funcionario1.setNome("João");
        funcionario1.setDepartamento(departamento1);

        Funcionario funcionario2 = new Funcionario();
        funcionario2.setNome("Maria");
        funcionario2.setDepartamento(departamento2);

        Funcionario funcionario3 = new Funcionario();
        funcionario3.setNome("José");
        funcionario3.setDepartamento(departamento2);

        Funcionario funcionario4 = new Funcionario();
        funcionario4.setNome("Stélio");
        funcionario4.setDepartamento(departamento2);

        Funcionario funcionario5 = new Funcionario();
        funcionario5.setNome("Gilson");
        funcionario5.setDepartamento(departamento3);

        Funcionario funcionario6 = new Funcionario();
        funcionario6.setNome("Marcos");
        funcionario6.setDepartamento(departamento3);

        Funcionario funcionario7 = new Funcionario();
        funcionario7.setNome("Alfredo");
        funcionario7.setDepartamento(departamento3);

        Funcionario funcionario8 = new Funcionario();
        funcionario8.setNome("Domingos");
        funcionario8.setDepartamento(departamento3);

        departamentoSrv.salvar(departamento1);
        departamentoSrv.salvar(departamento2);
        departamentoSrv.salvar(departamento3);

        funcionarioSrv.salvar(funcionario1);
        funcionarioSrv.salvar(funcionario2);
        funcionarioSrv.salvar(funcionario3);
        funcionarioSrv.salvar(funcionario4);
        funcionarioSrv.salvar(funcionario5);
        funcionarioSrv.salvar(funcionario6);
        funcionarioSrv.salvar(funcionario7);
        funcionarioSrv.salvar(funcionario8);

    }

}
