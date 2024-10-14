
public class Main {

	public static void main(String[] args) {
		Cliente abraao = new Cliente();
		abraao.setNome("Abraão");
		
		Conta cc = new ContaCorrente(abraao);
		Conta poupanca = new ContaPoupanca(abraao);

		cc.saque(150.0);
		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
