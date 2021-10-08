package Vehiculos;

public interface GestionVehiculo {

	boolean acelerar(float incremento);
	boolean parar();
	boolean frenar(float decremento);
	boolean arrancar();
}
