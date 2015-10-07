package proyectocalculadora;
public class CalculadoraAhoro extends Calculadora //Hereda de “Calculadora.java”
{   
    public CalculadoraAhoro() 
    {
        interes = 0;
        monto = 0.0;
        intereses=0.0;
        plazo = 0;
        controliniciada=false;
    /*
        Primer constructor que no recibe parámetros.
        Inicializa con 0 las variables: interés, monto, intereses, plazo y con false controliniciada.
    */
    }    
    public CalculadoraAhoro(int plazo, double interes, double monto)
    {
        this.interes = interes;
        this.monto = monto;
        this.plazo = plazo;
        Iniciada();
    /*
        Segundo constructor que recibe 3 parámetros.
        Inicializa las variables plazo, interés y mensualidad respectivamente con los parámetros recibidos.
    */
    }
     protected double CalculodeInteres()
    {
        double calculo;
        calculo=(monto*interes);        
        return calculo;
    /*
        Método declara una variable double llamada calculo le asigna el valor de que va a multiplicar
        la variable monto por la variable interes, luego retorna al calculo.
    */
    }         
    private void Calculos()
    {
        intereses=CalculodeInteres();
        monto+=intereses;
    /*
        Otorga a la variable mensualidad el valor de retorno del método CalculodeInteres()
        y a la variable monto aumenta la suma de mensualidad e intereses.
    */
    }    
    public void ImprimirTabla()
    {
        if(controlimpresion)
        {
            Impresiones.imprimirTablaAhorro(listcontador, listinteres, listcuotafija, listmonto, plazo, totalintereses, totalmonto);
        }
        else
        {
            listcuotafija.Agregar(monto);
            for(int contador=1;contador<=plazo;contador++)
            {
                Calculos();//Calculo del interes y de la mensualidad.
                totalintereses+=intereses;
                totalmonto=monto;
                listinteres.Agregar(intereses);
                listmonto.Agregar(monto);
                listcontador.Agregar(contador);
                listcuotafija.Agregar(monto);
                //Agregar los datos a listas para luego imprimirlas.
            }
            controlimpresion=true;
            ImprimirTabla();
        }            
    /*
    Consta de una condicional, la cual evalua el valor de controlimpresion,
    al ser true efectua el método Impresiones.imprimirTablaAhorro(),
    con las variables tipo lista listcontador, listinteres, listcuotafija, listmonto, plazo,
    en caso de ser false efectua un ciclo for que comienza en 1 y termina en el valor 
    del plazo dado por el usuario. Dentro de dicho ciclo for primero se efectua el método Calculos(),
    se continua aumentándole a la variable totalintereses el valor de intereses.
    */
    }
}