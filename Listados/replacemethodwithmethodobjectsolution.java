clase  Order  { // ... public double price ( ) 
    { return new PriceCalculator ( this ) . calcular ( ) ; 
        
    }
 
}
class PriceCalculator { 
    private double primaryBasePrice ; 
    privado doble secundarioBasePrice ; 
    privado doble terciarioBasePrice ; 
    PriceCalculator público ( orden de pedido ) {
