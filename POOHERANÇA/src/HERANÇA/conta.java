package HERANÇA;

public class conta {

    protected double saldo;
	private int agencia;
	private int numero;
	
	
	public conta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
	}

	public void deposita(double saldo) {
		
	}

	boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		System.out.println("Saldo insuficiente!");
		return false;
	}

	boolean transfere(double valor, conta contaDestino) {
		if (this.saldo >= valor) {
			this.saca(valor);
			contaDestino.deposita(valor);
			return true;
		}
		System.out.println("Saldo insuficiente!");
		return false;
	}
	
	double getSaldo(){
		return this.saldo;
	}
}
