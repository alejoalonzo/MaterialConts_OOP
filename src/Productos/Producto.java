package Productos;

public class Producto {

	protected int id;
	protected String nombre;
	protected float anchura;
	protected float profundidad;
	protected float altura;
	protected String color;
	protected String edificioActual;
	
	public Producto() {
		this.id= 0;
		this.nombre= "";
		this.anchura= 0.0f;
		this.profundidad= 0.0f;
		this.altura= 0.0f;
		this.color= "";
		this.edificioActual= null;
				
	}
	
	//Getters & Setters---------------------------------------
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getAnchura() {
		return anchura;
	}

	public void setAnchura(float anchura) {
		this.anchura = anchura;
	}

	public float getProfundidad() {
		return profundidad;
	}

	public void setProfundidad(float profundidad) {
		this.profundidad = profundidad;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getEdificioActual() {
		return edificioActual;
	}

	public void setEdificioActual(String edificioActual) {
		this.edificioActual = edificioActual;
	}
	
	
	
	
}
