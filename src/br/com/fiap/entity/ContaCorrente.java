package br.com.fiap.entity;

public class ContaCorrente {
	
	protected double saldo;
	
	public void sacar(double valor) throws SaldoInsuficienteException{
		if(valor > saldo) {
			throw new SaldoInsuficienteException();
		} 
		saldo = saldo - valor;
	}

}
