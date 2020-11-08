package Observable;

import java.util.ArrayList;
import java.util.List;

public class FavoriteDress implements Observe{

    List<Obj> users;
    private String message;

    public FavoriteDress() {
        this.users = new ArrayList<>();
    }

    @Override
    public void addObserve(Obj obj) {
        if (!users.contains(obj)){
            users.add(obj);
        }
    }

    @Override
    public void removeObserve(Obj obj) {
        users.remove(obj);
    }

    @Override
    public void notifyObserve() {

        for(Obj o: users){
            o.update();
        }

    }

    @Override
    public String getMessage() {
        return this.message;
    }

    public void postMessage(String message){
        System.out.println(message);
        this.message = message;
        notifyObserve();
    }
}
