package br.ufsc.ine.dso.models;

/**
 *
 * @author Valdir Luiz
 */
public class Produto {
    
    private Long id;
    private String marca;
    private String nome;
    private String descricao;
    private Integer quantidadeDisponivel;
    private Long custoEmPontos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
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

    public Integer getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    public void setQuantidadeDisponivel(Integer quantidadeDisponivel) {
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    public Long getCustoEmPontos() {
        return custoEmPontos;
    }

    public void setCustoEmPontos(Long custoEmPontos) {
        this.custoEmPontos = custoEmPontos;
    }
    
    
}
