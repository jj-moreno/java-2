package burger_shop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bread {
    public static final String RYE = "rye";
    public static final String WHEAT = "wheat";
    public static final String WHITE = "white";
    private static final List<String> breadOptions = new ArrayList<>(Arrays.asList(RYE, WHEAT, WHITE));

    private Bread() {
    }

    public static List<String> getBreadOptions() {
        return breadOptions;
    }
}
