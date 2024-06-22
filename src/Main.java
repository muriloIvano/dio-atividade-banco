public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        Cliente murilo = new Cliente("Murilo");
        Cliente severina = new Cliente("Severina");
        Cliente anderson = new Cliente("Anderson");
        Cliente andrei = new Cliente("Andrei");
        Cliente joaquim = new Cliente("Joaquim");

        Conta cc = new ContaCorrente(murilo);
        Conta cp = new ContaPoupanca(severina);
        Conta cc2 = new ContaCorrente(anderson);
        Conta cp2 = new ContaPoupanca(andrei);
        Conta cc3 = new ContaCorrente(joaquim);

        banco.adicionarConta(cc);
        banco.adicionarConta(cp);
        banco.adicionarConta(cc2);
        banco.adicionarConta(cc3);
        banco.adicionarConta(cp2);

        cc.depositar(1300);
        cc2.depositar(1300);
        cc3.depositar(1300);
        cp2.depositar(1300);
        cp.depositar(1300);
        cc.transferir(300, cp);

        banco.exibirAllExtratos();

        banco.exibirContas();
        System.out.println();
        System.out.println(banco.procurarPorNumero(4));
        System.out.println();
        System.out.println(banco.procurarPorNumero(5));



    }
}
