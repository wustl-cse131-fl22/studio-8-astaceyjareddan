package studio8;

public class Date {
	
	private int month;
	private int day;
	private int year;
	private boolean isHoliday;
	
	/**
	 * constructor
	 * @param initmonth
	 * @param initday
	 * @param inityear
	 * @param initholiday
	 */
	public Date(int initmonth, int initday, int inityear, boolean initholiday) {
		month = initmonth;
		day = initday;
		year = inityear;
		isHoliday = initholiday;
		
	}
	
	


    @Override
	public String toString() {
		return "Date [month=" + month + ", day=" + day + ", year=" + year + ", holiday=" + isHoliday + "]";
	}




	public static void main(String[] args) {
		Date a = new Date(12,25,1999,true);
		Date b = new Date(11,22,1986,false);

    }

}
