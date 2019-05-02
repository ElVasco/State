package main;

public class Principal {

	public static void main(String[] args) {
		
		Account cuenta = new Account("Alex");
		
		cuenta.depositar(50);
		cuenta.retirar(100);

	}

}
