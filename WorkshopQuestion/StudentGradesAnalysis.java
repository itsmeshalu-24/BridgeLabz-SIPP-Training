import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentGradesAnalysis {

    static class Student {
        String name;
        String id;
        int[] grades;  // Grades for multiple subjects

        Student(String name, String id, int numSubjects) {
            this.name = name;
            this.id = id;
            this.grades = new int[numSubjects];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter number of students: ");
            int numStudents = sc.nextInt();
            System.out.print("Enter number of subjects: ");
            int numSubjects = sc.nextInt();

            Student[] students = new Student[numStudents];

            // Input student details and grades
            for (int i = 0; i < numStudents; i++) {
                sc.nextLine(); // Consume leftover newline
                System.out.println("\nEnter details for Student " + (i + 1));
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("ID: ");
                String id = sc.nextLine();

                students[i] = new Student(name, id, numSubjects);

                for (int j = 0; j < numSubjects; j++) {
                    while (true) {
                        try {
                            System.out.print("Enter grade for subject " + (j + 1) + ": ");
                            int grade = sc.nextInt();
                            if (grade < 0 || grade > 100) {
                                throw new IllegalArgumentException("Grade must be between 0 and 100");
                            }
                            students[i].grades[j] = grade;
                            break; // Valid input
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid input! Please enter a number.");
                            sc.next(); // Clear invalid input
                        } catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                }
            }

            System.out.println("\n--- Student Total and Average ---");
            for (Student s : students) {
                int total = 0;
                int validGrades = 0;
                for (int g : s.grades) {
                    total += g;
                    validGrades++;
                }
                double average = validGrades > 0 ? (double) total / validGrades : 0;
                System.out.println("Student: " + s.name + " | ID: " + s.id +
                        " | Total: " + total + " | Average: " + String.format("%.2f", average));
            }

            System.out.println("\n--- Highest Grade per Subject ---");
            for (int subj = 0; subj < numSubjects; subj++) {
                int highest = -1;
                for (Student s : students) {
                    highest = Math.max(highest, s.grades[subj]);
                }
                System.out.println("Subject " + (subj + 1) + ": " + highest);
            }

            System.out.println("\n--- Overall Class Average ---");
            int totalGrades = 0, gradeCount = 0;
            for (Student s : students) {
                for (int g : s.grades) {
                    totalGrades += g;
                    gradeCount++;
                }
            }
            double classAverage = gradeCount > 0 ? (double) totalGrades / gradeCount : 0;
            System.out.println("Class Average: " + String.format("%.2f", classAverage));

        } catch (InputMismatchException e) {
            System.out.println("Invalid number input! Program exiting.");
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        } finally {
                   }
    }
}









}