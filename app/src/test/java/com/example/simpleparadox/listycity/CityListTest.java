package com.example.simpleparadox.listycity;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class CityListTest {
    private CityList mockCityList(){
        CityList cityList = new CityList();
        cityList.add(mockCity());
        return cityList;
    }

    private City mockCity(){
        return new City("Edmonton", "Alberta");
    }

    @Test
    public void testAdd(){
        CityList cityList = mockCityList();
        assertEquals(1, cityList.getCities().size());
        City city = new City("Regina","Saskatchewan");
        cityList.add(city);

        assertEquals(2,cityList.getCities().size());
        assertTrue(cityList.getCities().contains(city));
    }

    @Test
    public void testAddException(){
        CityList cityList = mockCityList();

        City city = new City("YellowKnife","NorthWest Territories");
        cityList.add(city);

        assertThrows(IllegalArgumentException.class,()->{
            cityList.add(city);
        });

    }
    @Test
    public void testGetCities(){
        CityList cityList = mockCityList();

        assertEquals(0,mockCity().compareTo(cityList.getCities().get(0)));

        City city = new City("Charlottetown","Prince Edward Island");
        cityList.add(city);

        assertEquals(0,city.compareTo(cityList.getCities().get(0)));
        assertEquals(0,mockCity().compareTo(cityList.getCities().get(1)));
    }
    @Test
    public void testDelete(){
        CityList cityList = mockCityList();
        City city = new City("Calgary","Alberta");
        cityList.add(city);
        cityList.delete(city);

        assertEquals(1,cityList.getCities().size());

    }

    @Test
    public void testDeleteException(){
        CityList cityList = mockCityList();

        City city = new City("YellowKnife","NorthWest Territories");
        cityList.add(city);
        cityList.delete(city);

        assertThrows(IllegalArgumentException.class,()->{
            cityList.delete(city);
        });

    }
    @Test
    public void testHasCity(){
        CityList cityList = mockCityList();

        assertEquals(1, cityList.getCities().size());
        City city = new City("Toronto","Ontario");
        cityList.add(city);

        assertTrue(cityList.getCities().contains(city));
    }
    @Test
    public void testCountCities(){
        CityList cityList = mockCityList();
        assertEquals(1, cityList.countCities());

    }

}
