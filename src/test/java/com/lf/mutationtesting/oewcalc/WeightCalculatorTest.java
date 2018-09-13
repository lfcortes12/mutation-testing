package com.lf.mutationtesting.oewcalc;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import com.lf.mutationtesting.oewcalc.WeightCalculator;

@RunWith(JUnit4.class)
public class WeightCalculatorTest {

   private WeightCalculator calculator;

   @Before
   public void setup() {
      calculator = new WeightCalculator();
   }

   @Test
   public void calculateFor700FleetTest() {
      assertEquals(1010, calculator.calculateByFleet("700", 10));
   }

   @Test
   public void calculateForOtherFleetTest() {
      assertEquals(515, calculator.calculateByFleet("800", 15));
   }

   @Test
   public void getBaseWeightFor700FleetTypeTest() {
      assertEquals(1000, calculator.getBaseWeightByFleetType("700"));
   }

   @Test
   public void getBaseWeightForOtherFleetTypeTest() {
      assertEquals(500, calculator.getBaseWeightByFleetType("800"));
   }

   @Test
   public void calculateWeightWhenModGreaterThanThresholdTest() {
      assertEquals(515, calculator.calculateByMod(15, "800"));
   }

   @Test
   public void calculateWeightWhenModLessThanThresholdTest() {
      assertEquals(500, calculator.calculateByMod(8, "800"));
   }

   @Test
   public void calculateWeightWhenModEqualThanThresholdTest() {
      assertEquals(510, calculator.calculateByMod(10, "800"));
   }

}
