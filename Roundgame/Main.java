import java.util.*;

public class Main{

    public static void main(String[] args) {
        String[] p = {"t1", "t2", "t3", "t4", "t5"};
        int num = p.length;
        for(int i = 0; i < num-1; i++){
            for(int j = i+1; j < num; j++){ // Fixed typo here
                if(j == i+1 || j == i+2 || j == i+3){
                    System.out.println(p[i] + " vs " + p[j]);
                }
                else{
                    System.out.println(p[i] + " vs " + p[j]);
                }
            }
        }
    }
}

