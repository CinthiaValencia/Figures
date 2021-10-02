package edu.uaslp.parcial2.figuras;

public abstract class Figura
{
    private String name;

    Figura(String name){
        this.name = name;
    }

    // Método concreto
    public String getName() {
        return name;
    }

    // Métodos abstractos
    public abstract void draw();
}
