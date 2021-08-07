package Task4;
public class MainClass {
    public static void main (String [] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Ivan Ivanov", "Engineer", "ivan@mail", "3-15-22", 50000, 35);
        employees[1] = new Employee("Petr Petrov", "Programmer", "petr@mail", "3-15-25", 70000, 32);
        employees[2] = new Employee("Sidr Sidorov", "Plumber", "sidr@mail", "3-15-29", 20000, 60);
        employees[3] = new Employee("Katya Tupova", "Accountant", "kate@mail", "3-15-32", 25000, 55);
        employees[4] = new Employee("Ira Zatupova", "Secretary", "ira@mail", "3-15-66", 15000, 20);
        for (Employee emple : employees) {
            if (emple.getAge() > 40) {emple.employeeInfo();}
        }
        System.out.println();


        Cat cat = new Cat();
        Dog dog = new Dog();
        cat.show("cat.cwin(0); -> результат:", cat.swim(0));
        cat.show("cat.jump(1); -> результат:", cat.jump(1));
        cat.show("cat.run(50); -> результат:", cat.run(50));
        dog.show("cat.cwin(5); -> результат:", dog.swim(5));
        dog.show("cat.jump(5); -> результат:", dog.jump(5));
        dog.show("cat.run(50); -> результат:", dog.run(50));
        System.out.println();



        Dich dich =new Dich();  //  мой вариант с косяками
        dich.show2();          //  мой вариант с косяками
        cat.catEat();           //  мой вариант с косяками
        System.out.println();

        Bowl bowl = new Bowl();         // вариат Ильи , правильный, работает хорошо
        for (int i = 0; i < 5; i++) {   // вариат Ильи , правильный, работает хорошо
            cat.catEat(bowl);           // вариат Ильи , правильный, работает хорошо
        }
    }




     Cat cattttt = new Cat(200,0,2);   // это втрой метод не обращать внимания
     Dog doggggg = new Dog(500, 10, 0.5F); // это втрой метод не обращать внимания


}
