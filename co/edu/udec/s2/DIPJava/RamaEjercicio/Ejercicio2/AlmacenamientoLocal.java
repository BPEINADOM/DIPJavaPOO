package Ejercicio2;

import Ejercicio2.Interfaces.Almacenamiento;

public class AlmacenamientoLocal implements Almacenamiento {

    @Override
    public void guardar(String archivo) {
        System.out.println("Se ha guardado el archivo " + archivo + " en Almacenamiento local.");
    }

    @Override
    public void borrar() {
        System.out.println("Se ha eliminado el archivo en Almacenamiento local correctamente.");
    }

}
