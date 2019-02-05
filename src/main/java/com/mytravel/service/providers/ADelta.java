package com.mytravel.service.providers;

import java.util.Random;

import org.springframework.stereotype.Component;

import com.mytravel.plans.ServiceProvider;
import com.mytravel.vo.TripPlan;
/**
 * @author Deepank Sharma
 *
 */
@Component
public class ADelta implements ServiceProvider {

	@Override
	public TripPlan createPlan(String origin, String destination) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int price =new Random().nextInt(300);
		TripPlan plan = TripPlan.builder().origin(origin).destination(destination).serviceProvider("Delta").Price(price).alliance(getAlliance()).build();
		System.out.println(Thread.currentThread().getName());
		return plan;
	}

	@Override
	public String getAlliance() {
		return "Western";
	}



}