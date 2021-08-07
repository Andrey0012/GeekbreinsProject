package Task4;

public class Cat extends Animal {
    protected int eatCount = (int) (Math.random() * 15); // кот сьедает за один раз

    public Cat(int _run, int _swim, int _jump) { // это втрой метод не обращать внимания
        this.swim = _swim;              // это втрой метод не обращать внимания
        this.run = _run;          // это втрой метод не обращать внимания
        this.jump = _jump;              // это втрой метод не обращать внимания

    }

    public Cat() {
        this.jump = 2;
        this.run = 200;
        this.swim = 0;
        this.eatCount = 7;
    }

    int catEatStat = 0;                                    //статус сытости
    Dich dich = new Dich();

    public int[] catEat() {                            // кот есть
        if ((dich.getEatBowl() - eatCount) >= 0) {
            // dich.getEatBowl() -= eatCount;
            catEatStat = 1;
            System.out.println("кот сыт");
            return new int[]{dich.getEatBowl(), catEatStat};
        } else {
            System.out.println("коту не хватает еды...");
            return new int[]{dich.getEatBowl(), catEatStat};
        }
    }

    private boolean status = false;       // изначально кот голоден (вариат Ильи , правильный, работает хорошо)
    public void catEat(Bowl bowl) {               // кот ест (вариат Ильи , правильный, работает хорошо)
        status = bowl.getEat(eatCount);
        if (status) System.out.println("Кот поел");
        else System.out.println("Кот голоден");
    }
}
