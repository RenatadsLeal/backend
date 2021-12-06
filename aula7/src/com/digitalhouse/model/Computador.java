package com.digitalhouse.model;

public class Computador {
    private Integer ram;
    private Integer hd;
    private static Integer contador = 0;

    public Computador(Integer ram, Integer hd) {
        this.ram = ram;
        this.hd = hd;
        contador++;
        System.out.println("Contador: " + contador);
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public Integer getHd() {
        return hd;
    }

    public void setHd(Integer hd) {
        this.hd = hd;
    }

    @Override
    public String toString() {
        return "Computador{" +
                "ram=" + ram +
                ", hd=" + hd +
                '}';
    }
}
