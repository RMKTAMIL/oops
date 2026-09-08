package currency;
import java.util.*;
import java.text.DecimalFormat;
class CurrencyConvertor
{
	double rupee,dollar,euro,yen;
	Scanner sc= new Scanner (System.in);
	DecimalFormat f = new DecimalFormat("##.###");
	public void convertInrToEuro()
	{
		System.out.println("Enter amount in rupees");
		rupee=sc.nextFloat();
		euro = repee/80;
		System.out.println("Euro : "+f.format(euro));
	}
	public void convertEuroToInr()
	{
		System.out.println("Enter amount in Euro");
		euro=sc.nextFloat();
		rupee = euro*80;
		System.out.println("Rupees : "+f.format(rupee));
	}
	public void convertInrToDollar()
	{
		System.out.println("Enter amount in rupees");
		rupee=sc.nextFloat();
		dollar = repee/66;
		System.out.println("Dollar : "+f.format(dollar));
	}
	public void convertDollarToInr()
	{
		System.out.println("Enter amount in Dollar");
		dollar=sc.nextFloat();
		rupee = euro*66;
		System.out.println("Rupee : "+f.format(rupee));
	}
	public void convertInrToYen()
	{
		System.out.println("Enter amount in rupees");
		rupee=sc.nextFloat();
		yen = repee/0.61;
		System.out.println("Yen : "+f.format(yen));
	}
	public void convertYenToInr()
	{
		System.out.println("Enter amount in Yen");
		yen=sc.nextFloat();
		rupee = euro*0.61;
		System.out.println("Rupee : "+f.format(rupee));
	}
}
package distance;
import java.util.*;
import java.text.DecimalFormat;
class DistanceConvertor
{
	double meter,km,miles;
	Scanner sc= new Scanner (System.in);
	DecimalFormat f = new DecimalFormat("##.###");
	public void convertMeterToKm()
	{
		System.out.println("Enter the meter:");
		meter=sc.nextFloat();
		km = meter*0.001;
		System.out.println("Km : "+f.format(km));
	}
	public void convertKmToMeter()
	{
		System.out.println("Enter the km:");
		km=sc.nextFloat();
		meter = km/0.001;
		System.out.println("Meter : "+f.format(meter));
	}
	public void convertMilesToKm()
	{
		System.out.println("Enter the miles:");
		miles=sc.nextFloat();
		km = miles*1.6093;
		System.out.println("Km : "+f.format(km));
	}
	public void convertKmToMiles()
	{
		System.out.println("Enter the km:");
		km=sc.nextFloat();
		miles = km/1.6093;
		System.out.println("Meter : "+f.format(miles));
	}
}
package time;
import java.util.*;
import java.text.DecimalFormat;
class DistanceConvertor
{
	double minute,second,hour;
	Scanner sc= new Scanner (System.in);
	DecimalFormat f = new DecimalFormat("##.###");
	public void convertHourToMinute()
	{
		System.out.println("Enter the Hour:");
		hour=sc.nextFloat();
		minute = hour*60;
		System.out.println("Minutes : "+f.format(minute));
	}
	public void convertMinuteToHour()
	{
		System.out.println("Enter the Minutes:");
		minute=sc.nextFloat();
		hour = minute*60;
		System.out.println("Hours : "+f.format(hour));
	}
	public void convertHourToSecond()
	{
		System.out.println("Enter the Hour:");
		hour=sc.nextFloat();
		second = hour*3600;
		System.out.println("Seconds : "+f.format(second));
	}
	public void convertSecondToHour()
	{
		System.out.println("Enter the Seconds:");
		second=sc.nextFloat();
		hour = second/3600;
		System.out.println("Hour : "+f.format(hour));
	}
}

import currency.*;
import distance.*;
import time.*;
import java.util.Scanner;
public class Convertor
{
	public static void main (String[] args)
	{
		int code,currency_code,distance_code,time_code;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the code 1: Currency\n2:Distance\n3:Time");
		code = sc.nextInt();
		if(code == 1)
		{
			System.out.println("Enter the Currency code 1:Euro\n2:Dollar\n3:Yen");
			code = sc.nextInt();
			if(currency_code==1)
			{
				convertInrToEuro();
				convertEuroToInr();
			}
			else if(currency_code==2)
			{
				convertInrToDollar();
				convertDollarToInr();
			}
			else if(currency_code==3)
			{
				convertInrToYen();
				convertYenToInr();
			}
			else
			{
				System.out.println("Invalid Code");
			}
			else if(code == 1)
			{
				System.out.println("Enter the Distance code 1:Mter\n2:Miles");
				code = sc.nextInt();
				if(currency_code==1)
				{
					convertMeterToKm();
					convertKmToMeter();
				}
				else if(currency_code==2)
				{
					convertMilesToKm();
					convertKmToMiles();
				}
				else
				{
					System.out.println("Invalid Code");
				}
			}
			else if(code == 3)
			{
				System.out.println("Enter the Time code 1:Minutes\n2:Seconds");
				code = sc.nextInt();
				if(currency_code==2)
				{
					convertHourToSecond();
					convertSecondToHour();
				}
				else if(currency_code==1)
				{
					convertHourToMinute();
					convertMinuteToHour();
				}
				else
				{
					System.out.println("Invalid Code");
				}
			}
			else
			{
				System.out.println("Invalid Code");

			}
		}
	}
}