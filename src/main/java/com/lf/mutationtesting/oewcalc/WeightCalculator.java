package com.lf.mutationtesting.oewcalc;

public class WeightCalculator {

   private static final int MOD_WEIGHT_THRESHOLD = 10;
   public static final String FLEET_700 = "700"; // fleet type
   public static final int BASE_WEIGHT_FLEET_700 = 1000; // pounds
   public static final int BASE_WEIGHT_DIFFERENT_FLEET = 500;

   public int calculateByFleet(final String fleetType, final int modWeight) {
      final int baseWeight = getBaseWeightByFleetType(fleetType);
      return baseWeight + modWeight;
   }

   public int calculateByMod(final int modWeight, final String fleetType) {
      if (modWeight >= MOD_WEIGHT_THRESHOLD) {
         return calculateByFleet(fleetType, modWeight);
      } else {
         return getBaseWeightByFleetType(fleetType);
      }
   }

   public int getBaseWeightByFleetType(final String fleetType) {
      if (FLEET_700.equalsIgnoreCase(fleetType)) {
         return BASE_WEIGHT_FLEET_700;
      } else {
         return BASE_WEIGHT_DIFFERENT_FLEET;
      }
   }
}
