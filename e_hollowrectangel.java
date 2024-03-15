public class e_hollowrectangel {
    
    public static void main(String[] args) {
        int rows = 4;
        int cols = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if(i==rows||i==1||j==1||j==cols){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
