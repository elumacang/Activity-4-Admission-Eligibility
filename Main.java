import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        
        int entranceScore;
        double gpa;
        
        System.out.println("Entrance Score: ");
        entranceScore = scn.nextInt();
        
        System.out.println("GPA: ");
        gpa = scn.nextDouble();
              
        if(entranceScore >= 70){

            if (gpa > 3.0) {
                System.out.println("You are eligable!");
            }
            else {
                System.out.println("\nI'm sorry but you failed.");
            }
            
        }
        else {
            System.out.println("\nI'm sorry but you failed.");
        }
        
        scn.close();
        
    }
    
}
