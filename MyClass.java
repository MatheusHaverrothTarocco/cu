public class MyClass {
    public static void main(String args[]) {
        int x=100;
        for(int y = 1; y <= x; y++){
            if((y-3) % 7 == 0){
                System.out.println(y);
            }
        }
    }
}