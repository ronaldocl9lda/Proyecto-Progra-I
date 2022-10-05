package logica;

//La función de esta clase es crear una plantilla que utilizaremos en la clase Resultados para obtener los resultados de las categorias,
//los equipos y por medio de arreglos de tipo Pantilla, utilizar el Metodo de Ordenamiento correspondiente para obtener
//los resultados en orden

public class Plantilla {
    private String texto;
    private int numero;

    public Plantilla(String texto, int numero) {
        this.texto = texto;
        this.numero = numero;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    
}

