package com.yongche.api.main;

import com.yongche.api.http.http_client;


public class ConcurrentTest 
{ 
	public static void main(String[] args) 
	{ 
		Runnable settlement = new settlement();
		Runnable pay = new pay();
		Thread thread1 = new Thread(settlement);
		Thread thread2 = new Thread(pay);
		thread1.run();
		thread2.run();
	}

}

class settlement implements Runnable
{
	@Override
	public void run()
	{
		for(int i=0; i<10; i++)
		{
			http_client a = new http_client();
			try {
				System.out.print("Settlement: " + i + " : ");
				a.client();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}

class pay implements Runnable
{
	@Override
	public void run()
	{
		for(int i =0; i<10; i++)
		{
			http_client b = new http_client();
			try {
				System.out.print("Pay: "+ i + " : ");
				b.client();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	
}
