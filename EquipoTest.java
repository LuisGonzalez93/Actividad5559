

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
        equipo1.agregarTenista("Roger", 1980, true, 79.2);
        equipo1.agregarTenista("Rafa", 1982, false, 82.5);
        equipo1.agregarTenista("Nole", 1985, true, 79);
        assertEquals("Roger, 1980, diestro, 79.2, 1\nRafa, 1982, zurdo, 82.5, 2\nNole, 1985, diestro, 79.0, 3\n", equipo1.getTenistasPorAnoNacimiento());
    }
}



