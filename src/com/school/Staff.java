package com.school;

public class Staff extends Person {
    public String staffRole;

    public Staff(String name, String staffRole) {
        super(name);
        this.staffRole = staffRole;
    }
    public String getRole() {
        return staffRole;
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.err.println("Staff Role: " + staffRole +" Role: Staff");
    }
}
