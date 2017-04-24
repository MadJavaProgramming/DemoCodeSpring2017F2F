package java111.project5.demos;
public class TestStringComparison {

    public static void main(String[] args) {
        String expected = "hello" + "/n";
        String actual = "hello" + "/n";
        if (expected.equals(actual)){
            System.out.println("passed");
        } else {
            System.out.println("failed");
       }
    
    }
}
