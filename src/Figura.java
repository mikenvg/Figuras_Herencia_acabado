

public class Figura {
    public String color;
    public String nombre;
    public int posX;
    public int posY;


public Figura(String color, String nombre, int posX, int posY){
    this.color = color;
    this.nombre = nombre;
    this.posX = posX;
    this.posY = posY;
}

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    @Override
    public String toString() {
        return "Color: " + color + "\nNombre: " + nombre + "\nPosición X: " + posX + "\nPosición Y: " + posY;
    }

    public void calcularArea(int posX, int posY){

    }

    public void calcularPerimetro(int posX, int posY){

    }

    public void moverXY(int posX, int posY){

    }
}

