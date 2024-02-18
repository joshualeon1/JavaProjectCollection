package com.genericspractice;

class NumericFns<T extends Number> {

	T num;

	NumericFns(T num) {
		this.num = num;
	}

	boolean absEqual(NumericFns<?> ob) {//NOTE: the '?' used to be 'T' but was changed to '?' as explained below
		if(Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue()))
			return true;
		return false;
	}

}

public class MoreGenericsPractice {

	public static void main(String[] args) {


		NumericFns<Integer> obj = new NumericFns<>(4);
		NumericFns<Integer> obj2 = new NumericFns<>(4);//Since this is of type 'Integer' the println line below gives us no complaints
		System.out.println(obj.absEqual(obj2));

		NumericFns<Double> obj3 = new NumericFns<>(5.0);
//		System.out.println(obj.absEqual(obj3));//We get an error here because, if we take a look at our 'absEqual()' method, we're expecting to be passed a value of the SAME TYPE due to our use of 'T'
//		We can fix/work around this by replacing the 'T' in our 'absEqual()' method with '?' signifying that we don't know what we'll be passed in, whether an Integer, Double, Float (still nums due to extend Number)

		
		System.out.println(obj.absEqual(obj3));//So, NOW this works as we can see
	}

}
