import unlu.poo.tps.tp1.ej1.ListaEnlazadaSimple;
import unlu.poo.tps.tp1.ej1.Nodo;
import unlu.poo.tps.tp1.ej5.Lista;
import unlu.poo.tps.tp1.ej5.Tarea;

public class Main {
    public static void main(String[] args) {
        /*
        ListaEnlazadaSimple lista=new ListaEnlazadaSimple();
        lista.mostrarLista();
        lista.agregarElemento(1);
        lista.agregarElemento(2);
        lista.agregarElemento(3);
        lista.agregarElemento(4);
        lista.agregarElemento(5);
        lista.mostrarLista();
        lista.insertar(3,99);
        lista.mostrarLista();
        Nodo nodo=lista.recuperarElemento(3);
        System.out.println("valor: "+nodo.getValor());
        lista.eliminarElemento(99);
        lista.mostrarLista();
        * */

        Lista l=new Lista();
        l.mostrarTareas();
        Tarea t=l.generarTarea();
        l.cargarTarea(t);
        l.mostrarTareas();
        l.editarTarea(1);
        l.mostrarTareas();



    }
}