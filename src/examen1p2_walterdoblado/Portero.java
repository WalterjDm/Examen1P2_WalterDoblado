package examen1p2_walterdoblado;

import java.util.ArrayList;
import java.util.Random;

public class Portero extends Jugador {

    Random ram = new Random();

    public Portero(String nombre, int edad, String nacio, String pieHabil, int rating, String equipo, int Agarre, int Lanzamiento, int Fisico, int Ritmo, int Entrada, int Vision, int Passing, int Regate, int Disparo) {
        super(nombre, edad, nacio, pieHabil, rating, equipo, Agarre, Lanzamiento, Fisico, Ritmo, Entrada, Vision, Passing, Regate, Disparo);
    }

    public Portero(String nombre, int edad, String nacio, String pieHabil, int rating) {
        super(nombre, edad, nacio, pieHabil, rating);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNacio() {
        return nacio;
    }

    public void setNacio(String nacio) {
        this.nacio = nacio;
    }

    public String getPieHabil() {
        return pieHabil;
    }

    public void setPieHabil(String pieHabil) {
        this.pieHabil = pieHabil;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public int getAgarre() {
        return Agarre;
    }

    public void setAgarre(int Agarre) {

        this.Agarre = Agarre;
    }

    public int getLanzamiento() {
        return Lanzamiento;
    }

    public void setLanzamiento(int Lanzamiento) {
        this.Lanzamiento = Lanzamiento;
    }

    public int getFisico() {
        return Fisico;
    }

    public void setFisico(int Fisico) {
        this.Fisico = Fisico;
    }

    public int getRitmo() {
        return Ritmo;
    }

    public void setRitmo(int Ritmo) {
        this.Ritmo = Ritmo;
    }

    public int getEntrada() {
        return Entrada;
    }

    public void setEntrada(int Entrada) {
        this.Entrada = Entrada;
    }

    public int getVision() {
        return Vision;
    }

    public void setVision(int Vision) {
        this.Vision = Vision;
    }

    public int getPassing() {
        return Passing;
    }

    public void setPassing(int Passing) {
        this.Passing = Passing;
    }

    public int getRegate() {
        return Regate;
    }

    public void setRegate(int Regate) {
        this.Regate = Regate;
    }

    public int getDisparo() {
        return Disparo;
    }

    public void setDisparo(int Disparo) {
        this.Disparo = Disparo;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Portero";
    }

    public void rating() {

        int opc = 0;
        int s;

        while (opc != 9) {

            s = ram.nextInt(100);
            opc++;

        }

    }

}
