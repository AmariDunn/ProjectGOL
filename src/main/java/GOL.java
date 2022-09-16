/*
 Amari Dunn
9/12/22
Project 1
Game of Life
 */

/**
 *
 * @author 142037
 */
import java.util.Scanner;

public class GOL {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        //Game grid
        int rowA; int a0 = 0; int a1 = 0; int a2 = 0; int a3 = 0; int a4 = 0;
        int rowB; int b0 = 0; int b1 = 0; int b2 = 0; int b3 = 0; int b4 = 0;
        int rowC; int c0 = 0; int c1 = 0; int c2 = 0; int c3 = 0; int c4 = 0;
        int rowD; int d0 = 0; int d1 = 0; int d2 = 0; int d3 = 0; int d4 = 0;
        int rowE; int e0 = 0; int e1 = 0; int e2 = 0; int e3 = 0; int e4 = 0;
        
        System.out.println(a0 + "  " + a1 + "  " + a2 + "  " + a3 + "  " + a4);
        System.out.println(b0 + "  " + b1 + "  " + b2 + "  " + b3 + "  " + b4);
        System.out.println(c0 + "  " + c1 + "  " + c2 + "  " + c3 + "  " + c4);
        System.out.println(d0 + "  " + d1 + "  " + d2 + "  " + d3 + "  " + d4);
        System.out.println(e0 + "  " + e1 + "  " + e2 + "  " + e3 + "  " + e4);
        //Random Start
         System.out.println("Enter a starting seed. The seed determines the number of cells that start as alive. Enter a number 1-4.");
        int seed = input.nextInt();
        int startX;
        int startY;
        switch(seed){
            case 1: 
                startX = (int)(Math.random() * 5);
                startY = (int)(Math.random() * 5);
            switch(startX){
            case 0: switch(startY){
                case 0: a0 = 2; break;
                case 1: b0 = 2; break;
                case 2: c0 = 2; break; 
                case 3: d0 = 2; break; 
                case 4: e0 = 2; break; 
            } break;
            case 1: switch(startY){
                case 0: a1 = 2; break;
                case 1: b1 = 2; break;
                case 2: c1 = 2; break; 
                case 3: d1 = 2; break; 
                case 4: e1 = 2; break; 
            } break;
            case 2: switch(startY){
                case 0: a2 = 2; break;
                case 1: b2 = 2; break;
                case 2: c2 = 2; break; 
                case 3: d2 = 2; break; 
                case 4: e2 = 2; break; 
            } break;
            case 3: switch(startY){
                case 0: a3 = 2; break;
                case 1: b3 = 2; break;
                case 2: c3 = 2; break; 
                case 3: d3 = 2; break; 
                case 4: e3 = 2; break; 
            } break;
            case 4: switch(startY){
                case 0: a4 = 2; break;
                case 1: b4 = 2; break;
                case 2: c4 = 2; break; 
                case 3: d4 = 2; break; 
                case 4: e4 = 2; break; 
            } break;
        }
            case 2:
            case 3:
            case 4:
        }
        
        rowA = a0 + a1 + a2 + a3 + a4;
        rowB = b0 + b1 + b2 + b3 + b4;
        rowC = c0 + c1 + c2 + c3 + c4;
        rowD = d0 + d1 + d2 + d3 + d4;
        rowE = e0 + e1 + e2 + e3 + e4;
        
        System.out.println("Start");
        System.out.println(a0 + "  " + a1 + "  " + a2 + "  " + a3 + "  " + a4);
        System.out.println(b0 + "  " + b1 + "  " + b2 + "  " + b3 + "  " + b4);
        System.out.println(c0 + "  " + c1 + "  " + c2 + "  " + c3 + "  " + c4);
        System.out.println(d0 + "  " + d1 + "  " + d2 + "  " + d3 + "  " + d4);
        System.out.println(e0 + "  " + e1 + "  " + e2 + "  " + e3 + "  " + e4);
        
        //first evolution
        int life = (int)(Math.random() * 4);
        switch(life){
            case 0:
            case 1:
            case 2:
            case 3:
        }
            
                
        if (rowE > rowD){
            int change = (int)(Math.random() * 5);
            switch(change){
                case 0: d0 = 2; d4 = 2; break;
                case 1: d1 = 2; d3 = 2; break;
                case 2: d2 = 2; break;
            }
        }
        if (rowD > rowC){
        int change = (int)(Math.random() * 5);
            switch(change){
                case 0: c0 = 2; c4 = 2; break;
                case 1: c1 = 2; c3 = 2; break;
                case 2: c2 = 2; break;
            }
        }
        if (rowC > rowB){
        int change = (int)(Math.random() * 5);
            switch(change){
                case 0: b0 = 2; b4 = 2; break;
                case 1: b1 = 2; b3 = 2; break;
                case 2: b2 = 2; break;
            }
        }
        if (rowB > rowA){
        int change = (int)(Math.random() * 5);
            switch(change){
                case 0: a0 = 2; a4 = 2; break;
                case 1: a1 = 2; a3 = 2; break;
                case 2: a2 = 2; break;
            }
        }
        if (rowA > rowE){
        int change = (int)(Math.random() * 5);
            switch(change){
                case 0: e0 = 2; e4 = 2; break;
                case 1: e1 = 2; e3 = 2; break;
                case 2: e2 = 2; break;
            }
        }
        rowA = a0 + a1 + a2 + a3 + a4;
        rowB = b0 + b1 + b2 + b3 + b4;
        rowC = c0 + c1 + c2 + c3 + c4;
        rowD = d0 + d1 + d2 + d3 + d4;
        rowE = e0 + e1 + e2 + e3 + e4;
        
        System.out.println("First Evolution");
        System.out.println(a0 + "  " + a1 + "  " + a2 + "  " + a3 + "  " + a4);
        System.out.println(b0 + "  " + b1 + "  " + b2 + "  " + b3 + "  " + b4);
        System.out.println(c0 + "  " + c1 + "  " + c2 + "  " + c3 + "  " + c4);
        System.out.println(d0 + "  " + d1 + "  " + d2 + "  " + d3 + "  " + d4);
        System.out.println(e0 + "  " + e1 + "  " + e2 + "  " + e3 + "  " + e4);
        
    }
}
