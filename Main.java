import java.time.LocalDate;

public class Main {
    
    public static void main(String[] args) {
        // Criando o sistema
        Gerenciamento sistema = new Gerenciamento();

        // =========================
        // CRIANDO USUÁRIOS
        // =========================

        Usuario u1 = new Usuario(
                "U1",
                "Carlos Silva",
                "12345678900",
                "carlos@email.com",
                TipoUsuario.TECNICO
        );

        Usuario u2 = new Usuario(
                "U2",
                "Ana Souza",
                "98765432100",
                "ana@email.com",
                TipoUsuario.ADMIN
        );

        Usuario u3 = new Usuario(
                "U3",
                "Pedro Lima",
                "11122233344",
                "pedro@email.com",
                TipoUsuario.FISCAL
        );

        sistema.cadastrarUsuario(u1);
        sistema.cadastrarUsuario(u2);
        sistema.cadastrarUsuario(u3);

        // =========================
        // LISTAR FUNCIONÁRIOS
        // =========================

        sistema.listarUsuarios();


        // =========================
        // CRIANDO LOCALIZAÇÕES
        // =========================

        Localizacao loc1 = new Localizacao(
                "Bloco A",
                "1",
                "101",
                "Corredor principal"
        );

        Localizacao loc2 = new Localizacao(
                "Bloco B",
                "2",
                "203",
                "Próximo ao elevador"
        );

        Localizacao loc3 = new Localizacao(
                "Bloco C",
                "Térreo",
                "Hall",
                "Entrada principal"
        );


        // =========================
        // CRIANDO EQUIPAMENTOS
        // =========================

        Extintor ext1 = new Extintor(
                "E1",
                "Extintor CO2",
                loc1,
                LocalDate.of(2023, 5, 10),
                LocalDate.of(2027, 5, 10)
        );

        Hidrante hid1 = new Hidrante(
                "H1",
                "Hidrante Principal",
                loc2,
                LocalDate.of(2022, 3, 15)
        );

        Alarme al1 = new Alarme(
                "A1",
                "Alarme Incêndio",
                loc3,
                LocalDate.of(2024, 1, 10)
        );


        // =========================
        // CADASTRANDO EQUIPAMENTOS
        // =========================

        sistema.cadastrarEquipamento(ext1);
        sistema.cadastrarEquipamento(hid1);
        sistema.cadastrarEquipamento(al1);


        // =========================
        // LISTANDO EQUIPAMENTOS
        // =========================

        System.out.println("\n===== EQUIPAMENTOS CADASTRADOS =====");

        for (Equipamento e : sistema.getEquipamentos()) {
            System.out.println(e.exibeInformacao());
            System.out.println("-----------------------------");
        }


        // =========================
        // TESTANDO EQUIPAMENTOS
        // =========================

        System.out.println("\n===== TESTANDO EQUIPAMENTOS =====");

        for (Equipamento e : sistema.getEquipamentos()) {

            System.out.println("Testando: " + e.getNome()); 

            System.out.println();

        }


        // =========================
        // VERIFICANDO MANUTENÇÃO
        // =========================

        System.out.println("\n===== VERIFICANDO MANUTENÇÃO =====");

        for (Equipamento e : sistema.getEquipamentos()) {

            if (e.precisaManutencao()) {

                System.out.println(e.getNome() + " precisa manutenção!");

            } else {

                System.out.println(e.getNome() + " está funcionando corretamente.");

            }

        }

    }
}

