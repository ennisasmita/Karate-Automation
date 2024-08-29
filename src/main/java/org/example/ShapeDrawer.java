package org.example;

import java.util.Scanner;

public class ShapeDrawer {
    Scanner scanner = new Scanner(System.in);

    public void displayMenu(){
        System.out.println("Welcome to ASCII Shape Drawer");
        System.out.println("1. Triangle");
        System.out.println("2. Square");
        System.out.println("3. Diamond");
        System.out.println("4. Exit");
    }

    public void drawShape(int choice){
        switch (choice){
            case 1:
                System.out.println("Enter the height of triangle : ");
                int height = scanner.nextInt();
                drawTriangle(height);
                break;
            case 2:
                System.out.println("Enter the height of square : ");
                int height2 = scanner.nextInt();
                drawSquare(height2);
                break;
            case 3:
                System.out.println("Enter the height of diamond : ");
                int height3 = scanner.nextInt();
                drawDiamond(height3);
                break;
            case 4 :
                System.exit(0);
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
    public void drawTriangle(int height){
        for(int i=1; i<=height; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    public void drawSquare(int height2) {
        for (int i = 1; i <= height2; i++) {
            for (int j = 1; j <= height2; j++) {
                System.out.print(" #");
            }
            System.out.println();
        }
    }

    public void drawDiamond (int height3) {
        for (int i = 1; i <= height3; i++) {
            for (int j = 1; j <= height3 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" #");
            }
            System.out.println();
        }
        for (int i = 1; i < height3; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= height3 - i; k++) {
                System.out.print(" #");
            }
            System.out.println();
        }
    }
    private void run() {
        while(true){
            displayMenu();
            System.out.println("Choose a shape draw : ");
            int choice = scanner.nextInt();
            drawShape(choice);
            System.out.println();
        }
    }
    public static void main(String[]args){
        ShapeDrawer drawer = new ShapeDrawer();
        drawer.run();
    }

}
