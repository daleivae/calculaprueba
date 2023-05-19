package main.java;

public class CalculadoraFinanciera {
    public double calcularInteresSimple(double capital, double tasa, int periodo) {
        return capital * tasa * periodo;
    }
    
    public double calcularInteresCompuesto(double capital, double tasa, int periodo) {
        return capital * Math.pow((1 + tasa), periodo);
    }
    
    public double calcularAmortizacion(double capital, double tasa, int periodo) {
        return capital * tasa / (1 - Math.pow((1 + tasa), -periodo));
    }
    
    public double calcularTasaEfectiva(double tasaNominal, int frecuencia) {
        return Math.pow((1 + tasaNominal / frecuencia), frecuencia) - 1;
    }
    
    // Otros métodos y funcionalidades de la calculadora financiera
}
