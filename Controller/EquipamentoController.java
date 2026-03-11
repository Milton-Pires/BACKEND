package controller;
import model.Equipamento;
import model.Extintor;

import java.util.*;

public class EquipamentoController{
    private List<Equipamento> equipamentos = new ArrayList();

    public void listarEquipamentosComProblema(){

        for (Equipamento e : equipamentos) {
            if (!e.estaOperacional()) {
                System.out.println(e.getNome() + " - Está com problema");
            }
        }
    }

    public void verificarExtintoresVencidos(){
        for (Equipamento e : equipamentos) {
            if(e instanceof model.Extintor) {
                Extintor ex = (Extintor) e;

                if(ex.estaVencido()) {
                    System.out.println(ex.getNome() + " - Extintor vencido");
                }
            }
        }
    }

    public Equipamento buscarEquipamentos(String id){
        for(Equipamento e: equipamentos){
            if(e.getId().equals(id)){
                return e;
            }
            
        }
        return null;
    }
    public void cadastrarEquipamento(Equipamento e) {
        equipamentos.add(e);
    }

    public boolean removerEquipamento(String id){
        Equipamento e = buscarEquipamentos(id);

        if(e != null){
            equipamentos.remove(e);
            return true;
        }
        else{
            return false;
        }
    }

    public List<Equipamento> getEquipamentos() {
        return equipamentos;
    }

}