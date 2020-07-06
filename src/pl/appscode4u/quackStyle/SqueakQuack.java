package pl.appscode4u.quackStyle;

import pl.appscode4u.IVoice;

public class SqueakQuack implements IVoice {
    @Override
    public void quack() {
        System.out.println("My quack is like a squeak.");
    }
}
