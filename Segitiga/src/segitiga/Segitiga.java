/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package segitiga;

/**
 *
 * @author ctray
 */

public class Segitiga {

    private double alas;
    private double tinggi;
    private double sisi;

    public Segitiga() {}

    public Segitiga(double alasBaru, double tinggiBaru, double sisiBaru) {
        this.alas = alasBaru;
        this.tinggi = tinggiBaru;
        this.sisi = sisiBaru;
    }

    public double getLuas() {
        return 0.5 * alas * tinggi;
    }

    public double getKeliling() {
        return 3 * sisi; // Segitiga sama sisi
    }

    public void setAlas(double alasBaru) {
        this.alas = alasBaru;
    }

    public void setTinggi(double tinggiBaru) {
        this.tinggi = tinggiBaru;
    }

    public void setSisi(double sisiBaru) {
        this.sisi = sisiBaru;
    }

    public static void main(String[] args) {
        Segitiga segitiga1 = new Segitiga(1.0, 1.0, 1.0);
        Segitiga segitiga2 = new Segitiga(30.0, 10.0, 90.0);
        Segitiga segitiga3 = new Segitiga(20.0, 30.0, 60.0);

        System.out.println("Segitiga 1:");
        System.out.println("Luas: " + segitiga1.getLuas());
        System.out.println("Keliling: " + segitiga1.getKeliling());
        System.out.println();

        System.out.println("Segitiga 2:");
        System.out.println("Luas: " + segitiga2.getLuas());
        System.out.println("Keliling: " + segitiga2.getKeliling());
        System.out.println();

        System.out.println("Segitiga 3:");
        System.out.println("Luas: " + segitiga3.getLuas());
        System.out.println("Keliling: " + segitiga3.getKeliling());
    }
    
}
