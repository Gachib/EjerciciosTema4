public class Main {
    public static void main(String[] args){
        // 1)
        int numeroIf = -3;
        if (numeroIf > 0){
            System.out.println("El numero " + numeroIf + " es positivo");
        } else if (numeroIf < 0) {
            System.out.println("El numero " + numeroIf + " es negativo");
        } else {
            System.out.println("El numero es 0");
        }

        //2)
        int numeroWhile = 0;
        while (numeroWhile < 3){
            System.out.println("Bucle while: " +numeroWhile);
            numeroWhile++;
        }

        //3)
        int numeroDoWhile = 0;
        do {
            System.out.println("Bucle do while: " + numeroDoWhile);
            numeroDoWhile++;
        } while (numeroDoWhile<1);

        //4)
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println("Bucle for: " + numeroFor);
        }

        //5)
        var estacion = "verano";

        switch (estacion){
            case "verano":
                System.out.println("Estas en verano");
                break;
            case "invierno":
                System.out.println("Estas en invierno");
                break;
            case "otoño":
                System.out.println("Estas en otoño");
                break;
            case "primavera":
                System.out.println("Estas en primavera");
                break;
            default:
                System.out.println("No estas en ninguna estacion");
        }
    }
}