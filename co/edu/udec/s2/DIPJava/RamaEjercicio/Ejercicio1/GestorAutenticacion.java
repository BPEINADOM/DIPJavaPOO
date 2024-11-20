package Ejercicio1;

import Ejercicio1.Interfaces.ServicioAutenticacion;

public class GestorAutenticacion {
    private ServicioAutenticacion ServicioAutenticacion;

    public GestorAutenticacion(ServicioAutenticacion ServicioAutenticacion) {
        this.ServicioAutenticacion = ServicioAutenticacion;
    }

    public void iniciarSesion(String nombre, String email, String contraseña) {
        if (ServicioAutenticacion.autenticar(nombre, email, contraseña)) {
            System.out.println("Ingreso de sesion exitoso!");
        } else {
            System.out.println("Datos ingresados no validos. Verifique si estan correctamente.");
        }
    }
}
