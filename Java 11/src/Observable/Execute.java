package Observable;

public class Execute {
    public static void main(String args[]){

        FavoriteDress fd = new FavoriteDress();

        Obj ob1 = new User("user1");

        Obj ob2 = new User("user2");

        Obj ob3 = new User("user3");

        ob1.setObserver(fd);
        ob2.setObserver(fd);
        ob3.setObserver(fd);

        fd.addObserve(ob1);
        fd.addObserve(ob2);
        fd.addObserve(ob3);

        fd.postMessage("Ciao!");

    }
}
