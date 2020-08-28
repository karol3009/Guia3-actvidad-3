
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
                    System.out.println("Raza"+ perrito.getraza());
                    System.out.println("Localidad"+ perrito.getlocalidad();
                    System.out.println("Nombre del Dueño"+ perrito.getNombre_del_dueño());
                    System.out.println("Cedula del Dueño"+ perrito.getCedula_del_dueño());
                    
                    }
                    break;
                                       
                }
                 
                    
                    
            }
            
        
    
        
        
        
       
    
   
