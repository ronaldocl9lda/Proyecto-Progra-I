package logica;

import static logica.Categoria.*;
import static logica.Equipos.*;
//clase competidor que asignara la categoria , la edad y el idey los equipos .

public class Competidor {

    private int edad;
    private int ID;
    private Categoria categoria;
    private Equipos equipo;

    private int tiempo_competencia1; //Los competidores tendrán de atributo la cantidad de puntos que obtienen en cada competición
    private int tiempo_competencia2;
    private int tiempo_competencia3;
    private int tiempo_competencia4;
    private int tiempo_competencia5;

    public Competidor() { //Abre Constructor
        this.edad = (int) (Math.random() * 63) + 18; //Asignar Edad aleatoria entre los 18 y 80 años

        if (this.edad >= 18 && this.edad <= 25) {  //Asignar Categoria de acuerdo a la edad
            this.categoria = JUVENIL;
        } else {
            if (this.edad > 25 && this.edad <= 35) {
                this.categoria = ADULTO;
            } else {
                if (this.edad > 35 && this.edad <= 45) {
                    this.categoria = ADULTO_MAYOR;
                } else if (this.edad > 45 && this.edad <= 55) {
                    this.categoria = VETERANO;
                } else {
                    if (this.edad > 55) {
                        this.categoria = ORO;
                    }
                }
            }
        }

        if (this.edad >= 18 && this.edad <= 20) { // Asignar Equipo de Acuerdo a la Edad
            this.equipo = Rapidos_y_Furiosos;
        } else {
            if (this.edad >= 21 && this.edad <= 30) {
                this.equipo = Velocidad_Total;
            } else {
                if (this.edad >= 31 && this.edad <= 45) {
                    this.equipo = Prudencia;
                } else {
                    if (this.edad >= 46) {
                        this.equipo = Prudencia_Total;
                    }
                }
            }
        }

    } //Cierra Constructor

    @Override
    public String toString() { //Metodo toString para imprimir la información del competidor
        return "\nCompetidor ID: " + this.ID + " Edad: " + this.edad + " Categoria: " + this.categoria;
    }

    public int resultados_totales() { //El Competidor tendrá de método, la suma de sus resultados en las competencias
        int suma = this.tiempo_competencia1 + this.tiempo_competencia2 + this.tiempo_competencia3 + this.tiempo_competencia4 + this.tiempo_competencia5;
        return suma;
    }

    //Abajo están los SET y GET de los atributos
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Equipos getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipos equipo) {
        this.equipo = equipo;
    }

    public int getTiempo_competencia1() {
        return tiempo_competencia1;
    }

    public void setTiempo_competencia1(int tiempo_competencia1) {
        this.tiempo_competencia1 = tiempo_competencia1;
    }

    public int getTiempo_competencia2() {
        return tiempo_competencia2;
    }

    public void setTiempo_competencia2(int tiempo_competencia2) {
        this.tiempo_competencia2 = tiempo_competencia2;
    }

    public int getTiempo_competencia3() {
        return tiempo_competencia3;
    }

    public void setTiempo_competencia3(int tiempo_competencia3) {
        this.tiempo_competencia3 = tiempo_competencia3;
    }

    public int getTiempo_competencia4() {
        return tiempo_competencia4;
    }

    public void setTiempo_competencia4(int tiempo_competencia4) {
        this.tiempo_competencia4 = tiempo_competencia4;
    }

    public int getTiempo_competencia5() {
        return tiempo_competencia5;
    }

    public void setTiempo_competencia5(int tiempo_competencia5) {
        this.tiempo_competencia5 = tiempo_competencia5;
    }

}
