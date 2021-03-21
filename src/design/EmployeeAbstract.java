package design;

public abstract class EmployeeAbstract implements Employee{
    @Override
    public int employeeId() {
        return 0;
    }

    @Override
    public String employeeName() {
        return null;
    }

    @Override
    public void assignDepartment() {

    }

    @Override
    public int calculateSalary() {
        return 0;
    }

    @Override
    public void benefitLayout() {

    }

    @Override
    public void employeeDOB() {

    }

    @Override
    public void dateHired() {

    }

    public abstract void vacationDaysLeft();

}
