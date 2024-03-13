public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(2.0);
        Retangulo retangulo = new Retangulo(3.0, 4.0);
        Triangulo triangulo = new Triangulo(3.0, 4.0);

        System.out.println("Area do circulo: " + circulo.calcularArea());
        System.out.println("Area do retangulo: " + retangulo.calcularArea());
        System.out.println("Area do triangulo: " + triangulo.calcularArea());
    }
}