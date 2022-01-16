class MultidimensionalArray 
{


    public static void main(String[] args) 
    {

        // create a 2d array
        int[][] a = {{1, 2, 3,4,5,6,7}, {4, 5, 6, 9}, {7}, };
        String [][] s = {{"java","programing","language"},{"ice-cream","fruit juice","milk shakes","coockies"}, {"family","work","office"}};
      
        // calculate the length of each row
        System.out.println("Length of row 1: " + a[0].length);
        System.out.println("Length of row 2: " + a[1].length);
        System.out.println("Length of row 3: " + a[2].length);
        System.out.println("Lenght of the string is: "+s[0].length);
        System.out.println(s[1].length);
        System.out.println(s[2].length);
    }
}

