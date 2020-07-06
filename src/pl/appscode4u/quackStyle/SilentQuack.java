package pl.appscode4u.quackStyle;

import pl.appscode4u.IVoice;

public class SilentQuack implements IVoice {
    @Override
    public void quack() {
        System.out.println("I'm serious silent duck");
    }
}
