public class CracklePop {
    public static void main(String[] args){
        int i = 1;
        while(i <= 100) {
            if(i % 3 == 0 && i % 5 == 0) {
                System.out.println("CracklePop");
            } else if(i % 3 == 0) {
                System.out.println("Crackle");
            } else if(i % 5 == 0){
                System.out.println("Pop");
            }
            i++;
        }

    }
}
