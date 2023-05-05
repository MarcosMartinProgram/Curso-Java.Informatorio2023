package desafios;

public class DesafioUno {
    public static void main(String[] args) {
        int edadCliente = 50;

        if(edadCliente < 13){
            System.out.println("Es un niño");
        }else if(edadCliente > 13 && edadCliente <=18){
            System.out.println("Es un adolescente");
        }else if(edadCliente > 18 && edadCliente <= 35){
            System.out.println("Es un adulto Joven");
        }else{
            System.out.println("Es un adulto");
        }
        

    }
}
