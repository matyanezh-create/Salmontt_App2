package ui;

import data.GestorUnidades;
import model.UnidadOperativa;

public class Main {

    public static void main(String[] args) {

        // Solicita al GestorUnidades que cree objetos de prueba
        UnidadOperativa[] unidades = GestorUnidades.crearUnidadesDemo();

        // Mensaje principal de salida
        System.out.println("Unidades operativas registradas:");

        // Recorre el arreglo y muestra cada unidad operativa
        for (UnidadOperativa u : unidades) {
            System.out.println(u.toString());  // Imprime la representación en texto de cada objeto
        }
    }
}
