package conta;

public class Principal {

	public static void main(String[] args) {
		
		// Criando clientes
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Wellington");

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Ana");

        Cliente cliente3 = new Cliente();
        cliente3.setNome("Carlos");

        // Criando contas para cada cliente
        Conta cc1 = new ContaCorrente(cliente1);
        Conta cc2 = new ContaCorrente(cliente2);
        Conta cc3 = new ContaCorrente(cliente3);

        // Definindo saldos iniciais diferentes
        cc1.depositar(500, "Depósito inicial");
        cc2.depositar(1000, "Depósito inicial");
        cc3.depositar(250, "Depósito inicial");

        // Realizando transferências (Agora passando corretamente quem enviou)
        cc1.transferir(200, cc2); // Wellington transfere para Ana
        cc2.transferir(150, cc3); // Ana transfere para Carlos
        cc3.transferir(50, cc1);  // Carlos transfere para Wellington

        // Exibindo extratos
        cc1.imprimirExtrato();
        cc2.imprimirExtrato();
        cc3.imprimirExtrato();



	}

}
