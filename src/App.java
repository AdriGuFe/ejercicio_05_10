public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("""
                Este programa calcula la media de los números positivos introducidos.
                Para parar, introduzca un número negativo.
                Vaya introduciendo números.
                """);
        double num=0;
        double sumaNum=0;
        double contador=0;
        do{
            num = Double.parseDouble(System.console().readLine());
            contador++;
            sumaNum = sumaNum+num;
        }while(num>=0);
        
        System.out.printf("La media de los números positivos introducidos es %.2f",sumaNum/contador);
    }
}
