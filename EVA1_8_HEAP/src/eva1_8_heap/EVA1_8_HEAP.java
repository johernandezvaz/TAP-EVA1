/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_8_heap;

/**
 *
 * @author Josep
 */
public class EVA1_8_HEAP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona perso = new Persona();
        Persona perso2 = new Persona("Juan", "Peter", 50);
//        Math.random();
        System.out.println(perso);
        System.out.println(perso2);
        
        
//        if(perso == perso2)
//            System.out.println("Objetos iguales");
//        else
//            System.out.println("Objetos distintos");
        String copia1 = perso2.getApellido();
        String copia2 = perso2.getNombre();
        String copia3 = Integer.toString(perso2.getEdad());
        perso = null;
        
        
        
        System.out.println(perso2);
        System.out.println(copia1);
        System.out.println(copia2);
        System.out.println(copia3);
        
        
    
    }
    
    
    
}

class Persona{
        private String nombre;
        private String apellido;
        private int edad;

        public Persona() {
        }

        public Persona(String nombre, String apellido, int edad) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.edad = edad;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }
        
        
        
        
    }
