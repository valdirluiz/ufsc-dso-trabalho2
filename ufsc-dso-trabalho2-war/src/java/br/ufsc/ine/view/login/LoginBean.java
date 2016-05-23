
package br.ufsc.ine.view.login;

import br.ufsc.ine.dso.controllers.LoginController;
import br.ufsc.ine.dso.models.Cliente;
import javax.ejb.EJB;
import javax.faces.bean.SessionScoped;

@SessionScoped
public class LoginBean {
    
    private Cliente cliente;
    @EJB
    private LoginController loginController;
    
    
    
    
}
