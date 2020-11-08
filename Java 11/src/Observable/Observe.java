package Observable;

public interface Observe {
    void addObserve(Obj obj);

    void removeObserve(Obj obj);

    void notifyObserve(); //notifica se è cambiato qualcosa  e mostra il messaggio

    String getMessage(); // prende il messaggio
}
