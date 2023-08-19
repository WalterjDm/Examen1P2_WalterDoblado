
package examen1p2_walterdoblado;

import java.util.ArrayList;


public class Equipo {
    
    private String nombreEqui;
    private String pais;
    private int ratingEqui;
    ArrayList<Jugador> plantilla = new ArrayList();

    public Equipo(String nombreEqui, String pais, int ratingEqui) {
        this.nombreEqui = nombreEqui;
        this.pais = pais;
        this.ratingEqui = ratingEqui;
    }

    public String getNombreEqui() {
        return nombreEqui;
    }

    public void setNombreEqui(String nombreEqui) {
        this.nombreEqui = nombreEqui;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getRatingEqui() {
        return ratingEqui;
    }

    public void setRatingEqui(int ratingEqui) {
       
        this.ratingEqui = ratingEqui;
        
    }

    public ArrayList<Jugador> getPlantilla() {
        return plantilla;
    }

    public void setPlantilla(ArrayList<Jugador> plantilla) {
         if(plantilla.size() <=4){
             int cont = 0;
        this.plantilla = plantilla;
             if (plantilla.size()==3) {
                
                 for (int i = 0; i < plantilla.size(); i++) {
                     
                     
                     
                     ratingEqui += plantilla.get(i).getRating();
                     
                 }
                
                 this.setRatingEqui(ratingEqui);
                 
             }
        }
     
    }

    @Override
    public String toString() {
        return "Equipo"
                + "\n" + "nombre :" + nombreEqui + ""
                + "\n pais: " + pais + ""
                + "\n rating:" + ratingEqui + ""
                + "\n plantilla=" + plantilla ;
    }
    
    
    
    
}
