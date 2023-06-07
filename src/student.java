class student {

    //Data Members: Instance Variable

    int studentId;
    String studentName;
    String studentCity;

    public void study(){
        System.out.println(studentName + " is studying");
    }


    public void showFullDetails(){
        System.out.println("my name is : " + studentName);
        System.out.println("my id is : " + studentId);
        System.out.println("my city is : " + studentCity);
    }


}
