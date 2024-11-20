package Ejercicio1;

import Ejercicio1.Interfaces.ServicioAutenticacion;

public class Autenticacion0Auth implements ServicioAutenticacion {

    @Override
    public boolean autenticar(String nombre, String email ,String contraseña) {
        System.out.println("Autenticando a " + nombre + " a traves de 0Auth...");
        System.out.println("Autenticacion exitosa!");
        return "JohnDev".equals(nombre) && "JohnHernandez99@hotmail.com".equals(email) && "J2345".equals(contraseña);
    }
}
