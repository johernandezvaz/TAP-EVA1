/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_9_polimorfismo;

/**
 *
 * @author Josep
 */
public class EVA1_9_POLIMORFISMO {

    /**
     * @param args the command line arguments
     */
    
    static Persona perso1;
    static Persona perso2;
    
    public static void main(String[] args) {
        // TODO code application logic here
        perso1 = new Persona();
        perso2 = new Persona("Jose", "Hernandez", 25);
        
        System.out.println(perso1);
        System.out.println(perso2);
        
        mensaje(perso1);
        mensaje(perso2);
    }
    
    public static void mensaje(Object obj){
        System.out.println("Metodo mensaje");
        System.out.println(obj);
        
        if (obj == perso1)
            System.out.println("Persona 1");
        else
            System.out.println("Persona 2");
        
        
        Persona perso = (Persona) obj;
        
        System.out.println(perso.getNombre());
        System.out.println(perso.getApellido());
        System.out.println(perso.getEdad());
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
