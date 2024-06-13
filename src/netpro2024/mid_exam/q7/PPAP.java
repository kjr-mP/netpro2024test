package netpro2024.mid_exam.q7;

import java.util.Scanner;

public class PPAP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //String str = scanner.nextLine();
        String str = "pen,pineapple,APPLE,PEN";
        String[] strs=str.split(",");
        String[] s1=new String[4];
        String[] s2=new String[4];
        for(int i=0; i<strs.length; i++){
            s1[i]=strs[i].substring(0,1).toUpperCase();
            s2[i]=strs[i].substring(1).toLowerCase();
            strs[i]=s1[i]+s2[i];
        }
        for(int i=0; i<strs.length; i++){
            System.out.print(strs[i]);
            if(i!=strs.length-1){
                System.out.print("-");
            }
        }
        
    }
}
