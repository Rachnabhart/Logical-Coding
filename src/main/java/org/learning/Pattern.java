package org.learning;

public class Pattern {

    public static void main(String[] args) {

      /*
      twenOne();
        twentwo();
        twenthree();
        twenfour();
        twenfive();
        twensix();
        twenseven();
        tweneight();
        twennine();
        thirty();
        thirone();
        thirtwo();
        thirthree();
        thirfour();
        thirfive();
        thirsix();
        thirseven();
        thireight();
        thirnine();
        fourty();
        fourone();
        fourtwo();
        fourthree();
        fouFour();
        fouFive();
        fouSix();
        fouSeven();
        fouEight();
        fouNine();
        fifty();
        fifOne();
        fifTwo();
        fifThree();
        fifFour();
        fifSix();*/
        fifSeven();
        //fifty1();
    }
    public static void oneToTen(){
        first();
        second();
        third();
        fourth();
        fifth();
        sixth();
        seventh();
        eighth();
        ninth();
        tenth();
    }
    public static void elevenToTwenty(){
        eleventh();
        twelth();
        thirteen();
        fourteen();
        fifteen();
        sixteen();
        seventeen();
        eighteen();
        nintheen();
        twenty();
    }
    public static  void first(){
        for (int i=1; i<=5;i++){
            for (int j=1;j<=5;j++) {
                System.out.print(" * ");
            };
            System.out.println(" ");
        }
    }

    public static void second(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.print(i);
            }
            System.out.println(" ");
        }
    }

    public static void third(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }

    public static void fourth(){
         char ch = 65;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.print( ch );
            }
            System.out.println(" ");
            ch++;
        }
    }

    public static void fifth(){
        for(int i = 0; i < 5; i++){
            for(char c1 = 'A'; c1 <= 'E'; c1++){
                System.out.print(c1 + " ");
            }
            System.out.println();
        }
    }

    public static void sixth(){
        for(int i=5;i>=1;i--){
            for(int j=0;j<5;j++){
                System.out.print( i );
            }
            System.out.println(" ");
        }
    }

    public static void seventh(){
        for(int i=5;i>=1;i--){
            for(int j=5;j>=1;j--){
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }

    public static void eighth() {
        char ch = 69;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(ch);
            }
            ch--;
            System.out.println(" ");
        }
    }
        public static void ninth() {
            for (int i = 0; i <= 5; i++) {
                for (char ch = 'E'; ch <= 'A'; ch--) {
                    System.out.print(ch);
                }
                System.out.println(" ");
            }
        }

    public static  void tenth(){
        for(int i=0;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println( " ");
        }

    }

    public static void eleventh(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i +" ");
            }
            System.out.println(" ");
        }
    }

    public static void twelth(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }

    public static void thirteen(){
        for(char ch='A';ch<='E'; ch++){
            for(char ch1='A';ch1<=ch;ch1++){
                System.out.print(ch + " ");
            }
            System.out.println(" ");
        }
    }

    public static void fourteen(){
        for(char ch='A';ch<='E';ch++){
            for (char ch1='A';ch1<=ch;ch1++){
                System.out.print(ch1 + " ");
            }
            System.out.println(" ");
        }
    }

    public static void fifteen(){
        for(int i=5;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }

    public static void sixteen(){
        for(int i=1;i<=5;i++){
            for(int j=i;j<=5;j++){
                System.out.print(i+" ");
            }
            System.out.println(" ");
        }
    }

    public static void seventeen(){
        for(int i=5;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j +" ");
            }
            System.out.println(" ");
        }
    }
    public static void eighteen(){
        for(char ch='A';ch<='E';ch++){
            for(char ch1=ch;ch1<='E';ch1++){
                System.out.print(ch +" ");
            }
            System.out.println(" ");
        }
    }
    public static void nintheen(){
        for (char ch='E';ch>='A';ch--){
            for(char ch1='A';ch1<=ch;ch1++){
                System.out.print(ch1+" ");
            }
            System.out.println(" ");
        }
    }

    public static void twenty(){
        for(int i=5; i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print(i+" ");
            }
            System.out.println(" ");
        }
    }

    public static void twenOne(){
        for(int i =1; i<=5;i++){
            for(int j=5;j>=i;j--){
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
    }

    public  static void twentwo(){
        for(char ch='E'; ch>='A'; ch--){
            for(char ch1=ch; ch1>='A'; ch1--){
                System.out.print(ch+ " ");
            }
            System.out.println(" ");
        }
    }

    public  static void twenthree(){
        for( char ch='A';ch<='E';ch++){
            for(char ch1='E';ch1>=ch;ch1--){
                System.out.print(ch1+" ");
            }
            System.out.println(" ");
        }
    }

    public static void twenfour(){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int k =1;k<=(n-i);k++){
                System.out.print("   ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void twenfive(){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int k=1;k<=(n-i);k++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println(" ");
        }
    }

    public static void twensix(){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int k=1;k<=(n-i);k++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println("  ");
        }
    }
    public static void twenseven(){
        int n=69;
        for(char ch='A';ch<='E';ch++){
            for(int k=1;k<=(n-ch);k++){
                System.out.print("  ");
            }
            for(char ch1='A';ch1<=ch;ch1++){
                System.out.print(ch+" ");
            }
            System.out.println(" ");
        }
    }
    public static void tweneight(){
        int n=69;
        for(char ch='A';ch<='E';ch++){
            for(int k=1;k<=(n-ch);k++){
                System.out.print("  ");
            }
            for(char ch1='A';ch1<=ch;ch1++){
                System.out.print(ch1+" ");
            }
            System.out.println(" ");
        }
    }
    public static void twennine(){
        int n=5;
        for(int i=5;i>=1;i--){
            for(int k=1;k<=(n-i);k++){
                System.out.print("   ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }
    public static void thirty(){
        int n=5;
        for(int i=5;i>=1;i--){
            for(int k=1;k<=(n-i);k++){
                System.out.print("  ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(i+" ");
            }
            System.out.println( " ");
        }
    }

    public static void thirone(){
        int n=5;
        for(int i=5;i>=1;i--){
            for(int k=1;k<=(n-i);k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j+"");
            }
            System.out.println(" ");
        }
    }

    public static void thirtwo(){
         int n=69;
        for(char ch = 'E'; ch >= 'A'; ch--){
            for(int k=1;k<=(n-ch);k++){
                System.out.print("  ");
            }
            for(char ch1 = ch; ch1 >= 'A'; ch1--){
                System.out.print(ch+" ");
            }
            System.out.println(" ");
        }
    }

    public static void thirthree(){
        int n=69;
        for(char ch='E';ch>='A';ch--){
            for(int k=1;k<=(n-ch);k++){
                System.out.print("  ");
            }
            for(char ch1='A';ch1<=ch;ch1++){
                System.out.print(ch1+" ");
            }
            System.out.println(" ");
        }
    }
    public static void thirfour(){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int k=1;k<=(n-i);k++){
                System.out.print("   ");
            }
            for(int j=1;j<=(2*i-1);j++){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }

    public static void thirfive(){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int k=1;k<=(n-i);k++){
                System.out.print("  ");
            }
            for(int j=1;j<=(2*i-1);j++){
                System.out.print(i+" ");
            }
            System.out.println(" ");
        }
    }
    public static void thirsix(){
        int n=1;
        for(int i=1;i<=5;i++){
            for(int k=1;k<=(5-i);k++){
                System.out.print( "  ");
            }
            for(int j=1;j<=(2*i-1);j++) {
                    System.out.print(n + " ");
            }
            n+=2;
            System.out.println(" ");
        }
    }

    public static void thirseven(){
        int n=1;
        for(char i='A';i<='E';i++){
            for(int k=1;k<(5-n);k++){
                System.out.print("  ");
            }
            for(int j=1;j<=(2*n-1);j++){
                System.out.print(i+" ");
            }
            n++;
            System.out.println(" ");

        }
    }

    public static void thireight(){
        int n=1;
        for(char i='A';i<='I';i++){
            for(int k=1;k<=(5-n);k++){
                System.out.print("  ");
            }
            for (int j=1;j<=(2*n-1);j++){
                System.out.print(i+" ");
            }
            n++;
            i++;
            System.out.println(" ");
        }
    }

    public static void thirnine(){
        for(int i=1;i<=5;i++){
            for(int k=1;k<=(5-i);k++){
                System.out.print("  ");
            }
            for(int j=1;j<=(2*i-1);j++){
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
    }

    public static void fourty(){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int k=1;k<(n-i);k++){
                System.out.print("  ");
            }
            for(int j=(2*i-1);j>=1;j--){
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
    }

    public static void fourone(){
        int n=1;
        for(char i='A';i<='E';i++){
            for(int k=1;k<=(5-n);k++){
                System.out.print("  ");
            }
            for(char j='A';j<((2*i)-i+n);j++){
                System.out.print(j+" ");
            }
            n++;
            System.out.println(" ");

        }
    }

    public static void fourtwo(){
        int n=1;
        for(char i='A';i<='I';i++){
            for(int k=1;k<=(5-n);k++){
                System.out.print(" ");
            }
            for(char j=i;j>='A';j--){
                System.out.print(j+" ");
            }i++;
            n++;
            System.out.println(" ");
        }
    }

    public static void fourthree(){
        int n=5;
        for(int i=0;i<n;i++){
            for(int k=1;k<=(n-i);k++){
                System.out.print("  ");
            }
            for(int j=i;j>=0;j--){
                System.out.print(j+" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
    }
    public static void fouFour(){
        int n=69;
        for(char i='A';i<='E';i++){
            for(int k=1;k<=(n-i);k++){
                System.out.print("  ");
            }
            for(char j=i;j>='A';j--){
                System.out.print(j+" ");
            }
            for(char j='B';j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
    }

    public static void fouFive(){
        for(int i=1;i<=5;i++){
            for(int k=1;k<=(5-i);k++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            for(int j=i-1;j>=1;j--){
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
    }

    public static void fouSix(){
        int n=69;
        for(char i='A';i<='E';i++){
            for(int k=1;k<=(n-i);k++){
                System.out.print("  ");
            }
            for(char j='A';j<=i;j++){
                System.out.print(j+" ");
            }
            for(char j='A';j<i;j++){
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
    }

    public static void fouSeven(){
        int n=9;
        for(int i=n;i>=1;i--){
            for(int k=1;k<=(n-i);k++){
                System.out.print("  ");
            }
            for(int j=5;j<=(2*i-1);j++){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }

    public static void fouEight(){
        int n=5;
        for(int i=n;i>=1;i--){
            for(int k=1;k<=(n-i);k++){
                System.out.print("  ");
            }
            for(int j=1;j<=(2*i-1);j++){
                System.out.print(i+" ");
            }
            System.out.println(" ");
        }
    }

    public static void fouNine(){
        int n=7;
        for(int i=n;i>=1;i--){
            for(int k=1;k<=(n-i);k++){
                System.out.print(" ");
            }
            for(int j=i;j<=(2*i-1);j++){
                System.out.print(i+" ");
            }i--;
            System.out.println(" ");
        }
    }

    public static void fifty(){
        int n=5;
        for(int i=n;i>=1;i--){
            for(int k=1;k<=(n-i);k++){
                System.out.print("  ");
            }
            for(int j=1;j<=(2*i-1);j++){
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
    }

    public static void fifty1(){
        int n=4;
        char ch = 'D';
        for(int i=n;i>=1;i--){
            for(int k=1;k<=(n-i);k++){
                System.out.print("  ");
            }
            for(int j=1;j<=(2*i-1);j++){
                System.out.print(ch+" ");
            }
            ch--;
            System.out.println(" ");
        }
    }

    public static void fifOne(){
        int n=4;
        for(char i='D';i>='A';i--){
            for(int k=1;k<=(4-n);k++){
                System.out.print("  ");
            }
            for(char j=1;j<=(2*n-1);j++){
                System.out.print(i+" ");
            }
            n--;
            System.out.println();
        }
    }

    public static void fifTwo(){
        int n=4;
        for(char i='G';i>='A';i--){
            for(int k=1;k<=(4-n);k++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*n-1);j++){
                System.out.print(i+" ");
            }n--;
            i--;
            System.out.println(" ");
        }
    }

    public static void fifThree(){
        int n=4;
        for(char i='G';i>='A';i--){
            for(int k=1;k<=(4-n);k++){
                System.out.print("  ");
            }
            for(char j='A';j<=i;j++){
                System.out.print(j+" ");
            }
            i--;
            n--;
            System.out.println(" ");
        }
    }

    public static void fifFour(){
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
        for(int i=3;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }

    public static void fifSix(){
        for(int i=3;i>=0;i--){
            for(int j=i;j<=3;j++){
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
        for(int i=1;i<=3;i++){
            for(int j=i;j<=3;j++){
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
    }

    public static void fifSeven(){
        /*for(char i='D';i>='A';i--){
            for(char j='D'; j<=i; j--){
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }*/

        for(int i = 4; i > 0; i--){
            for(int j = 4; j >= i; j--){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

}
