
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class EquipoTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class EquipoTest
{
    /**
     * Default constructor for test class EquipoTest
     */
    public EquipoTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testGetAgregarTenista()
    {
        Equipo equipo1 = new Equipo();
        equipo1.agregarTenista("Roger", 1980, true, 79.2);
    }

    @Test
    public void tesGetDevolverDatos()
    {
        Equipo equipo1 = new Equipo();
        assertEquals("", equipo1.getDatosTenista());
        equipo1.agregarTenista("Roger", 1980, true, 79.2);
        assertEquals("Roger, 1980, diestro, 79.2, 1\n", equipo1.getDatosTenista());
    }

    @Test
    public void testOrdenarPorAnoNacimiento()
    {
        Equipo equipo1 = new Equipo();
        assertEquals("", equipo1.getTenistasPorAnoNacimiento());

        equipo1.agregarTenista("Pepe", 2010, false, 82.5);
        equipo1.agregarTenista("Nole", 1990, true, 79);
        equipo1.agregarTenista("Roger", 1980, true, 79.2);
        equipo1.agregarTenista("Rafa", 1982, false, 82.5);
        equipo1.agregarTenista("Miguel", 2000, false, 82.5);
        equipo1.agregarTenista("Izan", 1985, true, 79);
        equipo1.agregarTenista("Alejandro", 1983, true, 79.2);
        equipo1.agregarTenista("Francisco", 1995, false, 82.5);

        assertEquals("Roger, 1980, diestro, 79.2, 3\nRafa, 1982, zurdo, 82.5, 4\nAlejandro, 1983, diestro, 79.2, 7\nIzan, 1985, diestro, 79.0, 6\nNole, 1990, diestro, 79.0, 2\nFrancisco, 1995, zurdo, 82.5, 8\nMiguel, 2000, zurdo, 82.5, 5\nPepe, 2010, zurdo, 82.5, 1\n", equipo1.getTenistasPorAnoNacimiento());
    }

    @Test
    public void testOrdenarPorPeso()
    {
        Equipo equipo1 = new Equipo();
        assertEquals("", equipo1.getTenistasPorPeso());
        equipo1.agregarTenista("Rafa", 1982, false, 85.3);
        equipo1.agregarTenista("Roger", 1980, true, 79.2);
        equipo1.agregarTenista("Nole", 1985, true, 79.6);
        assertEquals("Roger, 1980, diestro, 79.2, 2\nNole, 1985, diestro, 79.6, 3\n", equipo1.getTenistasPorPeso());
    }

    @Test
    public void testModificarPeso()
    {
        Equipo equipo1 = new Equipo();
        equipo1.setPesoActual(1, 79.6);
        assertEquals("", equipo1.getDatosTenista());
        equipo1.agregarTenista("Nole", 1985, true, 79.2);
        equipo1.setPesoActual(1, 79.2);
        equipo1.agregarTenista("Roger", 1980, true, 85.3);
        equipo1.setPesoActual(2, 79.6);
        equipo1.agregarTenista("Rafa", 1982, false, 79.2);
        equipo1.setPesoActual(3, 85.3);
        assertEquals("Nole, 1985, diestro, 79.2, 1\nRoger, 1980, diestro, 79.6, 2\nRafa, 1982, zurdo, 85.3, 3\n", equipo1.getDatosTenista());
    }

    @Test
    public void testEliminaTenista()
    {
        Equipo equipo1 = new Equipo();
        equipo1.eliminaTenista();
        assertEquals("", equipo1.getDatosTenista());
        equipo1.agregarTenista("Nole", 1985, true, 79.2);
        equipo1.agregarTenista("Roger", 1980, true, 79.6);
        equipo1.agregarTenista("Rafa", 1982, false, 85.3);
        equipo1.eliminaTenista();
        assertEquals("Nole, 1985, diestro, 79.2, 1\nRafa, 1982, zurdo, 85.3, 3\n", equipo1.getDatosTenista());
    }
}


