package co.edu.um.taller6;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Realiza las pruebas unitarias para la clase de OperacionesMatematicas
 */
public class OperacionesMatematicasTest {
    @Test
    public void testSuma() throws Exception {

        OperacionesMatematicas op = new OperacionesMatematicas();

        Assert.assertNotNull(op);

        Assert.assertEquals(5, op.suma(3,2));

        Assert.assertEquals(-3, op.suma (-2, -1));

        Assert.assertEquals(0, op.suma (0,0));

    }

    @Test
    public void testResta() throws Exception {

        OperacionesMatematicas op = new OperacionesMatematicas();

        Assert.assertNotNull(op);

        Assert.assertEquals(11, op.resta (14,-(-3)));

        Assert.assertEquals(40, op.resta(30, - 10));




    }

    @Test
        public void testMultiplicacion() throws Exception {

        OperacionesMatematicas op = new OperacionesMatematicas();

        Assert.assertNotNull(op);

        Assert.assertEquals(6, op.multiplicacion(3,2));

        Assert.assertEquals(20, op.multiplicacion(2, 10));

        Assert.assertEquals(15, op.multiplicacion(5,3));


    }

    @Test(expected = ArithmeticException.class)

    public void testDivision() throws Exception {

     OperacionesMatematicas op = new OperacionesMatematicas();

       Assert.assertNotNull(op);

      // Assert.assertEquals(2.5, op.division(5,2));

       op.division(2,0);

    }
}
