package proyectocalculadora;

public class CalculadoraCredito extends Calculadora  //Hereda de “Calculadora.java”
{
    private double cuotafija, totalmensual;
    private Lista listmensual = new Lista();
    
    
    public CalculadoraCredito() 
    {
        interes = 0;
        monto = 0.0;
        intereses=0.0;
        plazo = 0;
        cuotafija=0.0;
    /*
        Primer Constructor, inicializa las varibles interes, monto, intereses, plazo 
        y cuotafija que hereda de la clase Calculadora.
    */
    }
    public CalculadoraCredito(double monto, double interes, int plazo) //Segundo constructor, le otorga valores a sus variables de instancia.
    {
        this.interes = interes;
        this.monto = monto;
        this.intereses=0.0;
        this.plazo=plazo;
        cuotafija=monto/plazo;
        Iniciada();
    /*
        Constructor, declara que la variable intereses va a ser igual al método CalculodeIntereses, 
        la variable mensualidad va a ser igual a cuotafija+intereses 
        y que a la variable monto se le va a agregar la variable cuotafija.
    */
    }        
    private void Calculos()
    {
        intereses=CalculodeInteres();
        mensualidad=cuotafija+intereses;
        monto-=cuotafija;
    /*
        Funcion Pura
        Asigna el valor del metodo de CalculodeInteres(), a intereses.
        Asigna el valor de cuotafija mas intereses a mensualidad.
        Disminuye el valor de cuotafija a monto.
    */
    }    
    public void ImprimirTabla()
    {
        if(controlimpresion)
        {
            Impresiones.imprimirTablaCredito(listcontador, listmonto, listcuotafija, listinteres, listmensual, plazo, totalintereses, totalmensual);
        }
        else
        {
            for(int contador=1;contador<=plazo;contador++)
            {
                
                listcontador.Agregar(contador);
                listmonto.Agregar(monto);
                listcuotafija.Agregar(cuotafija);
                Calculos(); //Realizar los calculos de la calculadora.
                totalintereses+=intereses;
                totalmensual+=mensualidad;
                listinteres.Agregar(intereses);                
                listmensual.Agregar(mensualidad);
                //Agregar los datos a listas para luego imprimirlas.
            }
            controlimpresion=true;
            ImprimirTabla();
        }        
    /*
        Este metodo declara que si controldeimpresion es verdadero llama al
        método imprimirTablaAhorro de la clase Impresiones agregándole los parámetros que necesita 
        el método imprimirTablaAhorro.
        Si el método es falso, inicia agregando el valor de monto a listacuotafija es decir, con el 
        método Agregar de la clase Lista le agrega el valor de monto al objeto listacuotafija de la clase Lista. 
    */
    }
}