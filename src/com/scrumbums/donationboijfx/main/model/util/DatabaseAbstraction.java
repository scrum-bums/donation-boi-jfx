package com.scrumbums.donationboijfx.main.model.util;


import com.scrumbums.donationboijfx.main.model.entities.Item;
import com.scrumbums.donationboijfx.main.model.entities.Store;
import com.scrumbums.donationboijfx.main.model.entities.User;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;


/**
 * Abstraction of the database. Handles useful database functions through an
 * abstraction layer (i.e methods) but allows reconfiguration of the database
 * behind the scenes (local for demos, Firebase, etc.)
 *
 * @author jdierberger3
 */
public final class DatabaseAbstraction {
    public static Set<User> users = new HashSet<>();
    public static Set<Store> stores = new HashSet<>();
    public static User loggedIn = null;

    /**
     * Attempt to login with the given credentials.
     * @param email The email of the user.
     * @param password The password of the user.
     * @return 1 if the given credentials are valid, 0 if the password is
     * invalid, or -1 if the username is invalid.
     */
    public static boolean login(String email, String password) {
        Optional<User> user = users.stream().filter(u -> Objects.equals(u.getEmail(), email)
                && Objects.equals(u.getPassword(), password)).findAny();
        if (user.isPresent()) {
            loggedIn = user.get();
            return true;
        }
        return false;
    }

    /**
     * Register the given user.
     * @param user The User to register.
     * @return A Completable that will complete when the user has been registered successfully,
     *         or error otherwise.
     */
    public static boolean register(final User user) {
        if(users.stream().anyMatch(u -> Objects.equals(u.getEmail(), user.getEmail())
                && Objects.equals(u.getPassword(), user.getEmail()))) {
            return false;
        }
        users.add(user);
        return true;
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
     */
    public static void logout() {

    }
}
