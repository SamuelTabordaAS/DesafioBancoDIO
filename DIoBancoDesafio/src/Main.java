public class Main {
    public static void main(String[] args) {
        
        Cliente samuel = new Cliente(); 
        samuel.setNome("Samuel");

        Cliente maria = new Cliente(); 
        maria.setNome("Maria");

        ContaCorrente cc = new ContaCorrente(samuel); 
        ContaPoupanca poupanca = new ContaPoupanca(samuel); 

        ContaCorrente cc1 = new ContaCorrente(maria); 

        cc.depositar(1000);
        cc.transferir(100, cc1);
        cc.pix(100, cc1);

        cc.extrato();
        cc1.extrato();
    }
}
