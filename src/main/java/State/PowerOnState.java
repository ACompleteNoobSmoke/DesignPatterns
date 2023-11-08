package State;

public class PowerOnState implements ConsoleState {

    Console console;

    public PowerOnState(Console console){
        this.console = console;
    }

    @Override
    public boolean on() {
        if (console.off()) return true;
        System.out.println("The console is already turned on");
        return false;
    }

    @Override
    public void insertDisc(String disc) {
        String currentGame = console.getCurrentGame();
        if (currentGame != null && !currentGame.isBlank()){
            System.out.println("Currently Playing: " + currentGame);
            return;
        }
        console.setCurrentGame(disc);
        console.setState(console.getGameIn());
    }

    @Override
    public String ejectDisc() {
        String currentGame = console.getCurrentGame();
        if (currentGame != null && !currentGame.isBlank()){
            console.setCurrentGame(null);
            console.setState(console.getEmptyGame());
            return currentGame;
        }
        return "Empty Game Tray";
    }

    @Override
    public boolean off() {
        System.out.println("Turning off console");
        return true;
    }
}
