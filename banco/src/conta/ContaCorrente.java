package conta;

public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato conta Corrente ===");
		super.ImprimirInfosComuns();
		
	}

	@Override
	public void depositar(double valor) {
		// TODO Auto-generated method stub
		
	}

}
