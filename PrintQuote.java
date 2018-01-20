import java.time.Clock;
import java.time.Instant;
import java.time.LocalTime;
import java.time.ZoneId;

public class PrintQuote extends Clock {
	private int inputHour;
	private int inputMinute;
	private int inputSecond;

	public PrintQuote() {
		inputHour = 0;
		inputMinute = 0;
		inputSecond = 0;
	}

	public PrintQuote(int hour, int minute, int second) {
		setAlarmHour(hour);
		setAlarmMinute(minute);
		setAlarmSecond(second);
	}

	public void setAlarmHour(int hour) {
		if (hour >= 0 && hour <= 23) {
			inputHour = hour;
			return;
		}
		else {
			System.out.println("Invalid hour!");
		}
	}
	
	public void setAlarmMinute(int minute) {
		if (minute >= 0 && minute <= 59) {
			inputMinute = minute;
		}
		else {
			System.out.println("Invalid minute!");
		}
	}
	
	public void setAlarmSecond(int second) {
		if (second >= 0 && second <= 59) {
			inputSecond = second;
		}
		else {
			System.out.println("Invalid second!");
		}
	}
	
	public int getAlarmHour() {
		return inputHour;
	}

	public int getAlarmMinute() {
		return inputMinute;
	}

	public int getAlarmSecond() {
		return inputSecond;
	}

	public boolean equals(Object o) {
		if (o == null) {
			return false;
		}
		else {
			PrintQuote alarm = (PrintQuote) o;
			LocalTime currentTime = null;
			return (currentTime.getHour() == alarm.getAlarmHour()) 
					&& (currentTime.getMinute() == alarm.getAlarmMinute())
					&& (currentTime.getSecond() == alarm.getAlarmSecond());
		}

	}

	public ZoneId getZone() {
		// TODO Auto-generated method stub
		return null;
	}

	public Instant instant() {
		// TODO Auto-generated method stub
		return null;
	}

	public Clock withZone(ZoneId arg0) {
		// TODO Auto-generated method stub
		return null;
	}
}