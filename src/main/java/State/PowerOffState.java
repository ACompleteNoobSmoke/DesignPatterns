package State;

public class PowerOffState implements ConsoleState {

    Console console;

    public PowerOffState(Console console){
        this.console = console;
    }

    @Override
    public boolean on() {
        return !console.on();
    }

    @Override
    public void insertDisc(String disc) {
        System.out.println("Can't insert " + disc + " because power is off");
    }

    @Override
    public String ejectDisc() {
        return "Power currently off so cannot eject disc";
    }

    @Override
    public boolean off() {
        return false;
    }
}
