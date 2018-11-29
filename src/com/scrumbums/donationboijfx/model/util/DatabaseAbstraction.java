package com.scrumbums.donationboijfx.model.util;


import com.scrumbums.donationboijfx.model.entities.Item;
import com.scrumbums.donationboijfx.model.entities.Store;
import com.scrumbums.donationboijfx.model.entities.User;

import java.util.List;



/**
 * Abstraction of the database. Handles useful database functions through an
 * abstraction layer (i.e methods) but allows reconfiguration of the database
 * behind the scenes (local for demos, Firebase, etc.)
 *
 * @author jdierberger3
 */
public final class DatabaseAbstraction {
    /**
     * do not use.
     */
    private DatabaseAbstraction() { }

    /**
     * Attempt to login with the given credentials.
     * @param context The current application context
     * @param email The email of the user.
     * @param password The password of the user.
     * @return 1 if the given credentials are valid, 0 if the password is
     * invalid, or -1 if the username is invalid.
     */
    public static User login(String email, String password) {
        return null;
    }

    /**
     * Register the given user.
     * @param user The User to register.
     * @return A Completable that will complete when the user has been registered successfully,
     *         or error otherwise.
     */
    public static boolean register(final User user) {
        return false;
    }

    /**
     * Get a store by its store ID
     *
     * @param storeId The store ID to search by
     * @return The store if found.  Otherwise, null.
     */
    public static Store getStore(int storeId) {
        return null;
    }

    /**
     * retrieves an array of items from a store with specified id
     * @param storeId The store ID to search by
     * @return the items belonging to a store.
     */
    public static List<Item> getItemsByStoreId(int storeId) {
        return null;
    }

    /**
     * Get all the stores in the database
     *
     * @return An array containing all the stores in the database
     */
    public static Store[] getStoresArrayList() {
        return null;
    }

    /**
     * Logs the user out of the application
     *
     * @param context The current application context
     */
    public static void logout() {

    }
}
