package controller;

import model.Cliente;
import model.Inspecao;
import java.util.*;

public class RelatorioController {
    private List<Inspecao> inspecoes;
    private List<Cliente> clientes;

    // Constructor
    public RelatorioController(List<Inspecao> inspecoes) {
        this.inspecoes = inspecoes;
    }

    // Métodos

    // Filtro por Localizacao
    public void gerarRelatorioPorLocalizacao(String nomeLocalizacao) {
        System.out.println("\n=====RELATÓRIO POR LOCALIZAÇÃO=====");
        int totalEquipamentos = 0;
        Set<String> tecnicos = new HashSet<>();

        for (Inspecao i : inspecoes) {
            if (i.getLocalizacao().getNome().equalsIgnoreCase(nomeLocalizacao)) {
                totalEquipamentos++;
                tecnicos.add(i.getResponsavel().getNome());

                System.out.println("--------------------------------------");
                System.out.println("Equipamento: " + i.getEquipamento().getNome());
                System.out.println("Técnico responsavel: " + i.getResponsavel().getNome());
                System.out.println("Status: " + i.getStatus());
                System.out.println("Data: " + i.getDataInspecao());
            }
        }
    }

    // Filtro por Equipamento
    public void gerarRelatorioPorEquiapamento(String nomeEquipamento) {
        System.out.println("\n=====RELATÓRIO POR EQUIPAMENTO=====");
        System.out.println("Equipamento: " + nomeEquipamento);

        for (Inspecao i : inspecoes) {

            if (i.getEquipamento().getNome().equalsIgnoreCase(nomeEquipamento)) {
                System.out.println("--------------------------------------");
                System.out.println("Tecnico: " + i.getResponsavel().getNome());
                System.out.println("Localização: " + i.getLocalizacao().getNome());
                System.out.println("Status: " + i.getStatus());
                System.out.println("Data: " + i.getDataInspecao());
            }
        }
    }

    // Filtro por Técnico
    public void gerarRelatorioPorTecnico(String nomeTecnico) {
        System.out.println("\n=====RELATÓRIO POR TECNICO=====");
        System.out.println("Técnico: " + nomeTecnico);

        for (Inspecao i : inspecoes) {
            if (i.getResponsavel().getNome().equalsIgnoreCase(nomeTecnico)) {
                System.out.println("--------------------------------------");
                System.out.println("Equipamento: " + i.getEquipamento().getNome());
                System.out.println("Localizacao: " + i.getEquipamento().getLocalizacao().getNome());
                System.out.println("Status: " + i.getStatus());
                System.out.println("Data: " + i.getDataInspecao());
            }
        }
    }

    // Filtro por Periodo
    public void gerarRelatorioPorPeriodo(String dataInicio, String dataFim) {
        System.out.println("\n=====RELATÓRIO POR PERÍODO=====");
        System.out.println("De: " + dataInicio + " até " + dataFim);

        for (Inspecao i : inspecoes) {
            String data = i.getDataInspecao().toString();

            if (data.compareTo(dataInicio) >= 0 && data.compareTo(dataFim) <= 0) {

                System.out.println("--------------------------------------");
                System.out.println("Equipamento: " + i.getEquipamento().getNome());
                System.out.println("Tecnico: " + i.getResponsavel().getNome());
                System.out.println("Localização: " + i.getEquipamento().getLocalizacao().getNome());
                System.out.println("Status: " + i.getStatus());
                System.out.println("Data: " + data);

            }
        }
    }

    public void gerarRelatorioGeral() {
        System.out.println("\n=====RELATÓRIO GERAL DE INSPEÇÕES=====");

        for (Inspecao i : inspecoes) {
            System.out.println("--------------------------------------");
            System.out.println("Equipamento: " + i.getEquipamento().getNome());
            System.out.println("Técnico: " + i.getResponsavel().getNome());
            System.out.println("Localização: " + i.getEquipamento().getLocalizacao().getNome());
            System.out.println("Status: " + i.getStatus());
            System.out.println("Data: " + i.getDataInspecao());
        }

    }

    public void gerarRelatorioPorCliente(String cnpj) {
        Cliente clienteEncontrado = null;

        for (Cliente c : clientes) {
            if (c.getCnpj().equalsIgnoreCase(cnpj)) {
                clienteEncontrado = c;
                break;
            }
        }

        if (clienteEncontrado == null) {
            System.out.println("Cliente não encontrado.");
            return;
        }

        System.out.println("\n=====RELATÓRIO POR CLIENTE=====");
        System.out.println("Cliente: " + clienteEncontrado.getNomeEmpresa());

        for (Inspecao i : inspecoes) {
            if (i.getCliente() != null &&
                    i.getCliente().getCnpj().equalsIgnoreCase(cnpj)) {

                System.out.println("\n--------------------------------------");
                System.out.println("Equipamento: " + i.getEquipamento().getNome());
                System.out.println("Técnico: " + i.getResponsavel().getNome());
                System.out.println("Localização: " + i.getEquipamento().getLocalizacao().getNome());
                System.out.println("Status: " + i.getStatus());
                System.out.println("Data: " + i.getDataInspecao());
            }
        }
    }
}
