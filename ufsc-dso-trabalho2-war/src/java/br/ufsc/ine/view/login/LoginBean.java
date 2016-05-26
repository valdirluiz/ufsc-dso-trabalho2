
package br.ufsc.ine.view.login;

import br.ufsc.ine.dso.controllers.LoginController;
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
    @EJB
    private LoginController loginController;

    public LoginBean() {
    }
    
    public String logar(){
        Optional<Cliente> optionalCliente = getLoginController().buscarCliente(getLogin(), getSenha());
        if(optionalCliente.isPresent()){
            this.setClienteLogado(optionalCliente.get());
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

    public LoginController getLoginController() {
        return loginController;
    }

    public void setLoginController(LoginController loginController) {
        this.loginController = loginController;
    }
    
    
    
}
