import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a coordenada x do primeiro ponto: ");
        double x1 = scanner.nextDouble();

        System.out.print("Digite a coordenada y do primeiro ponto: ");
        double y1 = scanner.nextDouble();

        System.out.print("Digite a coordenada x do segundo ponto: ");
        double x2 = scanner.nextDouble();

        System.out.print("Digite a coordenada y do segundo ponto: ");
        double y2 = scanner.nextDouble();

        Ponto p1 = new Ponto(x1, y1);
        Ponto p2 = new Ponto(x2, y2);

        double distance = p1.distance(p2);

        System.out.printf("A distância entre os dois pontos é: %.2f\n", distance);
    }
}