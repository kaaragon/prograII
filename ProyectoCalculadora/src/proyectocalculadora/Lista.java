package proyectocalculadora;
public class Lista 
{
    int length; 
    Node head;  
    Node ultimo; 
    /*
    length indica el tamaño de la lista.
    head enlaza al primer elemento de la lista.
    ultimo enlaza al ultimo elemento de la lista, permitiendo añadir de ultimo 
    sin conocer el tamaño ni hacer grandes procedimientos.
    */
    
    public Lista () 
    {
	length = 0;
	head = null;
        ultimo = head;
    //Contructor que no recibe parámetros, solo deja disponible la lista para trabajarla.
    }
      
     
    public void Agregar(double valor)
    {
        Node nodo = new Node(valor);
        switch (length) 
        {
            case 0:
                head = nodo;
                break;
            case 1:
                ultimo=nodo;
                head.next = ultimo;
                break;
            default:
                ultimo.next=nodo;
                ultimo=ultimo.next;
                break;
        }
        length=length+1;
    /*
    Metodo que recibe un doublé para crear un método con este valor y agregarlo a la lista, 
    en caso de estar vacia lo hace el head sino va agregando de último.
    */
    } 
}