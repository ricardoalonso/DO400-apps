package com.redhat.shipping;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShippingCalculatorTest {

    @Test
    public void onNARegionTheCostIs100() {
        // Given a shipping calculator
        ShippingCalculator calculator = new ShippingCalculator();

        // When NA is the country region
        int calculatedCost = calculator.costForRegion("NA");

        // Then the shipping cost is 100
        assertEquals(100, calculatedCost);
    }

    @Test
    public void onLATAMRegionTheCostIs200() {
        // Given a shipping calculator
        ShippingCalculator calculator = new ShippingCalculator();

        // When LATAM is the country region
        int calculatedCost = calculator.costForRegion("LATAM");

        // Then the shipping cost is 200
        assertEquals(200, calculatedCost);
    }

    @Test
    public void onAPACRegionTheCostIs400() {
        // Given a shipping calculator
        ShippingCalculator calculator = new ShippingCalculator();

        // When APAC is the country region
        int calculatedCost = calculator.costForRegion("APAC");

        // Then the shipping cost is 400
        assertEquals(400, calculatedCost);
    }

    @Test
    public void onNonSupportedRegionARegionNotFoundExceptionIsRaised() {
        ShippingCalculator calculator = new ShippingCalculator();

        assertThrows(
            RegionNotFoundException.class,
            () -> calculator.costForRegion("Unknown Region")
        );
    }
}
