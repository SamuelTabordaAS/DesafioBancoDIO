import java.util.List;

public class Banco {
    public String nome ; 
    private List<Conta> contas ; 

    
    public String getNome(){ 
        return nome; 
    }

    public void setContas(List<Conta> contas){ 
        this.contas = contas ; 
    }

}
