package pl.appscode4u.ducks;

import pl.appscode4u.Duck;
import pl.appscode4u.flying.Wingsless;
import pl.appscode4u.quackStyle.SilentQuack;


public class WoodenDuck extends Duck {
    @Override
    public void Show() {
        System.out.println("I'm wooden duck, I can swimm.");
    }
    public WoodenDuck(){
        iFlying = new Wingsless();
        iVoice = new SilentQuack();
    }
}
