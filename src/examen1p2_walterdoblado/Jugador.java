
package examen1p2_walterdoblado;


public abstract class Jugador {
    protected String nombre;
    protected int edad;
    protected String nacio;
    protected String pieHabil;
    protected int rating;
    protected String equipo;
    
    protected int Agarre;
    protected int Lanzamiento;
    protected int Fisico;
    protected int Ritmo;
    protected int Entrada;
    protected int Vision;
    protected int Passing;
    protected int Regate;
    protected int Disparo;

    public Jugador(String nombre, int edad, String nacio, String pieHabil, int rating, String equipo, int Agarre, int Lanzamiento, int Fisico, int Ritmo, int Entrada, int Vision, int Passing, int Regate, int Disparo) {
        this.nombre = nombre;
        this.edad = edad;
        this.nacio = nacio;
        this.pieHabil = pieHabil;
        this.rating = rating;
        this.equipo = equipo;
        this.Agarre = Agarre;
        this.Lanzamiento = Lanzamiento;
        this.Fisico = Fisico;
        this.Ritmo = Ritmo;
        this.Entrada = Entrada;
        this.Vision = Vision;
        this.Passing = Passing;
        this.Regate = Regate;
        this.Disparo = Disparo;
    }

    public Jugador(String nombre, int edad, String nacio, String pieHabil, int rating) {
        this.nombre = nombre;
        this.edad = edad;
        this.nacio = nacio;
        this.pieHabil = pieHabil;
        this.rating = rating;
    }

    public Jugador() {
        
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
        return "Jugador   " + "  nombre=  " + nombre + ", edad=" + edad + ", nacio=" + nacio + ", pieHabil=" + pieHabil + ", rating=" + rating + ", equipo=" + equipo + ", Agarre=" + Agarre + ", Lanzamiento=" + Lanzamiento + ", Fisico=" + Fisico + ", Ritmo=" + Ritmo + ", Entrada=" + Entrada + ", Vision=" + Vision + ", Passing=" + Passing + ", Regate=" + Regate + ", Disparo=" + Disparo + '}';
    }
    
    public abstract void rating();
        
        
    
    
    
    
    
}
