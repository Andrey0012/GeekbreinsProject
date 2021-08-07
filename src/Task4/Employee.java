package Task4;

public class Employee {
    protected String wio;
    protected String post;
    protected String email;
    protected String numberTelephone;
    protected int salary;
    protected int age;
    public Employee (String _wio, String _post, String _email, String _numberTelephone, int _salary, int _age) {
        wio = _wio;
        post = _post;
        email = _email;
        numberTelephone = _numberTelephone;
        salary = _salary;
        age = _age;
    }
    public int getAge() {
        return age;
    }
    public void employeeInfo () {
        System.out.println("сотрудник " + wio + ": должность " + post + ", почта: " +
                email + ", телефон: " + numberTelephone + ", зарплата: " + salary + ", возраст: " + age);
    }
}
