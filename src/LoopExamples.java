class LoopExamples {
    public static void main(String args[]){

        //for loop in java
        //forward direction
        for (int i=1; i<=10; i++){
            System.out.println(i+"");
        }

        //reverse order
        for (int i=10; i>0; i--){
            System.out.println(i+" ");
        }



        //while loop
        int j=100;
        while (j<=110){
            System.out.println(j);
            j++;
        }


//        for-each

        int num[] = {15, 16, 17, 18};
        for (int x:num) {
            System.out.println(x);
        }

    }
}
