package proyectocalculadora;
import java.text.DecimalFormat; 

public class Impresiones 
{
    public static void imprimirMenu() 
    {
        space();
        System.out.println("Calculadora de Ahorro o Credito");
        System.out.println("1. Calculadora de Ahorro.");
        System.out.println("2. Calculadora de Credito.");
        System.out.println("3. Salir.");
        System.out.print("Opcion Numero: ");
    //método que permite impriir el menu de calculadoras del programa 
    }    
    public static void imprimirMenuCuenta() 
    {
        System.out.println("1. Iniciar Cuenta");
        System.out.println("2. Imprimir Tabla");
        System.out.println("3. Restaurar Cuenta");
        System.out.println("4. Regresar al Menu");
        System.out.print("Opcion Numero: ");
    //método que permite imprimir el menu de la cuenta ya sea de ahorro o crédito
    }
    public static void imprimirMenuPrincipal() 
    {
        space();
        System.out.println("        Calculadora de Ahorro y Credito");
        System.out.println(" ");
        System.out.println("El presente programa fue diseñado por los estudiantes:");
        System.out.println("");
        System.out.println("0909 - 13 - 01436 Sergio Eduardo Tally Ramirez");
        System.out.println("0909 - 13 - 02631 Karla Yolanda Aldana Aragon");
        System.out.println("0909 - 13 - 04771 Jhoseline Paola Pelico Roche");
        System.out.println("0909 - 14 - 03770 Robin Alexander Aragon Salguero");
        System.out.println("0909 - 14 - 07582 Angel Miguel Guzman Hernandez");
        System.out.println(" ");
        System.out.println("De la Universidad Mariano Gálvez de Guatemala");
        System.out.println("para el curso de programación II, el cual realiza");
        System.out.println("la proyección de un prestamo o ahorro de interes");
        System.out.println("compuesto.");
    //método que permite imprimir el menu principal 
    }    
    public static void imprimirTablaCredito(Lista contador, Lista monto, Lista cuotafija, Lista interes, Lista mensualidad, int plazo, double totalinteres, double totalmensual)
    {
        Node nodocontador = contador.head;
        Node nodomonto = monto.head;
        Node nodocuotafija = cuotafija.head;
        Node nodointeres = interes.head;
        Node nodomensualidad = mensualidad.head;
        //Nodos anexados a listas.
        DecimalFormat df = new DecimalFormat("0.00");
        //Para mostrar decimales.
        
        int mayorlistacontador=mayorlista(contador);
        int mayorlistamonto=mayorlista(monto);
        int mayorlistainteres=mayorlista(interes);
        int mayorlistacuotafija=mayorlista(cuotafija);
        int mayorlistamensualidad=mayorlista(mensualidad);
        //Guardar en variables los mayores largos de las listas.
        
        if(mayorlistacontador<12){mayorlistacontador=12;}        
        if(mayorlistamonto<12){mayorlistamonto=12;}        
        if(mayorlistainteres<12){mayorlistainteres=12;}        
        if(mayorlistacuotafija<12){mayorlistacuotafija=12;}        
        if(mayorlistamensualidad<12){mayorlistamensualidad=12;}
        if(mayorlistamensualidad>18){mayorlistamensualidad=20;}
        if(mayorlistacontador>18){mayorlistacontador=20;}
        if(mayorlistacuotafija>18){mayorlistacuotafija=20;}
        if(mayorlistamonto>18){mayorlistamonto=20;}
        if(mayorlistainteres>18){mayorlistainteres=20;}
        //Condicionales para que la tabla no resulta muy corta o larga.
        
        space();
        
        StringBuilder SBtemporal = new StringBuilder("Calculadora de Crédito");
        espacios(mayorlistacontador-SBtemporal.length());
        System.out.println(SBtemporal);
        
        System.out.print("| ");        
        SBtemporal = new StringBuilder("Contador");        
        espacios(mayorlistacontador-SBtemporal.length());
        System.out.print(SBtemporal);
        System.out.print(" |");
                
        System.out.print("| ");        
        SBtemporal = new StringBuilder("Monto");        
        espacios(mayorlistamonto-SBtemporal.length()+3);
        System.out.print(SBtemporal);
        System.out.print(" |");
        
        System.out.print("| ");
        SBtemporal = new StringBuilder("Cuota Fija");        
        espacios(mayorlistacuotafija-SBtemporal.length()+3);        
        System.out.print(SBtemporal);
        System.out.print(" |");
        
        System.out.print("| ");        
        SBtemporal = new StringBuilder("Interés");        
        espacios(mayorlistainteres-SBtemporal.length()+3);
        System.out.print(SBtemporal);
        System.out.print(" |");
        
        System.out.print("| ");
        SBtemporal = new StringBuilder("Mensualidad");        
        espacios(mayorlistamensualidad-SBtemporal.length()+3);        
        System.out.print(SBtemporal);
        System.out.println(" |");
        //Parte superior de la tabla.
        for(int contadorbucle=0; contadorbucle<plazo; contadorbucle++)
        {
            System.out.print("| ");
            SBtemporal = new StringBuilder(Integer.toString(nodocontador.cargo.intValueExact()));
            espacios(mayorlistacontador-SBtemporal.length());
            System.out.print(SBtemporal);
            System.out.print(" |");
            
            System.out.print("| ");
            SBtemporal = new StringBuilder(df.format(nodomonto.cargo));
            espacios(mayorlistamonto-SBtemporal.length());
            System.out.print("Q. "+SBtemporal);
            System.out.print(" |");
            
            System.out.print("| ");
            SBtemporal = new StringBuilder(df.format(nodocuotafija.cargo));
            espacios(mayorlistacuotafija-SBtemporal.length());
            System.out.print("Q. "+SBtemporal);
            System.out.print(" |");
            
            System.out.print("| ");
            SBtemporal = new StringBuilder(df.format(nodointeres.cargo));
            espacios(mayorlistainteres-SBtemporal.length());
            System.out.print("Q. "+SBtemporal);
            System.out.print(" |");
            
            System.out.print("| ");
            SBtemporal = new StringBuilder(df.format(nodomensualidad.cargo));
            espacios(mayorlistamensualidad-SBtemporal.length());
            System.out.print("Q. "+SBtemporal);
            System.out.println(" |");
               
            nodocontador=nodocontador.next;
            nodomonto=nodomonto.next;
            nodocuotafija=nodocuotafija.next;
            nodointeres=nodointeres.next;
            nodomensualidad=nodomensualidad.next; 
         /*
            Cuerdo de la tabla.
            Conexion al siguiente nodo de la lista.     
         */
        }
        SBtemporal = new StringBuilder("Totales");
        System.out.print("| ");        
        espacios(mayorlistacontador-SBtemporal.length());
        System.out.print(SBtemporal);
        System.out.print(" |");
        
        SBtemporal = new StringBuilder("");
        System.out.print("| ");        
        espacios(mayorlistamonto-SBtemporal.length()+3);
        System.out.print(SBtemporal);
        System.out.print(" |");
        
        SBtemporal = new StringBuilder("");
        System.out.print("| ");
        espacios(mayorlistacuotafija-SBtemporal.length()+3);        
        System.out.print(SBtemporal);
        System.out.print(" |");        
        
        SBtemporal = new StringBuilder(df.format(totalinteres));
        System.out.print("| ");        
        espacios(mayorlistainteres-SBtemporal.length());
        System.out.print("Q. "+SBtemporal);
        System.out.print(" |");
        
        SBtemporal = new StringBuilder(df.format(totalmensual));
        System.out.print("| ");
        espacios(mayorlistamensualidad-SBtemporal.length());        
        System.out.print("Q. "+SBtemporal);
        System.out.println(" |");
        //Parte de totales o inferior de la lista.
    /*
        Método que permite imprimir la tabla de la calculadora crédito
    */
    }        
    public static void imprimirTablaAhorro(Lista contador, Lista interes, Lista cuotafija,  Lista monto, int plazo, double totalintereses, double totalmonto)
    {
        Node nodocontador = contador.head;
        Node nodomonto = monto.head;
        Node nodocuotafija = cuotafija.head;
        Node nodointeres = interes.head;
        //Nodos anexados a listas.
        DecimalFormat df = new DecimalFormat("0.00");
        //Para mostrar decimales.
        
        int mayorlistacontador=mayorlista(contador);
        int mayorlistamonto=mayorlista(monto);
        int mayorlistainteres=mayorlista(interes);
        //Guardar en variables los mayores largos de las listas.
        if(mayorlistacontador<12){mayorlistacontador=12;}        
        if(mayorlistamonto<8){mayorlistamonto=8;}        
        if(mayorlistainteres<8){mayorlistainteres=8;}
        if(mayorlistacontador>18){mayorlistacontador=22;}
        if(mayorlistamonto>18){mayorlistamonto=22;}
        if(mayorlistainteres>18){mayorlistainteres=22;}
        //Condicionales para que la tabla no resulta muy corta o larga.
        
        space();
        
        StringBuilder SBtemporal = new StringBuilder("Calculadora de Ahorro");
        espacios(mayorlistacontador-SBtemporal.length());
        System.out.println(SBtemporal);
        
        System.out.print("| ");                
        SBtemporal = new StringBuilder("Contador");        
        espacios(mayorlistacontador-SBtemporal.length());
        System.out.print(SBtemporal);
        System.out.print(" |");
        
        System.out.print("| ");        
        SBtemporal = new StringBuilder("Monto");        
        espacios(mayorlistamonto-SBtemporal.length()+3);
        System.out.print(SBtemporal);
        System.out.print(" |");
                
        System.out.print("| ");        
        SBtemporal = new StringBuilder("Interés");
        espacios(mayorlistainteres-SBtemporal.length()+3);
        System.out.print(SBtemporal);
        System.out.print(" |");
        
        SBtemporal = new StringBuilder("Saldo");
        System.out.print("| ");        
        espacios(mayorlistamonto-SBtemporal.length()+3);
        System.out.print(SBtemporal);
        System.out.println(" |");               
        //Parte superior de la tabla.
       
        for(int contadorbucle=0; contadorbucle<plazo; contadorbucle++)
        {
            System.out.print("| ");
            SBtemporal = new StringBuilder(Integer.toString(nodocontador.cargo.intValueExact()));
            espacios(mayorlistacontador-SBtemporal.length());
            System.out.print(SBtemporal);
            System.out.print(" |");
            
            System.out.print("| ");
            SBtemporal = new StringBuilder(df.format(nodocuotafija.cargo));
            espacios(mayorlistamonto-SBtemporal.length());
            System.out.print("Q. "+SBtemporal);
            System.out.print(" |");
            
            System.out.print("| ");
            SBtemporal = new StringBuilder(df.format(nodointeres.cargo));
            espacios(mayorlistainteres-SBtemporal.length());
            System.out.print("Q. "+SBtemporal);
            System.out.print(" |");
            
            System.out.print("| ");
            SBtemporal = new StringBuilder(df.format(nodomonto.cargo));
            espacios(mayorlistamonto-SBtemporal.length());
            System.out.print("Q. "+SBtemporal);
            System.out.println(" |");
                           
            nodocontador=nodocontador.next;
            nodomonto=nodomonto.next;
            nodocuotafija=nodocuotafija.next;
            nodointeres=nodointeres.next;
        /*
            Cuerdo de la tabla.
            Conexion al siguiente nodo de la lista.     
        */
        }
        SBtemporal = new StringBuilder("Totales");
        System.out.print("| ");                
        espacios(mayorlistacontador-SBtemporal.length());
        System.out.print(SBtemporal);
        System.out.print(" |");
        
        SBtemporal = new StringBuilder("");
        System.out.print("| ");        
        espacios(mayorlistamonto-SBtemporal.length()+3);
        System.out.print(SBtemporal);
        System.out.print(" |");
        
        SBtemporal = new StringBuilder(df.format(totalintereses));
        System.out.print("| ");        
        espacios(mayorlistainteres-SBtemporal.length());
        System.out.print("Q. "+SBtemporal);
        System.out.print(" |");
        
        SBtemporal = new StringBuilder(df.format(totalmonto));
        System.out.print("| ");        
        espacios(mayorlistamonto-SBtemporal.length());
        System.out.print("Q. "+SBtemporal);
        System.out.println(" |");
    /*
        Parte de totales o inferior de la lista.    
        Método que permite imprimir la tabla de la calculadora ahorro.
    */
    }  
    public static void space() 
    {
        for(int contador=0; contador<50; contador++)
        {System.out.println("");}
    //Método que inserta 50 espacios para separar el menú de la presentación.
    }
    public static void espacios(int espacios)
    {
        for(int contador=0; contador<espacios; contador++)
        {System.out.print(" ");}
    //Metodo que genera los espacios para mantener una tabla simetrica.
    }
   public static int mayorlista(Lista lista)
   {
        int mayor=0;
        Node nodo = lista.head;
        for(int contador=0; contador<lista.length; contador++)
        {
            String SBtemporal = nodo.cargo.toString();
            if(SBtemporal.length()<mayor)
            {}
            else
            {mayor=SBtemporal.length();}
            nodo=nodo.next;
        }
        return mayor;
   //Metodo que regresa un valor entero, con el tamaño de la mayor cadena de una lista.
   }
   public static void error()
   {
       System.out.println("Opcion no valida, vuelva a intentarlo.");
   //Mensaje de error...
   }
}