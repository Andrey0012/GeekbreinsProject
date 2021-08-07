package Task4;

public class Dich {            // мой вариант миски работает плохо, не псовсем правильно работает алгоритм
    int maxCountBowl = 20;         //максимальное количество еды  в миске, то есть максимальный объем еды
    private int eatBowl = (int) (Math.random()*maxCountBowl);       //начальная еда в миске

    public int getEatBowl() {
        return eatBowl;
    }

    public int getBowl(int a){                                              //наполнение миски
        a = maxCountBowl - eatBowl;
        System.out.println("добавлено еды в миску: " + a);
        eatBowl += a;
        return eatBowl;
    }
    public int catEatBowl (int a) {              // остаток еды после того как кот поест
        Cat cat = new Cat();
        if (cat.catEatStat == 1) {
            eatBowl -= cat.eatCount;
        }
        return eatBowl;
    }
    public void show2 () {
        System.out.println(eatBowl);
    }
}
