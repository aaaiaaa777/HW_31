package core;
import java.math.*;
public class CLA_M_Div {

public static void main(String num[]) {
	if (num.length<2) {
		System.err.println("at least 2 params"); System.exit(0);}
	Double result =Double.valueOf(num[0]);    //2+0
	for (int i=1; i< num.length; i++) { result /= Double.valueOf(num[i]);}
	System.out.println(new BigDecimal(result).setScale(2, RoundingMode.HALF_UP));

	}

}
