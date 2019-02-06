import java.util.ArrayList;
/**
 * Write a description of class Equipo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Equipo
{
    private ArrayList<Tenista> tenistas;
    private int numeroLicencia;

    /**
     * Constructor for objects of class Equipo
     */
    public Equipo()
    {
        tenistas = new ArrayList<Tenista>();
        numeroLicencia = 1;
    }

    /**
     *
     */
    public void agregarTenista(String nombre, int anoNacimiento, boolean diestro, double peso) {
        Tenista nuevoTenista = new Tenista(nombre, anoNacimiento, diestro, peso, numeroLicencia);
        tenistas.add(nuevoTenista);
        numeroLicencia ++;
    }

    /**
     *
     */
    public String getDatosTenista() {
        String aDevolver = "";
        for(Tenista tenistaActual : tenistas){
            aDevolver += tenistaActual.getDatosTenista() + "\n";
        }
        return aDevolver;
    }
}
