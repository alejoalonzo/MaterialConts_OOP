package Vehiculos;

public class Gasolina extends Vehiculo {
	//Definition Bombero's class (attributes)
	protected float contaminacion;
	protected float tammanyoDeposito;
		
	// Builder
	public Gasolina() {
		this.contaminacion= 0.0f;
		this.tammanyoDeposito= 0.0f;
	}
	 	
	public Gasolina(String mrc,	float vA, boolean eA, float prec, float pes, String colr, float longi, float cantam, float tD) {
		super(mrc, vA, eA, prec, pes, colr, longi);//From parents
		this.contaminacion= cantam;
		this.tammanyoDeposito= tD;
	}
	
	//Getters & Setters---------------------------------------------------------

	public float getContaminacion() {
		return contaminacion;
	}

	public void setContaminacion(float contaminacion) {
		this.contaminacion = contaminacion;
	}

	public float getTammanyoDeposito() {
		return tammanyoDeposito;
	}

	public void setTammanyoDeposito(float tammanyoDeposito) {
		this.tammanyoDeposito = tammanyoDeposito;
	}
	
	

}
