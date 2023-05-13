package modelo;

public class Coordenada {
        
        
        private double x;
        private double y;
 

        // Constructor por defecto
        public Coordenada() {
                //
                this.x = 0.0; 
                this.y = 0.0;
        }

        public Coordenada(double x, double y) { // Constructor con parámetros
                this.x = x; 
                this.y = y;
        }

        public double getX() {
                return x;
        }

        public double getY() {
                return y;
        }

        public void setX(double x) {
                this.x = x;
        }

        public void setY(double y) {
                this.y = y;
        }

        // Método para calcular la distancia entre dos coordenadas 
        public Double calcularDistancia(Object objeto) { // Objeto puede ser una coordenada o un punto
                Coordenada temporal = (Coordenada) objeto; 
                Double distanciaX = Math.abs(this.getX() - temporal.getX()); 
                Double distanciaY = Math.abs(this.getY() - temporal.getY());
                return Math.sqrt(Math.pow(distanciaY, 2) + Math.pow(distanciaX, 2)); // Teorema de Pitágoras
        }

        public String toString() {
                return "Coordenada: " + "(" + x + ", " + y + ")";
        }

        public boolean equals(Object objeto) {
                Coordenada temporal = (Coordenada) objeto; 
                return (this.x == temporal.x) && (this.y == temporal.y);
        }
}
