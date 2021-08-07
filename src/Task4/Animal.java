package Task4;

public class Animal {
    protected int run;
    protected int swim;
    protected float jump;
    public String str;
    public boolean run(int a) {
        if (a <= run) return true;
        else return false;
    }
    public boolean swim(int a) {
        if (a <= swim) return true;
        else return false;
    }
    public boolean jump(float a) {
        if (a <= jump) return true;
        else return false;
    }
    public void show (String str, boolean g) {
        System.out.println(str + g);
    }
}
