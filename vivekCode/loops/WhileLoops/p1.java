class p1{
    public static void main11(String arg[]){
        int i = 1;
        while(i){
            System.out.println(i);
            i++;
        }
    }
}

/* javac p1.java
p1.java:4: error: incompatible types: int cannot be converted to boolean
        while(i){
              ^
1 error
*/