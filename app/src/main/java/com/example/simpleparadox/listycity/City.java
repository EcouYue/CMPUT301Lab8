package com.example.simpleparadox.listycity;

public class City extends Throwable implements Comparable<City>{
    private String city;
    private String province;

    City(String city, String province){
        this.city = city;
        this.province = province;
    }

    String getCityName(){
        return this.city;
    }

    String getProvinceName(){
        return this.province;
    }

    @Override
    public int compareTo(City city) {
        return this.city.compareTo(getCityName());
    }
}
