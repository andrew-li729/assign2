import java.util.Scanner;

public class Students {
    Scanner input = new Scanner(System.in);
    private String Fname,Lname,standing,email,id,address,city,state,zip;





    public void getInfo(){
        System.out.println("Enter first name:");
        Fname=input.nextLine();
        while(!Fname.matches("[a-zA-Z]+")){
            System.out.println("Please enter a valid name!");
            Fname=input.nextLine();
        }

        System.out.println("Enter last name:");
        Lname=input.nextLine();
        while(!Lname.matches("[a-zA-Z]+")){
            System.out.println("Please enter a valid name!");
            Lname=input.nextLine();
        }

        System.out.println("Enter PeopleSoft ID");
        id=input.nextLine();
        while(!id.matches("[0-9]+")){
            System.out.println("Please enter a valid ID number!");
            id=input.nextLine();
        }

        System.out.println("Enter class standing:");
        standing=input.nextLine();
        while(!((standing.equals("freshman")||standing.equals("sophomore")||standing.equals("junior"))||standing.equals("senior"))){
            System.out.println("Please enter a valid standing!");
            standing=input.nextLine();
        }

        System.out.println("Enter email:");
        email=input.nextLine();
        while(!(email.matches("^(.+)@(.+)(.com|.edu|.org)$"))){
            System.out.println("Please enter a valid email!");
            email=input.nextLine();
        }

        System.out.println("Enter address line 1:");
        address=input.nextLine();
        while(!(address.matches("^(.+)\\d(.+) (.+)[a-zA-Z]$"))){
            System.out.println("Please enter a valid address line 1!");
            address=input.nextLine();
        }

        System.out.println("Enter city:");
        city=input.nextLine();
        while(!(city.matches("[a-zA-Z]"))){
            System.out.println("Please enter a valid address line 1!");
            city=input.nextLine();
        }



    }
    public void displayInfo(){

        System.out.println(Fname+" "+Lname+" "+id+" "+standing+" "+email+" "+address);
    }

}
