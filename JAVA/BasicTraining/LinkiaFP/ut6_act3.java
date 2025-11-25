package ut6

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Act_3 {

    public static void main(String[] args) {

        Map<String, String> usuarios = new HashMap<>();


        usuarios.put("jesus@gmail.com", "Jesús Salmerón");
        usuarios.put("ripley@gmail.com", "Ellen Ripley");
        usuarios.put("Redfield@gmail.es", "Chris Redfield");

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Búsqueda de Usuario por Email =====");
        System.out.print("Introduce un correo electrónico: ");
        String email = sc.nextLine().trim();

        if (usuarios.containsKey(email))
        {
            String nombre = usuarios.get(email);
            System.out.println("Usuario encontrado: " + nombre);
        }
        else
        {
            System.out.println("No existe ningún usuario con ese correo.");
        }

        sc.close();
    }
}
