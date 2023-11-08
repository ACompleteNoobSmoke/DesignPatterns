package State;

public interface ConsoleState {
    boolean on();
    void insertDisc(String disc);
    String ejectDisc();
    boolean off();
}
