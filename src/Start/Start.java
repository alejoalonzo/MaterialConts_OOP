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
		
		coche1.setEstaArrancado(true);
		coche1.setVelocidadActual(50.0f);
		coche2.setEstaArrancado(true);
		coche2.setVelocidadActual(50.0f);
		System.out.println("Esta arrancado el coche electrico 1: "+coche1.getEstaArrancado());
		System.out.println("Esta arrancado el coche electrico 2: "+coche2.getEstaArrancado());
		System.out.println("Velocidad actual del coche electrico 1: "+coche1.getVelocidadActual());
		System.out.println("Velocidad actual del coche electrico 2: "+coche2.getVelocidadActual());
		
		if(coche3.getVelocidadActual()  >= 80.f) {
			coche3.setEstaArrancado(false);
		}

		if(coche4.getVelocidadActual()  >= 80.f) {
			coche4.setEstaArrancado(false);
		}
		System.out.println("Esta arrancado el coche Gasolina: "+coche3.getEstaArrancado());
		System.out.println("Esta arrancado el coche Gasolina: "+coche4.getEstaArrancado());
		
		//Edificios-----------------------------------------------------------------------------------------------------------
		Edificio edi1 = new Fabrica();
		Edificio edi2 = new Almacen();
		Edificio edi3 = new Oficina();
	}

}
