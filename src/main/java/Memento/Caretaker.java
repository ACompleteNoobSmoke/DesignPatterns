package Memento;

import java.util.Stack;

public class Caretaker {
    private final Stack<Memento> mementoStack = new Stack<>();
    public boolean isEmpty() { return mementoStack.isEmpty(); }

    public void push(Memento newMemento){
        mementoStack.push(newMemento);
    }

    public Memento pop(){
        if (isEmpty()) return null;
        mementoStack.pop();
        return mementoStack.peek();
    }

    public void peekAll(){
        if (isEmpty()) return;
        for (int i = mementoStack.size(); i >= 0 ; i--) {
            System.out.println(mementoStack.get(i).getState());
        }
    }


}