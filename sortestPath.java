public class sortestPath {
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        int x = 0;
        int y = 0;
        for(int i=0; i<path.length(); i++){
            if(path.charAt(i) == 'N'){
                y++;
            }
            else if(path.charAt(i) == 'S'){
                y--;
            }
            else if(path.charAt(i) == 'E'){
                x++;
            }
            else if(path.charAt(i) == 'W'){
                x--;
            }
            System.out.println("I reached this point: " + x + "," + y);
        }
        int X1 = x* x;
        int Y1 = y*y;
        System.out.println("The distance is: " +(float) Math.sqrt(X1+Y1));
    }
}
