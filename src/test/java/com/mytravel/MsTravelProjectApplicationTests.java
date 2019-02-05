package com.mytravel;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import static org.assertj.core.api.Assertions.assertThat;
import com.mytravel.vo.TripPlan;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
public class MsTravelProjectApplicationTests {
	@Autowired
	private TestRestTemplate restTemplate;
	
	@Test
	public void checkAirlinesQuotes_Test() throws Exception{
		TripPlan plan = this.restTemplate.getForObject("/v1/air/", TripPlan.class);
		assertThat(plan.getPrice()).isNotZero();
	}
	
	@Test
	public void checkAirlinesandHotelQuotes_Test() throws Exception{
		TripPlan plan = this.restTemplate.getForObject("/v1/airhotels/", TripPlan.class);
		assertThat(plan.getPrice()).isNotZero();
	}
	
	@Test
	public void checkAirlinesandHotelandCarQuotes_Test() throws Exception{
		TripPlan plan = this.restTemplate.getForObject("/v1/airhotelscar/", TripPlan.class);
		assertThat(plan.getPrice()).isNotZero();
	}

}
