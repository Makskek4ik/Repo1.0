package task3.utils;

public class RandomData {
// hi!
    private RandomData(){

    }

    public static String randomString(int length){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int a = (int) (33+Math.random()*223);
            sb.append((char) a);
        }
        return sb.toString();
    }
}
