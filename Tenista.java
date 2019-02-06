
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
     * 
     */
    public String getNombre(){
        return nombre;
    }
    
    /**
     * 
     */
    public void setNombre(String nuevoNombre){
        nombre = nuevoNombre;
    }
    
    /**
     * 
     */
    public int getAnoNacimiento(){
        return anoNacimiento;
    }
    
    /**
     * 
     */
    public void setAnoNacimiento(int nuevoAnoNacimiento){
        anoNacimiento = nuevoAnoNacimiento;
    }
    
    /**
     * 
     */
    public boolean diestro(){
        return diestro;
    }
    
    /**
     * 
     */
    public void esDiestro(){
        diestro = false;
    }
    
    /**
     * 
     */
    public double getPeso(){
        return peso;
    }
    
    /**
     * 
     */
    public void setPeso(double nuevoPeso){
        peso = nuevoPeso;
    }
}
