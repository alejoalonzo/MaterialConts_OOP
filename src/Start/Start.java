package Start;

import Empresa.Empresa;
import Edificios.*;
import Productos.*;
import Vehiculos.*;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empresa miEmpresa = new Empresa();
		
		
		//Vehiculos-----------------------------------------------------------------------------------------------------------
		Vehiculo coche1 = new Electrico("Toyota", 0.0f, false ,  50000.0f, 1080f,  "Blanco", 3.0f,  182.0f, 175f );
		Vehiculo coche2 = new Electrico("Honda", 0.0f, false ,  20000.0f, 1080f,  "Negro", 3.0f,  172.0f, 150f );
		Vehiculo coche3 = new Gasolina("Mitsubishi", 0.0f, false ,  30000.0f, 1050f,  "Gris", 2.5f,  13.0f, 1000f );
		Vehiculo coche4 = new Gasoil( "Nissan",	0.0f, false ,  40000,  1200f,  "Rojo",  2.1f);
		
		miEmpresa.setElectrico1(coche1);
		miEmpresa.setElectrico2(coche2);
		miEmpresa.setGasolina1(coche3);
		miEmpresa.setDiessel1(coche4);
		
		coche1.setEstaArrancado(true);
		coche1.setVelocidadActual(50.0f);
		coche2.setEstaArrancado(true);
		coche2.setVelocidadActual(50.0f);
		System.out.println("Esta arrancado el coche electrico 1: "+coche1.getEstaArrancado());
		System.out.println("Esta arrancado el coche electrico 2: "+coche2.getEstaArrancado());
		System.out.println("Velocidad actual del coche electrico 1: "+coche1.getVelocidadActual());
		System.out.println("Velocidad actual del coche electrico 2: "+coche2.getVelocidadActual());

		coche3.frenar(80.0f);
		coche4.frenar(80.0f);
		System.out.println("Esta arrancado el coche Gasolina: "+coche3.getEstaArrancado());
		System.out.println("Esta arrancado el coche Gasoil: "+coche4.getEstaArrancado());
		System.out.println();
		
		
		
		//Edificios-----------------------------------------------------------------------------------------------------------
		Edificio edi1 = new Fabrica("Fabrica", 60.0f, 5.0f, 38.0f, "Concreto", 600000f,  "Blanco");
		Edificio edi2 = new Almacen("Almacen", 30.0f, 5.0f, 15.0f, "Concreto",  300000f, "Amarillo");
		Edificio edi3 = new Oficina("Oficina", 20f, 3.0f, 10.0f, "Pladur", 50000f, "Gris");
		
		miEmpresa.setFabrica1(edi1);
		miEmpresa.setAlmacen1(edi2);
		miEmpresa.setOficina1(edi3);
		
		float coste;
		coste = edi1.costePintura("verde", 30f);
		System.out.println("El coste de pintar toda la fabrica es: " + coste);
		System.out.println();
		
		
		//Productos-------------------------------------------------------------------------------------------------------------
		Producto puer1 = new Puertas(1, "Puerta salón", 1.2f, 0.1f, 2.2f, "Blanco", edi1);
		Producto puer2 = new Puertas(2, "Puerta salón", 1.2f, 0.1f, 2.2f, "Blanco", edi1);
		Producto si1 = new Sillas(3, "Silla comedor", 0.6f, 0.5f, 1.2f, "Marron",  edi1);
		Producto si2 = new Sillas(4, "Silla comedor", 0.6f, 0.5f, 1.2f, "Marron",  edi1);
		Producto ven1 = new Ventanas(5, "Ventana salón", 0.6f, 0.1f, 0.6f, "Marron",  edi1);
		Producto ven2 = new Ventanas(6, "Ventana salón", 0.6f, 0.1f, 0.6f, "Marron",  edi1);
		
		miEmpresa.setPuerta1(puer1);
		miEmpresa.setPuerta2(puer2);
		miEmpresa.setSilla1(si1);
		miEmpresa.setSilla2(si2);
		miEmpresa.setVentana1(ven1);
		miEmpresa.setVentana2(ven2);
		

		
		
		System.out.println(miEmpresa.print());
		
		
		
		//System.out.println("MI EMPRESA: " + miEmpresa.print());
		
	}

}
