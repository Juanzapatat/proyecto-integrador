package com.example;

import java.util.ArrayList;
import java.util.Scanner;

public class ReporteFinanzas.class {
    
    public static void main(String[] args) {
    ArrayList<String> ReporteFinanzas = new ArrayList<>();

       Scanner scanner = new Scanner(System.in);

           while (true) {
            System.out.println("-----------------------------------");
            System.out.println("Opciones:");
            System.out.println("1. NOMBRE DEL REPORTE");
           System.out.println("2. FECHA DE EXPIDICION");
           System.out.println("3. FECHA DE VENCIMIENTO");
            System.out.println("4. MONTO DEL REPORTE");
             System.out.println("5. CATEGORIA");
              System.out.println("6.Generar reporte ");
             System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            if (opcion == 1) {
        System.out.print("Ingrese el nombre del reporte: ");
           String articulo = scanner.next();
           ReporteFinanzas.add(articulo);
           } else if (opcion == 2) {
             System.out.print("Ingrese la fecha de expedicion: ");
             String articulo = scanner.next();
             ReporteFinanzas.add(articulo);

          }
        else if (opcion == 3) {
         System.out.print("Ingrese la fecha de vencimiento : ");
         String articulo = scanner.next();
         ReporteFinanzas.add(articulo);}
         else if (opcion == 4) {
         System.out.print("Ingrese el monto de reporte: ");
         String articulo = scanner.next();
         ReporteFinanzas.add(articulo);}

         else if (opcion ==5 ) {
         System.out.println("categoria:");
         for (int i = 0; i < ReporteFinanzas.size(); i++) {
         System.out.println(ReporteFinanzas.get(i));
         }
        } else if (opcion == 6) {
        System.out.println("Generar reporte");
 break;
        }  
       }
     }
}