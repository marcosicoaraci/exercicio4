package br.com.exercicio4.dto;

/**
 * Created by marcos on 28/08/15.
 */
public class FuncionarioDepartamentoDTO {

    private String nome;
    private String nomeDpto;

    public FuncionarioDepartamentoDTO(String nome, String nomeDpto) {
        this.nome = nome;
        this.nomeDpto = nomeDpto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeDpto() {
        return nomeDpto;
    }

    public void setNomeDpto(String nomeDpto) {
        this.nomeDpto = nomeDpto;
    }
}
