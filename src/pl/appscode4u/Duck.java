package pl.appscode4u;

public abstract class Duck{
    public IFlying iFlying;
    public IVoice iVoice;

    void swimm(){
        System.out.println("All pl.appscode4u.ducks can swimm");
    }
    public abstract void Show();

    public void doFly(){
        iFlying.fly();
    }

    public void doQuack(){
        iVoice.quack();
    }

    public void setiVoice(IVoice iVoice){ //method for runtime voice change
        this.iVoice = iVoice;
    }

    public void setiFlying(IFlying iFlying){ //method for runtime flying style change
        this.iFlying = iFlying;
    }
}