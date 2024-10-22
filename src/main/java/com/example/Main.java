package com.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> factura = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Mensaje de bienvendia al programa
            System.out.println(
                    "Bienvenido al sistema de registro de facturas. Por favor, complete el formulario a continuación para procesar su registro de manera eficiente.");
            System.out.println(
                    "----------------------------------------------------------------------------------------------------------------------------------------------");
                    // Menu de opciones a las cuales puede acceder el adminstrador
            System.out.println("Opciones:");
            System.out.println("1. Ingresar nombre");
            System.out.println("2. Ingresar monto");
            System.out.println("3. Ingresar proveedor");
            System.out.println("4. Ingresar empresa");
            System.out.println("5. Revisar factura");
            System.out.println("6. Finalizar registro");
            System.out.print("Seleccione una opción: ");
            int opciones = scanner.nextInt();
            scanner.nextLine(); 

            // Respuesta para cada posible opción seleccionada
            switch (opciones) {
                case 1:
                    System.out.print("Ingrese el nombre: ");
                    String nombre = scanner.nextLine();
                    factura.add("Nombre: " + nombre);
                    break;
                case 2:
                    System.out.print("Ingrese el monto: ");
                    String monto = scanner.nextLine();
                    factura.add("Monto: " + monto);
                    break;
                case 3:
                    System.out.print("Ingrese el proveedor: ");
                    String proveedor = scanner.nextLine();
                    factura.add("Proveedor: " + proveedor);
                    break;
                case 4:
                    System.out.print("Ingrese la empresa: ");
                    String empresa = scanner.nextLine();
                    factura.add("Empresa: " + empresa);
                    break;
                case 5:
                    System.out.println("Revisión de factura:");
                    for (String Revisión : factura) {
                        System.out.println(Revisión);
                    }
                    break;
                case 6:
                    System.out.println("Registro de factura finalizado. ¡Gracias por su registro!");
                   return; 
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }
        }
    }
}