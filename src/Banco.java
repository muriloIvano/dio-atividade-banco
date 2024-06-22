import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Banco {
    public List<Conta> contas;
    private String nome;


    public List<Conta> getContas() {
        return contas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarConta(Conta conta){
        contas.add(conta);
    }

    public Banco() {
        this.contas = new ArrayList<>();

    }

    public void exibirContas(){
        System.out.println(contas);
    }

    public Conta procurarPorNumero(int numero){
        Conta C = null;
        if(!contas.isEmpty()){
            for(Conta c : contas){
                if(c.getNumero() == numero){
                    C = c;
                }
            }
        }
        return C;
    }

    public void exibirAllExtratos(){
        Conta C = null;
        if(!contas.isEmpty()){
            for(Conta c : contas){
                C = c;
                C.imprimirExtrato();
            }
        }
    }
}