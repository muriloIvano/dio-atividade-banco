public class ContaPoupanca extends Conta {

    public void exibirExtrato() {
        System.out.println("=== Extrato da Conta Poupança ===");
        super.dados();
    }
}
