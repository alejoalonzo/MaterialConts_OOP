package Edificios;

public class Oficina extends Edificio{
	
	public Oficina(String tip, float anch, float al, float profu, String mater, float prMkt, String color) {
		// TODO Auto-generated constructor stub
		this.tipo = tip;
		this.anchura = anch;
		this.altura = al;
		this.profundidad = profu;
		this.material = mater;
		this.precioMercado= prMkt;
		this.color = color;
	}

	

	@Override
	public void funcionalidadEdificio() {
		// TODO Auto-generated method stub
		System.out.println("La funcionalidad del esdificio 'Oficina' es: Etiquetar el producto");
	}

}
