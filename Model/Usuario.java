public class Usuario {
    private String id;
    private String nome;
    private String cpf;
    private String email;
    private TipoUsuario tipo;

    public Usuario(String id, String nome, String cpf, String email, TipoUsuario tipo) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.tipo = tipo;
    }

    public String informacoesUsuario(){
        return "Nome: " + getNome() + " - Cargo: " + getTipo();
    }



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
