package com.demo.prototype;

public class Student implements IPrototype{
    private String firstName;
    private String lastName;
    private String schools;
    private String email;

    public Student(String firstName, String lastName, String schools, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.schools = schools;
        this.email = email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSchools(String schools) {
        this.schools = schools;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public IPrototype clone() {
        try {
            return (IPrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", schools='" + schools + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
