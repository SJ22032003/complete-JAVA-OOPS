public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("MultiDimensional Array\n");

        int[][] flats = new int[2][3];
        
        flats[0][0] = 1;
        flats[0][1] = 2;
        flats[0][2] = 3;
        flats[1][0] = 4;
        flats[1][1] = 5;
        flats[1][2] = 6;

        for (int i = 0; i < flats.length; i++) {
            for (int j = 0; j < flats[i].length; j++) {
                System.out.print(flats[i][j]+" ");
            }
            
            System.out.println("");
        }
    }
}
