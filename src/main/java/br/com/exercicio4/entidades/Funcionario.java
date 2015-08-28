package br.com.exercicio4.entidades;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Objects;

/**
 * Created by marcos on 27/08/15.
 */

@Entity
@Table(name = "funcionario")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = "Funcionario.findAll", query = "SELECT f FROM Funcionario f"),
        @NamedQuery(name = "Funcionario.findById", query = "SELECT f FROM Funcionario f WHERE f.id = :id"),
        @NamedQuery(name = "Autor.findByNome", query = "SELECT f FROM Funcionario f WHERE f.nome = :nome")})
public class Funcionario {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long Id;

    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;

    @ManyToOne
    private Departamento departamento;

    public Funcionario(String nome, Departamento departamento) {
        this.nome = nome;
        this.departamento = departamento;
    }

    public Funcionario() {

    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Funcionario)) return false;
        Funcionario that = (Funcionario) o;
        return Objects.equals(getId(), that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "Id=" + Id +
                '}';
    }
}
