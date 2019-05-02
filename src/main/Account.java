package main;

public class Account {

		private State estado;
		private String nombre;
		
		public Account(String nombre) {
			this.nombre = nombre;
			this.estado = new SilverState(0,this);
			
		}
		
		public void depositar (double cantidad) {
			estado.depositar(cantidad);
			System.out.println("depositado: "+cantidad);
			System.out.println("estado de la cuenta: "+this.estado.getClass().getSimpleName());
		}
		
		public void retirar (double cantidad) {
			estado.retirar(cantidad);
			System.out.println("retirado: "+cantidad);
			System.out.println("estado de la cuenta: "+this.estado.getClass().getSimpleName());
		}

		public State getEstado() {
			return estado;
		}

		public void setEstado(State estado) {
			this.estado = estado;
		}

		
}
