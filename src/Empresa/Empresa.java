package Empresa;

import Vehiculos.*;
import Edificios.*;
import Productos.*;

public class Empresa {
	
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
		this.diessel1 = new Gasoil();
		
		this.oficina1 = new Oficina();
		this.almacen1 = new Almacen();
		this.fabrica1 = new Fabrica();
		
		this.puerta1 = new Puertas();
		this.puerta2 = new Puertas();
		this.ventana1 = new Ventanas();
		this.ventana2 = new Ventanas();
		this.silla1 = new Sillas();
		this.silla2 = new Sillas();
		
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
	
}
