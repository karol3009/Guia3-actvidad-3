
package el.colegio.de.perros;

import java.util.ArrayList;
import java.util.Scanner;

public class ElColegioDePerros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner kbd = new Scanner (System.in);
        ArrayList<Perro> Perros = new ArrayList<>();
        int opc;
        
        do {
            System.out.println("0. Salir");
            System.out.println("1. Agregar un perro");
            System.out.println("2. Mostrar informacon de un Perro");
            System.out.println("3. Eliminar un  perro de la lista");
            System.out.println("4. Mostrar los perros que pertenecen a:");
            System.out.println("5. Mostrar los perros segun su Raza:");
            System.out.println("6. Mostrar los perros segun la localdad donde habitan:");
            opc = kbd.nextInt();
            switch (opc){
                case 1:
                    String nombre, raza, localidad, nombre_del_dueño; 
                    int codigo_del_perro, cedula_del_dueño;
                    System.out.println("Ingrese el Nombre: ");
                    kbd.nextLine();
                    nombre = kbd.nextLine();
                    System.out.println("Ingrese la raza del perro: ");
                    raza = kbd.nextLine();
                    System.out.println("Ingrese la localidad: ");
                    localidad = kbd.nextLine();
                    System.out.println("Ingrese el codigo del perro: ");
                    codigo_del_perro = kbd.nextInt();
                    System.out.println("Ingrese el nombre del dueño: ");
                    kbd.nextLine();
                    nombre_del_dueño = kbd.nextLine();
                    System.out.println("Ingrese la cedula del dueño: ");
                    cedula_del_dueño = kbd.nextInt();
                    Perro p  = new Perro(nombre, codigo_del_perro, raza, localidad, nombre_del_dueño, cedula_del_dueño);
                    Perros.add(p);
                    break;
                case 2:
                for (Perro perrito : Perros) {
                    System.out.println("Nombre:  "+ perrito.getNombre());    
                    System.out.println("codigo del perro"+ perrito.getCodigo_del_Perro());
                    System.out.println("Raza"+ perrito.getRaza());
                    System.out.println("Localidad"+ perrito.getLocalidad());
                    System.out.println("Nombre del Dueño"+ perrito.getNombre_del_dueño());
                    System.out.println("Cedula del Dueño"+ perrito.getCedula_del_dueño());
                    }
                break;
                case 3:
                   System.out.println("eliminar  perro con numero de codigo:"); 
                   kbd.nextLine();
                   codigo_del_perro = kbd.nextInt();
                   for ( Perro perrito : Perros){
                       if (perrito.getCodigo_del_perro().equals(codigo_del_perro)){
                           Perros.remove(codigo_del_perro);
                           
                       }
                    break;
                case 4:
                    System.out.println("mostar perros de:");  
                    kbd.nextLine();
                    Nombre_del_dueño =kbd.nextLine();
                    for (perro perrito : perros) {
                    if (perrito.get.Nombre_del_dueño().equals(Nombre_del_dueño)){
                    System.out.println("dueño "+ perrito.getNombre_del_dueño());
                   }
                   break;
                case 5:
                    System.out.println("digame la raza:"); 
                   kbd.nextLine();
                   raza = kbd.nextLine();
                   for ( Perro perrito : Perros){
                       if (perrito.getRaza().equals(raza)){
                           System.out.println("raza: " + perrito.getNombre());
                   }
                   break; 
                case 6:
                    System.out.println("mostar los perrros de la localidad:"); 
                   kbd.nextLine();
                   localidad = kbd.nextLine();
                   for ( Perro perrito : Perros){
                       if (perrito.getLocalidad().equals(localidad)){
                           System.out.println("Localidad: " + perrito.getLocalidad());
                     }
                   break;
                   
                   }
                   }
                   }
               
                  } while (0 != opc);
            }
        }  
        
        


                                       
                   
                
        
        


        
        

                 
                    
                    
        
        
        
         

      
        
        
        
        
        
       
    
   
            