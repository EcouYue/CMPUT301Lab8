package com.example.simpleparadox.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is a class that keeps track of a list of city objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if the city does not exist
     * @param city city to add
     */
    void add(City city){
        if (cities.contains(city)){
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }
    /**
     * This method returns a sorted list of cities
     * @return
     * Return the sorted sort
     */
    public List<City> getCities(){
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * This method return whether or not it belongs in the list
     * @return
     * Return True or False
     */
    public boolean hasCity(City city) {
        if (cities.contains(city)){
            return true;
        }
        return false;
    }

    /**
     * This method returns length of the  list
     * @return
     * Return the number of cities
     */

    public int countCities(){
        return cities.size();
    }

    /**
     * This method delete a city from the list if city exists.
     * @param city city to delete
     */

    public void delete(City city) {
        if(cities.contains(city) == false) {
            throw new IllegalArgumentException();
        }

        cities.remove(city);
    }
}
