package UT6

import java.util.ArrayList;

class USUARIO {


    private String nombre;
    private String email;
    private int edad;



    public USUARIO(String nombre, String email, int edad) {
        this.nombre = nombre;
        this.email = email;
        this.edad = edad;
    }


    public void funMostrar() {

        System.out.println("════════════════════════════════════════════════════════════");
        System.out.println("El nombre es: " + nombre);
        System.out.println("La dirección de email: " + email);
        System.out.println("La edad: " + edad);
        System.out.println("════════════════════════════════════════════════════════════");
    }
}

public class Act_1 {

    public static void main(String[] args) {

        ArrayList<USUARIO> usuarios = new ArrayList<>();


        usuarios.add(new USUARIO("Jesus Salmeron", "jesus@gmail.com",36));
        usuarios.add(new USUARIO("Jack Torrance", "resplandor@gmail.com", 48));


        System.out.println("********************** Lista de Usuarios **********************");
        for (USUARIO USUARIO1 : usuarios) {
            USUARIO1.funMostrar();
        }
    }
}
