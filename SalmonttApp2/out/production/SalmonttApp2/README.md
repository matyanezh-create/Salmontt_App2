# SalmonttApp

Proyecto académico para la digitalización de la empresa salmonera Salmontt.

El objetivo de esta semana es implementar una jerarquía de clases con herencia simple para representar las unidades operativas de la empresa.

## Clases creadas

### Paquete model/
- UnidadOperativa  
  Clase base que contiene los atributos comunes: nombre y comuna.

- CentroCultivo  
  Subclase que hereda de UnidadOperativa y agrega el atributo toneladasProduccion.

- PlantaProceso  
  Subclase que hereda de UnidadOperativa y agrega el atributo capacidadProceso.

### Paquete data/
- GestorUnidades  
  Contiene un método que crea instancias de prueba de las subclases y las retorna para su uso.

### Paquete ui/
- Main  
  Clase principal encargada de ejecutar el programa y mostrar las unidades creadas por consola.

## Instrucciones para ejecutar Main

1. Abrir el proyecto en un IDE como IntelliJ o Eclipse.
2. Asegurarse de que la estructura de paquetes sea la siguiente:
   - model/
   - data/
   - ui/
3. Compilar el proyecto.
4. Ejecutar la clase: ui.Main  
   La consola mostrará las unidades operativas creadas mediante el método del GestorUnidades.
