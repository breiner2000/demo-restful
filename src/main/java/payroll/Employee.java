package payroll;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import java.util.Objects;


@Entity
class Employee {

    private @Id @GeneratedValue Long id;
    private String name;

//    modificaciones a la clase para empleados nuevos
    private String firstName;
    private String lastName;
    private String role;

    public Long getId() {
        return this.id;
    }

//    public String getName() {
//        return this.name;
//    }
//    cambiar metodo para empeados nuevos

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getName() {
        return this.firstName + " " + this.lastName;
    }


    public String getRole() {
        return this.role;
    }

    public Employee setId(Long id) {
        this.id = id;
        return this;
    }

//    public Employee setName(String name) {
//        this.name = name;
//        return this;
//    }

    public Employee setName(String name) {
        String[] parts = name.split(" ");
        this.firstName = parts[0];
        this.lastName = parts[1];
        return this;
    }


    public Employee setRole(String role) {
        this.role = role;
        return this;
    }

    public Employee setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public Employee setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }



//    @Override
//    public boolean equals(Object o) {
//
//        if (this == o)
//            return true;
//        if (!(o instanceof Employee))
//            return false;
//        Employee employee = (Employee) o;
//        return Objects.equals(this.id, employee.id) && Objects.equals(this.name, employee.name)
//                && Objects.equals(this.role, employee.role);
//    }

//    nuevo metodo para empleados nuevos
    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;
        if (!(o instanceof Employee))
            return false;
        Employee employee = (Employee) o;
        return Objects.equals(this.id, employee.id) && Objects.equals(this.firstName, employee.firstName)
                && Objects.equals(this.lastName, employee.lastName) && Objects.equals(this.role, employee.role);
    }


//    @Override
//    public int hashCode() {
//        return Objects.hash(this.id, this.name, this.role);
//    }

//    nuevo metodo para empleados nuevos
    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.firstName, this.lastName, this.role);
    }


//    @Override
//    public String toString() {
//        return "Employee{" + "id=" + this.id + ", name='" + this.name + '\'' + ", role='" + this.role + '\'' + '}';
//    }

//    nuevo metodo para empleados nuevos
    public String toString() {
        return "Employee{" + "id=" + this.id + ", firstName='" + this.firstName + '\'' + ", lastName='" + this.lastName
                + '\'' + ", role='" + this.role + '\'' + '}';
    }

}
