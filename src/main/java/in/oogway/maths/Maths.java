package in.oogway.maths;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Maths {
    static Logger mathsLogger = LoggerFactory.getLogger(Maths.class);
    public static int add(int num1, int num2) { //Method to add 2 integers
        int sum;
        sum = num1 + num2;
        mathsLogger.info("Adding two integers");
        return sum;
    }

    public static float add(float num1, float num2) { // Method to add 2 floats
        float sum;
        sum = num1 + num2;
        mathsLogger.info("Adding two float numbers ");
        return sum;
    }
}
