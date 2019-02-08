import java.util.ArrayList;
import java.util.Iterator;
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
     * Agrega un nuevo tenista a la colección.
     */
    public void agregarTenista(String nombre, int anoNacimiento, boolean diestro, double peso) {
        Tenista nuevoTenista = new Tenista(nombre, anoNacimiento, diestro, peso, numeroLicencia);
        tenistas.add(nuevoTenista);
        numeroLicencia ++;
    }

    /**
     * Método 06.
     * Devuelve los datos del tenista, cada tenista en una línea.
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
     * Salen ordenados los tenistas por su año de nacimiento.
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
     * Salen los tenistas ordenados por peso, con la condición de que sean
     * diestros.
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

    /**
     * Método 09.
     * Modifica el peso indicando su número de licencia.
     */
    public void setPesoActual(int numeroLicencia, double peso){
        int contador = 0;
        boolean buscando = true;
        while(contador < tenistas.size() && buscando){
            if(tenistas.get(contador).getId() == numeroLicencia){
                tenistas.get(contador).setPeso(peso);
                buscando = false;
            }
            contador ++;
        }
    }

    /**
     * Método 10.
     * Elimina un tenista cuando su año de nacimiento es menor a 1981.
     */
    public void eliminaTenista(){
        Iterator <Tenista> it=tenistas.iterator();
        while(it.hasNext()){
            Tenista tenistaAEliminar = it.next();
            if(tenistaAEliminar.getAnoNacimiento() > 0 && tenistaAEliminar.getAnoNacimiento() < 1981){
                it.remove();
            }
        }
    }
}
