import java.util.*;

public class Gerenciamento {
    private List<Inspecao> inspecoes = new ArrayList<>();
    private List<Manutencao> manutencoes = new ArrayList<>();
    private List<Usuario> usuarios = new ArrayList<>();

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
    
    
}