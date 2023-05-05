package estructurado.iterativas;

import javax.sound.midi.Soundbank;

public class ManejadoPorContador {
    public static void main(String[] args) {
        
        int contador = 1;

        while (contador < 10){
            System.out.println("Hello! soy el numero " + contador);
            contador++;
        }

        do {
            System.out.println("Adios! soy el numero " + contador);
            contador --;

        }while (contador == 0);
        //Al ser false sale del while

        //En el unico caso que vamos a usar un do while es para un menu
        //de opciones como el que precede. 

        System.out.println("Seleccione una opción");
        String opcion = "4";

        do{
            //MEJORAR ESTO CON FOR 
            System.out.println("Opcion 1");
            System.out.println("Opcion 2");
            System.out.println("opcion 3");
            System.out.println("opcion 4");

            switch(opcion){
                case "1":
                case "2":
                case "3":
                case "4":
                    System.out.printf("Elegiste la opción %s!" ,opcion);
                    System.out.println("\n");

            }

        }while (opcion != "4");


    }
}
