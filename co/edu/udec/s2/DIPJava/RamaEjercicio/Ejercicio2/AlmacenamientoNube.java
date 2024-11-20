package Ejercicio2;

import Ejercicio2.Interfaces.Almacenamiento;

public class AlmacenamientoNube implements Almacenamiento {

    @Override
    public void guardar(String archivo) {
        System.out.println("Se ha guardado el archivo " + archivo + " en Almacenamiento en la nube.");
    }

    @Override
    public void borrar() {
        System.out.println("Se ha eliminado el archivo en Almacenamiento en la nube correctamente.");
    }

}
