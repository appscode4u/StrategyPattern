package pl.appscode4u.ducks;

import pl.appscode4u.Duck;
import pl.appscode4u.flying.FlyingBecauseOfWings;
import pl.appscode4u.quackStyle.NormalQuack;

public class NormalDuck extends Duck {
    @Override
    public void Show() {
        System.out.println("I'm live duck, I also can swimm.");
    }
    public NormalDuck(){
        iFlying = new FlyingBecauseOfWings();
        iVoice = new NormalQuack();
    }
}
