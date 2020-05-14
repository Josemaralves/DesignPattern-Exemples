package Facade;

public class UsuarioFacade {

    private UsuarioService usuarioService;
    private UsuarioValidador usuarioValidador;

    void cadastrarUsuario(UsuarioVO usuarioVO){
        validarUsuario(usuarioVO);
        usuarioService.save(usuarioVO);
    }

    void validarUsuario(UsuarioVO usuarioVO){
        usuarioValidador.validar(usuarioVO);
    }

    public UsuarioService getUsuarioService() {
        return usuarioService;
    }

    public void setUsuarioService(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    public UsuarioValidador getUsuarioValidador() {
        return usuarioValidador;
    }

    public void setUsuarioValidador(UsuarioValidador usuarioValidador) {
        this.usuarioValidador = usuarioValidador;
    }
}
