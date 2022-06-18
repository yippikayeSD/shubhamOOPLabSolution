import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.dxytech.models.Employee;

public class App {
    public static void main(String[] args) throws Exception {
        String firstName;
        String lastName;
        System.out.println("----Welcome to Credential Generator App----");
        try(BufferedReader employeeReader = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("Please enter first name");
            firstName = employeeReader.readLine();
            System.out.println("Please enter last name");
            lastName = employeeReader.readLine();
            Employee newRecruit = new Employee (firstName, lastName);
            newRecruit.setEmailId();
            newRecruit.setPassword();
            newRecruit.showEmployee();

            
        }catch(IOException e){
            System.err.println("An error occured while performing I/O Operations:"+e.getMessage());
        }
        
    }
}
