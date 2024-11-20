package Ejercicio1;

import Ejercicio1.Interfaces.ServicioAutenticacion;

public class AutenticacionLocal implements ServicioAutenticacion {

    @Override
    public boolean autenticar(String nombre, String email ,String contraseña) {
        System.out.println("Autenticando a " + nombre + " en la base de datos local...");
        System.out.println("Autenticacion exitosa!");
        return "JohnDev".equals(nombre) && "JohnHernandez99@hotmail.com".equals(email) && "J2345".equals(contraseña);
    }

}
