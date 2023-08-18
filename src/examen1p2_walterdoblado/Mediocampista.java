
package examen1p2_walterdoblado;

import java.util.ArrayList;
import java.util.Random;


public class Mediocampista extends Jugador{
        Random ram = new Random();
    public Mediocampista(String nombre, int edad, String nacio, String pieHabil, int rating, Equipo equipo, int Agarre, int Lanzamiento, int Fisico, int Ritmo, int Entrada, int Vision, int Passing, int Regate, int Disparo) {
        super(nombre, edad, nacio, pieHabil, rating, equipo, Agarre, Lanzamiento, Fisico, Ritmo, Entrada, Vision, Passing, Regate, Disparo);
    }

    public Mediocampista(String nombre, int edad, String nacio, String pieHabil, int rating) {
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

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
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
        return "Mediocampista{" + '}';
    }
    
    
      public void rating() {

        int opc = 0;
        int s;
         int opc1 = 0;
        ArrayList d = new ArrayList();
        while (opc != 3) {

            d.add(s = 1 + ram.nextInt(12));
            opc++;

        }
           ArrayList dd = new ArrayList();
        while (opc1 != 6) {

            dd.add(s = 1 + ram.nextInt(5));
            opc++;

        }
        /////////////////////
        while (Agarre >= 70 && Agarre <= 100) {

            int Agarre1 = (Integer) dd.get(1);

            Agarre = Agarre1 * 13;

        }

        this.Agarre = Agarre;
        
        
        while (Lanzamiento >= 70 && Lanzamiento <= 100) {

            int Lanzamiento1 = (Integer) dd.get(2);

            Lanzamiento = Lanzamiento1 * 13;

        }
        this.Lanzamiento = Lanzamiento;
        
        
        while (Fisico >= 70 && Fisico <= 100) {

            int Fisico1 = (Integer) dd.get(3);

            Fisico = Fisico1 * 13;

        }
        this.Fisico = Fisico;
        
          while (Ritmo >= 70 && Ritmo <= 100) {

            int Ritmo1 = (Integer) dd.get(4);

            Ritmo = Ritmo1 * 13;

        }
          this.Ritmo = Ritmo;
          while (Entrada >= 70 && Entrada <= 100) {

            int Entrada1 = (Integer) dd.get(5);

            Entrada = Entrada1 * 13;

        } 
          this.Entrada =Entrada;
          
               while (Vision >= 70 && Vision <= 100) {

            int Vision1 = (Integer) dd.get(6);

            Vision = Vision1 * 13;

        } 
          this.Vision =Vision;
         while (Passing >= 70 && Passing <= 100) {

            int Passing1 = (Integer) d.get(1);

            Passing = Passing1 * 12;

        }

        this.Passing = Passing;
        
               while (Regate >= 70 && Regate <= 100) {

            int Regate1 = (Integer) d.get(2);

            Regate = Regate1 * 12;

        } 
          this.Regate =Regate;
          
           while (Disparo >= 70 && Disparo <= 100) {

            int Disparo1 = (Integer) d.get(3);

            Disparo = Disparo1 * 12;

        } 
          this.Disparo =Disparo;
          
        
        
    }
    
    
    
    
}
