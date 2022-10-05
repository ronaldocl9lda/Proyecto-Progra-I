
package logica;

// clase para generar las competencias .
public class GeneradorCompetencias {
    private Competidor competidores[];
    
    public GeneradorCompetencias(Competidor c[]) { // El método Constructor tendrá de parámetro un arreglo, que será el que
        this.competidores = c;                      //que creamos en la Clase Inscripcion para utilizar los mismos valores
    }

    public void tiempo_competencia1 () { // Gran Premio Mangos (Sede de Alajuela)
        for (int i = 0; i < competidores.length; i++) {
            int tiempo_carrera = (int) (Math.random() * 3001) + 3000; 
            competidores[i].setTiempo_competencia1(tiempo_carrera); // el tiempo obtenido se lo asigna por medio del set al Competidor
        }
    } 
    
    public String resultados_competencia1() { // Con este método, imprimiremos la cantidad de puntos que obtuvo el Competidor en la competencia 1
        int vueltas = (int)(Math.random() * 21) + 30;// genera aleatoriamente numeros 
        float conversion = Math.round(((vueltas * 8150) * 2.54 ) * 0.000010); //Formula para convertir de Pulgadas a Kilometros
        String mensaje = "Resultados de la competencia" + "\n" + "Gran Premio Mangos (Sede de Alajuela)" + "\nKilometros de la carrera: " + conversion +" KM \n\n";
        String hilera = ""; 
        Competidor objeto_auxiliar;
        int diferencia;
        for (int i = 0; i < competidores.length; i++) { //Metodo de Ordenamiento por Seleccion
            int minimo = i;
            for (int j = i+1; j < competidores.length; j++) {
                if (competidores[j].getTiempo_competencia1() < competidores[minimo].getTiempo_competencia1()) {
                    minimo = j;
                }
            }
            objeto_auxiliar = competidores[i];
            competidores[i] = competidores[minimo];
            competidores[minimo] = objeto_auxiliar;
        }
        for (int i = 0; i < competidores.length; i++) {
            if (i == 0) {
                hilera+= "Competidor ID: " + competidores[i].getID() + " Tiempo: " + competidores[i].getTiempo_competencia1() + "\n";
            }
            else {
                diferencia = competidores[i].getTiempo_competencia1() - competidores[0].getTiempo_competencia1();
                hilera+= "Competidor ID: " + competidores[i].getID() + " Tiempo: " + competidores[i].getTiempo_competencia1() + " Diferencia: " + diferencia +"\n";
            }
        }
        return mensaje + hilera;
    }
    
    public void tiempo_competencia2 () { //Tiempos de la Competencia Gran Premio Hato (Sede de Atenas)
        for (int i = 0; i < competidores.length; i++) {
            int tiempo_carrera = (int) (Math.random() * 3001) + 3000;
            competidores[i].setTiempo_competencia2(tiempo_carrera);
        }
    }
    
    public String resultados_competencia2() {
        int vueltas = (int)(Math.random() * 21) + 30; 
        float conversion = Math.round(((vueltas * 8150) * 2.54 ) * 0.000010); //Formula para convertir de Pulgadas a Kilometros
        String mensaje = "Resultados de la competencia" + "\n" + "Gran Premio Hato (Sede de Atenas)" + "\nKilometros de la carrera: " + conversion +" KM \n\n";
        String hilera = "";
        Competidor objeto_auxiliar;
        int diferencia;
        for (int i = 0; i < competidores.length; i++) { //Metodo de Ordenamiento por Seleccion
            int minimo = i;
            for (int j = i+1; j < competidores.length; j++) {
                if (competidores[j].getTiempo_competencia2() < competidores[minimo].getTiempo_competencia2()) {
                    minimo = j;
                }
            }
            objeto_auxiliar = competidores[i];
            competidores[i] = competidores[minimo];
            competidores[minimo] = objeto_auxiliar;
        }
        for (int i = 0; i < competidores.length; i++) {
            if (i == 0) {
                hilera+= "Competidor ID: " + competidores[i].getID() + " Tiempo: " + competidores[i].getTiempo_competencia2() + "\n";
            }
            else {
                diferencia = competidores[i].getTiempo_competencia2() - competidores[0].getTiempo_competencia2();
                hilera+= "Competidor ID: " + competidores[i].getID() + " Tiempo: " + competidores[i].getTiempo_competencia2() + " Diferencia: " + diferencia +"\n";
            }
        }
        return mensaje + hilera;
    }
    
    public void tiempo_competencia3 () { // Gran Premio Chuchecas (Sede de Puntarenas)
        for (int i = 0; i < competidores.length; i++) {
            int tiempo_carrera = (int) (Math.random() * 3001) + 3000;
            competidores[i].setTiempo_competencia3(tiempo_carrera);
        }
    }
    
    public String resultados_competencia3() {
        int vueltas = (int)(Math.random() * 21) + 30;
        float conversion = Math.round(((vueltas * 8150) * 2.54 ) * 0.000010); //Formula para convertir de Pulgadas a Kilometros
        
        String mensaje = "Resultados de la competencia" + "\n" + "Gran Premio Chuchecas (Sede de Puntarenas)" + "\nKilometros de la carrera: " + conversion +" KM \n\n";
        String hilera = "";
        Competidor objeto_auxiliar;
        int diferencia;
        for (int i = 0; i < competidores.length; i++) { //Metodo de Ordenamiento por Seleccion
            int minimo = i;
            for (int j = i+1; j < competidores.length; j++) {
                if (competidores[j].getTiempo_competencia3() < competidores[minimo].getTiempo_competencia3()) {
                    minimo = j;
                }
            }
            objeto_auxiliar = competidores[i];
            competidores[i] = competidores[minimo];
            competidores[minimo] = objeto_auxiliar;
        }
        for (int i = 0; i < competidores.length; i++) {
            if (i == 0) {
                hilera+= "Competidor ID: " + competidores[i].getID() + " Tiempo: " + competidores[i].getTiempo_competencia3() + "\n";
            }
            else {
                diferencia = competidores[i].getTiempo_competencia3() - competidores[0].getTiempo_competencia3();
                hilera+= "Competidor ID: " + competidores[i].getID() + " Tiempo: " + competidores[i].getTiempo_competencia3() + " Diferencia: " + diferencia +"\n";
            }
        }
        return mensaje + hilera;
    }
    
    public void tiempo_competencia4 () { // Gran Premio Ganaderos (Sede de San Carlos)
        for (int i = 0; i < competidores.length; i++) {
            int tiempo_carrera = (int) (Math.random() * 3001) + 3000;
            competidores[i].setTiempo_competencia4(tiempo_carrera);
        }
    }
    
    public String resultados_competencia4() {
        int vueltas = (int)(Math.random() * 21) + 30;
        float conversion = Math.round(((vueltas * 8150) * 2.54 ) * 0.000010); //Formula para convertir de Pulgadas a Kilometros
        String mensaje = "Resultados de la competencia\n" + "Gran Premio Ganaderos (Sede de San Carlos)" + "\nKilometros de la carrera: " + conversion +" KM \n\n";
        String hilera = "";
        Competidor objeto_auxiliar;
        int diferencia;
        for (int i = 0; i < competidores.length; i++) { //Metodo de Ordenamiento por Seleccion
            int minimo = i;
            for (int j = i+1; j < competidores.length; j++) {
                if (competidores[j].getTiempo_competencia4() < competidores[minimo].getTiempo_competencia4()) {
                    minimo = j;
                }
            }
            objeto_auxiliar = competidores[i];
            competidores[i] = competidores[minimo];
            competidores[minimo] = objeto_auxiliar;
        }
        for (int i = 0; i < competidores.length; i++) {
            if (i == 0) {
                hilera+= "Competidor ID: " + competidores[i].getID() + " Tiempo: " + competidores[i].getTiempo_competencia4() + "\n";
            }
            else {
                diferencia = competidores[i].getTiempo_competencia4() - competidores[0].getTiempo_competencia4();
                hilera+= "Competidor ID: " + competidores[i].getID() + " Tiempo: " + competidores[i].getTiempo_competencia4() + " Diferencia: " + diferencia +"\n";
            }
        }
        return mensaje + hilera;
    }
    
    public void tiempo_competencia5 () { //Gran Premio Pampa (Sede de Guanacaste)
        for (int i = 0; i < competidores.length; i++) {
            int tiempo_carrera = (int) (Math.random() * 3001) + 3000;
            competidores[i].setTiempo_competencia5(tiempo_carrera);
        }
    }
    
    public String resultados_competencia5() { // resultados 
        int vueltas = (int)(Math.random() * 21) + 30; 
        float conversion = Math.round(((vueltas * 8150) * 2.54 ) * 0.000010); //Formula para convertir de Pulgadas a Kilometros
        String mensaje = "Resultados de la competencia\n" + "Gran Premio Pampa (Sede de Guanacaste)" + "\nKilometros de la carrera: " + conversion +" KM \n\n";
        String hilera = "";
        Competidor objeto_auxiliar;
        int diferencia;
        for (int i = 0; i < competidores.length; i++) { //Metodo de Ordenamiento por Seleccion
            int minimo = i;
            for (int j = i+1; j < competidores.length; j++) {
                if (competidores[j].getTiempo_competencia5() < competidores[minimo].getTiempo_competencia5()) {
                    minimo = j;
                }
            }
            objeto_auxiliar = competidores[i];
            competidores[i] = competidores[minimo];
            competidores[minimo] = objeto_auxiliar;
        }
        for (int i = 0; i < competidores.length; i++) {
            if (i == 0) {
                hilera+= "Competidor ID: " + competidores[i].getID() + " Tiempo: " + competidores[i].getTiempo_competencia5() + "\n";
            }
            else {
                diferencia = competidores[i].getTiempo_competencia5() - competidores[0].getTiempo_competencia5();
                hilera+= "Competidor ID: " + competidores[i].getID() + " Tiempo: " + competidores[i].getTiempo_competencia5() + " Diferencia: " + diferencia +"\n";
            }
        }
        return mensaje + hilera;
    }

    
    
    public Competidor[] getCompetidores() { //Método Get del Arreglo 
        return competidores;
    }

    
}
