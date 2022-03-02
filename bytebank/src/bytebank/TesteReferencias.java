package bytebank;

public class TesteReferencias {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		
		primeiraConta.saldo = 300;
		
		System.out.println("o saldo da primeira conta é " + primeiraConta.saldo);

		Conta segundaConta = primeiraConta;
		
		System.out.println(segundaConta);
		
		System.out.println("o saldo da segunda conta é " + segundaConta.saldo);
		
		segundaConta.saldo += 100;
		System.out.println("o saldo da segunda conta é " + segundaConta.saldo);
		
		System.out.println(primeiraConta.saldo);
		
		if (primeiraConta == segundaConta) {
			System.out.println("são a mesmissima conta");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}

}
