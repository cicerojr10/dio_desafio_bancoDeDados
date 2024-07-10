package desafio_dio_banco;

public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente("Venilton");
		venilton.setNome("Venilton");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);
		
		Banco banco = new Banco("Banco Digital");
	        banco.adicionarConta(cc);
	        banco.adicionarConta(poupanca);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		banco.listarContas();
	}

}