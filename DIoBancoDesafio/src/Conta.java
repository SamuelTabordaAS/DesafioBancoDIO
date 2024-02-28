public class Conta {

    
    private static final int AGENCIA_PADRAO = 001 ; 
    private static int SEQUENCIA_DE_CONTAS = 1 ; 
    private int agencia ; 
    private int numero ; 
    private double saldo ; 
    protected Cliente cliente ; 
    private double taxa = 0.05 ; 

    /**
     * @param cliente
     * estrutura principal onde todas a CONTAS que extende CONTA deve conter 
     */
    public Conta(Cliente cliente) { 
        this.agencia = AGENCIA_PADRAO ; 
        this.numero = SEQUENCIA_DE_CONTAS++ ; 
        this.cliente = cliente ; 
    }

    public void sacar(double valor){ 
        saldo -= valor ; 
        comprovanteSaque(valor);
    }
    public void depositar(double valor){ 
        saldo+= valor ; 
        comprovanteDeposito(valor);
    }
    public void transferir(double valor, Conta contaDestino){ 
        this.sacar(valor); 
        contaDestino.depositar(valor); 
        saldo-= taxa ; 
        System.out.println("Transferencia realizada com SUCESSO, TAXA de 5% cobrada");
    }
    public void pix (double valor, Conta contaDestino){ 
        this.sacar(valor);
        contaDestino.depositar(valor);
        System.out.println("PIX feito com SUCESSO (SEM TAXA)");
    }
    public void comprovanteSaque(double valor){ 
        System.out.println("== COMPROVANTE DE SAQUE ==");
        System.out.println("Foi sacado : "+ valor );
        System.out.println("==========================");
    }
    public void comprovanteDeposito(double valor){ 
        System.out.println("== COMPROVANTE DE DEPOSITO ==");
        System.out.println("Foi depositado : "+ valor );
        System.out.println("=============================");
    }

    public int getAgencia(){ 
        return agencia ; 
    }
    public int getNuemro(){ 
        return numero ; 
    }
    public double getSaldo(){ 
        return saldo; 
    }

    protected void informacoes (){ 
        System.out.println(String.format("TITULAR: %s", this.cliente.getNome()));
        System.out.println(String.format("AGENCIA: %d", this.agencia));
        System.out.println(String.format("NUMERO: %d", this.numero));
        System.out.println(String.format("SALDO: %.2f", this.saldo));
    }


}
