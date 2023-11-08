package State;

public class EmptyGameState implements  ConsoleState{

    Console console;

    public EmptyGameState(Console console){
        this.console = console;
    }

    @Override
    public boolean on() {
        return false;
    }

    @Override
    public void insertDisc(String disc) {

    }

    @Override
    public String ejectDisc() {
        return null;
    }

    @Override
    public boolean off() {
        return false;
    }
}
