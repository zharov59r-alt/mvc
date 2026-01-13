package mvc;


import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import mvc.validation.CheckEmail;

import java.util.List;
import java.util.Map;

public class Employee {

    @NotEmpty(message = "incorrect employee.name shouldn't be empty")
 //   @Size(min = 5, max = 20, message = "incorrect employee.name length")
    private String name;
    @NotEmpty(message = "incorrect employee.surname shouldn't be empty")
  //  @Size(min = 5, max = 20, message = "incorrect employee.surname length")
    private String surname;
 //   @Max(value = 1000, message = "incorrect employee.salary")
    private int salary;
    private String department;
    private String gender;
    private List<String> languages;

    @CheckEmail(value = "gmail.com")
    private String email;

    public Employee() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
