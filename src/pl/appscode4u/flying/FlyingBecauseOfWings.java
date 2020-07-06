package pl.appscode4u.flying;

import pl.appscode4u.IFlying;

public class FlyingBecauseOfWings implements IFlying {

    @Override
    public void fly() {
        System.out.println("I have healthy wings and I can fly!");
    }
}
