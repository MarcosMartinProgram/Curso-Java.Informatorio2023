package estructurado.condicional;

import javax.sound.midi.Soundbank;

public class EstructuraSwitch {
    public static void main(String[] args) {
        String curso = "Java";

        final String MENSAJE_BIENVENIDA = "Bienvenido al curso de ";
        final String CURSO_DE_PYTHON = "Python";
        final String CURSO_DE_JAVA = "Java"; 
        final String CURSO_DE_TESTING = "Testing"; 

        switch (curso){
            case CURSO_DE_PYTHON:
                System.out.println(MENSAJE_BIENVENIDA + CURSO_DE_PYTHON);
                System.out.println("Que te diviertas ");
                break;
            case CURSO_DE_JAVA:
                System.out.println(MENSAJE_BIENVENIDA + CURSO_DE_JAVA);
                break;
            case CURSO_DE_TESTING:
                System.out.println(MENSAJE_BIENVENIDA + CURSO_DE_TESTING);
                break;
            default:
                System.out.println("El Curso ingrersado no existe");
        }
    }
}
