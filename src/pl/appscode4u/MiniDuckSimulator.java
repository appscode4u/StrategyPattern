package pl.appscode4u;

import pl.appscode4u.ducks.NormalDuck;
import pl.appscode4u.ducks.RubberDuck;
import pl.appscode4u.ducks.WoodenDuck;
import pl.appscode4u.flying.Wingsless;
import pl.appscode4u.quackStyle.SilentQuack;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck woody = new WoodenDuck();
        System.out.println("Wooden duck:");
        woody.swimm();
        woody.doFly();
        woody.doQuack();

        Duck rubber = new RubberDuck();
        System.out.println("\nRubber duck:");
        rubber.swimm();
        rubber.doFly();
        rubber.doQuack();

        Duck live = new NormalDuck();
        System.out.println("\nLive duck:");
        live.swimm();
        live.doFly();
        live.doQuack();
            //run-time change for voice and flying style
            live.setiVoice(new SilentQuack());
            live.setiFlying(new Wingsless());
            live.doFly();
            live.doQuack();
    }
}
