import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int NumberOfSub = 4;

        int[] marks = new int[ NumberOfSub];

        // Input marks for each subject
        for (int i = 0; i <  NumberOfSub; i++) {
            System.out.println("Enter marks for subject " + (i + 1) + " (out of 100):");
            marks[i] = scanner.nextInt();
        }

        // Calculate total marks and average percentage
        int totalMarks = 0;
        for (int mark : marks) {
           
            totalMarks=mark+totalMarks;
        }
        double AveragePercen = (double) totalMarks /  NumberOfSub;

        // Assign grade
        String grade = AveragePercen >= 80 ? "A" : AveragePercen >= 60 ? "B" : "C";

        // Display results
        System.out.println("Total Marks: " + totalMarks);
        System.out.printf("Average Percentage: %.2f%%\n", AveragePercen);
        System.out.println("Grade: " + grade);
    }
}

