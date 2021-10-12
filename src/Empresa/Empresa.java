package Empresa;

import Vehiculos.*;
import Edificios.*;
import Productos.*;

public class Empresa{
	
	protected String nombre;

	protected Vehiculo electrico1;
	protected Vehiculo electrico2;
	protected Vehiculo gasolina1;
	protected Vehiculo diessel1;
	
	protected Edificio oficina1;
	protected Edificio almacen1;
	protected Edificio fabrica1;
	
	protected Producto puerta1;
	protected Producto puerta2;
	protected Producto ventana1;
	protected Producto ventana2;
	protected Producto silla1;
	protected Producto silla2;
	
	
	public Empresa() {
		this.electrico1 = new Electrico();
		this.electrico2 = new Electrico();
		this.gasolina1 = new Gasolina();
		this.diessel1 = new Gasoil(nombre, 0, false, 0, 0, nombre, 0);
		
		this.oficina1 = new Oficina(nombre, 0, 0, 0, nombre, 0, nombre);
		this.almacen1 = new Almacen(nombre, 0, 0, 0, nombre, 0, nombre);
		this.fabrica1 = new Fabrica(nombre, 0, 0, 0, nombre, 0, nombre);
		
		this.puerta1 = new Puertas(0, nombre, 0, 0, 0, nombre, almacen1);
		this.puerta2 = new Puertas(0, nombre, 0, 0, 0, nombre, almacen1);
		this.ventana1 = new Ventanas(0, nombre, 0, 0, 0, nombre, almacen1);
		this.ventana2 = new Ventanas(0, nombre, 0, 0, 0, nombre, almacen1);
		this.silla1 = new Sillas(0, nombre, 0, 0, 0, nombre, almacen1);
		this.silla2 = new Sillas(0, nombre, 0, 0, 0, nombre, almacen1);
		
		this.nombre = "Mi empresa";
	}
	
	
	//Getters & Setters---------------------------------------------------------------------

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Vehiculo getElectrico1() {
		return electrico1;
	}

	public void setElectrico1(Vehiculo electrico1) {
		this.electrico1 = electrico1;
	}

	public Vehiculo getElectrico2() {
		return electrico2;
	}

	public void setElectrico2(Vehiculo electrico2) {
		this.electrico2 = electrico2;
	}

	public Vehiculo getGasolina1() {
		return gasolina1;
	}

	public void setGasolina1(Vehiculo gasolina1) {
		this.gasolina1 = gasolina1;
	}

	public Vehiculo getDiessel1() {
		return diessel1;
	}

	public void setDiessel1(Vehiculo diessel1) {
		this.diessel1 = diessel1;
	}

	public Edificio getOficina1() {
		return oficina1;
	}

	public void setOficina1(Edificio oficina1) {
		this.oficina1 = oficina1;
	}

	public Edificio getAlmacen1() {
		return almacen1;
	}

	public void setAlmacen1(Edificio almacen1) {
		this.almacen1 = almacen1;
	}

	public Edificio getFabrica1() {
		return fabrica1;
	}

	public void setFabrica1(Edificio fabrica1) {
		this.fabrica1 = fabrica1;
	}

	public Producto getPuerta1() {
		return puerta1;
	}

	public void setPuerta1(Producto puerta1) {
		this.puerta1 = puerta1;
	}

	public Producto getPuerta2() {
		return puerta2;
	}

	public void setPuerta2(Producto puerta2) {
		this.puerta2 = puerta2;
	}

	public Producto getVentana1() {
		return ventana1;
	}

	public void setVentana1(Producto ventana1) {
		this.ventana1 = ventana1;
	}

	public Producto getVentana2() {
		return ventana2;
	}

	public void setVentana2(Producto ventana2) {
		this.ventana2 = ventana2;
	}

	public Producto getSilla1() {
		return silla1;
	}

	public void setSilla1(Producto silla1) {
		this.silla1 = silla1;
	}

	public Producto getSilla2() {
		return silla2;
	}

	public void setSilla2(Producto silla2) {
		this.silla2 = silla2;
	}//---------------------------------------------------------------------------------------
	
	
	
	
	
	public String print() {
		return this.nombre + "\n" + electrico1.print() + "\n" + electrico2.print() + "\n" + gasolina1.print() +
				"\n" + diessel1.print() + "\n" + oficina1.print() + "\n" + almacen1.print() + "\n" + fabrica1.print() + 
				"\n" + puerta1.print() + "\n" +  puerta2.print() + "\n" + ventana1.print() + "\n" + ventana2.print() +
				"\n" + silla1.print() + "\n" + silla2.print();
	}
	
	

	public boolean crearProducto(Producto pro) {
		// TODO Auto-generated method stub
		
		if ( puerta1 == null || puerta1.getId() != pro.getId() || puerta1.getId() <7) {
			puerta1 = pro;
			System.out.println("Puerta creada");
			return true;	
		}else if ( puerta2 == null || puerta2.getId() != pro.getId() || puerta1.getId() <7) {
			puerta2 = pro;
			System.out.println("Puerta creada");
			return true;	
		}else if ( silla1 == null || silla1.getId() != pro.getId() || puerta1.getId() <7) {
			silla1 = pro;
			System.out.println("Silla creada");
			return true;	
		}else if ( silla2 == null || silla2.getId() != pro.getId() || puerta1.getId() <7) {
			silla2 = pro;
			System.out.println("Silla creada");
			return true;
		}else if ( ventana1 == null || ventana1.getId() != pro.getId() || puerta1.getId() <7) {
			ventana1 = pro;
			System.out.println("ventana creada");
			return true;	
		}else if ( ventana2 == null || ventana2.getId() != pro.getId() || puerta1.getId() <7) {
			ventana2 = pro;
			System.out.println("ventana creada");
			return true;
		}else {
			
			System.out.println("No se ha podido crear el producto");
			return false;	
		}
				
	}
	
	

	public boolean venderProducto(Producto pro) {
		// TODO Auto-generated method stub
		if(puerta1.getId() == pro.getId()) {
			pro = null;
			System.out.println("Puerta vendida");
			return  true;
		}else if(puerta2.getId() == pro.getId()) {
			pro = null;
			System.out.println("Puerta vendida");
			return  true;
		}else if(silla1.getId() == pro.getId()) {
			pro = null;
			System.out.println("Silla vendida");
			return  true;
		}else if(silla2.getId() == pro.getId()) {
			pro = null;
			System.out.println("Silla vendida");
			return  true; 
		}else if(ventana1.getId() == pro.getId()) {
			pro = null;
			System.out.println("Ventana vendida");
			return  true;
		}else if(ventana2.getId() == pro.getId()) {
			pro = null;
			System.out.println("Ventana vendida");
			return  true;
		}
		
		System.out.println("No se ha podido vender el producto");
		return false;
	}
	
	
	
	public boolean cambiarUbicacionDeProducto(Producto pro, Edificio edi) {
		// TODO Auto-generated method stub
		if(pro.getId() == puerta1.getId() || pro.getId() == puerta2.getId() || pro.getId() == silla1.getId() || pro.getId() == silla2.getId()
		|| pro.getId() == ventana1.getId() || pro.getId() == ventana2.getId()) {
				pro.setEdificioActual(edi);
		}
		System.out.println("Se ha cambiado la ubicación del preoducto a: " + edi);
		return true;
	}
	
	

	
}
