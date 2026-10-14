package lms_Act;

/**
 *
 * @author Lawrenze
 */



import java.util.Scanner;
        
public class ClassRankingSystem {
    public static void main(String[] args) {
        class student {
        String name;
        double[] quiz;

        student(String name, double[] quiz) {
            this.name = name;
            this.quiz = quiz;
        }

        double getave() {
            double sum = 0;
            for (double score : quiz) {
                sum += score;
            }
            return sum / quiz.length;
        }
    }

    
        // Create array of students from 2D quiz data
        String[] names = {"Owen", "Ryan", "Railey", "Gwen"};
        double[][] scores = {
            {85, 80, 82, 84},
            {90, 85, 88, 92},
            {95, 90, 93, 91},
            {85, 80, 82, 84},
            
        };
        student[] list = new student[names.length];
        for(int i = 0; i < names.length; i++){
            list[i] = new student(names[i], scores[i]);
        }
        for(int i = 0; i < list.length -  1; i++){
            for(int j = 0; j < list.length -i -1; j++){
                if(list[j].getave() < list[j+1].getave()){
                    student temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
            }
        }
        System.out.println("Rank | Name   | Average");
        System.out.println("-------------------------");
        
        int rank = 1;
        for(int i = 0; i < list.length; i++){
            if(i > 0 && list[i].getave() == list[i-1].getave()){
                System.out.printf(" %d   | %-6s | %.2f\n", rank, list[i].name, list[i].getave());
            }else{
                rank = i + 1;
                System.out.printf(" %d   | %-6s | %.2f\n", rank, list[i].name, list[i].getave());
                }
        }
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("\nEnter Student Name: ");
        String fnd = sc.nextLine();
        boolean found = false;
        
        rank = 1;
        for(int i = 0; i < list.length; i++){
            if(i > 0 && list[i].getave() == list[i-1].getave()){
                
            }else{
                rank = i + 1;
            }
            
            
            
            if(list[i].name.equals(fnd)){
                System.out.printf("\n%s is ranked #%d with an average of %.2f\n", list[i].name, rank, list[i].getave());
                
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("\nStudent not found.");
        }
        
        
        
    } 
}
