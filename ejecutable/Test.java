package ejecutable;

import modelo.Coordenada;

public class Test {
    public static void main(String[] args) {
        Coordenada c1 = new Coordenada();
        System.out.println(c1.toString());

        Coordenada c2 = new Coordenada(1.3, 5.3);
        System.out.println(c2.toString());

        Coordenada c3 = c1;
        System.out.println(c3.toString());

        Coordenada c4 = c2;
        System.out.println(c4.toString());

        if (c1.equals(c2)) {
            System.out.println("Las coordenadas son ¡inguales!");
        } else {
            System.out.println("Las coordenadas son ¡diferentes!");
        }

        System.out.println("La distancia total es de: " + String.format("%.4f", c1.calcularDistancia(c2)));
    }
}
