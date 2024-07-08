package ar.com.codo24100.web.service;

import ar.com.codo24100.web.dao.UsuarioDAO;
import ar.com.codo24100.web.dao.UsuarioDAOMysqlImpl;
import ar.com.codo24100.web.domain.Usuario;

public class UsuarioService {

    private UsuarioDAO dao;

    public UsuarioService() {
        this.dao = new UsuarioDAOMysqlImpl();
    }

    public Usuario buscarUsuario(String email) {
        return this.dao.findByUsername(email);
    }
}
