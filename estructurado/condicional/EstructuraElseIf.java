package estructurado.condicional;

public class EstructuraElseIf {
    public static void main(String[] args) {

        boolean esUnDiaLluvioso = true;

        final String DAY = " Lunes"; 

        if(esUnDiaLluvioso){
            System.out.println("Hoy es : " + DAY + " y esta lloviendo");

        }else{
            System.out.println("Hoy es : " + DAY + " Y no está lloviendo");
        }

        System.out.println("Esto es un codigo extra");

        if(esUnDiaLluvioso && DAY == "martes"){
            System.out.println("Hoy es : " + DAY + " Y está lloviendo");

        }else if(esUnDiaLluvioso == false){
            System.out.println("Hoy es : " + DAY + " Y no esta lloviendo");

        }else{
            System.out.println("Hoy es martes por lo que no tenemos informacion del clima");
        } 

        
    }
}
