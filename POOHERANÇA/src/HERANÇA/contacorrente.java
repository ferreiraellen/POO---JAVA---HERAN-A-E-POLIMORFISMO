package HERANÇA;

public class contacorrente extends conta {

	public contacorrente(int agencia, int numero) {
		super( agencia, numero);
	}
	
	
	public boolean saca(double valor) {
		double valorASacar = valor + 0.2;
		return super.saca(valorASacar);
	}


	public void deposita(double valor) {
		super.saldo += valor;
	}
}
