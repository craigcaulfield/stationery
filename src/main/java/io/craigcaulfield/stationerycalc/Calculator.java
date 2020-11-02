package io.craigcaulfield.stationerycalc;

import java.math.BigDecimal;
import java.util.*;

/**
 * Perform the inventory calculations.
 *
 * @author Craig Caulfield
 */
public class Calculator {

    private List<Pencil> inventory = new ArrayList<>();

    private void loadInventory() {

        inventory.add(Pencil.builder().productCode("HB24").bundleSize(5).price(BigDecimal.valueOf(6.99)).build());
        inventory.add(Pencil.builder().productCode("HB24").bundleSize(10).price(BigDecimal.valueOf(12.99)).build());
        inventory.add(Pencil.builder().productCode("PPM3").bundleSize(3).price(BigDecimal.valueOf(9.95)).build());
        inventory.add(Pencil.builder().productCode("PPM3").bundleSize(6).price(BigDecimal.valueOf(16.95)).build());
        inventory.add(Pencil.builder().productCode("PPM3").bundleSize(9).price(BigDecimal.valueOf(24.95)).build());
        inventory.add(Pencil.builder().productCode("BP19").bundleSize(3).price(BigDecimal.valueOf(5.95)).build());
        inventory.add(Pencil.builder().productCode("BP19").bundleSize(5).price(BigDecimal.valueOf(9.75)).build());
        inventory.add(Pencil.builder().productCode("BP19").bundleSize(9).price(BigDecimal.valueOf(16.99)).build());
    }

    public Calculator() {
        loadInventory();
    }


    /**
     * Break down a product code into the minimum bundles
     *
     * @param productCode the pencil product code
     * @param quantity the required quantity
     * @return a Map of the bundles in this format: (bundle size, number)
     */
    public Map<Integer, Integer> breakdownBundle(String productCode, int quantity) {

        Map<Integer, Integer> breakdown = new HashMap<>();




        return breakdown;
    }


    /**
     * Recursively find the minimum bundles required to satisfy a number given the current set of bundle sizes.
     *
     * @param bundles and array of the bundles available for this particular product
     * @param remainder the target to be reached.
     * @param count an array to hold the counts
     * @return the minimum number of bundles.
     */
    public int minimumBundles(int[] bundles, int remainder, int[] count) {

        if (remainder < 0) {
            return -1;
        } else if (remainder == 0) {
            return 0;
        }

        if (count[remainder - 1] != 0) {
            return count[remainder - 1];
        }

        int minimum = Integer.MAX_VALUE;

        for (int bundle : bundles) {
            int res = minimumBundles(bundles, remainder - bundle, count);
            if (res >= 0 && res < minimum) {
                minimum = 1 + res;
            }
        }

        return minimum;
    }
}
