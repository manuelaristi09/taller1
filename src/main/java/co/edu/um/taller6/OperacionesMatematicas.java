package co.edu.um.taller6;

/**
 * Esta clase permite realizar las operaciones basicas de la matematica
 */
public class OperacionesMatematicas {

    /**
     * Este metodo realiza la adicion de dos numeros enteros
     * @param valor1 Primer parametro de tipo entero
     * @param valor2 Segundo parametro de tipo entero
     * @return La suma de los dos parametros
     */
    public int suma(int valor1, int valor2)
    {
        return valor1 + valor2;
    }

    public int resta(int valor1, int valor2)
    {
        return valor1 - valor2;
    }

    public int multiplicacion(int valor1, int valor2)
    {
        return valor1 * valor2;
    }

    public double division(int valor1, int valor2) throws ArithmeticException
    {
        if(valor2 == 0){
            throw new ArithmeticException();
        }

        return valor1 / valor2;
    }
}
