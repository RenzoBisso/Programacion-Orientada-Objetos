package unlu.poo.tps.tp1.ej4;

public class Cola {
    private Nodo cabeza;
    private Nodo fin;
    public Cola(){
        this.cabeza=null;
        this.fin=null;
    }

    public boolean esVacia(){
        if(this.cabeza==null){
            return true;
        }else{
            return false;
        }
    }

    public Nodo desencolar(){
        if(this.esVacia()){
            System.out.println("No hay nada en la cola.");
            return null;
        }
        Nodo nodoAux=this.cabeza;
        this.cabeza=nodoAux.getSiguiente();
        return nodoAux;
    }

    public void encolar(Nodo nodo){
        if(this.esVacia()){
            this.cabeza=nodo;
        }else{
            this.fin.setSiguiente(nodo);
        }
        this.fin=nodo;
    }
    public void encolar(int valor){
        Nodo nodo=new Nodo();
        nodo.setValor(valor);
        nodo.setSiguiente(null);
        if(this.esVacia()){
            this.cabeza=nodo;
        }else{
            this.fin.setSiguiente(nodo);
        }
        this.fin=nodo;
    }

}
