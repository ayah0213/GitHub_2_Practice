package day3_Practice2;

public class day3 {
    public static void main(String[] args) {

        int AGE = -2;

        if (AGE >= 1 && AGE <= 150){

            if (AGE< 21){
                System.out.println("This person is teenager");
            }else if (AGE >=21 && AGE <= 55){
                System.out.println("This is person Adult");
            }else {
                System.out.println("This is Senior person");
            }
        }else{
            System.out.println("Invalid AGE");
        }

    }
}
