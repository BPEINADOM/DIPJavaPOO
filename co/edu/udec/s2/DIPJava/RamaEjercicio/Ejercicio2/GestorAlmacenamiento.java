package Ejercicio2;

import Ejercicio2.Interfaces.Almacenamiento;

public class GestorAlmacenamiento {
    private Almacenamiento almacenamiento;

    public GestorAlmacenamiento(Almacenamiento almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public void guardarArchivo(String archivo) {
        almacenamiento.guardar(archivo);
    }

    public void borrarArchivo() {
        almacenamiento.borrar();
    }
    
}
