package org.learning;

public class NumberSystem {

    public static void main(String[] args) {
        /*largerNo(15, 20);
        smallerNo(145,11,96);
        middleNo(11987,5668,96669);
        printAs(57,156,5);
        printTrue(355,20,15);
        printSquare(170,11,13);
        printEven(-454);
        printMultiple(20);
        printOdd(21,31);
        printEvenSum(4,10);
        printMultiple4and5(20);
        swapInt(15,30);
        raisingOrder(5676598);
        countDigit( 5678);
        SumOfDigit(12345);
        //reverse(1234);
        palindrome(123455521);
        factorial(5);
        prime(11);
        initialPrime(20);
       betweenPrime(50,100);
        primefrom100(20);
        sumOfPrime(30);
        betweenSum(2,10);
        reversePrime();
       // multipleOfPrime();
        //beforeMultiple();
        //primeInRaising(30);
        //primeDescending(5);
        //fibonacci(15);
         // tillFibonacci(100,10000);*/
       // reverseOrderFibonacci();
        armstrong(371);
        initialArmstrong(200);
    }

    public static void largerNo(int a, int b) {
        if (a > b) {
            System.out.println(a + " is the greatest number.");
        } else {
            System.out.println(b + " is the greatest number.");
        }
    }

    public static void smallerNo(int a,int b, int c){
        if(a<b && a<c){
            System.out.println(a +" is smallest number.");
        } else if (b<c) {
            System.out.println(b +" is smallest number.");
        }else {
            System.out.println(c +" is the smallest number.");
        }

    }
    public static void middleNo(int a,int b, int c){
        if(a>b &&  a<c)
            System.out.println(a +" is middle number.");
        else if (b>a && b<c) {
            System.out.println(b +" is middle number.");
        }else{
            System.out.println(c +" is middle number.");
        }
    }
    public static void printAscending(int a, int b, int c){
        if(a<b && a<c && b<c) {
            System.out.println(a+ "," + b +","+ c);
        } else if (a<b && a<c && c<b) {
            System.out.println(a+ "," + c +","+ b);
         } else if (b<a && b <c && a<c) {
            System.out.println(b+","+ a+","+ c);
         }else if (b<a && b <c && c<a) {
                System.out.println(b+","+ c +","+ a);
            }
        else {
            System.out.println(c + ","+ a+","+ b);
        }
    }

    public static void printAs(int a, int b, int c){
       int min = getMin(a, b, c);
       if(min == a){
          print(min, b, c);
       } else if (min == b) {
           print(min, a, c);
       } else {
           print(min,a, b);
       }
    }

    private static void print(int min, int num1, int num2){
        if(num1 < num2){
            System.out.println(min +","  + num1 + "," + num2);
        }else {
            System.out.println(min +","  + num2 + "," + num1);
        }
    }


    private static int getMin(int... a){
        int num = a[0];
        for(int index = 1; index < a.length; index++){
            if(num > a[index]){
                num = a[index];
            }
        }
        return num;
    }

    public static void printTrue(int a, int b, int c){
        if(a + b ==c || b+c==a || a+c ==b){
            System.out.println(" true ");
        }else
            System.out.println(" false ");
    }

    public static void printSquare(int a, int b, int c){
        if((a*a )+ (b*b) ==c || (b*b)+(c*c)==a || (a*a)+(c*c) ==b){
            System.out.println(" true ");
        }else
            System.out.println(" false ");
    }

    public static void printEven(int a){
        if(a==0){
            System.out.println(a + " is neither even nor odd. ");
        } else if ( a % 2 == 0) {
            System.out.println(a +" is even number.");
        }else{
            System.out.println(a +" is odd number.");
        }
    }
    public  static void printMultiple(int a){
        for(int i=1 ; i<=5; i++){
            System.out.println( i *a );
        }
    }

    public static void printOdd(int a, int b){
        for(int i=a;i<=b ; i++){
            if(i % 2 !=0){
                System.out.println(i);
            }
        }
    }

    public static void printEvenSum(int a, int b){
        int sum =0;
        for(int i=a;i<=b ; i++){
            if(i % 2 ==0){
                System.out.println(i);
                sum+=i;
            }
        }
        System.out.println( " sum of given all even number = " + sum);
    }

    public static void printMultiple4and5(int a){
        for(int i=1; i<=a; i++){
            if(i%4==0 && i% 5==0){
                System.out.println("lara");
            } else if (i % 4==0 ){
                System.out.println(" java ");
            }else if (i % 5==0){
                System.out.println("J2ee");
            }
        }
    }

    public static void swapInt(int a, int b){
        System.out.println(  a  );
        System.out.println(  b );
        a= a+b;
        b=a-b;
        a=a-b;
        System.out.println(  a  );
        System.out.println(  b );
    }

    public static  void raisingOrder(int n ) {
        int rem = n % 10;
        n /= 10;
        while (n > 0) {
            int temp = n % 10;
            if (rem > temp) {
                rem = temp;
                n /= 10;
            } else {
                System.out.println(" it is not rising number .");
                return;
            }
        }
        System.out.println(" it is rising number.");
    }


    public static  void countDigit(int n){
        int count=0;
        while(n>0){
            int temp =n%10;
            count+=1;
            n=n/10;

        }
        System.out.println(" Total number of digit is = " +count );
    }

    public static void SumOfDigit(int n){
        int sum=0;
        while (n>0){
            int temp= n%10;
            sum += temp;
            n= n/10;
        }
        System.out.println(" Sum of all digit = " + sum );
    }

    public static void palindrome(int num){
        int n =num;
        int temp=0;
        int rem = 0;
        while(n>0) {
            rem = n % 10;
            temp =  temp *10 + rem;
            n /= 10;
        }
            if (num == temp) {
                System.out.println(" it is Palindrome number.");
            } else {
                System.out.println(" It is not a Palindrome number.");
            }



    }

    public static void reverse(int n){
        while (n>0){
            int temp=n%10;
            int rem=temp;
            System.out.print( rem );
            n=n/10;
        }
    }

    public  static  void factorial(int n){
        int temp = n;
        int fact = 1;
        while(n>0){
            fact = fact * n;
            n=n-1;
        }
        System.out.println(" Factorial of " + temp +" is = " + fact );
    }


    public static void  prime(int n){

        for(int i= 2; i<n; i++) {
            if (n % i == 0) {
                System.out.println(" It is not a prime number. ");
                return;
            }
        }
        System.out.println(" It is prime number.");
    }

    public static  void initialPrime(int n ){
        int count =0;
        int num = 2;
        while(count<n){
            boolean isPrime = isPrime(num);
            if (isPrime){
                System.out.println(num);
                count++;
            }
            num++;
        }


    }

    public  static boolean isPrime(int n){
        boolean isPrime= true;
        for(int i=2;i<n;i++){
            if(n%i == 0){
                isPrime = false;
                break;
            }
        }

          return isPrime;

    }

    public static  void betweenPrime(int n1, int n2){
        for(int i=n1;i<n2;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }

    public static void primefrom100(int n){
        int count =0;
        int num=100;
        while (count<n) {
            if (isPrime(num)) {
                System.out.println(num);
                count++;
            }
            num++;
        }
    }

    public  static  void sumOfPrime(int n){
        int count= 0;
        int num =2;
        int sum=0;
        while(count<n){
            if(isPrime(num)){
                sum +=num;
                count ++;
            }
            num++;
        }
        System.out.println(" sum of initial "+ count +" prime no = "+ sum);
    }

    public  static void  betweenSum(int n1, int n2){
        int sum=0;
        for(int i=n1;i<n2;i++){
            if(isPrime(i)){
                sum+=i;
            }
        }
        System.out.println(" sum of between  "+n1+ " and "+n2 +" is = "+sum);
    }

    public static void reversePrime(){
        for(int i=70;i>20;i--){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }

    public static void multipleOfPrime(){
        for(int i=10;i<200;i++){
            if(i%10==0){
                //while (true){
                for(int j = i; j < i+10; j++){
                    if(isPrime(j)){
                        System.out.println(j);
                        break;
                    }
                  //  i++;
                    i = j;
                }

            }
        }
    }

    public static void beforeMultiple() {
         int beforePrime=0;
        for(int i = 2; i<200; i++){
            if(isPrime(i)) {
                beforePrime = i;
            }
            if(i%10==0){
                System.out.println(beforePrime);

            }
        }
    }


    public static void primeInRaising(int n){
      int count =0;
      int num=11;
        System.out.println(" Prime number in raising order:-  ");
        while(count<n){
          if(isPrime(num)){
              System.out.println( num );
              count ++;
          } num++;
      }
    }

    public static void primeDescending(int n){
        int count=0;
        int num=10;
        System.out.println("Prime number in descending order:-  ");
        while(count<n){
            if(isPrime(num)){
                count++;
            }
            num++;
        }
        for(int i = num; i >10; i--){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
    public static void fibonacci(int n){
        int firstNo = 0;
        int secondNo =1;
        System.out.println( firstNo );
        System.out.println(secondNo);
        for(int i=0;i<n; i++){
            int thirdNo= firstNo + secondNo;
            System.out.println( thirdNo );
            firstNo = secondNo;
            secondNo = thirdNo;
        }
    }

    public static void tillFibonacci(int n1, int n2){
        int firstNo = 100;
        int secondNo = 102;
        System.out.println( firstNo );
        System.out.println( secondNo);
        for(int i = n1; i<n2; i++){
            int thirdNo = firstNo +secondNo;
            System.out.println( thirdNo);
            firstNo= secondNo;
            secondNo = thirdNo;
        }
    }

    public static void reverseOrderFibonacci(){
        int firstNo = 500;
        int secondNo = 501;
        System.out.println( firstNo );
        System.out.println( secondNo);
        for(int i = 5000; i<500; i--) {
            int thirdNo = firstNo+ secondNo;
            System.out.println(thirdNo);
            firstNo = secondNo;
            secondNo = thirdNo;
        }
    }

    public  static void armstrong(int n){
        int num = n;
        int temp=0;
        int rem=0;
        while (n>0){
            rem= n%10;
            temp=temp + (rem*rem*rem);
            n/=10;
        }
        if(temp==num){
            System.out.println(" it is armstrong.");
        }
        else{
            System.out.println(" it is not armstrong number.");
        }
    }

    public static void initialArmstrong(int n){
        int temp=0;
        //int num=n;
        int rem=0;
        for(int i=10;i<n;i++) {
            while (n > 0) {
                rem = n % 10;
                temp = temp + (rem * rem + rem);
                n /= 10;
            }
            if(i== temp){
                System.out.println(i);
            }
        }

    }


}
