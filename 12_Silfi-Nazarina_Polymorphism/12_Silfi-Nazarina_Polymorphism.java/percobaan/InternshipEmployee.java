public class InternshipEmployee extends Employee {
    private int length;

    InternshipEmployee(String name, int length){
        this.length = length;
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String getEmployeeInfo() {
        String info = super.getEmployeeInfo() + "\n";
        info += "Registered as intership employee for "+length+" month/s\n";
        return info;
    }
}
