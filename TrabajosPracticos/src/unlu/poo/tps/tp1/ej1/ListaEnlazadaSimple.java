package unlu.poo.tps.tp1.ej1;

public class ListaEnlazadaSimple {
    private int cantidad;
    private Nodo inicio;


    public ListaEnlazadaSimple(){
        this.inicio=null;
    }

    public boolean esVacia(){
        if(this.inicio==null){
            System.out.println("La lista esta vacia.");
            return  true;
        }else{
            System.out.println("La lista no esta vacia.");
            return false;
        }
    }

    public void longitud(){
        System.out.println("La longitud de la lista es: "+this.cantidad);
    }

    public boolean agregarElemento(int valor){
        Nodo nodoActual=this.inicio;
        Nodo nodoNuevo=new Nodo();
        nodoNuevo.setValor(valor);
        if(this.inicio==null){
            this.inicio=nodoNuevo;
            nodoActual.setSiguiente(null);
            this.cantidad++;
            return true;
        }
        while(nodoActual.getSiguiente()!=null){
            nodoActual=nodoActual.getSiguiente();
        }
        nodoNuevo.setSiguiente(null);
        nodoActual.setSiguiente(nodoNuevo);
        this.cantidad++;
        return true;
    }

    public boolean eliminarElemento(int valor){
        Nodo nodoActual=this.inicio;
        if(this.inicio.getValor()==valor){
            this.inicio=nodoActual.getSiguiente();
            this.cantidad--;
            return true;
        }
        Nodo nodoSiguiente=nodoActual.getSiguiente();
        while(nodoSiguiente!=null){
            if(nodoSiguiente.getValor()==valor){
                nodoActual.setSiguiente(nodoSiguiente.getSiguiente());
                this.cantidad--;
                return true;
            }
            nodoActual = nodoSiguiente;
            nodoSiguiente=nodoSiguiente.getSiguiente();
        }
        return false;
    }

    public Nodo recuperarElemento(int pos){
        if(this.esVacia()){
            return null;
        }
        int count=1;
        Nodo nodoActual=this.inicio;
        while(nodoActual.getSiguiente()!=null){
            count++;
            if(count==pos){
                return nodoActual;
            }
            nodoActual=nodoActual.getSiguiente();
        }
        return null;
    }

    public void insertar(int pos, int valor){
        if(this.esVacia()){
            System.out.println("La lista esta vacia, no se pudo insertar.");

        }
        if(pos < 1 || pos > this.cantidad + 1){
            System.out.println("Poscion invalida, no se pudo insertar.");

        }
        int count=1;
        Nodo nuevoNodo=new Nodo();
        nuevoNodo.setValor(valor);
        nuevoNodo.setSiguiente(null);
        Nodo nodoActual=this.inicio;
        if(pos==1){
            nuevoNodo.setSiguiente(nodoActual);
            this.inicio=nuevoNodo;
            this.cantidad++;
        }

        while(nodoActual.getSiguiente()!=null){
            count++;
            if(count==pos-1){
                nuevoNodo.setSiguiente(nodoActual.getSiguiente());
                nodoActual.setSiguiente(nuevoNodo);
                this.cantidad++;
            }
            nodoActual=nodoActual.getSiguiente();
        }
    }
    public void mostrarLista(){
        Nodo nodoActual=this.inicio;

        if(this.esVacia()){
            System.out.println("null");
            return;
        }

        while(nodoActual!=null){
            int aux=nodoActual.getValor();
            System.out.println("Valor: "+aux);
            nodoActual=nodoActual.getSiguiente();
        }

    }
}
