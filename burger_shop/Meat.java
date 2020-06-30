package burger_shop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Meat {
    public static final String BEEF = "beef";
    public static final String CHICKEN = "chicken";
    public static final String STEAK = "steak";
    public static final String BLACK_BEAN = "black bean";
    public static final String ROAST_BEEF = "roast beef";
    private static final List<String> meatOptions = new ArrayList<>(Arrays.asList(BEEF, CHICKEN, STEAK, BLACK_BEAN, ROAST_BEEF));

    private Meat() {
    }

    public static List<String> getMeatOptions() {
        return meatOptions;
    }
}
