public class Test {

    private int id;
    private Student student;
    private Subject subject;

    public Test(int id, int roll, String name, int srNo, String title) {
        this.id = id;
        student = new Student(roll, name);
        subject = new Subject(srNo, title);
    }

    public void display() {
        System.out.println(id);
        student.display();
        subject.display();
        //System.out.println(student.roll);
    }

    class Student {
        private int roll;
        private String name;

        public Student(int roll, String name) {
            this.roll = roll;
            this.name = name;
        }

        public int getRoll() {
            return roll;
        }

        public void setRoll(int roll) {
            this.roll = roll;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void display() {
            System.out.println("roll = " + roll + " name = " + name);
        }
    }

    class Subject {
        private int srNo;
        private String title;

        public Subject(int srNo, String title) {
            this.srNo = srNo;
            this.title = title;
        }

        public int getSrNo() {
            return srNo;
        }

        public void setSrNo(int srNo) {
            this.srNo = srNo;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void display() {
            System.out.println("srNo = " + srNo + " title = " + title);
        }
    }

}

