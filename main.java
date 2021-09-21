/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
Autor, Número de páginas, y un constructor con todos los atributos pasados por
parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los
datos al usuario y luego informar mediante otro método el número de ISBN, el título,
el autor del libro y el numero de páginas.
 */
package Ejercicio1;


import java.util.Scanner;


/**
 *
 * @author jhosenny
 */
public class main {                                         //Creacion De Mi Clase
   public static Scanner leer= new Scanner(System.in);      //Sccaners tipo Global 
    public static void main(String[] args) {                //Creacion de mi metodo main
       MostrarDatos(pedirdatos());    //Creo un subprograma (metodo) que se va a encargar de mostrar los datos cargador por teclado,  este va a revisar primero los que este entre parentesis (parametros) y resolver lo que este dentro en este caso seria la funcion de la Lin 24-35 
   }//FinMain
    
    public static Libro pedirdatos(){  //modificador "public" static tipo de dato "Libro" nombre de la funcion "book"                      
        Libro book= new Libro();  //Tipo de dato "Libro" nombreV= "Book"  
        System.out.println("Introduce el Codigo ISBN");
        book.setISBN(leer.nextInt());         //los guardo en Setter ya que el se encarga de modificar  
        System.out.println("Introduce el nombre del libro");
        book.setTitulo("El secreto del bambu");            
        System.out.println("Introduce el nombre del autor del libro");
        book.setAutor(leer.next());
        System.out.println("Introduce cuantas paginas tiene el libro");
        book.setNumeroDePagina(leer.nextInt());
        return book;                            //Todos los datos cargados se almacenaran en la variable book 
    }
    
    public static void MostrarDatos(Libro book){  // Subprograma  nombre del metodo"Mostrardatos" parametros:(tipo de dato "Libro" nombre de la variable "book" 
        System.out.println(book.toString());
    }
    
   
    
    
    
    
    
    
    
}
