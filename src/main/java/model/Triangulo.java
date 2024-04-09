package model;

import javax.swing.*;

public class Triangulo extends FiguraGeometrica {

    private double base;
    private double altura;

    public Triangulo() {
        this("", 0, 0);
    }

    public Triangulo(String cor, double base, double altura) {
        super(cor);
        setBase(base);
        setAltura(altura);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setBase(String base) {
        this.base = Double.parseDouble(base);
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setAltura(String altura) {
        this.altura = Double.parseDouble(altura);
    }

    public void leitura() {
        super.leitura();
        setBase(JOptionPane.showInputDialog("Digite a base"));
        setAltura(JOptionPane.showInputDialog("Digite a altura"));
    }

}
