


public class Pilha<T> {

    private No topo;
    private int idx = 0;

    public Pilha(){
        topo = null;
    }

    public void empilha(T dado){
        No empilha = new No(dado);
        empilha.setProx(topo);
        topo = empilha;
        idx++;
    }

    public T desempilha(){
        if(cheia()){
            No tmp = topo;
            T valor = (T)tmp.getDado();
            topo = topo.getProx();
            idx--;
            return valor;
        }else{
            return null;
        }
    }

    public boolean vazia(){
        return topo == null ? false : true;
    }

    public boolean cheia(){
        return topo == null ? true : false;
    }

    public int tamanho(){
        return idx;
    }
}
