package io.craigcaulfield.stationerycalc;

import java.util.Arrays;

/**
 * An enum representing the product codes and their associated bundles.
 *
 * @author Craig Caulfield
 */
public enum ProductBundles {

    HB24("HB24", new int[] {5,10}),
    PPM3("PPM3", new int[] {3,6,9}),
    BP19("BP19", new int[] {3,5,9});

    private String productCode;

    private int[] bundle;

    ProductBundles(String productCode, int[] bundle) {
        this.productCode = productCode;
        this.bundle = bundle;
    }

    public int[] getBundle() {
        return bundle;
    }

    public String getProductCode() {
        return productCode;
    }

    public static ProductBundles findByProductCode(String productCode) {
        return Arrays.stream(ProductBundles.values()).filter(v ->
                v.getProductCode().equals(productCode)).findFirst().orElse(null);
    }
}
