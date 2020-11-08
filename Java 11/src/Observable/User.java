package Observable;

public class User implements Obj{
    private String name;
    private Observe observe;

    public User(String name){
        this.name = name;
    }

    @Override
    public void update() {
        String message = observe.getMessage();
        System.out.println(name + " messaggio " + message);

    }

    @Override
    public void setObserver(Observe observe) {
        this.observe = observe;
    }
}
