package com.scrumbums.donationboijfx.main.model.entities;

import java.util.ArrayList;
import java.util.Collection;


/**
 * Store class. Abstracts away a store.
 *
 * @author Nate Schneider, Gibran Essa, and Evan Strat
 */
public class Store {
    private int storeId;
    private Collection inventory;

    private String name;

    private Location location;

    private int locationId;
    private String locationType;
    private String phoneNumber;
    private String website;



    /**
     * Constructor for a store. Only accepts a name, location and phone number
     * without a website.
     *
     * @param name        The name of the store.
     * @param location    The location of the store.
     * @param phoneNumber This store's phone number.
     */
    private Store(String name, Location location, String phoneNumber) {
        this(name, location, phoneNumber, null, null);
    }


    /**
     * Constructor for a store. Only accepts a name, location and phone number
     * without a website.
     *
     * @param name        The name of the store.
     * @param phoneNumber This store's phone number.
     * @param website     This store's website.
     */
    private Store(String name, Location location, String phoneNumber, String website,
                  String locationType) {
        this.inventory = new ArrayList();
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.website = website;
        this.location = location;
        this.locationType = locationType;

    }

    /**
     * Creates a new Store
     *
     * @param name         Name of the store
     * @param location     Physical location of the store
     * @param phoneNumber  Store's phone number
     * @param website      Store's website
     * @param locationType Store type
     * @param storeId      Manually specify the store ID rather than auto-calculating it using
     *                     Realm
     */
    public Store(String name, Location location, String phoneNumber, String website, String
            locationType, int storeId) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.website = website;
        this.location = location;
        this.locationType = locationType;
        this.storeId = storeId;
    }

    /**
     * Reads in sample stores from a CSV and converts them to Store objects
     *
     */
    public static void saveSampleLocationData() {

    }

    /**
     * Get this location's ID
     *
     * @return This location's ID
     */
    public int getLocationId() {
        return locationId;
    }

    /**
     * Set this location's ID
     * @param locationId The ID to set the location ID to
     */
    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    /**
     * Get this location's phone number
     * @return This location's phone number
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Set this location's phone number
     * @param phoneNumber The new phone number
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Get this store's ID
     * @return This store's ID
     */
    public int getStoreId() {
        return storeId;
    }

    /**
     * Set this store's ID
     * @param storeId The new store ID
     */
    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    /**
     * Get the type of this location
     * @return This location's type
     */
    public String getLocationType() {

        return locationType;
    }

    /**
     * Set this location's type
     * @param locationType New location type
     */
    public void setLocationType(String locationType) {
        this.locationType = locationType;
    }



    /**
     * Get this store's name
     * @return The store's name
     */
    public String getName() {
        return name;
    }

    /**
     * Set this store's name
     * @param name The store's name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get this store's location
     * @return A Location object representing the store's physical location
     */
    private Location getLocation() {
        return location;
    }

    /**
     * Set this store's location
     * @param location A Location  object representing the new location for this store
     */
    public void setLocation(Location location) {
        this.location = location;
    }

    /**
     * Get the website URL for this store
     * @return The store's website
     */
    public String getWebsite() {
        return website;
    }

    private void setWebsite(String website) {
        this.website = website;
    }

    private void addToInventory(Item item) {

    }



    /**
     * Get the store's inventory
     * @return An ArrayList of the items in this store's inventory
     */
    public ArrayList<Item> getInventoryArrayList() {
        //noinspection ConstantConditions
        if (inventory == null) {
            return null;
        }
        return new ArrayList<>(inventory);
    }

    /**
     * Lookup an item in this store's inventory by it
     * @param itemId The item ID to search by
     * @return The item, if it was found.  Otherwise, null.
     */
    public Item getInventoryItem(int itemId) {
        return null;
    }

    public String toString() {
        String ret = "";
        ret += "Name: " + (name == null ? "not listed" : name);
        ret += "\nLocation: " + (location == null ? "not listed" : location);
        ret += "\nPhone Number: " + (phoneNumber == null ? "not listed" : phoneNumber);
        ret += "\nWebsite: " + (website == null ? "not listed" : website);
        return ret;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Store) {
            Store compare = (Store) obj;

            return this.name.equals(compare.getName())
                    && this.location.equals(compare.getLocation());
        }
        return false;

    }

    @Override
    public int hashCode() {
        return name.hashCode() + location.hashCode() + phoneNumber.hashCode() + website.hashCode();
    }

    /**
     * Get this store's latitude
     *
     * @return The store's latitude
     */
    public float getLatitude() {
        return location.getLatitude();
    }

    /**
     * Get this store's longitude
     * @return The store's longitude
     */
    public float getLongitude() {
        return location.getLongitude();
    }

}
