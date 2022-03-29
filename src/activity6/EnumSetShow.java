package activity6;

import java.time.Month;
import java.util.EnumSet;

public class EnumSetShow {

	public void show() {
		EnumSet<Month> allMonth, summerMonth, restMonth, copyMonth, septemberToDecemberMonth;
		allMonth = EnumSet.allOf(Month.class);
		System.out.println(allMonth);
		summerMonth = EnumSet.noneOf(Month.class);
		summerMonth.add(Month.JUNE);
		summerMonth.add(Month.JULY);
		summerMonth.add(Month.AUGUST);
		System.out.println(summerMonth);
		restMonth = EnumSet.of(Month.JANUARY, Month.FEBRUARY, Month.MARCH, Month.APRIL, Month.MAY, Month.SEPTEMBER,
				Month.OCTOBER, Month.NOVEMBER, Month.DECEMBER);
		copyMonth = EnumSet.copyOf(restMonth);
		System.out.println(restMonth);
		System.out.println(copyMonth);
		septemberToDecemberMonth = EnumSet.range(Month.SEPTEMBER, Month.DECEMBER);
		System.out.println(septemberToDecemberMonth);
	}

}
