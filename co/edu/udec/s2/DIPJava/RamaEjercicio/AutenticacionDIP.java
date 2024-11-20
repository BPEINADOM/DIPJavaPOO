import Ejercicio1.Autenticacion0Auth;
import Ejercicio1.AutenticacionLocal;
import Ejercicio1.GestorAutenticacion;
import Ejercicio1.Interfaces.ServicioAutenticacion;

public class AutenticacionDIP {

    public static void main(String[] args) {

        System.out.println("*****************7502410037******************");
        System.out.println("********BILLY JEAN YER PEINADO MADERA********");
        System.out.println("*********************************************");

        ServicioAutenticacion autenticacionLocal = new AutenticacionLocal();
        GestorAutenticacion gestorAutenticacionLocal = new GestorAutenticacion(autenticacionLocal);
        gestorAutenticacionLocal.iniciarSesion("JohnDev", "JohnHernandez99@hotmail.com", "J2345");

        System.out.println("*********************************************");

        ServicioAutenticacion autenticacion0auth = new Autenticacion0Auth();
        GestorAutenticacion gestorAutenticacion0auth = new GestorAutenticacion(autenticacion0auth);
        gestorAutenticacion0auth.iniciarSesion("JohnDev", "JohnHernandez99@hotmail.com", "J2345");

        System.out.println("*********************************************");
        
    }
}
