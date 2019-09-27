package Agenda;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Angendas miAgenda = new Angendas();
        String Opcion;
        Opcion = "Valor Inicial";
        String nombre;
        int telefono;
        String correo;        
        while (!"S".equals(Opcion.toUpperCase())) {
            System.out.println("Por favor ingrese una opción");
            Opcion = teclado.next();
            switch (Opcion.toUpperCase()) {                    
                case "A":
                    System.out.println("Por favor ingrese el nombre ");
                    nombre = teclado.next();
                    System.out.println("Por favor ingrese el número de teléfono ");
                    telefono = teclado.nextInt();
                    System.out.println("Por favor ingrese el correo electrónico ");
                    correo = teclado.next();
                    miAgenda.agregarContacto(nombre, telefono, correo);
                    break;
                case "B":
                    System.out.print("Por favor ingrese el nombre del contacto que quiere buscar ");
                    nombre = teclado.next();
                    if (miAgenda.contactoEstaEnLaLista(nombre)) {
                        System.out.println("El contacto está en la agenda");
                    } else {
                        System.out.println("El contacto no está en la agenda");
                    }
                    break;
                case "C":
                    miAgenda.listarContactos();
                    break;
                case "D":
                    if (miAgenda.agendaLlena()) {
                        System.out.println("La egenda está llena");
                    } else {
                        System.out.println("La egenda no está llena todavía");
                    }
                           
                      
                    break;
                case "E":
                    System.out.println("hay " + miAgenda.espaciosVacios() + " espacios vacíos");
                    break;
            }
        }
    }

}
