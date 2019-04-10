package sample;

public class Mainn {
    public static void main(String[] args) {
        PersonModel<student> studentPersonModel = new PersonModel<>();
        studentPersonModel.add(new student(1, 18, "Kiên"));
        studentPersonModel.add(new student(2, 19, "Giang"));
        studentPersonModel.input();
        PersonModel<Employee> employeePersonModel = new PersonModel<>();
        employeePersonModel.add(new Employee(3, 20.0000, "Đức"));
        employeePersonModel.add(new Employee(4, 30.000, "Thông"));
        employeePersonModel.input();
    }
}
