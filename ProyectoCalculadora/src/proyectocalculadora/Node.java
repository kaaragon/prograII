package proyectocalculadora;
import java.math.BigDecimal;

public class Node 
{
    BigDecimal cargo;
    Node next;
    /*
    cargo; Variable de tipo BigDecimal para utilizar métodos especiales de este tipo.
    next; variable permite crear una estructura de datos abstractos.
    */
    public Node () 
    {
	cargo = new BigDecimal(0);
	next = null;
    //Constructor que no recibe parámetros, solo mantiene el nodo disponible.
    }    
     public Node (double cargo) 
    {
	this.cargo = new BigDecimal(cargo);
	this.next = null;
    /*
    Constructor que recibe un double como parámetro para agregarlo a BigDecimal como valor, 
    asignando a next el valor null.
    */
    }   
}
