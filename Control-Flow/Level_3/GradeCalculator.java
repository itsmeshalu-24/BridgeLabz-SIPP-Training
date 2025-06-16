import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks for Physics, Chemistry, and Maths: ");
        int p = sc.nextInt(), c = sc.nextInt(), m = sc.nextInt();
        double avg = (p + c + m) / 3.0;
        String grade, remark;

        if (avg >= 80) { grade = "A"; remark = "Level 4, above agency-normalized standards"; }
        else if (avg >= 70) { grade = "B"; remark = "Level 3, at agency-normalized standards"; }
        else if (avg >= 60) { grade = "C"; remark = "Level 2, below, but approaching agency-normalized standards"; }
        else if (avg >= 50) { grade = "D"; remark = "Level 1, well below agency-normalized standards"; }
        else if (avg >= 40) { grade = "E"; remark = "Level 1-, too below agency-normalized standards"; }
        else { grade = "R"; remark = "Remedial standards"; }

        System.out.printf("Average: %.2f%%\nGrade: %s\nRemarks: %s\n", avg, grade, remark);
    }
}
