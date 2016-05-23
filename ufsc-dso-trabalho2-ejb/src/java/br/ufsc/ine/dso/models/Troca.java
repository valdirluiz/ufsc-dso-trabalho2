package br.ufsc.ine.dso.models;

import java.util.Date;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 *
 * @author Valdir Luiz
 */
public class Troca {
    
    private Integer id;
    
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="ID_CLIENTE")
    
    private Cliente cliente;
    private Produto produto;
    private Date dataTroca;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Date getDataTroca() {
        return dataTroca;
    }

    public void setDataTroca(Date dataTroca) {
        this.dataTroca = dataTroca;
    }
    
    
    
}
