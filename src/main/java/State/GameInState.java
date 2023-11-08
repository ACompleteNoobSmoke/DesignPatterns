package State;

public class GameInState implements ConsoleState {

    Console console;

    public GameInState(Console console){
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
