
package br.ufsc.ine.view.login;

import br.ufsc.ine.dso.controllers.ClienteController;
import br.ufsc.ine.dso.models.Cliente;
import java.util.Optional;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class LoginBean {
    
    private String login;
    private String senha;
    private Cliente clienteLogado;
    
    public LoginBean(){
        
    }
    
    @EJB
    private ClienteController clienteController;
    
    
    public String logar(){
    Optional<Cliente> optionalCliente = clienteController.buscarCliente(login, senha);
        if(optionalCliente.isPresent()){
            this.clienteLogado = optionalCliente.get();
            return "index";
        } 
        return "login";
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

    public Cliente getClienteLogado() {
        return clienteLogado;
    }

    public void setClienteLogado(Cliente clienteLogado) {
        this.clienteLogado = clienteLogado;
    }
   
    
    
}
