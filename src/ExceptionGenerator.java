public class ExceptionGenerator {
    public void generateNullPointerException() {
        String str = null;
        str.length(); // To spowoduje NullPointerException
    }
}