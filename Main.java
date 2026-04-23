import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Peso do drone em Kg: ");
        double pesodrone = teclado.nextDouble();
        System.out.println("coordenada x: ");
        int x = teclado.nextInt();
        System.out.println("coordenada y: ");
        int y = teclado.nextInt();
        System.out.println("Peso da carga em Kg: ");
        double pesocarga = teclado.nextDouble();
        System.out.println("Porcentagem da bateria do drone: ");
        int bateria = teclado.nextInt();
        if (x < 10 || x > 50 || y < 10 || y > 80) {
            System.out.println("Entrega Negada: Destino fora da área de cobertura.");
        }
        else if (pesocarga > (pesodrone*0.10)){
            System.out.println("Entrega Negada: Peso da carga excede o limite técnico.");
        }
        else if((x>40 || y>70) && bateria<50){
            System.out.println("Entrega negada: Sem bateria suficiente.");

          }
        else if(bateria<20){
            System.out.println("Entrega negada: Sem bateria suficiente.");

        }
        else {
            System.out.println("Entrega Autorizada!");
        }
        }
        }