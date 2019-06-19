package core;
import java.math.*;
public class CLA_M_Sub {

public static void main(String sub[]) {
	if (sub.length<2) {
		System.err.println("at least 2 params"); System.exit(0);}
	Double result =Double.valueOf(sub[0]); 
	for (int i=1; i< sub.length; i++) { result -= Double.valueOf(sub[i]);}
	System.out.println(new BigDecimal(result).setScale(2, RoundingMode.HALF_UP));

	}

}
