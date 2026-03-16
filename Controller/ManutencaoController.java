package controller;
import java.util.ArrayList;
import java.util.List;
import model.Manutencao;

public class ManutencaoController{
    private List<Manutencao> manutencoes = new ArrayList<>();

    public void registrarManutencao(Manutencao manutencao){
        manutencoes.add(manutencao);
    }
    public void excluirManutencao(Manutencao manutencao){
        manutencoes.remove(manutencao);
    }
    public List<Manutencao> listarManutencoes(){
        return manutencoes;
    }
}