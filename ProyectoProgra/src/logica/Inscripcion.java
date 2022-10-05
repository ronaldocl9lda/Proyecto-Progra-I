package logica;

import static logica.Equipos.*;

//clase para realizar las inscripciones 
public class Inscripcion {

    private Competidor competidor[];

    public Inscripcion() {//Método constructor 
        this.competidor = new Competidor[50]; //arreglo para 50 competidores 
    }

    public void llenar_inscripciones() { //Método para inscribir a los 50 competidores
        for (int i = 0; i < competidor.length; i++) {
            Competidor competidores = new Competidor();
            competidor[i] = competidores;
        }
    }

    public void asignar_ID() { //Con este método se asignan los ID que son Numero entre 100 y 500 sin que se repitan.
        int numero;
        for (int i = 0; i < competidor.length; i++) {
            numero = (int) (Math.random() * 401) + 100;
            competidor[i].setID(numero);
            for (int j = 0; j < i; j++) {
                if (competidor[i].getID() == competidor[j].getID()) {
                    numero = (int) (Math.random() * 401) + 100;
                    competidor[i].setID(numero);
                    j = -1;
                }
            }
        }
    }
//metodo set y get del arreglo 

    public Competidor[] getCompetidor() {
        return competidor;
    }

    public void setCompetidor(Competidor[] competidor) {
        this.competidor = competidor;
    }

    //metodo toString que imprime el competidor 
    public String toString() {
        String hilera = " ";
        for (int i = 0; i < competidor.length; i++) {
            hilera += competidor[i].toString();
        }
        return hilera;
    }

    //metodo toString  para imprimir el competidor mas la edaad y el ide de cada competidor 
    public String imprimir_equipos() { //Método para imprimir a los equipos y sus respectivos competidores
        String equipo1 = "Equipo Rapidos y Furiosos \n \n";
        String equipo2 = "\n \nEquipo Velocidad Total \n \n";
        String equipo3 = "\n \nEquipo Prudencia \n \n";
        String equipo4 = "\n \nEquipo Prudencia Total \n \n";

        for (int i = 0; i < this.competidor.length; i++) {
            if (competidor[i].getEquipo() == Rapidos_y_Furiosos) {
                equipo1 += "Competidor ID: " + competidor[i].getID() + " Edad: " + competidor[i].getEdad() + "\n";
            }
            if (competidor[i].getEquipo() == Velocidad_Total) {
                equipo2 += "Competidor ID: " + competidor[i].getID() + " Edad: " + competidor[i].getEdad() + "\n";
            }
            if (competidor[i].getEquipo() == Prudencia) {
                equipo3 += "Competidor ID: " + competidor[i].getID() + " Edad: " + competidor[i].getEdad() + "\n";
            }

            if (competidor[i].getEquipo() == Prudencia_Total) {
                equipo4 += "Competidor ID: " + competidor[i].getID() + " Edad: " + competidor[i].getEdad() + "\n";
            }
        }
        return equipo1 + equipo2 + equipo3 + equipo4;
    }

    public void ordenar_id_menor_mayor() { // Método para ordenar los ID de menor a Mayor
        Competidor objeto_auxiliar;
        for (int i = 0; i < competidor.length; i++) { //Metodo de Ordenamiento por Seleccion
            int minimo = i;
            for (int j = i + 1; j < competidor.length; j++) {
                if (competidor[j].getID() < competidor[minimo].getID()) {
                    minimo = j;
                }
            }
            objeto_auxiliar = competidor[i];
            competidor[i] = competidor[minimo];
            competidor[minimo] = objeto_auxiliar;
        }
    }

    public void ordenar_id_mayor_menor() { // Método para ordenar los ID de mayor a menor
        Competidor objeto_auxiliar;
        for (int i = 0; i < competidor.length; i++) { //Metodo de Ordenamiento por Seleccion
            int mayor = i;
            for (int j = i + 1; j < competidor.length; j++) {
                if (competidor[j].getID() > competidor[mayor].getID()) {
                    mayor = j;
                }
            }
            objeto_auxiliar = competidor[i];
            competidor[i] = competidor[mayor];
            competidor[mayor] = objeto_auxiliar;
        }
    }

    public void ordenar_edad_menor_mayor() { // Metodo para ordenar a los competidores por edad de menor a mayor
        Competidor objeto_auxiliar;
        for (int i = 0; i < competidor.length; i++) { //Metodo de Ordenamiento por Seleccion
            int minimo = i;
            for (int j = i + 1; j < competidor.length; j++) {
                if (competidor[j].getEdad() < competidor[minimo].getEdad()) {
                    minimo = j;
                }
            }
            objeto_auxiliar = competidor[i];
            competidor[i] = competidor[minimo];
            competidor[minimo] = objeto_auxiliar;
        }
    }

    public void ordenar_edad_mayor_menor() { // Metodo para ordenar a los competidores por edad de mayor a menor
        Competidor objeto_auxiliar;
        for (int i = 0; i < competidor.length; i++) { //Metodo de Ordenamiento por Seleccion
            int mayor = i;
            for (int j = i + 1; j < competidor.length; j++) {
                if (competidor[j].getEdad() > competidor[mayor].getEdad()) {
                    mayor = j;
                }
            }
            objeto_auxiliar = competidor[i];
            competidor[i] = competidor[mayor];
            competidor[mayor] = objeto_auxiliar;
        }
    }

}
