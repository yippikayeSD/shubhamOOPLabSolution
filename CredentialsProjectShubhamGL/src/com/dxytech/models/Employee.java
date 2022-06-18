package com.dxytech.models;



import com.dxytech.services.CredentialService;

public class Employee {
    private String employeeFirstName;
    private String employeeLastName;
    private String department;
    private String emailId;
    private String password;
    private int leaves;
    CredentialService credService = new CredentialService();
    public Employee(String employeeFirstName, String employeeLastName){
        this.employeeFirstName = employeeFirstName;
        this.employeeLastName = employeeLastName;
        System.out.printf("---Employee Created with First Name: \"%s\" and Last Name: \"%s\"---\n",employeeFirstName,employeeLastName);

    }

    //defining setter methods
    public void setEmployeeFirstName(String employeeFirstName) {
        this.employeeFirstName = employeeFirstName;
    }
    public void setEmployeeLastName(String employeeLastName) {
        this.employeeLastName = employeeLastName;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public void setEmailId() {
        emailId = credService.generateEmailAddress(this);
    }
    public void setPassword() {
        password = credService.generatePassword();
    }

    //defining getter methods
    public String getEmployeeFirstName() {
        return employeeFirstName;
    }
    public String getEmployeeLastName() {
        return employeeLastName;
    }
    public String getDepartment() {
        return department;
    }
    public String getEmailId() {
        return emailId;
    }
    public String getPassword() {
        return password;
    }
    //performing basic employee operations
    public void showEmployee(){
        credService.showCredentials(this);
    }
    public int calculateLeaves(){

        /*
         * basic leave calculation code goes here
         * We may define it here for MVP2.0
         */
        return leaves;


    }

    /*
     * Here we may define other operations on employee in MVP 2.0  like:
     * location
     * salary band
     * payroll calulations
     * calendar management
     * transfer management
     * training management
     * etc.
     */


}
