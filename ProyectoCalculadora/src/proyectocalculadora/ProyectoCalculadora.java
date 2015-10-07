package proyectocalculadora;
import java.util.Scanner;

public class ProyectoCalculadora
{
    public static void main(String[] args) 
    {
    /*
        opcionmenu= Esta variable nos permite guardar la opción del usuario para el menú principal.
        opcionmenucredito= Esta variable nos permite guardar la opción del usuario para el menú de la calculadora crédito.
        opcionahorro= Esta variable nos permite guardar la opción del usuario para el menú de la calculadora ahorro.
    */
        int opcionmenu=0, opcionmenucredito=0, opcionmenuahorro=0;
        Scanner entrada= new Scanner(System.in);
        CalculadoraAhoro CalculadoraAhorro = new CalculadoraAhoro();        
        CalculadoraCredito CalculadoraCredito = new CalculadoraCredito();
    /*
        entrada; Variable que permite recibir los datos de entrada del usuario.
        CalculadoraAhoro= Se inicializa una instancia u objeto de la clase calculadora ahoro,
        se realiza en el inicio del main para que tenga un rango que abarque  los menús posteriores.        
        CalculadCalculadoraCredito= Se inicializa una instancia u objeto de la clase calculadora crédito,
        se realiza en el inicio del main para que tenga un rango que abarque  los menús posteriores.
    */
        Impresiones Impresiones = new Impresiones(); 
        Impresiones.imprimirMenuPrincipal();    
        entrada.nextLine();
        boolean comparar;
        String temporal="";
        int plazo; 
        double interes, monto, mensualidad;
    /*
        plazo; Variable que servirá para almacenar el tiempo.
        interes, monto, mensualidad; Variables que el usuario ingresará a la calculadora.
    */
        while(opcionmenu != 3)//Ciclo para el menu principal.
        {
            Impresiones.space();
            Impresiones.imprimirMenu();
            
            comparar=false;
            while(!comparar)
            {comparar=CompararEntrada(temporal=entrada.next());
            if(!comparar){Impresiones.error();}}
            // Ciclo que ocupan el metodo CompararEntrada volviendo a recibir los datos del usuario.
            
            opcionmenu=Integer.parseInt(temporal);
            switch(opcionmenu)
            {
                case 1:                    
                    while(opcionmenuahorro != 4)//Ciclo para el menu de Calculadora Ahorro.
                    {                        
                        Impresiones.space();
                        System.out.println("Cuenta de Ahorro");
                        Impresiones.imprimirMenuCuenta();
                        comparar=false;
                        while(!comparar)
                        {comparar=CompararEntrada(temporal=entrada.next());
                        if(!comparar){Impresiones.error();}}
                        // Ciclo que ocupan el metodo CompararEntrada volviendo a recibir los datos del usuario.
                        
                        opcionmenuahorro=Integer.parseInt(temporal);
                        switch(opcionmenuahorro)
                        {
                            case 1:
                                if(CalculadoraAhorro.controliniciada)
                                {
                                    System.out.println("Cuenta ya creada.");
                                    entrada.nextLine();
                                    entrada.nextLine();
                                }
                                else
                                {
                                    System.out.print("Ingrese el plazo en meses: ");
                                    comparar=false;
                                    
                                    while(!comparar)
                                    {comparar=CompararEntrada(temporal=entrada.next());
                                    if(!comparar){Impresiones.error();}}
                                    plazo=Integer.parseInt(temporal);
                                    System.out.print("Ingrese el interes mensual %: ");
                                    comparar=false;
                                    
                                    while(!comparar)
                                    {comparar=CompararEntradaD(temporal=entrada.next());
                                    if(!comparar){Impresiones.error();}}
                                    interes=Double.parseDouble(temporal)/100;
                                    System.out.print("Ingrese el monto: ");
                                    comparar=false;
                                    
                                    while(!comparar)
                                    {comparar=CompararEntradaD(temporal=entrada.next());
                                    if(!comparar){Impresiones.error();}}
                                    mensualidad=Double.parseDouble(temporal);
                                    
                                    /*
                                        Ciclos que ocupan los metodos CompararEntrada y CompararEntradaD
                                        volviendo a recibir los datos del usuario.
                                    */
                 
                                    CalculadoraAhorro = new CalculadoraAhoro(plazo, interes, mensualidad);
                                    //Recreacion del objeto CalcualdoraAhorro, reemplazando datos anteriores.
                                    System.out.println("Cuenta creada.");
                                }                                     
                                break;
                            case 2:
                                if(CalculadoraAhorro.controliniciada)
                                {
                                    CalculadoraAhorro.ImprimirTabla();
                                    entrada.nextLine();
                                    entrada.nextLine();
                                    //El primer nextline recibe un salto de linea de println y el segundo espera un enter
                                }
                                else
                                {
                                    System.out.println("Cuenta no creada.");
                                    entrada.nextLine();
                                    entrada.nextLine();
                                    //El primer nextline recibe un salto de linea de println y el segundo espera un enter
                                }
                                /*
                                    Ciclo que controla si el objeto CalculadoraAhorro tiene o no valores,
                                    dando mensaje en caso contrario.
                                */
                                break;
                            case 3:
                                CalculadoraAhorro = new CalculadoraAhoro(); 
                                System.out.println("Cuenta restaurada.");
                                entrada.nextLine();
                                entrada.nextLine();
                                //Reinicio del objeto CalculadoraAhorro.
                                break;
                            case 4: break;
                            default:
                                System.out.println("Opcion no valida");
                                entrada.nextLine();
                                entrada.nextLine();
                                //El primer nextline recibe un salto de linea de println y el segundo espera un enter
                                break;
                        }
                    }
                    break;
                case 2:
                    while(opcionmenucredito != 4)//Ciclo para el menu de Calculadora Credito
                    {                        
                        Impresiones.space();
                        System.out.println("Cuenta de Credito");
                        Impresiones.imprimirMenuCuenta();
                        comparar=false;
                        while(!comparar)
                        {comparar=CompararEntrada(temporal=entrada.next());
                        if(!comparar){Impresiones.error();}}
                        // Ciclo que ocupan el metodo CompararEntrada volviendo a recibir los datos del usuario.
                        
                        opcionmenucredito=Integer.parseInt(temporal);
                        switch(opcionmenucredito)
                        {
                            case 1:
                                if(CalculadoraCredito.controliniciada)
                                {
                                    System.out.println("Cuenta ya creada.");
                                    entrada.nextLine();
                                    entrada.nextLine();   
                                    //El primer nextline recibe un salto de linea de println y el segundo espera un enter
                                }
                                else
                                {
                                    System.out.print("Ingrese el plazo en meses: ");
                                    comparar=false;
                                    
                                    while(!comparar)
                                    {comparar=CompararEntrada(temporal=entrada.next());
                                    if(!comparar){Impresiones.error();}}
                                    plazo=Integer.parseInt(temporal);
                                    System.out.print("Ingrese el interes anual %: ");
                                    comparar=false;
                                    
                                    while(!comparar)
                                    {comparar=CompararEntradaD(temporal=entrada.next());
                                    if(!comparar){Impresiones.error();}}
                                    interes=Double.parseDouble(temporal)/100;
                                    System.out.print("Ingrese el monto: ");
                                    comparar=false;
                                    
                                    while(!comparar)
                                    {comparar=CompararEntradaD(temporal=entrada.next());
                                    if(!comparar){Impresiones.error();}}
                                    monto=Double.parseDouble(temporal);
                                    
                                    /*
                                        Ciclos que ocupan los metodos CompararEntrada y CompararEntradaD
                                        volviendo a recibir los datos del usuario.
                                    */
                                    
                                    CalculadoraCredito = new CalculadoraCredito(monto, interes, plazo);
                                    //Recreacion del objeto CalcualdoraCredito, reemplazando datos anteriores.
                                    System.out.println("Cuenta creada.");
                                }      
                                break;
                            case 2:
                                if(CalculadoraCredito.controliniciada)
                                {
                                    CalculadoraCredito.ImprimirTabla();
                                    entrada.nextLine();
                                    entrada.nextLine();
                                }
                                else
                                {
                                    System.out.println("Cuenta no creada.");
                                    entrada.nextLine();
                                    entrada.nextLine();
                                }        
                                /*
                                    Ciclo que controla si el objeto CalculadoraCredito tiene o no valores,
                                    dando mensaje en caso contrario.
                                */
                                break;
                            case 3:
                                    CalculadoraCredito = new CalculadoraCredito();                            
                                    System.out.println("Cuenta restaurada.");
                                    entrada.nextLine();
                                    entrada.nextLine();
                                    //El primer nextline recibe un salto de linea de println y el segundo espera un enter
                                    // Reinicio del objeto CalculadoraCredito.
                                    break;
                                case 4: break;
                                default:
                                    System.out.println("Opcion no valida");
                                    entrada.nextLine();
                                    entrada.nextLine();  
                                    //El primer nextline recibe un salto de linea de println y el segundo espera un enter
                                    break;
                        }
                    }
                    break;
                case 3:
                    System.out.println("Gracias por su atencion, lo esperamos nuevamente.");
                    break;
                default:
                    System.out.println("No valido");
                    entrada.nextLine();
                    entrada.nextLine();
                    //El primer nextline recibe un salto de linea de println y el segundo espera un enter
                    break;                
            }
            opcionmenuahorro=0;
            opcionmenucredito=0;
            //Reinicio de las variables control de los menus.
        }
    }
    public static boolean CompararEntrada(String Cadena)
    {
        try
        {
            Integer.parseInt(Cadena);
            return true;
        }
        catch(NumberFormatException nfe)
        {return false;}
    /*
        Metodo que retorna true en caso de poder convertirse a entero
        si no se puede convertir a entero, contener letras u otros caracteres
        retorna false. Permitiendo controlar el ingreso de letras y caracteres.
    */
    }
    public static boolean CompararEntradaD(String Cadena)
    {
        try
        {
            Double.parseDouble(Cadena);
            return Cadena.length() <= 15;
        }
        catch(NumberFormatException nfe)
        {return false;}
    /*
        Metodo que retorna true en caso de poder convertirse a double
        si no se puede convertir a double, contener letras u otros caracteres
        retorna false. Permitiendo controlar el ingreso de letras y caracteres.
    */    
    }
}