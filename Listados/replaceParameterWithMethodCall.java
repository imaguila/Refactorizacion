// Problem
int basePrice = quantity * itemPrice;
double seasonDiscount = this.getSeasonalDiscount();
double fees = this.getFees();
double finalPrice = discountedPrice(basePrice, seasonDiscount, fees);

// Solution
int basePrice = quantity * itemPrice;
double finalPrice = discountedPrice(basePrice);
