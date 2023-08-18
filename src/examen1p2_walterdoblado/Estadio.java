
package examen1p2_walterdoblado;


public class Estadio {
    
    private String nombreEst;
        private String ciudad;
        private int capa;
        private Equipo equipo;

    public Estadio() {
    }

    public Estadio(String nombreEst, String ciudad, int capa, Equipo equipo) {
        this.nombreEst = nombreEst;
        this.ciudad = ciudad;
        this.capa = capa;
        this.equipo = equipo;
    }

    public Estadio(String nombreEst, String ciudad, int capa) {
        this.nombreEst = nombreEst;
        this.ciudad = ciudad;
        this.capa = capa;
    }

    public String getNombreEst() {
        return nombreEst;
    }

    public void setNombreEst(String nombreEst) {
        this.nombreEst = nombreEst;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getCapa() {
        return capa;
    }

    public void setCapa(int capa) {
        this.capa = capa;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return "Estadio{" + "nombreEst=" + nombreEst + ", ciudad=" + ciudad + ", capa=" + capa + ", equipo=" + equipo + '}';
    }
        
    
    
    
    
    
}
