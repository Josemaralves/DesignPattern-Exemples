package Facade;

public class Controller {
    private UsuarioFacade usuarioFacade;

    void cadastrarUsuario(){
        UsuarioVO usuarioVO = new UsuarioVO();
        usuarioFacade.cadastrarUsuario(usuarioVO);
    }

}
