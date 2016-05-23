package br.ufsc.ine.dso.models;




import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

/**
 *
 * @author Valdir Luiz
 */

public class Cliente {
    
    private Long id;
    private String login;
    private String senha;
    private String nome;
    private String email;
    private String  cidade;
    private String rua;
    private Long quantidadePontos;
    private Date dataCadastro;
    private Date dataUltimoLogin;
    
    
    
    @OneToMany(mappedBy = "cliente")
    private List<Troca> trocas = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public Long getQuantidadePontos() {
        return quantidadePontos;
    }

    public void setQuantidadePontos(Long quantidadePontos) {
        this.quantidadePontos = quantidadePontos;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Date getDataUltimoLogin() {
        return dataUltimoLogin;
    }

    public void setDataUltimoLogin(Date dataUltimoLogin) {
        this.dataUltimoLogin = dataUltimoLogin;
    }

    public List<Troca> getTrocas() {
        return trocas;
    }

    public void setTrocas(List<Troca> trocas) {
        this.trocas = trocas;
    }    
    
}
