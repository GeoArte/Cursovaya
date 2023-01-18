public class Employee
{
    private String name;
    private int department;
    private int id;
    private int zp;

    private static int idCreate = 1;
    public Employee(String name, int department, int zp)
    {
        this.name = name;
        if (department >= 1 || department <= 5)
        {
            this.department = department;
        }
        else
        {
            throw new IllegalArgumentException("Такого отдела нет");
        }
        this.id = idCreate;
        idCreate ++;
        if (zp >= 0)
        {
            this.zp = zp;
        }
        else
        {
            throw new IllegalArgumentException("Неправильно выставленна зарплата");
        }
    }
    public String getName()
    {
        return this.name;
    }
    public int getDepartment()
    {
        return this.department;
    }
    public int getId()
    {
        return this.id;
    }
    public int getZp()
    {
        return this.zp;
    }
    public void setDepartment(int department)
    {
        if (department >= 1 || department <= 5)
        {
            this.department = department;
        }
        else
        {
            throw new IllegalArgumentException("Такого отдела нет");
        }
    }
    public void setZp(int zp)
    {
        if (zp >= 0)
        {
            this.zp = zp;
        }
        else
        {
            throw new IllegalArgumentException("Неправильно выставленна зарплата");
        }
    }
    public String toString ()
    {
        return "ФИО: " + this.name + "\nОтдел: " + this.department + "\nid: " + this.id + "\nЗарплата: " + this.zp;
    }
}