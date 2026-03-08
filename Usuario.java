public class Usuario {
    private String id;
    private String nome;
    private String cpf;
    private String email;
    private TipoUsuario tipo;

    public boolean podeRealizarInspecao(){
        return tipo == TipoUsuario.FISCAL || tipo == TipoUsuario.ADMIN;
    }

    public boolean podeRealizarManutencao(){
        return tipo == TipoUsuario.TECNICO;
    }

    public String getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public String getEmail() {
        return email;
    }
    public TipoUsuario getTipo() {
        return tipo;
    }

    
}
