package Task4;

public class Dog extends Animal{
    public Dog (int _run, int _swim, float _jump) {
        this.swim = _swim;
        this.run = _run;
        this.jump = _jump;
    }
    public Dog () {
        this.jump = 0.5F;
        this.run = 500;
        this.swim = 10;
    }
}
