package pl.appscode4u.quackStyle;

import pl.appscode4u.IVoice;

public class NormalQuack implements IVoice {
    @Override
    public void quack() {
        System.out.println("Quack, Quack! I'm quacking like a normal duck.");
    }
}
