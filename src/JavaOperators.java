public class JavaOperators {

    public static  void main(String args[]){

//        int x=10;
//        //x++ = x+1,
//        x++;
//        System.out.println(x);//10 (11)
//        System.out.println(++x);//12
//        x--;
//        System.out.println(x);//12 (11)
//        System.out.println(--x);//10



      //  int a=10;
//        int b=5;
//        System.out.println(a+b);//15
//        System.out.println(a-b);//5
//        System.out.println(a*b);//50
//        System.out.println(a/b);//2
//        System.out.println(a%b);//0

//        int fNumber = 8;
//        int sNumber  = 19;
//        boolean value = fNumber == sNumber;


//        boolean payment = false;
//        boolean hasGrade = true;
//        boolean taskCompleted  = true;
//        boolean    registration = (payment && (hasGrade || taskCompleted));
//        System.out.println(registration);
        //&&

        String  name = "hanna";
        boolean isMale = true;
        boolean examPassed = false;


        System.out.println(isMale && !examPassed);



        System.out.println();

        boolean BankSaving=false;
        boolean GoodSalary= false;
        boolean ScoreCard = true;
        boolean CriminalRecord= false;


        boolean loan  = !CriminalRecord &&  ((ScoreCard && (BankSaving || GoodSalary)) || (BankSaving && GoodSalary));

        System.out.println(loan);


        boolean isUnderAge;
        boolean isEthiopian;
        boolean hasAnID;
        boolean isPerviousVoter;
        boolean CriminalRecord2= false;








    }
}
