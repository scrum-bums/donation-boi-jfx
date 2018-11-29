package com.scrumbums.donationboijfx.model.entities;



/**
 * Model class representing the physical location of a store
 */
public class Location  {
    private static int locationCount;
    private int locationId;

    private float latitude;
    private float longitude;
    private String streetAddress;
    private String city;
    private String state;
    private int zipCode;

    /**
     * Public no-arg constructor for Realm
     */
    public Location() {
    }

    /**
     * Creates a new location
     *
     * @param streetAddress Street address for the location
     * @param state         State for the location
     * @param city          City for the location
     * @param zipCode       ZIP code for the location
     * @param latitude      Latitude for the location
     * @param longitude     Longitude for the location
     */
    public Location(String streetAddress, String state, String city, int zipCode, float latitude,
                    float longitude) {
        this.streetAddress = streetAddress;
        this.state = state;
        this.city = city;
        this.zipCode = zipCode;
        this.latitude = latitude;
        this.longitude = longitude;
        locationCount++; // Required to set the location ID for Realm
        this.locationId = locationCount;
    }

    /**
     * Get's the location's ID
     * @return The location's ID
     */
    public int getLocationId() {
        return locationId;
    }

    /**
     * Sets this location's ID
     * @param locationId ID to change the location ID to
     */
    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    /**
     * Get the latitude of this location
     * @return The latitude of this location
     */
    public float getLatitude() {
        return latitude;
    }

    private void setLatitude(float lat) {
        this.latitude = lat;
    }

    /**
     * Get the longitude of this location
     * @return This location's longitude
     */
    public float getLongitude() {
        return longitude;
    }

    private void setLongitude(float lon) {
        this.longitude = lon;
    }

    /**
     * Get the street address of the location
     * @return This location's street address
     */
    private String getStreetAddress() {
        return streetAddress;
    }

    private void setStreetAddress(String sA) {
        this.streetAddress = sA;
    }

    /**
     * Get this location's city
     * @return This location's city
     */
    private String getCity() {
        return city;
    }

    private void setCity(String city) {
        this.city = city;
    }

    /**
     * Get this location's state
     * @return State where this location is located
     */
    private String getState() {
        return state;
    }

    private void setState(String state) {
        this.state = state;
    }

    /**
     * Get the ZIP code for this location
     *
     * @return This location's ZIP code
     */
    public int getZipCode() {
        return zipCode;
    }

    private void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String toString() {
        String ret = "";
        ret += "Address: " + cityStateZipCode();
        return ret;
    }

    private String cityStateZipCode() {
        if ((streetAddress == null) && (city == null) && (state == null) && (zipCode == 0)) {
            return "not listed";
        }
        String ret = "";
        ret += (streetAddress == null) ? "" : streetAddress;
        ret += (city == null) ? "" : (", " + city);
        ret += (state == null) ? "" : (", " + state);
        ret += (zipCode == 0) ? "" : (", " + zipCode);

        String latLon = "(" + latitude + ", " + longitude + ")";

        ret += ", " + latLon;
        return ret;
    }

    @Override
    public int hashCode() {
        int hash = 18;
        hash += 31 * this.streetAddress.hashCode();
        hash += 31 * this.state.hashCode();
        hash += 31 * this.city.hashCode();
        hash += 31 * this.zipCode;
        hash += 31 * this.latitude;
        hash += 31 * this.longitude;

        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj instanceof Location) {
            Location compare = (Location) obj;
            return this.streetAddress.equals(compare.getStreetAddress())
                    && this.city.equals(compare.getCity())
                    && this.state.equals(compare.getState())
                    && (this.latitude == compare.getLatitude())
                    && (this.longitude == compare.getLongitude())
                    && (this.zipCode == compare.getZipCode());
        }
        return false;
    }
}
