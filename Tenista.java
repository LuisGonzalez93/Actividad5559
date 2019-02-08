
/**
 * Write a description of class Tenista here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tenista
{
    // instance variables - replace the example below with your own
    private String nombre;
    private int anoNacimiento;
    private boolean diestro;
    private double peso;
    private int numeroLicencia;

    /**
     * Constructor for objects of class Tenista
     */
    public Tenista(String nombre, int anoNacimiento, boolean diestro, double peso, int numeroLicencia)
    {
        this.nombre = nombre;
        this.anoNacimiento = anoNacimiento;
        this.diestro = diestro;
        this.peso = peso;
        this.numeroLicencia = numeroLicencia;
    }

    /**
     * Devuelve el nombre del tenista.
     */
    public String getNombre(){
        return nombre;
    }

    /**
     * Cambia el nombre del tenista.
     */
    public void setNombre(String nuevoNombre){
        nombre = nuevoNombre;
    }

    /**
     * Devuelve el año de nacimiento del tenista.
     */
    public int getAnoNacimiento(){
        return anoNacimiento;
    }

    /**
     * Cambia el año de nacimiento del tenista.
     */
    public void setAnoNacimiento(int nuevoAnoNacimiento){
        anoNacimiento = nuevoAnoNacimiento;
    }

    /**
     * Devuelve si es diestro el tenista.
     */
    public boolean diestro(){
        return diestro;
    }

    /**
     * Cambia a no diestro el tenista.
     */
    public void esDiestro(){
        diestro = false;
    }

    /**
     * Devuelve el peso del tenista.
     */
    public double getPeso(){
        return peso;
    }

    /**
     * Cambia el peso del tenista.
     */
    public void setPeso(double nuevoPeso){
        peso = nuevoPeso;
    }
    
    /**
     * Devuelve el numero de licencia
     */
    public int getId(){
        return numeroLicencia;
    }

    /**
     * Devuelve los datos del tenista, cuando es diestro aparece diestro y
     * cuando no es diestro aparece zurdo.
     */
    public String getDatosTenista(){
        String aDevolver = "" + nombre + ", " + anoNacimiento + ", ";
        if(diestro){
            aDevolver += "diestro";
        }
        else{
            aDevolver += "zurdo";
        }
        aDevolver += ", " + peso + ", " + numeroLicencia;
        return aDevolver;
    }   
}
