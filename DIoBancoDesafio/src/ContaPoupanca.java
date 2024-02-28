public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public void extrato(){ 
        System.out.println("-=- IMPRIMINDO EXTRATO DA CONTA POUPANCA -=-");
        informacoes();
    }
    
    
    

}
