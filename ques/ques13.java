import java.util.Scanner;

class Student {
    String Name;
    long rollNo;

    void getData(String Name, long rollNo) {
        this.Name = Name;
        this.rollNo = rollNo;
    }
}

class Exam extends Student {
    int Exam_Marks;

    void getData(String Name, long rollNo, int Exam_Marks) {
        super.getData(Name, rollNo);
        this.Exam_Marks = Exam_Marks;
    }
}

interface Sports {
    int marks = 50;
}

class Result extends Exam implements Sports {
    int resultExam() {
        return marks + Exam_Marks;
    }

    void getData(String Name, long rollNo, int Exam_Marks) {
        super.getData(Name, rollNo, Exam_Marks);
    }

}

class ques13 {
    public static void main(String[] args) {
        Result r1 = new Result();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name : ");
        String Name = sc.next();
        System.out.println("Enter rollno : ");
        int rollNo = sc.nextInt();
        System.out.println("Enter exam_marks : ");
        int Exam_Marks = sc.nextInt();
        r1.getData(Name, rollNo, Exam_Marks);
        System.out.println("Total marks = " + r1.resultExam());
        sc.close();
    }
}
