package javabasic;

public class PrimeNoInArray {

    public static void main(String[] args) {
        int[] a= {2,4,6,7,9,13,17};


        for(int i=0; i<a.length; i++) {
            int count=0;
            for(int j=2;j<a[i];j++) {

                if(a[i]% j == 0) {
                    count++;
                }
            }
            if(count == 0 && a[i]>1 ) {
                System.out.println(a[i]+" is prime");
            }else {
                System.out.println(a[i]+" is not prime");
            }
        }
    }
}
