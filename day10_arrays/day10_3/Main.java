

public class Main {

    public static void main(String[] args) {
        student students[] = new student[10];
        String name[] = { "Ankit", "Ankuj", "Ashish", "Shivam", "Chhotu", "Nanakau", "Guddu", "Golu", "Amit", "Anuj" };
        for (int i = 0; i < students.length; i++) {
            student s1 = new student();
            s1.roll_no = i + 1;
            s1.setResult();
            s1.name = name[i];
            students[i] = s1;
        }
        System.out.println("RN.: Name :Total mark");
        for (student myStudent : students) {
            System.out.println(myStudent.roll_no + ": " + myStudent.name + ": " + myStudent.totalMark);
        }
        System.out.println();
        for (student myStudent : students) {
            System.out.println("RN.: Name :Total mark");
            System.out.println(myStudent.roll_no + ": " + myStudent.name + ": " + myStudent.totalMark);
            System.out.println("Hindi: " + myStudent.myResult.hindi);
            System.out.println("English: " + myStudent.myResult.english);
            System.out.println("Math: " + myStudent.myResult.math);
            System.out.println("Chemistry: " + myStudent.myResult.chemistry);
            System.out.println("Physics: " + myStudent.myResult.physics);
            System.out.println("Bio: " + myStudent.myResult.bio);
            System.out.println();

        }

    }
}

class result {
    int hindi;
    int english;
    int math;
    int chemistry;
    int physics;
    int bio;
}

class student {
    int roll_no;
    String name;
    int totalMark;
    result myResult;

    public void setResult() {
        myResult = new result();
        myResult.hindi = (int) (Math.random() * 100);
        myResult.english = (int) (Math.random() * 100);
        myResult.math = (int) (Math.random() * 100);
        myResult.chemistry = (int) (Math.random() * 100);
        myResult.physics = (int) (Math.random() * 100);
        myResult.bio = (int) (Math.random() * 100);
        totalMark = myResult.hindi + myResult.english + myResult.math + myResult.chemistry + myResult.physics
                + myResult.bio;
    }
}