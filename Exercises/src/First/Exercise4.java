package First;

import java.io.*;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Exercise4 {

    private static final String path = "C:\\Users\\francisco\\Documents\\1-Backend\\Informatorio\\java_informatorio_practice\\Exercises\\DirectoryText\\empleado.txt";

    private static String message = "Program to writer an Object to a text file", c = "-";

    public static void main(String[] args) throws IOException {
        System.out.println(title_decorator() +'\n'+ message +'\n'+ title_decorator());

        writer_file(
                getEmployeeList()
        );
    }

    private static File create_file_text(String path){
        return new File(path);
    }
    private static void writer_file(List<Employee> employeeList) throws IOException {
           PrintWriter wr = new PrintWriter(
                   new FileWriter(
                           create_file_text(path)));

        employeeList.stream().forEach((p) -> wr.println(p));
        wr.close();
    }

    private static List<Employee> getEmployeeList(){
        return Arrays.asList(
                new Employee("Maria", "Gonzalez",32,LocalDate.parse("1990-02-13"),2300,12345678),
                new Employee("Lucas", "Paolliello",32,LocalDate.parse("1990-02-13"),2300,12345678),
                new Employee( "Maxi", "Carabajal",32,LocalDate.parse("1990-02-13"),2300,12345678),
                new Employee("Francisco", "Savato",32,LocalDate.parse("1990-02-13"),2300,12345678));
    }

    private static String title_decorator() {
        return c.repeat(message.length());
    }

    private static class Employee{
        private String firstName, lastName;
        private Integer age, salary, pasport;
        private LocalDate birthDate;

        public Employee(String firstName, String lastName, Integer age, LocalDate birthDate, Integer salary, Integer pasport) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.birthDate = birthDate;
            this.salary = salary;
            this.pasport = pasport;
        }

        @Override
        public String toString() {
            return firstName + ","
                    + lastName + ','
                    + age + ','
                    + birthDate + ','
                    + salary + ','
                    + pasport + ',';
        }
    }
}
