# MaterialConts_OOP



********************************ABOUT*********************************************************************
La empresa MATERIALCONTS desea crear un programa que gestione:
Los productos de la empresa
Los vehículos de la empresa
Los edificios de la empresa. 


Diseño de clases
A día de hoy no poseen una base de datos donde almacenar toda la información, por lo que nos
piden que creemos la estructura de clases para poder gestionar toda la información que desean.
Desean que la organicemos en paquetes para que posteriormente las puedan utilizar en futuros
proyectos que hagan.
Nota importante: Todas las clases que se definan en el ejercicio tendrán que implementar el
método print para mostrar por la consola toda la información de los atributos del objeto. 



Vehículos (Clase Vehiculo)
La empresa desea gestionar la información de todos sus vehículos, posee vehículos de tres tipos:
 Gasolina
 Gasoil
 Eléctricos.
Cada uno de ellos tienen características comunes y cada uno de ellos posee algunas
características propias.
Todos los vehículos tienen una marca, velocidad actual, está arrancado(booleano), un precio, un
peso, un color y una longitud.
Por otro lado, los vehículos de gasolina poseen las características contaminación y tamaño
depósito exclusivas
También los vehículos eléctricos poseen las características potencia y velocidad máxima que no
poseen los otros dos tipos.
Todos los vehículos sea cual sea su tipo DEBEN OBLIGATORIAMENTE implementar de una
interfaz llamada GestionVehiculo los métodos arrancar(), frenar(), acelerar(), parar() ya que todos
los vehículos deben realizar estas acciones independientemente del tipo. 
Diseño de clases
5
 La implementación del método acelerar debe devolver un booleano indicando si la
operación se ha realizado con éxito (true si el coche esta arrancado y false en caso
contrario) y se posee un único parámetro de tipo float que es el incremento de la velocidad
actual
boolean acelerar(float)
 La implementación del método frenar debe devolver un booleano (true si el coche esta
arrancado y false en caso contrario) y se posee un único parámetro de tipo float que es el
decremento de la velocidad actual, en caso de que la velocidad sea inferior a 0, cambiar
la velocidad actual a 0.
boolean frenar(float)
 La implementación del método arrancar debe devolver un booleano (true si el coche no
esta arrancado y false en caso contrario) y no posee parámetros
boolean arrancar()
 La implementación del método parar debe devolver un booleano (true si el coche está
arrancado y false en caso contrario) y no posee parámetros.
boolean parar() 



Edificios (Clase Edificio) 
Por otro lado, se desean gestionar los edificios que componen la empresa. Hay 3 tipos de edificios:
 Fabrica
 Almacén
 Oficina.
Todos los tipos de edificios tienen unas características comunes, anchura, altura, profundidad,
material, tipo de edificio en relación a su funcionalidad, precio de mercado y color. 
Diseño de clases
6
Los edificios poseen una serie de funcionalidades una de ellas es costePintura a la cual se le
pasa como parámetro el color y el precio de pintura por metro y te devolverá un float con el coste
que supondría pintar el edificio (coste= precio por metro * anchura * altura* profundidad).
En caso de que el precio de coste sea inferior o igual a 0 la función devolverá un -1
La funcionalidad costePintura estará sobrecargada, existirá otro método con el mismo nombre y
devolución información pero se le pasará un parámetro más de tipo String, con los posibles valores
ladoanchura o ladoprofundidad.. Si el valor es ladoanchura el coste sería coste= precio por metro
* anchura * altura en caso de ser ladoprofundidad el coste sería coste= precio por metro * altura*
profundidad, en caso de introducir otro valor la función devolverá -1.
En caso de que el precio de coste sea inferior o igual a 0 la función devolverá un -1
Por otro lado se desea crear en la clase padre Edificio un método abstracto llamado
funcionalidadEdificio a la cual no se le pasa ningún parámetro y devuelve un String con la
información del tipo de edificio en concreto.
La funcionalidad de cada edificio es la siguiente:
En la fábrica se crea el producto.
En la oficina se etiqueta el producto
En el almacén se guarda el producto para posteriormente venderlo

Diseño de clases
7



Productos (Clase Producto) 
También desean gestionar los productos de la empresa. La empresa posee 3 tipos de productos:
 Ventanas
 Puertas
 Sillas.
Todas los productos poseen las siguientes características: identificador único (ningún producto
tiene el mismo identificador), nombre, tipo, anchura, profundidad, altura, color y Edificio (es el
edificio donde se encuentran). 


Empresa (Clase Empresa) 
La empresa posee edificios, coches y productos
Poseen 4 coches: 2 eléctricos, uno de gasolina y uno diesel.
La empresa posee 3 edificios, una fábrica, un almacén y una oficina.
Poseen 6 productos como máximo simultáneamente: 2 puertas, 2 sillas y 2 ventana todos ubicados
en la fábrica 
Diseño de clases
8
En la empresa se realizan varias funcionalidades:
boolean crearProducto(Producto): se añade un nuevo producto a la empresa, que se le pasa
como parámetro, si tiene hueco y el identificador no existe, en caso de añadirlo devolverá true, en
caso contrario devolverá false (tanto si no tiene hueco, como si el identificador existe).
boolean venderProducto(Producto) : se vende un producto de la empresa que se le pasa como
parámetro, si existe (existe su identificador), lo borra y devuelve true, en caso que no exista
devuelve false.
Nota: Un producto se podrá vender solo si se encuentra en el almacen.
boolean cambiarUbicaciónProducto(Producto, Edificio) se pasa como parámetro el producto
que se desea cambiar la ubicación y el edificio al cual se desea cambiar, si el producto existe
(coinciden los identificadores) se modificará el edificio del producto y devolverá un true, en caso
contrario devolverá false
Importante: La case Fabrica, Almacén y Oficina son Edificios ya que serán hijas suyas, por lo tanto
se les puede pasar como parámetro a este método. 



Creación de la empresa OO (Programa principal que posee el
método main) 
Vehículos:
Poseen 4 coches: 2 eléctricos, uno de gasolina y uno diesel.
Los vehículos eléctricos deben están arrancados e ir a una velocidad de 50 km/h.
Los otros dos vehículos deben frenar tras ir a una velocidad de 80km/h. 
Diseño de clases
9
Edificios:
La empresa posee 3 edificios, una fábrica, un almacén y una oficina.
La funcionalidad de cada edificio es la siguiente:
En la fábrica se crea el producto.
En la oficina se etiqueta el producto
En el almacen se guarda el producto para posteriormente venderlo.
Calcular el precio de pintar la fábrica completa de color verde y precio por metro 30 euros.
Productos:
Poseen 6 productos como máximo simultáneamente: 2 puertas, 2 sillas y 2 ventana todos ubicados
en la fábrica
Poseen una puerta con identificador 1 y otra con el identificador 2
Poseen una silla con el identificador 3 y otra con el 4
Poseen una ventana con el identificador 5 y otra con el 6
Vender la puerta con el identificador 1
Vender una silla con el identificador 3
Crear una puerta nueva con el identificador 2
Crear una puerta nueva con el identificador 10 
