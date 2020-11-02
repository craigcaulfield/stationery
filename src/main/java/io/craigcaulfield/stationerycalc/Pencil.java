package io.craigcaulfield.stationerycalc;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
/**
 * Domain object representing a pencil
 *
 *
 * @author Craig Caulfield
 */
public class Pencil {

    private String productCode;

    private int bundleSize;

    private BigDecimal price;
}
