public class EmployeeBook
{
    private Employee[] employees;
    private int size;

    public EmployeeBook(int size)
    {
        this.employees = new Employee[size];
        this.size = size;
    }
    public int getSize()
    {
        return this.size;
    }
    public Employee[] getEmployees()
    {
        return this.employees;
    }


    public void printEmployee ()
    {
        for (int i = 0; i < this.getSize(); i++)
        {
            if (this.employees[i] != null)
            {
                System.out.println("Сотрудник №" + (i+1) + ":\n" + this.employees[i].toString());
                System.out.println();
            }
            else
            {
                System.out.println("Нет сотрудника.");
                System.out.println();
            }
        }
    }

    public int sumZp ()
    {
        int sum = 0;
        for (int i = 0; i < this.size; i++)
        {
            if (this.employees[i] != null)
            {
                sum = sum + this.employees[i].getZp();
            }
        }
        return sum;
    }
    public Employee minZp ()
    {
        int b = 0;
        int min = 1000000000;
        for (int i = 0; i < this.size; i++)
        {
            if (this.employees[i] != null)
            {
                if (min > this.employees[i].getZp())
                {
                    b = i;
                    min = this.employees[i].getZp();
                }
            }
        }
        return this.employees[b];
    }
    public Employee maxZp ()
    {
        int b = 0;
        int max = 0;
        for (int i = 0; i < this.size; i++)
        {
            if (this.employees[i] != null)
            {
                if (max < this.employees[i].getZp())
                {
                    b = i;
                    max = this.employees[i].getZp();
                }
            }
        }
        return this.employees[b];
    }
    public float midZp()
    {
        float mid = this.sumZp()/this.size;
        return mid;
    }

    public void allName()
    {
        for (int i = 0; i < this.size; i++)
        {
            if (this.employees[i] != null)
            {
                System.out.println("Сотрудник №" + (i+1) + ":\n" + this.employees[i].getName());
            }
        }
    }
    public void indexZp(int pr)
    {
        for (int i = 0; i < this.employees.length; i++)
        {
            if (this.employees[i] != null)
            {
                this.employees[i].setZp(this.employees[i].getZp()+((this.employees[i].getZp()*pr)/100));
            }
        }
    }
    public EmployeeBook employeesLessZp(int zp)
    {
        int c = 0;
        for (int i = 0; i < this.size; i++)
        {
            if (this.employees[i] != null)
            {
                if (this.employees[i].getZp() < zp)
                {
                    c++;
                }
            }
        }
        EmployeeBook b = new EmployeeBook(c);
        for (int i = 0; i < this.size; i++)
        {
            if (this.employees[i] != null)
            {
                if (this.employees[i].getZp() < zp)
                {
                    b.addEmployee(this.employees[i].getName(), this.employees[i].getDepartment(), this.employees[i].getZp());
                }
            }
        }
        return b;
    }
    public EmployeeBook employeesMoreZp(int zp)
    {
        int c = 0;
        for (int i = 0; i < this.size; i++)
        {
            if (this.employees[i] != null)
            {
                if (this.employees[i].getZp() >= zp)
                {
                    c++;
                }
            }
        }
        EmployeeBook b = new EmployeeBook(c);
        for (int i = 0; i < this.size; i++)
        {
            if (this.employees[i] != null)
            {
                if (this.employees[i].getZp() >= zp)
                {
                    b.addEmployee(this.employees[i].getName(), this.employees[i].getDepartment(), this.employees[i].getZp());
                }
            }
        }
        return b;
    }
    public Employee minZpDepartment(int department)
    {
        int min = 10000000;
        int minNum = 10;
        for (int i = 0; i < 10; i++) {
            if (this.employees[i] != null)
            {
                if (this.employees[i].getDepartment() == department)
                {
                    if (min > this.employees[i].getZp())
                    {
                        minNum = i;
                        min = this.employees[i].getZp();
                    }
                }
            }
        }
        if (minNum < 10) {
            return this.employees[minNum];
        }
        else
        {
            throw new IllegalArgumentException("Такого отдела не существует");
        }
    }

    public Employee maxZpDepartment(int department)
    {
        int max = 0;
        int maxNum = 10;
        for (int i = 0; i < 10; i++)
        {
            if (this.employees[i] != null)
            {
                if (this.employees[i].getDepartment() == department)
                {
                    if (max < this.employees[i].getZp())
                    {
                        maxNum = i;
                        max = this.employees[i].getZp();
                    }
                }
            }
        }
        if (maxNum < 10)
        {
            return this.employees[maxNum];
        }
        else
        {
            throw new IllegalArgumentException("Такого отдела не существует");
        }
    }

    public int sumZpDepartment (int department)
    {
        int sum = 0;
        for (int i = 0; i < this.size; i++)
        {
            if (this.employees[i] != null)
            {
                if (this.employees[i].getDepartment() == department)
                {
                    sum = sum + this.employees[i].getZp();
                }
            }
        }
        return sum;
    }
    public float midZpDepartment(int department)
    {
        int departmentEmployees = 0;
        for (int i = 0; i < this.size; i++)
        {
            if (this.employees[i] != null)
            {
                if (this.employees[i].getDepartment() == department)
                {
                    departmentEmployees++;
                }
            }
        }
        float mid = this.sumZpDepartment(department)/departmentEmployees;
        return mid;
    }
    public void indexZpDepartment(int pr, int department)
    {
        for (int i = 0; i < this.size; i++)
        {
            if (this.employees[i] != null)
            {
                if (this.employees[i].getDepartment() == department)
                {
                    this.employees[i].setZp(this.employees[i].getZp()+((this.employees[i].getZp()*pr)/100));
                }
            }
        }
    }
    public void printEmployeeDepartment (int department)
    {
        System.out.println();
        for (int i = 0; i < this.size; i++)
        {
            if (this.employees[i] != null)
            {
                if (this.employees[i].getDepartment() == department)
                {
                    System.out.println("Сотрудник №" + (i+1) + ":\nИмя: " + this.employees[i].getName() + "\nId: " + this.employees[i].getId() + "\nЗарплата: " + this.employees[i].getZp());
                    System.out.println();
                }
            }
        }
    }
    public void addEmployee(String name, int department, int zp)
    {
        boolean breakCheck = false;
        for (int i = 0; i < this.size; i ++)
        {
            if (this.employees[i] == null)
            {
                this.employees[i] = new Employee(name, department, zp);
                breakCheck = true;
            }
            if (breakCheck == true)
            {
                break;
            }
        }
        if (breakCheck == false)
        {
            System.out.println("Не удалось добавить сотрудника так как больше нет мест.");
        }
    }
    public void deleteEmployeeName(String name)
    {
        boolean breakCheck = false;
        for (int i = 0; i < this.size; i ++)
        {
            if (this.employees[i] != null)
            {
                if (this.employees[i].getName().equals(name))
                {
                    this.employees[i] = null;
                    breakCheck = true;
                }
                if (breakCheck == true)
                {
                    break;
                }
            }
        }
        if (breakCheck == false)
        {
            System.out.println("Такого сотрудника нет");
        }
    }
    public void deleteEmployeeId(int id)
    {
        boolean breakCheck = false;
        for (int i = 0; i < this.size; i ++)
        {
            if (this.employees[i] != null)
            {
                if (this.employees[i].getId() == id)
                {
                    this.employees[i] = null;
                    breakCheck = true;
                }
                if (breakCheck == true)
                {
                    break;
                }
            }
        }
        if (breakCheck == false)
        {
            System.out.println("Такого сотрудника нет");
        }
    }
    public void changeEmployee(String name, int department, int zp) //Что бы не менять департамент или зарплату надо ввести -1
    {
        boolean breakCheck = false;
        for (int i = 0; i < this.size; i ++)
        {
            if (this.employees[i] != null)
            {
                if (this.employees[i].getName().equals(name))
                {
                    if (department != -1)
                    {
                        this.employees[i].setDepartment(department);
                    }
                    if (zp != -1)
                    {
                        this.employees[i].setZp(zp);
                    }
                    breakCheck = true;
                }
            }
            if (breakCheck == true)
            {
                break;
            }
        }
        if (breakCheck == false)
        {
            System.out.println("Такого сотрудника нет");
        }
    }
    public void nameOfEmployeeByDepartment ()
    {
        for (int department = 1; department < 6; department ++)
        {
            System.out.println("Отдел №" + department + ":\n");
            for (int i = 0; i < this.size; i++)
            {
                if (this.employees[i] != null)
                {
                    if (this.employees[i].getDepartment() == department)
                    {
                        System.out.println("    Имя: " + this.employees[i].getName() + "\n    Id: " + this.employees[i].getId() + "\n    Зарплата: " + this.employees[i].getZp());
                        System.out.println();
                    }
                }
            }
        }
    }
}