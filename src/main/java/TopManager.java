public class TopManager implements Employee{
    public String employeeName;
    @Override
    public int getMonthSalary() {
        int salary = (int)(Math.random()*5000)+5000;
        return salary;
    }

    @Override
    public void onFire() {
        System.out.println("TopManager is fired" +employeeName);
    }

    @Override
    public void onHire() {

        System.out.println("Employee is hired as TopManager" +employeeName);

    }
}
