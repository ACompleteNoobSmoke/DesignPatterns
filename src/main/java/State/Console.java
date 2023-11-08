package State;

public class Console {
    private ConsoleState consoleState;
    private PowerOnState powerOn;
    private GameInState gameIn;
    private EmptyGameState emptyGame;
    private PowerOffState powerOff;
    private String currentGame;

    public ConsoleState getConsoleState() {
        return consoleState;
    }

    public PowerOnState getPowerOn() {
        return powerOn;
    }

    public GameInState getGameIn() {
        return gameIn;
    }

    public EmptyGameState getEmptyGame() {
        return emptyGame;
    }

    public PowerOffState getPowerOff() {
        return powerOff;
    }

    public void setCurrentGame(String game){
        this.currentGame = game;
    }

    public String getCurrentGame(){
        return currentGame;
    }


    public Console(){
        powerOn = new PowerOnState(this);
        gameIn = new GameInState(this);
        emptyGame = new EmptyGameState(this);
        powerOff = new PowerOffState(this);
        setState(powerOff);
    }


    public void setState(ConsoleState consoleState) {
        this.consoleState = consoleState;
    }

    public boolean on(){
       return consoleState.on();
    }

    public void insertDisc(String disc){
        consoleState.insertDisc(disc);
    }

    public void ejectDisc(){
        String ejectedDisc = consoleState.ejectDisc();
        System.out.println(ejectedDisc);
    }

    public boolean off(){
       return consoleState.off();
    }
}
