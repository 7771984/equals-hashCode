import java.util.Objects;

/* Создать класс Сотрудник (Employee) с полями:
Имя, Фамилия (String)
Название отдела (String)
Зарплата (double)
Реализовать equals и hashCode, который работает только с именем и фамилией */

public class Employee {

        private final String name;
        private final String surname;
        private final String department;
        private final double salary; 

    public Employee (String name, String surname, String department, double salary){
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.salary = salary;  
}

public String name() {
    return name;
}

public String surname() {
    return surname;
}

@Override
public String toString() {
    return "[" + name + ", " + surname + "]";
}

@Override
public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Employee employee = (Employee) o;
    return name == employee.name && surname == employee.surname;
}

@Override
public int hashCode() {
    return Objects.hash(name, surname);
}
}
