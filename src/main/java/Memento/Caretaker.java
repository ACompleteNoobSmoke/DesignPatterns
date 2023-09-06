package Memento;

import java.util.Stack;

public class Caretaker {
    private Stack<Memento> states = new Stack<>();
    private int count = 0;

    public void push(Memento newMemento){
        states.push(newMemento);
        count++;
    }

    public Memento pop(){
        if (count <= 0) return null;
        count--;
        states.pop();
        return states.peek();
    }

    public void peekAll(){
        if (count <= 0) return;
        for(int i = count; i >= 0; i--)
            System.out.println(states.get(i).getState());
    }
}
