package proyectocalculadora;

public class Calculadora 
{    
    protected double monto, mensualidad;
    protected int plazo, mayorinteres, mayormonto, mayorcontador, mayorcuotafija;
    protected double intereses, interes;
    protected boolean controliniciada=false;
    protected boolean controlimpresion=false;
    protected String temporal;
    protected double totalintereses;
    protected double totalmonto;
    protected Lista listinteres = new Lista();
    protected Lista listmonto = new Lista();
    protected Lista listcontador = new Lista();
    protected Lista listcuotafija = new Lista();
    /*
        monto, mensualidad; Variables que gurdan el monto y mensualidad ingresados
        plazo, mayorinteres, mayormonto, mayorcontador, mayorcuotafija;  variables que guardan lo ingresado
        intereses, interes; Variables que guardan lo ingresado
        controliniciada; Variable que  permite saber si ya se le dieron los valores a la calculadora.
        controlimpresion; Variable que permite saber si ya se generaron los calculos para la impresión de la calculadora.
        temporal; Variable que sirve para los cambios de un tipo de variable a otro.
        totalintereses; Variable que permite guardar el total de los intereses de la calculadora.
        totalmonto; Variable que permite guardar el total del monto de la calculadora.
        listinteres = new Lista(); Inicializa la lista listinteres.
        listmonto = new Lista(); Inicializa la lista listmonto.
        listcontador = new Lista(); Inicializa la lista listcontador.
        listcuotafija = new Lista(); Inicializa la lista listcuotafija.        
    */
    protected double CalculodeInteres()
    {
        double calculo;
        calculo=(monto*interes)/12;        
        return calculo;
    /*
        Primer método declara una variable double llamada calculo le asigna el valor de que va a multiplicar
        la variable monto por la variable interes y lo dividirá entre 12, luego retorna al calculo.
    */
    }            
    protected void Iniciada()                                            
    {
        //Segundo método le asigna el valor de true a la variable controliniciada.
        controliniciada=true;
    }    
}