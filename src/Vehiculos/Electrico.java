package Vehiculos;

public class Electrico extends Vehiculo {
	protected float potencia;
	protected float velocidadMaxima;

	public Electrico() {
		this.potencia = 0;
		this.velocidadMaxima = 120;
	}
	public Electrico(String mrc,	float vA, boolean eA, float prec, float pes, String colr, float longi, float poten, float vM) {
		super(mrc, vA, eA, prec, pes, colr, longi);//From parents
		this.potencia= poten;
		this.velocidadMaxima= vM;
	}
	
	//Getters & Setters-------------------------------------------------------------------------
	public float getPotencia() {
		return potencia;
	}
	public void setPotencia(float potencia) {
		this.potencia = potencia;
	}
	public float getVelocidadMaxima() {
		return velocidadMaxima;
	}
	public void setVelocidadMaxima(float velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	
	
	public String print() {
		return super.print() + "Potencia: " + this.potencia + "Velocidad maxima: " +this.velocidadMaxima;
	}
	
	
}
	
	
