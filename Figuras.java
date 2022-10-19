import java.sql.SQLOutput;

public class Figuras {
    private String tipoFigura; //Cuadrado o Circulo
    private int dimension;
    private double area;

    public Figuras(String tipoFigura, int dimension) {
        this.tipoFigura = tipoFigura;
        this.dimension = dimension;
    }

    public String getTipoFigura() {
        return tipoFigura;
    }

    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    public String calcularArea() {
     if (this.dimension>0) {
         if (this.tipoFigura == "circulo") {
             area = (Math.PI * Math.pow(dimension, 2));
             System.out.println("El área del " + this.tipoFigura + " es de " + area + " unidades");
             return "El área del " + this.tipoFigura + " es de " + area + " unidades";
         } else if (this.tipoFigura == "cuadrado") {
             area = Math.pow(dimension, 2);
             System.out.println("El área del " + this.tipoFigura + " es de " + area + " unidades");
             return "El área del " + this.tipoFigura + " es de " + area + " unidades";
         }
         return String.valueOf(area);
     }
     else {
         if (this.tipoFigura=="circulo") {
             System.out.println("El valor del radio debe ser mayor que cero");
             return null;
         }
         else{
             System.out.println("El valor del lado debe ser mayor que cero");
             return null;
         }
     }

    }
}


