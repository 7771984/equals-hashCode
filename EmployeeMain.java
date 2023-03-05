import java.lang.reflect.Array;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Алексей", "Иванов", "Снабжение", 50000);
        Employee emp2 = new Employee("Владимир", "Логинов", "Продажи", 80000);
        Employee emp3 = new Employee("Максим", "Петров", "IT", 150000);
        Employee emp4 = new Employee("Мария", "Матвеева", "HR", 60000);
        Employee emp5 = new Employee("Алексей", "Иванов", "Логистика", 90000);
       
       
        if (!emp1.equals(emp2)){
            System.out.println("Все не гуд");
        }

        if (emp1.equals(emp5)){
            System.out.println("Все гуд");
        }
    }
}


