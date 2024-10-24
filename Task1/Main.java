package Task1;

public class Main {
    public static void main(String[] args) {

        String opgave;

        Main kald = new Main();
        kald.methodA("bob");
        kald.methodB();
        kald.methodC(5);
        kald.methodD(4);


    }
    public void methodA(String input){
        System.out.println("J");
        if(input.equals("bob")){
            System.out.println("A");
        }

    }
    public void methodB(){
        for(int i = 0; i < 4; i++){
            if(i == 3) {
                System.out.println("V");
            }
        }
        System.out.println("A");

    }

    public int methodC(int number){
        System.out.println("E");
        if(number<7){
            System.out.println("R");
        }
        return number;
    }

    public void methodD(int number){
        boolean opgave = true;
        if(number != 5) {
            System.out.println("S");
        }
        if(opgave == true) {
            System.out.println("J");
        }
        System.out.println("O");
        if(number == 4) {
            System.out.println("V");
        }

        System.out.println("T");
    }
}
