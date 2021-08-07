package Task4;

public class Bowl {               // миска вариант Ильи, правильный класс

    private int MAX_COUNT = (int) (Math.random() * 10 + 20);   // максимальное количество еды в миске
    private int currentCount = MAX_COUNT - (int) (Math.random() * 10); ///текущее значение еды в миске

    public int getMaxCount() {
        return MAX_COUNT;
    }
    public void putEat(int eat) {             //положить еду
        if (eat > 0) {
            currentCount += eat;
            if (currentCount > MAX_COUNT) currentCount = MAX_COUNT;
        } else {
            System.out.println("Нельзя положить отрицательное количество");
        }
    }

    public boolean getEat(int eat) {       // съесть еду
        if (eat <= currentCount) {
            currentCount -= eat;
            return true;
        } else {
            return false;
        }
    }

    public int getCurrentCount() {      //получить текущее значение
        return currentCount;
    }


}
