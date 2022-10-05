package logica;

import static logica.Categoria.*;
import static logica.Equipos.*;

// clase para generar los resultados de las competencias 
public class Resultados {
    private Competidor comp_resultados[];
    Plantilla arregloCategoria[] = new Plantilla [5]; //Arreglo que utilizaremos para ordenar los ganadores por categoria
    Plantilla arregloEquipos[] = new Plantilla [4]; //Arreglos que utilizaremos para ordenar los ganadores por equipo
    
    public Resultados (Competidor c[]) { // Metodo constructor que recibe como parametro el arreglo que se ha estado trabajando
        this.comp_resultados = c;
    }
    
    public void ordenar_casificacion_general () {  
       Competidor objeto_auxiliar;
       for (int i = 0; i < comp_resultados.length; i++) { //Metodo de Ordenamiento por Seleccion
            int minimo = i;
            for (int j = i+1; j < comp_resultados.length; j++) {
                if (comp_resultados[j].resultados_totales() < comp_resultados[minimo].resultados_totales()) {
                    minimo = j;
                }
            }
            objeto_auxiliar = comp_resultados[i];
            comp_resultados[i] = comp_resultados[minimo];
            comp_resultados[minimo] = objeto_auxiliar;
        }
    }
    
    public String clasificacion_general () {
        String hilera = "\nClasificacion General\n\n";
        int diferencia;
        for (int i = 0; i < this.comp_resultados.length; i++) {
            if (i == 0) {
                hilera+= "Competidor ID: " + this.comp_resultados[i].getID() + " Tiempo: " + this.comp_resultados[i].resultados_totales() + "\n";
            }
            else {
                diferencia = this.comp_resultados[i].resultados_totales() - this.comp_resultados[0].resultados_totales();
                hilera+= "Competidor ID: " + this.comp_resultados[i].getID() + " Tiempo: " + this.comp_resultados[i].resultados_totales() +" Diferencia:" + diferencia + "\n";                                     
            }
        }
        return hilera;
    }
     //por categorias 
    public String clasificacion_categoria () {
        Plantilla objeto_auxiliar;
        String hilera = "";
        int tiempo_juvenil = 0, tiempo_adulto = 0, tiempo_adulto_mayor = 0, tiempo_veterano = 0, tiempo_oro = 0, diferencia;
        
        for (int i = 0; i < this.comp_resultados.length; i++) {
            if (comp_resultados[i].getCategoria() == JUVENIL) {
                tiempo_juvenil = tiempo_juvenil + comp_resultados[i].resultados_totales();
            }
            if (comp_resultados[i].getCategoria() == ADULTO) {
                tiempo_adulto = tiempo_adulto + comp_resultados[i].resultados_totales();
            }
            if (comp_resultados[i].getCategoria() == ADULTO_MAYOR) {
                tiempo_adulto_mayor = tiempo_adulto_mayor + comp_resultados[i].resultados_totales();
            }
            if (comp_resultados[i].getCategoria() == VETERANO) {
                tiempo_veterano = tiempo_veterano + comp_resultados[i].resultados_totales();
            }
            if (comp_resultados[i].getCategoria() == ORO) {
                tiempo_oro = tiempo_oro + comp_resultados[i].resultados_totales();
            }
        }
        arregloCategoria[0] = new Plantilla ("CATEGORÍA JUVENIL",tiempo_juvenil);
        arregloCategoria[1] = new Plantilla ("CATEGORÍA ADULTO",tiempo_adulto);
        arregloCategoria[2] = new Plantilla ("CATEGORÍA ADULTO_MAYOR",tiempo_adulto_mayor);
        arregloCategoria[3] = new Plantilla ("CATEGORÍA VETERANO",tiempo_veterano);
        arregloCategoria[4] = new Plantilla ("CATEGORÍA ORO",tiempo_oro);
        for (int i = 0; i < arregloCategoria.length; i++) { //Metodo de Ordenamiento por Seleccion
            int minimo = i;
            for (int j = i+1; j < arregloCategoria.length; j++) {
                if (arregloCategoria[j].getNumero()< arregloCategoria[minimo].getNumero()) {
                    minimo = j;
                }
            }
            objeto_auxiliar = arregloCategoria[i];
            arregloCategoria[i] = arregloCategoria[minimo];
            arregloCategoria[minimo] = objeto_auxiliar;
        }
        for (int i = 0; i < arregloCategoria.length; i++) {
            if (i == 0) {
                hilera += "\n" + arregloCategoria[i].getTexto() + "\nTiempo: " + arregloCategoria[i].getNumero() + "\n";
            } 
            else {
                diferencia = arregloCategoria[i].getNumero() - arregloCategoria[0].getNumero();
                hilera += "\n" + arregloCategoria[i].getTexto() + "\nTiempo: " + arregloCategoria[i].getNumero() + "\nDiferencia: " + diferencia + "\n";
            }
        }
        return hilera;
    }
    
    public String clasificacion_equipos () {
        int tiempo_rapidos_furiosos = 0, tiempo_velocidad_total = 0, tiempo_prudencia = 0, tiempo_prudencia_total = 0, diferencia;
        Plantilla objeto_auxiliar;
        String hilera = "";
        
        for (int i = 0; i < this.comp_resultados.length; i++) {
            if (comp_resultados[i].getEquipo() == Rapidos_y_Furiosos) {
                tiempo_rapidos_furiosos = tiempo_rapidos_furiosos + comp_resultados[i].resultados_totales();
            }
            if (comp_resultados[i].getEquipo() == Velocidad_Total) {
                tiempo_velocidad_total = tiempo_velocidad_total + comp_resultados[i].resultados_totales();
            }
            if (comp_resultados[i].getEquipo() == Prudencia) {
                tiempo_prudencia = tiempo_prudencia + comp_resultados[i].resultados_totales();
            }
            if (comp_resultados[i].getEquipo() == Prudencia_Total) {
                tiempo_prudencia_total = tiempo_prudencia_total + comp_resultados[i].resultados_totales();
            }
        }
        arregloEquipos[0] = new Plantilla ("Equipo Rapidos y Furiosos",tiempo_rapidos_furiosos);
        arregloEquipos[1] = new Plantilla ("Equipo Velocidad Total",tiempo_velocidad_total);
        arregloEquipos[2] = new Plantilla ("Equipo Prudencia",tiempo_prudencia);
        arregloEquipos[3] = new Plantilla ("Equipo Prudencia Total",tiempo_prudencia_total);
        for (int i = 0; i < arregloEquipos.length; i++) { //Metodo de Ordenamiento por Seleccion
            int minimo = i;
            for (int j = i+1; j < arregloEquipos.length; j++) {
                if (arregloEquipos[j].getNumero()< arregloEquipos[minimo].getNumero()) {
                    minimo = j;
                }
            }
            objeto_auxiliar = arregloEquipos[i];
            arregloEquipos[i] = arregloEquipos[minimo];
            arregloEquipos[minimo] = objeto_auxiliar;
        }
        for (int i = 0; i < arregloEquipos.length; i++) {
            if (i == 0) {
                hilera += "\n " + arregloEquipos[i].getTexto() + "\nTiempo: " + arregloEquipos[i].getNumero() + "\n";
            } 
            else {
                diferencia = arregloEquipos[i].getNumero() - arregloEquipos[0].getNumero();
                hilera += "\n" + arregloEquipos[i].getTexto() + "\nTiempo: " + arregloEquipos[i].getNumero() + "\nDiferencia: " + diferencia + "\n";
            }
        }
        return hilera;
    }
    // toString queimprimira los ganadores 
    public String imprimir_ganadores() {
        return "\nGanador de la Clasificación General\nCompetidor: " + comp_resultados[0].getID() + " Edad: " + comp_resultados[0].getEdad() + " Tiempo: " + comp_resultados[0].resultados_totales() + "\n" +
                "\nCategoría ganadora\n" + arregloCategoria[0].getTexto() + " Tiempo: " + arregloCategoria[0].getNumero() + "\n" +
                "\nEquipo Ganador\n" + arregloEquipos[0].getTexto() + " Tiempo : " + arregloEquipos[0].getNumero();
    }
    
}
