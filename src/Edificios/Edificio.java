package Edificios;

public abstract class Edificio {
	//Attributes--------------------------
		protected String tipo;
		protected float anchura;
		protected float altura;
		protected float profundidad;
		protected String material;
		protected float precioMercado;
		protected String color;
		
		//Builders---------------------------------
		public Edificio(){
			this.tipo = "";
			this.anchura = 0.0f;
			this.altura = 0.0f;
			this.profundidad = 0.0f;
			this.material = "";
			this.precioMercado= 0.0f;
			this.color = "";
			
		}//Builder overload
		public Edificio(String tip,	float anch, float al, float profu, String mater, float prMkt, String color) {
			this.tipo = "";
			this.anchura = 0.0f;
			this.altura = 0.0f;
			this.profundidad = 0.0f;
			this.material = "";
			this.precioMercado= 0.0f;
			this.color = "";
			
		}
		
		//Getters & Setters----------------------------------------------------
		public String getTipo() {
			return tipo;
		}
		public void setTipo(String tipo) {
			this.tipo = tipo;
		}
		public float getAnchura() {
			return anchura;
		}
		public void setAnchura(float anchura) {
			this.anchura = anchura;
		}
		public float getAltura() {
			return altura;
		}
		public void setAltura(float altura) {
			this.altura = altura;
		}
		public float getProfundidad() {
			return profundidad;
		}
		public void setProfundidad(float profundidad) {
			this.profundidad = profundidad;
		}
		public String getMaterial() {
			return material;
		}
		public void setMaterial(String material) {
			this.material = material;
		}
		public float getPrecioMercado() {
			return precioMercado;
		}
		public void setPrecioMercado(float precioMercado) {
			this.precioMercado = precioMercado;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		
		
		//Own Methods-----------------------------------------------------
		
		public float costePintura(String color, float precioMetro) {
			float coste;
			coste = precioMetro * this.altura * this.anchura * this.profundidad;
			
			if(coste <= 0) {
				return -1;
			}else {
				return coste;
			}	
		}
		
		
		public float costePintura(String color, float precioMetro, String lado) {
			
			String ladoAnchura="ladoAnchura", ladoProfundidad="ladoProfundidad";
			float coste;
			if(lado.equals(ladoProfundidad)) {
				coste = precioMetro * this.altura * this.profundidad;
				if(coste <= 0) {
					return -1;
				}else {
					return coste;
				}	
			}else if(lado.equals(ladoAnchura)) {
				coste = precioMetro * this.altura * this.anchura;
				if(coste <= 0) {
					return -1;
				}else {
					return coste;
				}
			}else {
				System.out.println("Error en metodo costePintura");
				return 0;
			}
			
		}
		
		
		
		public abstract void funcionalidadEdificio();
		
}
