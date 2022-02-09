
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
//////////////////////
public class Archivos {
    private String Nombre;
    private String Apellidos;
    private int Fecha_nacimiento;
    private int DPI;
    private String Genero;
    private int Telefono;
    private String Direccion;
    File nombrearchivo = new File("archivo.txt");   
public void manejo_archivos (){
}
public void new_archivo(){     
    try {
        if (nombrearchivo.exists())
        {
           System.out.println("la base de dato ya existe");		
        }
        else
        { 
           nombrearchivo.createNewFile();
           System.out.println("Base de dato creada");
        }
    }
    catch(Exception ex){
    System.out.println(ex.getMessage());
    }
}
public void asignardatos(String nombre2, String apellidos2, int fecha_nacimiento2, int dpi2 , String genero2, int telefono2, String direccion2)
{
    Nombre =  nombre2;
    Apellidos = apellidos2 ;
    Fecha_nacimiento = fecha_nacimiento2 ;
    DPI = dpi2 ;
    Genero = genero2 ;
    Telefono = telefono2 ;
    Direccion = direccion2 ;
    try {
        try (BufferedWriter Fescribe = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(nombrearchivo,true)))) {
            Fescribe.write(Nombre+"   "+Apellidos+"   "+Fecha_nacimiento+"    "+DPI+ "   "+Genero+"   "+Telefono+"   "+Direccion);
            Fescribe.write("");
            System.out.print("Su informacion ha sido guardada");
            Fescribe.close();
        }      
         
    }
    catch(IOException ex){
    System.out.println(ex.getMessage());
    }
}  

//------------------------------------
public void buscarregistro(String nombre2){
    String usuario = nombre2;
    try {
          BufferedReader leer = new BufferedReader(new FileReader("archivo.txt"));
          String linea = nombre2;
          while((linea=leer.readLine())!=null) 
          {
               if (linea.contains(usuario))
           {
               System.out.println("se encontro el registro: "+linea);
           }
          }
    }
     
    catch (IOException ex )
    {
       System.out.println(ex.getMessage());

    }
 }
//-------------------------------------   
 }      
