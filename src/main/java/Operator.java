public class Operator implements Employee{
    public String employeeName;
    @Override
    public int getMonthSalary() {
        int salary = (int)(Math.random()*1000)+100;
        return salary;
    }

    @Override
    public void onFire() {
        System.out.println("Operator is fired" +employeeName);
    }

    @Override
    public void onHire() {
        System.out.println("Employee is hired as operator" +employeeName);
    }
}
