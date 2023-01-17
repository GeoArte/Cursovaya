import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args)
    {
        System.out.println();
        EmployeeBook workingShift = new EmployeeBook(10);
        workingShift.addEmployee("Трубной Василий Игоревич", 2, 130000);
        workingShift.addEmployee("Конюхов Борис Николаевич", 5, 30000);
        workingShift.addEmployee("Пупкин Василий Васильевич", 2, 160000);
        workingShift.addEmployee("Императоров Николай Александрович", 5, 20000);
        workingShift.addEmployee("Стенгер Филип Всерадович", 1, 250000);
        workingShift.addEmployee("Ламперуж Лилуш Чарльзович", 3, 100000);
        workingShift.addEmployee("Кустов Макар Сергеевич", 4, 70000);
        workingShift.addEmployee("Гласк Рената Силковна", 2, 140000);
        workingShift.addEmployee("Букин Геннадий Петрович", 4, 60000);
        workingShift.addEmployee("Пустынев Владимир Ильич", 5, 40000);
        workingShift.printEmployee();
        System.out.println("Затраты на зарплату: " + workingShift.sumZp() + "\n");
        System.out.println("Минимальная зарплата у:\n" + workingShift.minZp().toString() + "\n");
        System.out.println("Максимальная зарплата у:\n" + workingShift.maxZp().toString() + "\n");
        System.out.println("Средняя зарплата: " + workingShift.midZp() + "\n");
        workingShift.allName();
        workingShift.indexZp(10);
        System.out.println(workingShift.sumZp());
        workingShift.printEmployeeDepartment(2);
        System.out.println("Максимальная зарплата в отделе у:\n" + workingShift.maxZpDepartment(4).toString() + "\n");
        System.out.println("Минимальная зарплата в отделе у:\n" + workingShift.minZpDepartment(5).toString() + "\n");
        System.out.println("Средня зарплата в отделе:" + workingShift.midZpDepartment(3) + "\n");
        System.out.println("Затраты на зарплату в отделе: " + workingShift.sumZpDepartment(1) + "\n");
        workingShift.indexZpDepartment(10,1);
        EmployeeBook less = workingShift.employeesLessZp(90000);
        EmployeeBook more = workingShift.employeesMoreZp(90000);
        less.printEmployee();
        more.printEmployee();
        //Что бы не менять департамент или зарплату надо ввести -1
        workingShift.changeEmployee("Пустынев Владимир Ильич", -1, 10);
        workingShift.changeEmployee("Букин Геннадий Петрович", 2, -1);
        workingShift.deleteEmployeeId(3);
        workingShift.deleteEmployeeName("Кустов Макар Сергеевич");
        workingShift.printEmployee();
        workingShift.nameOfEmployeeByDepartment();
    }
}