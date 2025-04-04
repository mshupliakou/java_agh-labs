public class ObjectComparisonTester{
    ObjectComparisonTester(){

    }
    public static void  compareObjects(TextEntity s1, TextEntity s2, TextEntity s3){
        if(s1.equals(s2)){
            System.out.println("s1.equals(s2) true");
        }
        if(s1.equals(s3)){
            System.out.println("true");
        }
        else{
            System.out.println("s1.equals(s3) false");
        }
        System.out.println("t1.hashCode(): "+s1.hashCode());
        System.out.println("t1.hashCode(): "+s2.hashCode());
        System.out.println("t1.hashCode(): "+s3.hashCode());
//
    }
}