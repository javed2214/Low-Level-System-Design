import com.phone.OS;
import com.phone.OSFactory;

public class Main {
    public static void main(String[] args) {

        OSFactory osFactory = new OSFactory();
        OS os = osFactory.createOS("Best");
        os.getOSType();
    }
}
