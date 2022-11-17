package studio8;


public class Time {
	
	private int hour;
	private int minute;
	private boolean twelveHourFormat;
	
	/**
	 * constructor
	 * @param initHour
	 * @param initMinute
	 * @param initHourFormat
	 */
	public Time(int initHour, int initMinute, boolean  initHourFormat ) {
		hour = initHour;
		minute = initMinute;
		twelveHourFormat = initHourFormat;
		
		
	}
	
	

	@Override
	public String toString() {
		return "Time [hour=" + hour + ", minute=" + minute + ", hourFormat=" + twelveHourFormat + "]";
	}



	public static void main(String[] args) {
		Time a = new Time(7,55,true);
		Time b = new Time(16,43,false);
		
 
    	
    }

}