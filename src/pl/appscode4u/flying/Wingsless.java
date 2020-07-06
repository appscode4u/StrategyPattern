package pl.appscode4u.flying;

import pl.appscode4u.IFlying;

public class Wingsless implements IFlying {

    @Override
    public void fly() {
        System.out.println("My wings don't work, I can't fly :(");
    }
}
