package netpro2024.mid_exam.q4;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("西暦年を入力してください（4桁の正の整数）：");
        int year = scanner.nextInt();
        if(year%400==0){
            System.out.println("閏年");
        }else if(year%100==0){
            System.out.println("平年");
        }else if(year%4==0){
            System.out.println("閏年");
        }else {
            System.out.println("平年");
        }
        System.out.print("西暦年を入力してください（4桁の正の整数）：");
        year = scanner.nextInt();
        if(year%400==0){
            System.out.println("閏年");
        }else if(year%100==0){
            System.out.println("平年");
        }else if(year%4==0){
            System.out.println("閏年");
        }else {
            System.out.println("平年");
        }
        System.out.print("西暦年を入力してください（4桁の正の整数）：");
        year = scanner.nextInt();
        if(year%400==0){
            System.out.println("閏年");
        }else if(year%100==0){
            System.out.println("平年");
        }else if(year%4==0){
            System.out.println("閏年");
        }else {
            System.out.println("平年");
        }
        System.out.print("西暦年を入力してください（4桁の正の整数）：");
        year = scanner.nextInt();
        if(year%400==0){
            System.out.println("閏年");
        }else if(year%100==0){
            System.out.println("平年");
        }else if(year%4==0){
            System.out.println("閏年");
        }else {
            System.out.println("平年");
        }
        System.out.print("西暦年を入力してください（4桁の正の整数）：");
        year = scanner.nextInt();
        if(year%400==0){
            System.out.println("閏年");
        }else if(year%100==0){
            System.out.println("平年");
        }else if(year%4==0){
            System.out.println("閏年");
        }else {
            System.out.println("平年");
        }
        scanner.close();
    }
}