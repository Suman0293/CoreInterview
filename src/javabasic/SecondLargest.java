package javabasic;

public class SecondLargest {

    public static void main(String[] args) {
        int[] a= {22,5,9,17,8,3,96,89,54,299};
        int c = 0;
        int b=a[0];

        for(int i=0;i<a.length;i++) {
            if(a[i]>b) {
                c=b;
                b=a[i];
            }
            else if(a[i]>c && a[i]<b){
                c=a[i];
            }
        }
        System.out.println(c);
    }
}
