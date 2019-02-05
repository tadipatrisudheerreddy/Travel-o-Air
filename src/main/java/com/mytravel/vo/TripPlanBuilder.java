package com.mytravel.vo;

public class TripPlanBuilder {

     Integer price;
     String origin = "";
     String destination = "";
     String alliance = "";
     String serviceProvider = "";
    
    public TripPlanBuilder(Integer price, String origin, String destination, String alliance,
            String serviceProvider) {
      this.price = price;
      this.origin = origin;
      this.destination = destination;
      this.alliance = alliance;
      this.serviceProvider = serviceProvider;
    }


    public TripPlanBuilder price(Integer price) {
        this.price = price;
        return this;
    }

    public TripPlanBuilder origin(String origin) {
        this.origin = origin;
        return this;
    }

    public TripPlanBuilder destination(String destination) {
        this.destination =destination;
        return this;
    }
    
    public TripPlanBuilder alliance(String alliance) {
        this.alliance = alliance;
        return this;
    }
    
    public TripPlanBuilder serviceProvider(String serviceProvider) {
        this.serviceProvider = serviceProvider;
        return this;
    }
    
    public TripPlan build() {
        return new TripPlan(price,destination,origin,serviceProvider,alliance);
    }
}