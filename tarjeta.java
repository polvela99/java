package ej33;

public class tarjeta {
	String banco;
	Boolean activ;
	Double saldo = 1000.00;
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	public Boolean getActiv() {
		return activ;
	}
	public void setActiv(Boolean activ) {
		this.activ = activ;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	public tarjeta(String banco, Boolean activ, Double saldo) {
		super();
		this.banco = banco;
		this.activ = activ;
		this.saldo = saldo;
	}
	public tarjeta() {
		
	}
	public void pagar(double pago) {
		if (activ & this.saldo>pago) {
			saldo = saldo - pago;
			System.out.println("SALDO DISPONIBLE " + saldo);
		}else {
		 System.out.println("Tarjeta no operativa");
		}
	}
	public void ingresar(double ingreso) {
		saldo = saldo + ingreso;
	}
	public void mostrar (double muestra) {
		System.out.println(saldo);
	}
}