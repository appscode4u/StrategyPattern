package pl.appscode4u.ducks;

import pl.appscode4u.Duck;
import pl.appscode4u.flying.Wingsless;
import pl.appscode4u.quackStyle.SqueakQuack;

public class RubberDuck extends Duck {
    @Override
    public void Show() {
        System.out.println("I'm rubber duck, I can swimm.");
    }
    public RubberDuck(){
        iFlying = new Wingsless();
        iVoice = new SqueakQuack();
    }
}
