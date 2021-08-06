public class No<T> {
    private T dado;
    private No prox;

    public No(){}

    public No(T dado){
        this.dado = dado;
        this.prox = null;
    }

    public void setProx(No no){
        this.prox = no;
    }

    public No getProx(){
        return this.prox;
    }

    public void setDado(T dado){
        this.dado = dado;
    }

    public T getDado(){
        return this.dado;
    }
}
