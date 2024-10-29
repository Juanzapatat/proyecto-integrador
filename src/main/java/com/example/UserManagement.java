package com.example;

import java.util.HashMap;
import java.util.Scanner;

public class UserManagement {
    private static HashMap<String, String> usuarios = new HashMap<>();

    static {
        
        usuarios.put("ADMIN", "CESDE");
    }

    public static void crearUsuario(String nuevoUsuario, String nuevaContrasena) {
        if (usuarios.containsKey(nuevoUsuario)) {
            System.out.println("El usuario ya existe. Intente con otro nombre.");
        } else {
            usuarios.put(nuevoUsuario, nuevaContrasena);
            System.out.println("Usuario " + nuevoUsuario + " creado con éxito.");
        }
    }

    public static boolean iniciarSesion(Scanner scanner) {
        int intentos = 0;

        while (intentos < 3) {
            System.out.print("Ingrese su usuario: ");
            String usuario = scanner.nextLine();

            if (usuario.equalsIgnoreCase("salir")) {
                return false; 
            }

            System.out.print("Ingrese su contraseña: ");
            String contrasena = scanner.nextLine();

            if (usuarios.containsKey(usuario) && usuarios.get(usuario).equals(contrasena)) {
                System.out.println("Bienvenido, " + usuario + "!");
                return true; 
            } else {
                intentos++;
                System.out.println("Usuario o contraseña incorrectos. Intentos restantes: " + (3 - intentos));
            }
        }

        System.out.println("Ha alcanzado el límite de intentos. Regresando al menú principal.");
        return false; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("\n1. Iniciar sesión");
            System.out.println("2. Crear nuevo usuario");
            System.out.println("3. Salir\n");

            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    salir = !iniciarSesion(scanner);
                    break;

                case 2:
                    System.out.print("Ingrese un nuevo usuario: ");
                    String nuevoUsuario = scanner.nextLine();
                    System.out.print("Ingrese la contraseña para el nuevo usuario: ");
                    String nuevaContrasena = scanner.nextLine();
                    if (nuevoUsuario.equals("ADMIN")) {
                        System.out.println("No se puede modificar el usuario ADMIN.");
                    } else {
                        crearUsuario(nuevoUsuario, nuevaContrasena);
                    }
                    break;

                case 3:
                    System.out.println("Saliendo...");
                    scanner.close();
                    salir = true;
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
}
