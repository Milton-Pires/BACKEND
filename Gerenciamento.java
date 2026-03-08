import java.util.*;

public class Gerenciamento {
    private List<Equipamento> equipamentos = new ArrayList<>();
    private List<Inspecao> inspecoes = new ArrayList<>();
    private List<Manutencao> manutencoes = new ArrayList<>();
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

    public void verificarManutencoes(){
        for (Equipamento e : equipamentos){
            if(e.precisaManutencao()){
                System.out.println(e.getNome() + " - Precisa de manutenção");
            }
        }
    }

    public void listarEquipamentosComProblema(){

        for (Equipamento e : equipamentos) {
            if (!e.estaOperacional()) {
                System.out.println(e.getNome() + " - Está com problema");
            }
        }
    }

    public void verificarExtintoresVencidos(){
        for (Equipamento e : equipamentos) {
            if(e.precisaManutencao()) {
                Extintor ex = (Extintor) e;

                if(ex.estaVencido()) {
                    System.out.println(ex.getNome() + " - Extintor vencido");
                }
            }
        }
    }

    public void cadastrarEquipamento(Equipamento e) {
        equipamentos.add(e);
    }

    public void removerEquipamento(Equipamento e) {
        equipamentos.removeIf(equipamento -> equipamento.getId().equals(e.getId()));
    }

    public void agendarInspecao(Inspecao i) {
        inspecoes.add(i);
    }

    public void gerarRelatorio() {
        System.out.println("Relatório de Equipamentos:");
        for (Equipamento e : equipamentos) {
            System.out.println(e.exibeInformacao());
        }
        System.out.println("\nRelatório de Inspeções:");
        for (Inspecao i : inspecoes) {
            System.out.println(i);
        }
        System.out.println("\nRelatório de Manutenções:");
        for (Manutencao m : manutencoes) {
            System.out.println(m);
        }
    }
    
    public List<Equipamento> getEquipamentos() {
        return equipamentos;
    }
}