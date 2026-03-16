package controller;
import java.util.ArrayList;
import java.util.List;
import model.Usuario;

public class UsuarioController{
    private List<Usuario> usuarios = new ArrayList<>();

    public void cadastrarUsuario(Usuario u) {
        usuarios.add(u);
    }
    public void removerUsuario(Usuario u) {
        usuarios.removeIf(usuario -> usuario.getId().equals(u.getId()));
    }

    public void listarUsuarios() {
        for (Usuario u : usuarios) {
            System.out.println(u.informacoesUsuario());
        }
    }
    public Usuario buscarUsuario(String id){
        for(Usuario u: usuarios){
            if(u.getId().equals(id)){
                return u;
            }
        }
        return null;
    }
}