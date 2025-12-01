package data;

import model.CentroCultivo;
import model.PlantaProceso;
import model.UnidadOperativa;

//Clase encargada de gestionar la creación de unidades operativas.
public class GestorUnidades {

    //Crea y retorna un conjunto de unidades operativas de ejemplo.
    public static UnidadOperativa[] crearUnidadesDemo() {

        // Creación de centros de cultivo
        UnidadOperativa u1 = new CentroCultivo("Centro A", "Calbuco", 1200.5);
        UnidadOperativa u2 = new CentroCultivo("Centro B", "Quellón", 980.0);

        // Creación de plantas de proceso
        UnidadOperativa p1 = new PlantaProceso("Planta Norte", "Puerto Montt", 300);
        UnidadOperativa p2 = new PlantaProceso("Planta Sur", "Chonchi", 450);

        // Retorno de todos los objetos en un arreglo
        return new UnidadOperativa[]{u1, u2, p1, p2};
    }
}
