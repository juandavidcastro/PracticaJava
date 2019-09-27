package Agenda;

public class Angendas {

    contacto[] listaContactos = new contacto[15];

    public void agregarContacto(String nombre, long telefono, String correo) {
        contacto nuevoContacto = new contacto();
        nuevoContacto.nombre = nombre;
        nuevoContacto.telefono = telefono;
        nuevoContacto.correo = correo;
        if (agendaLlena()) {
            System.out.println("La agenda ya está llena");
        } else {
            if (contactoEstaEnLaLista(nuevoContacto.nombre)) {
                System.out.println("El contacto ya está en la agenda");
            } else {
                for (int indice = 0; indice < 15; indice++) {

                    if (this.listaContactos[indice] == null) {
                        this.listaContactos[indice] = nuevoContacto;
                        break;
                    }
                }
            }

        }
    }

    public boolean contactoEstaEnLaLista(String nombre) {
        boolean contactoEsta;
        contactoEsta = false;
        int indice;
        for (indice = 0; indice < 15; indice++) {
            if (this.listaContactos[indice] != null) {

                if (nombre.equals(this.listaContactos[indice].nombre)) {
                    contactoEsta = true;
                    break;
                }
            }
        }
        return contactoEsta;
    }

    public void listarContactos() {
        for (int indice = 0; indice < 15; indice++) {
            if (espaciosVacios() == 15) {
                System.out.println("No hay contactos aún en la agenda");
                return;
            }
            if (this.listaContactos[indice] != null) {
                System.out.println(this.listaContactos[indice].nombre);
            }
        }
    }

    public boolean agendaLlena() {
        boolean estaLlena;
        estaLlena = false;
        int indice;
        int contador;
        contador = 0;
        for (indice = 0; indice < 15; indice++) {
            if (this.listaContactos[indice] == null) {
                contador = contador + 1;
            }
        }
        if (contador == 0) {
            estaLlena = true;
        }
        return estaLlena;
    }

    public int espaciosVacios() {
        int indice;
        int contador;
        contador = 0;
        for (indice = 0; indice < 15; indice++) {
            if (this.listaContactos[indice] == null) {
                contador = contador + 1;
            }
        }
        return contador;
    }

}
