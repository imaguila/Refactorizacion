// Problem
int low = daysTempRange.getLow();
int high = daysTempRange.getHigh();
boolean withinPlan = plan.withinRange(low, high);


// Solution
boolean withinPlan = plan.withinRange(daysTempRange);
