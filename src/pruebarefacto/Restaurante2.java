package pruebarefacto;

public class Restaurante2 {

    private int kgPolbo;
    private int kgPatacas;

    public Restaurante2() {
        kgPolbo = 0;
        kgPatacas = 0;
    }

    public Restaurante2(int kgPolbo, int kgPatacas) {
        this.kgPolbo = kgPolbo;
        this.kgPatacas = kgPatacas;
    }

    public void setKgPolbo(int kgPolbo) {
        this.kgPolbo = kgPolbo;
    }

    public void setKgPatacas(int kgPatacas) {
        this.kgPatacas = kgPatacas;
    }

    public void engadirPolbo(int x) {
        kgPolbo = kgPolbo + x;
    }

    public void engadirPatacas(int x) {
        kgPatacas = kgPatacas + x;
    }

    public int amosarNumClientes() {
        int usarPolbo;
        usarPolbo = kgPolbo / 2;
        int numClientes;
        numClientes = Math.min(usarPolbo, kgPatacas) * 3;
        System.out.println("Se puede atender a " + numClientes + " clientes.");
        return numClientes;
    }

    public void amosarPolbo() {
        System.out.println("Hay " + kgPolbo + " kg de pulpo en el almacén.");
    }

    public void amosarPatacas() {
        System.out.println("Hay " + kgPatacas + " kg de patatas en el almacén.");
    }
}
