

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
    public void AgregarTenista()
    {
        Equipo equipo1 = new Equipo();
        equipo1.agregarTarea("Roger", 1980, true, 79.2);
    }
}

