public class Test {
    public static void main(String args[]){


        //        variables in java

        int a = 10;
        System.out.println(a);
         a = 5;
        System.out.println(a);

        String name = "Jhon";
        System.out.println(name);


        //implicit typecasting

        int i = 50;
        double d = i;
        System.out.println(i);
        System.out.println(d);

//        explicit typecasting

        double mval = 24;
        int mint = (int)mval;
        System.out.println(mval);
        System.out.println(mint);



      //  if statement

//        int a = 10;
        int b = 8;
        if (a>12)
        {
            System.out.println("true");
        }
        System.out.println("false");


//        if-else statement

        if (a>b)
        {
            System.out.println("if block is executed");
        }
        else
        {
            System.out.println("else block executed");
        }


//        else if-ladder

        int marks = 72;
        if (marks>90){
            System.out.println("Grade A");
        } else if (marks>60 && marks<=90) {
            System.out.println("Grade B");
        } else if (marks>35 && marks<=60) {
            System.out.println("Grade C");
        }else {
            System.out.println("fail");
        }

//        nested if

        int x = 152;
        if (x>0){
            if (x%2==0){
                System.out.println(" it is even number");
            }
        }else {
            System.out.println("it is odd number");
        }



//        switch statement

        String day = "THU";

        switch (day){
            case "MON":
                System.out.println("its mondey");
                break;
            case "TUE":
                System.out.println("its tuesday");
                break;
            case "WED":
                System.out.println("its wednesday");
                break;
            case "THU":
                System.out.println("its thursday");
                break;
            case "FRI":
                System.out.println("its friday");
                break;
            default:
                System.out.println("its sunday");
        }








    }
}
