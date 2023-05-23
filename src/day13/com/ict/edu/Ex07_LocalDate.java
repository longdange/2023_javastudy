package day13.com.ict.edu;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ex07_LocalDate {
public static void main(String[] args) {
	//java version 8.0이상만 가능
	//LocalDate:날짜 정보만 필요할 때
	//LocalDatetime:날짜,시간 모두 필요할 때
LocalDate cDate=LocalDate.now();
System.out.println(cDate);
LocalTime cTime=LocalTime.now();
System.out.println(cTime);



}
}
