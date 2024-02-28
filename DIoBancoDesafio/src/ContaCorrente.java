public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    public void extrato(){ 
        System.out.println("-=- IMPRIMINDO EXTRATO DA CONTA CORRENTE -=-");
        informacoes();
    }
}
