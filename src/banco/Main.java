package banco;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cliente emerson = new Cliente();
        emerson.setNome("Junior");
       Conta corrente = new ContaCorrente(emerson);
       Conta poupanca = new ContaPoupanca(emerson);
       corrente.depositar(3000);
       corrente.transferir(3000,poupanca);

        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}