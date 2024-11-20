import Ejercicio2.AlmacenamientoLocal;
import Ejercicio2.AlmacenamientoNube;
import Ejercicio2.GestorAlmacenamiento;
import Ejercicio2.Interfaces.Almacenamiento;

public class AlmacenamientoDIP {

    public static void main(String[] args) {

        System.out.println("*****************7502410037******************");
        System.out.println("********BILLY JEAN YER PEINADO MADERA********");
        System.out.println("*********************************************");
        
        Almacenamiento almacenamientoLocal = new AlmacenamientoLocal();
        GestorAlmacenamiento gestorAlmacenamientoLocal = new GestorAlmacenamiento(almacenamientoLocal);

        gestorAlmacenamientoLocal.guardarArchivo("Recibo.PDF");
        gestorAlmacenamientoLocal.borrarArchivo();

        System.out.println("*********************************************");

        Almacenamiento almacenamientoNube = new AlmacenamientoNube();
        GestorAlmacenamiento gestorAlmacenamientoNube = new GestorAlmacenamiento(almacenamientoNube);

        gestorAlmacenamientoNube.guardarArchivo("Recido.PDF");
        gestorAlmacenamientoNube.borrarArchivo();

        System.out.println("*********************************************");

    }
}
