@package Controller
public class InspecaoController{

    private List<Inspecao> inspecoes = new ArrayList();
    
    public void agendarInspecao(Inspecao i) {
        inspecoes.add(i);
    }

    public void excluirInspecao(Inspecao i){
        inspecoes.remove(i);
    }

    public List<Inspecao> listaInspecao(){
        return inspecoes; 
    }
}