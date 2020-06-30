package burger_shop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Side {
    public static final String FRIES = "fries";
    public static final String CHIPS = "chips";
    public static final String APPLE_PIE = "apple pie";
    public static final String ICE_CREAM = "ice cream";
    public static final double PRICE = 0.50;
    public static final List<String> sideOptions = new ArrayList<>(Arrays.asList(FRIES, CHIPS, APPLE_PIE, ICE_CREAM));

    private Side() {}
}
