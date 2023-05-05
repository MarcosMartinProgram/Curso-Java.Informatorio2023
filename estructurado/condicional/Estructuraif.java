package estructurado.condicional;

public class Estructuraif {

    public static void main(String[] args) {
        int topScore = 80; 
        
        //Condicional simple
        if(topScore < 100){
            System.out.println("Esta condición se cumple ");
        }

        int secondScore = 60; 

        if(topScore > secondScore && topScore <= 90){
            System.out.println("Esto tambien se cumple ");
        }
        
        if(topScore < 90 || secondScore >= 100){
            System.out.println("secondScore >= 100 no se toca por cortocircuito");
        }
        


    }
    
}
