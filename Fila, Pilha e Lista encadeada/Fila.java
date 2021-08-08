public class Fila<T> {

    private No inicio;
    private No fim;
    private int idx = 0;

    public Fila(){
        this.inicio = null;
        this.fim = null;
    }

    public void enfileira(T dado){

        No enfileira = new No();
        enfileira.setDado(dado);
        enfileira.setProx(null);
            if(inicio == null){
                inicio = enfileira;
            }else{
                fim.setProx(enfileira);
            }
            fim = enfileira;
            idx++;
    }

    public T desenfileira(){
        if(cheia()){
            No<T> tmp = inicio;
            inicio = (inicio.getProx());
            T valor = tmp.getDado();
            idx--;
            return valor;
        }else{
           System.out.println("Fila vazia!");
           return null;
        }

    }

    public boolean cheia(){
        return inicio != null ? true : false;
    }

    public boolean vazia(){
        return inicio == null ? true : false;
    }

    public int tamanho(){
        return idx;
    }
}
