package netpro2024.mid_exam.q2;

public class Kuku {
    public static void main(String args[]) {
       //ここに実装
       for(int i=1; i<10; i++){
        for(int j=1; j<10; j++){
            if(i*j<10){
                System.out.print("|0"+i*j);
            }else{
                System.out.print("|"+i*j);
            }
        }
        System.out.print("|\n");
       }
    }
}