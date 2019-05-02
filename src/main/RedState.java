package main;

public class RedState extends State {

	public RedState(State estadoAnterior) {
		this.balance = estadoAnterior.balance;
		this.cuenta = estadoAnterior.cuenta;
		iniciar();
	}
	
	private void iniciar() {
		intereses = 0.0;
		limiteInferior = -100;
		limiteSuperior = 0;
		
	}

	@Override
	public void depositar(double cantidad) {
		balance += cantidad;
		comprobarCambioDeEstado();
	}

	private void comprobarCambioDeEstado() {
		if (balance > limiteSuperior) {
			cuenta.setEstado (new SilverState(this));
		}
	}

	@Override
	public void retirar(double cantidad) {
		System.out.println("no se puede retirar dinero");
	}

	@Override
	public void pagarIntereses() {
		System.out.println("no se pagan intereses");
	}

}
