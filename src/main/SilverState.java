package main;

public class SilverState extends State {
	
	public SilverState(State estadoAnterior) {
		this(estadoAnterior.balance,estadoAnterior.cuenta);
	}
	
	public SilverState(double balance, Account cuenta) {
		intereses = 0;
		limiteInferior = 0;
		limiteSuperior = 1000;
		this.setCuenta(cuenta);
	}

	@Override
	public void depositar(double cantidad) {
		balance += cantidad;
		comprobarCambioDeEstado();
	}

	private void comprobarCambioDeEstado() {
		if (balance < limiteInferior) {
			cuenta.setEstado(new RedState(this));
		}else if (balance > limiteSuperior) {
			System.out.println("cambio de estado a GoldState");
		}
		
	}

	@Override
	public void retirar(double cantidad) {
		balance -= cantidad;
		comprobarCambioDeEstado();
	}

	@Override
	public void pagarIntereses() {
		// TODO Auto-generated method stub

	}

}
