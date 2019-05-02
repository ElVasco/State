package main;

public abstract class State {
	
		protected Account cuenta;
		protected double balance;
		protected double intereses;
		protected double limiteInferior;
		protected double limiteSuperior;
		
		public abstract void depositar(double cantidad);
		public abstract void retirar(double cantidad);
		public abstract void pagarIntereses();

		public Account getCuenta() {
			return cuenta;
		}

		public void setCuenta(Account cuenta) {
			this.cuenta = cuenta;
		}

		public double getBalance() {
			return balance;
		}

		public void setBalance(double balance) {
			this.balance = balance;
		}
		
}
