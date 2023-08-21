package Week2;

import java.util.Scanner;

public class Infinitetri {
    public static void main(String[] args) {
    //inserting variables
        int level;
        System.out.println("enter intiger under 70");
        Scanner scan = new Scanner(System.in);
        level = scan.nextInt();
        int alevel = level;

        while (level > 1){
            for (int i = 0; i<level-1;i++ ){
                System.out.print(" ");
            }
            System.out.print("/");
            for (int i = 0; i<alevel-level;i++ ){
                System.out.print("  ");
            }
            System.out.print("\\\n");
            level --;
        };
        System.out.print("/");
        for (int i = 0; i < alevel-1; i++) {
            System.out.print("__");
        }
        System.out.print("\\");
    }
}
/*
  (spaces before)/(spaces after)\


              while (alevel > 1){
                System.out.print(" ");
                alevel =- 1;
            }
            System.out.print("/");
            levelon = blevel;
            while (levelon > 1){
                System.out.print("  ");
                levelon =-1;
            }
            levelon = blevel + 1;
            System.out.print("\\\n");
            level =-1;
 */