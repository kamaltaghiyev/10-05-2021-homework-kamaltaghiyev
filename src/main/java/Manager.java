public class Manager implements Employee{
    public String employeeName;

    @Override
    public int getMonthSalary() {
        int salary = (int)(Math.random()*4000)+1000;
        return salary;
    }

    @Override
    public void onFire() {
        
        System.out.println("Manager is fired" +employeeName);
    }

    @Override
    public void onHire() {
        this.employeeName=employeeName;
        System.out.println("Employee is hired as manager" +employeeName);
    }
}
