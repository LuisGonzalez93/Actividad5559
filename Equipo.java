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
     * Método 05.
     */
    public void agregarTenista(String nombre, int anoNacimiento, boolean diestro, double peso) {
        Tenista nuevoTenista = new Tenista(nombre, anoNacimiento, diestro, peso, numeroLicencia);
        tenistas.add(nuevoTenista);
        numeroLicencia ++;
    }

    /**
     * Método 06.
     */
    public String getDatosTenista() {
        String aDevolver = "";
        for(Tenista tenistaActual : tenistas){
            aDevolver += tenistaActual.getDatosTenista() + "\n";
        }
        return aDevolver;
    }

    /**
     * Método 07.
     */
    public String getTenistasPorAnoNacimiento() {
        ArrayList<Tenista> tenistaConAnoNacimiento = new ArrayList<Tenista> ();
        String textoADevolver = "";
        for(Tenista tenistaActual : tenistas) {
            tenistaConAnoNacimiento.add(tenistaActual);
        }
        int posicionAMirar = 0;
        while(posicionAMirar < tenistaConAnoNacimiento.size()) {
            int posicionMenor = posicionAMirar;
            int posicionPosibleMenor = posicionAMirar;
            int valorMaximoDeAno = 9999;
            while(posicionPosibleMenor < tenistaConAnoNacimiento.size()) {
                if (tenistaConAnoNacimiento.get(posicionPosibleMenor).getAnoNacimiento() < valorMaximoDeAno) {
                    posicionMenor = posicionPosibleMenor;
                    valorMaximoDeAno = tenistaConAnoNacimiento.get(posicionPosibleMenor).getAnoNacimiento();
                }
                posicionPosibleMenor ++;
            }
            Tenista tenistaTemporal = tenistaConAnoNacimiento.get(posicionAMirar);
            tenistaConAnoNacimiento.set(posicionAMirar, tenistaConAnoNacimiento.get(posicionMenor));
            tenistaConAnoNacimiento.set(posicionMenor, tenistaTemporal);
            posicionAMirar ++;
        }
        for(Tenista tenistaTemporal : tenistaConAnoNacimiento){
            textoADevolver += tenistaTemporal.getDatosTenista() + "\n";
        }
        return textoADevolver;
    }

    /**
     * Método 08.
     */
    public String getTenistasPorPeso(){
        ArrayList<Tenista> tenistaConPeso = new ArrayList<Tenista> ();
        String textoADevolver = "";
        for(Tenista tenistaActual : tenistas) {
            if(tenistaActual.diestro()){
                tenistaConPeso.add(tenistaActual);
            }
        }
        int posicionAMirar = 0;
        while(posicionAMirar < tenistaConPeso.size()) {
            int posicionMenor = posicionAMirar;
            int posicionPosibleMenor = posicionAMirar;
            double valorMaximoDePeso = 9999;
            while(posicionPosibleMenor < tenistaConPeso.size()) {
                if (tenistaConPeso.get(posicionPosibleMenor).getPeso() < valorMaximoDePeso) {
                    posicionMenor = posicionPosibleMenor;
                    valorMaximoDePeso = tenistaConPeso.get(posicionPosibleMenor).getPeso();
                }
                posicionPosibleMenor ++;
            }
            Tenista tenistaTemporal = tenistaConPeso.get(posicionAMirar);
            tenistaConPeso.set(posicionAMirar, tenistaConPeso.get(posicionMenor));
            tenistaConPeso.set(posicionMenor, tenistaTemporal);
            posicionAMirar ++;
        }
        for(Tenista tenistaTemporal : tenistaConPeso){
            textoADevolver += tenistaTemporal.getDatosTenista() + "\n";
        }
        return textoADevolver;
    }
}
