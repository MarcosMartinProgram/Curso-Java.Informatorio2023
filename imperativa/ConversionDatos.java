package imperativa;

public class ConversionDatos {
    public static void main(String[] args) {
        //PROMOCIÓN 
        int value1 = 5;
        System.out.println("Valor por promoción" + value1);

        //CONTRACCIÓN
        int value2 = (int)5.23f; //Parsing
        System.out.println("Valor por contracción" + value2);

        //IMPLICITA
        double value3 = 10 + 20.5d;
        System.out.println("Valor por implicita" + value3);
        
    }
}
