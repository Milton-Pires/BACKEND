@package Controller
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
            if(e.precisaManutencao()) {
                Extintor ex = (Extintor) e;

                if(ex.estaVencido()) {
                    System.out.println(ex.getNome() + " - Extintor vencido");
                }
            }
        }
    }

    public void buscarEquipamentos(int id){
        for(Equipamento e: equipamentos){
            if(e.getId == id){
                return e;
            }
            
        }
        return null;
    }
    public void cadastrarEquipamento(Equipamento e) {
        equipamentos.add(e);
    }

    public boolean removerEquipamento(int id){
        Equipamento e = buscarEquipamento(id);

        if(e != null){
            equipamentos.remove(id);
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