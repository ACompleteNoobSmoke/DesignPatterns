package Memento;

public class Organizer {
    private String state;

    public void setState(String state){
        this.state = state;
    }

    public String getState(){ return state; }

    public Memento createMemento() {
        return new Memento(state);
    }

    public void restore(Memento memento){
        this.state = memento.getState();
    }

    public String toString(){
        return "State: " + state;
    }
}
