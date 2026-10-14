package lms_Act;

/**
 *
 * @author Lawrenze
 */
public class UnitCastingConverter {
    public static void main(String[] args) {
        double centi = 167.6;
        int met = (int)centi / 100;
        double rem = centi - (met * 100);
        
        System.out.println("Length in Centimeter: "+ centi +"cm");
        System.out.println("Length in Meters: "+ met +" meters and " + rem);
        
        int sm = 15;
        double wm = sm;
        
        System.out.println("\nInt "+ sm +", becomes Double "+ wm);
        /*No cast is needed here because widening conversions are safe.
        A smaller type (int) can fit into a larger type (double) without data loss. */
        
        double pv = 6.66;
        int nv = (int)pv;
        
        System.out.println("\nDouble "+ pv +", becomes Int "+ nv);
        
        /*Cast is needed here because narrowing conversions may cause data loss
    .A larger type (double) may not fit into a smaller type (int).
    Java requires explicit casting to show that you accept the risk of losing precision. */
    }
}