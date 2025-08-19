package unlu.poo.tps.tp1.ej3;

public class Pila {

    private Nodo tope;

    public Pila(){
        this.tope=null;
    }

    public boolean esVacia(){
        if(this.tope==null){
            System.out.println("La pila esta vacia.");
            return true;
        }else{
            return false;
        }
    }

    public void apilar(int valor){
        Nodo nodoNuevo=new Nodo();
        nodoNuevo.setValor(valor);
        nodoNuevo.setSiguiente(null);
        if(esVacia()){
            this.tope=nodoNuevo;
        }else{
            Nodo nodoActual=this.tope;
            this.tope=nodoNuevo;
            nodoNuevo.setSiguiente(nodoActual);
        }
    }

    public void apilar(Nodo nodoNuevo){
        if(esVacia()){
            this.tope=nodoNuevo;
        }else{
            Nodo nodoActual=this.tope;
            this.tope=nodoNuevo;
            nodoNuevo.setSiguiente(nodoActual);
        }
    }

    public Nodo desapilar(){
        if(this.esVacia()){
            System.out.println("No hay nada para desapilar");
            return null;
        }
        Nodo nodoAux=this.tope;
        this.tope=nodoAux.getSiguiente();
        return nodoAux;
    }

    public void pMostrar(){
        Pila pAux=new Pila();
        while(!this.esVacia()){
            Nodo nodoAux=this.desapilar();
            System.out.println("Valor: "+nodoAux.getValor());
            pAux.apilar(nodoAux);
        }
        while(!pAux.esVacia()){
            Nodo nodoAux=pAux.desapilar();
            this.apilar(nodoAux);
        }

    }

}
