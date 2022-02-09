
import java.util.Scanner;
public class Creacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);
    int salir =1;
    Archivos objeto1 = new Archivos();
    System.out.println("------------Bienvenido a Citrix Connect-------------");
    System.out.println("Eliga una opcion : \n"
            + "1.Crear base de datos \n"
            + "2.Registrarse\n"
            + "3.Buscar \n"
            + "4.Salir\n");    
    while (salir != 6)
    {
    try{

    System.out.println("----------------------------------------------------");
    System.out.println("Eliga una opcion");
    salir = teclado.nextInt();
    if (salir ==1){objeto1.new_archivo();}           
         
    if (salir ==2){
    System.out.println("Ingresa su primer nombre: ");
    String  nombre = teclado.next();
    System.out.println("Ingrese sus apellidos  ");
    String  apellidos = teclado.next();
    System.out.println("Ingrese su fecha nacimiento ");
    int fecha_nacimiento = teclado.nextInt();
    System.out.println("Digite su DPI ");
    int dpi = teclado.nextInt();
    System.out.println("Ingrese su genero ");
    String  genero = teclado.next();
    System.out.println("Digite su telefono ");
    int telefono = teclado.nextInt();
    System.out.println("Digite su direccion ");
    String  direccion = teclado.next();
       
    objeto1.asignardatos(nombre,apellidos,fecha_nacimiento,dpi,genero,telefono,direccion);

    } 
    if (salir ==3){
    System.out.println("---------Ingrese su nombre----------");
    String nombre=teclado.next();
    objeto1.buscarregistro(nombre);
    }
    if (salir ==4){
    System.out.println("Gracias por se parte de nosotros");
    System.exit(0);
    }
}   
    catch (Exception ex )
    {
       System.out.println(ex.getMessage());
       teclado.nextLine();
    }
 //-----------------------------------------------------------------------------   
    }
  } 
}
