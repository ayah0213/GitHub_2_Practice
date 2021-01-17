package day1_PracticeGit2;

public class Package_1 {
    public static void main(String[] args) {


        int age = 14;
        if (age >= 18) {
            System.out.println("you re eligible for driver license");
        } else {
            System.out.println("you re not eligible for driver license");
        }


        System.out.println("==============================");

        char grade = 'A';
        if (grade == 'A' || grade == 'B' || grade == 'C') {
            System.out.println("you passed the class");
        } else {
            System.out.println("You didint pass the class");
        }


        System.out.println("===========================================");
        // else if : 3 or more options
        int n1 = 100;
        int n2 = 200;

        if (n1 > n2) {
            System.out.println(n1 + " is greater than " + n2);
        } else if (n2 > n1) {
            System.out.println(n2 + " is greater than" + n1);
        } else {
            System.out.println(n1 + " is equal to " + n2);
        }


        System.out.println("========================");

        int num = 4;  // 1 ~ 7 days of the week

        if (num == 1) {
            System.out.println("Today is Monday");
        } else if (num == 2) {
            System.out.println("Today id Tuesday");
        } else if (num == 3) {
            System.out.println("Today is Wednsday");
        } else if (num == 4) {
            System.out.println("TOday is Thursday");
        } else if (num == 5) {
            System.out.println("TOday is Friday");
        } else if (num == 6) {
            System.out.println("Today is Saturday");
        } else {
            System.out.println("Today is Sunday");
        }


        System.out.println("=============================");

        int Age = 35;

        if (Age < 21) {
            System.out.println("This person considered as Teenager");
        } else if (Age >= 21 && Age <= 55) {
            System.out.println("this person is adult");
        } else if (Age > 55 && Age == 65) {
            System.out.println("This person is Senior");

        } else {
            System.out.println("This person is Very Old age ");
        }

        System.out.println("==========================");
        // nested if

    }
}
