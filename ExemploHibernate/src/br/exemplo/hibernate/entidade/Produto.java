package br.exemplo.hibernate.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * @author Rafael 01/11/2013
 * 
 * Classe para objetos do tipo Produto, onde serão contidos, atributos e métodos para o mesmo.
 */
@Entity
@Table(name="produto", schema="exemplo")
public class Produto {
    
    @Id
    @SequenceGenerator(name="produto_seq", sequenceName="exemplo.produto_id_produto_seq", allocationSize = 1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="produto_seq")
    private Long id;
    
    @Column(name="nome", nullable=false)
    private String nome;
    
    @Column(name="descricao", nullable=false)
    private String descricao;
    
    @Column(name="preco", nullable=false)
    private Double preco;

    //getters e setters
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
    
}
