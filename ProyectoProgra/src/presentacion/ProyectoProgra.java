//Buenas Tardes Profesor, este es mi proyecto de Programación I

//Estudiante: Ronaldo Ulises Campos Lucas

package presentacion;

import logica.*;

public class ProyectoProgra {

    //Aqui abajo inicializamos las clases y despues las utilizaremos en otras ventanas por medio del import._____
    public static Competidor competidores = new Competidor();
    public static Inscripcion inscripcion1 = new Inscripcion();
    public static GeneradorCompetencias competencia = new GeneradorCompetencias(inscripcion1.getCompetidor());
    public static Resultados resultados = new Resultados(competencia.getCompetidores());

    // metodo main para poner visible el jFrm principal 
    public static void main(String[] args) {
        jFrmPrincipal ventana1 = new jFrmPrincipal();
        ventana1.setVisible(true);
        ventana1.setLocationRelativeTo(null);
    }
}
