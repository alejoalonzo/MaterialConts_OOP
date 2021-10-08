package Vehiculos;

public class Vehiculo implements GestionVehiculo{
	
	//Attributes--------------------------
	protected String marca;
	protected float velocidadActual;
	protected boolean estaArrancado;
	protected float precio;
	protected float peso;
	protected String color;
	protected float longitud;
	
	//builders---------------------------------
	public Vehiculo(){
		this.marca = "";
		this.velocidadActual = 0.0f;
		this.estaArrancado = false;
		this.precio = 0.0f;
		this.peso = 0.0f;
		this.color= "";
		this.longitud = 0.0f;
		
	}//Builder overload
	public Vehiculo(String mrc,	float vA, boolean eA, float prec, float pes, String colr, float longi) {
		this.marca = mrc;
		this.velocidadActual = vA;
		this.estaArrancado = eA;
		this.precio = prec;
		this.peso = pes;
		this.color= colr;
		this.longitud = longi;
		
	}
	
	
	//Getters & Setters-----------------------------------------------------
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public float getVelocidadActual() {
		return velocidadActual;
	}
	public void setVelocidadActual(float velocidadActual) {
		this.velocidadActual = velocidadActual;
	}
	public boolean getEstaArrancado() {
		return estaArrancado;
	}
	public void setEstaArrancado(boolean estaArrancado) {
		this.estaArrancado = estaArrancado;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public float getLongitud() {
		return longitud;
	}
	public void setLongitud(float longitud) {
		this.longitud = longitud;
	}
	
	
	
	//Own methods--------------------------------------------
	
	public String print() {
		String info= "";
		info +="\n Marca: " + marca;
		info +="\n Velocidad actual: " + velocidadActual;
		info +="\n Está arrancado: " + estaArrancado;
		info +="\n Precio: " + precio;
		info +="\n Peso: " + peso;
		info +="\n Color: " + color;
		
		return info;
		
	}
	
	
	//----------------------Definition of own method---------------------------
	
	@Override
	public boolean acelerar(float incremento) {
		// TODO Auto-generated method stub
	
       
		if (this.estaArrancado= true) {
			this.velocidadActual+= incremento;
			this.estaArrancado= true;
			return true;
		}else {
			this.estaArrancado= false;
			return false;
		}
		
	}
	
	@Override
	public boolean frenar(float decremento) {
		// TODO Auto-generated method stub
		if(this.estaArrancado)
			this.velocidadActual-= decremento;
			if(this.velocidadActual < 0.0f) {
				this.velocidadActual = 0.0f;
				return true;
			}
			else{
				return false;
			}
	}
	
	@Override
	public boolean arrancar() {
		// TODO Auto-generated method stub
		if(this.estaArrancado = true) {
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public boolean parar() {
		// TODO Auto-generated method stub
		if(this.estaArrancado = true) {
			return true;
		}else {
			return false;
		}
	}
	
	//-------------------------------------------------------------------------------

	
	
	
	
	
}
