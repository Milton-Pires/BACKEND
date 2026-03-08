import java.time.LocalDate;

public abstract class Equipamento{
    private String id;
    private String nome;
    private Localizacao Localizacao;
    private LocalDate dataInstalacao;
    private Status status;
    private boolean ativo;

    public void ativar(){
        this.ativo = true;
    }
    public void desativar(){
        this.ativo = false;
    }

    public boolean precisaManutencao(){
        return status != Status.CONCLUIDA;
    }

    public String exibeInformacao(){
        return this.nome + " - " + this.status;
    }
    

}