package ar.com.codo24100.web.dao;

import ar.com.codo24100.web.domain.Usuario;

public interface UsuarioDAO {

    public Usuario findByUsername(String username);
}
