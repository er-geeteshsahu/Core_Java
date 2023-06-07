class Demo {

    public static void main(String args[]){
        student std1 = new student();

        std1.studentName = "aman";
        std1.studentId = 123;
        std1.studentCity = "delhi";

        std1.study();
        std1.showFullDetails();


        student std2 = new student();

        std2.studentName = "Rahul";
        std2.studentId = 124;
        std2.studentCity = "mumbai";

        std2.study();
        std2.showFullDetails();
    }

}
