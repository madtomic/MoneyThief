package io.github.ratismal.moneythief.util;

import org.bukkit.ChatColor;

/**
 * Created by Ratismal on 2015-10-05.
 */

public class MessageProcessor {

    /**
     * Processes a general message
     *
     * @param process Message to process
     * @return Processed message
     */
    public static String processGeneral(String process) {

        process = ChatColor.translateAlternateColorCodes('&', process);

        return process;
    }

    /**
     * Processes a PVP message
     *
     * @param process    Message to process
     * @param killedName Killed player's name
     * @param moneyGiven The money given to the killer
     * @param taken      The money taken from the victim
     * @param moneyLost  The money taken from the victim that was lost
     * @param killerName Killer's name
     * @param majorGiven Major of moneyGiven
     * @param minorGiven Minor of moneyGiven
     * @param majorTaken Major of taken
     * @param minorTaken Minor of taken
     * @param majorLost  Major of moneyLost
     * @param minorLost  Minor of moneyLost
     * @return The processed message
     */
    public static String processPVP(String process, String killedName, double moneyGiven, double taken, double moneyLost,
                                    String killerName, int majorGiven, int minorGiven, int majorTaken, int minorTaken,
                                    int majorLost, int minorLost) {

        process = process.replaceAll("%VICTIM", killedName);
        process = process.replaceAll("%MONEYGAINED", Double.toString(moneyGiven));
        process = process.replaceAll("%MONEYTAKEN", Double.toString(taken));
        process = process.replaceAll("%MONEYLOST", Double.toString(moneyLost));
        process = process.replaceAll("%MAJORTAKEN", Integer.toString(majorTaken));
        process = process.replaceAll("%MINORTAKEN", Integer.toString(minorTaken));
        process = process.replaceAll("%MAJORLOST", Integer.toString(majorLost));
        process = process.replaceAll("%MINORLOST", Integer.toString(minorLost));
        process = process.replaceAll("%KILLER", killerName);
        process = process.replaceAll("%MAJORGAINED", Integer.toString(majorGiven));
        process = process.replaceAll("%MINORGAINED", Integer.toString(minorGiven));

        process = ChatColor.translateAlternateColorCodes('&', process);

        return process;

    }

    /**
     * Processes a simplified PVP message (When killed has no balance)
     *
     * @param process    Message to process
     * @param killedName Killed player's name
     * @param killerName Killer's name
     * @return Processed message
     */
    public static String processPVP(String process, String killedName, String killerName) {

        process = process.replaceAll("%VICTIM", killedName);
        process = process.replaceAll("%MONEYGAINED", "null");
        process = process.replaceAll("%MONEYTAKEN", "null");
        process = process.replaceAll("%MONEYLOST", "null");
        process = process.replaceAll("%MAJORTAKEN", "null");
        process = process.replaceAll("%MINORTAKEN", "null");
        process = process.replaceAll("%MAJORLOST", "null");
        process = process.replaceAll("%MINORLOST", "null");
        process = process.replaceAll("%KILLER", killerName);
        process = process.replaceAll("%MAJORGAINED", "null");
        process = process.replaceAll("%MINORGAINED", "null");

        process = ChatColor.translateAlternateColorCodes('&', process);

        return process;

    }

    /**
     * Processes a PVE message (mob)
     *
     * @param process   Message to process
     * @param entity    Killer entity
     * @param moneyLost Money lost
     * @param major     Major of moneyLost
     * @param minor     Minor of moneyLost
     * @param prefix    Mob prefix (a/an)
     * @return Processed message
     */
    public static String processMobPVE(String process, String entity, double moneyLost, int major, int minor, String prefix) {

        process = process.replaceAll("%MOBNAME", entity);
        process = process.replaceAll("%MONEY", Double.toString(moneyLost));
        process = process.replaceAll("%MAJOR", Integer.toString(major));
        process = process.replaceAll("%MINOR", Integer.toString(minor));
        process = process.replaceAll("%A", prefix);
        process = process.replaceAll("%CAUSE", "null");
        process = ChatColor.translateAlternateColorCodes('&', process);

        return process;
    }

    /**
     * Processes a simplified PVE message (mob, player has no balance)
     *
     * @param process Message to process
     * @param entity  Killer entity
     * @param prefix  Mob prefix (a/an)
     * @return Processed message
     */
    public static String processMobPVE(String process, String entity, String prefix) {

        process = process.replaceAll("%MOBNAME", entity);
        process = process.replaceAll("%MONEY", "null");
        process = process.replaceAll("%MAJOR", "null");
        process = process.replaceAll("%MINOR", "null");
        process = process.replaceAll("%A", prefix);
        process = process.replaceAll("%CAUSE", "null");
        process = ChatColor.translateAlternateColorCodes('&', process);

        return process;
    }

    /**
     * Processes a PVE message (environment)
     *
     * @param process   Message to process
     * @param cause     Cause of death
     * @param moneyLost Money lost
     * @param major     Major of moneyLost
     * @param minor     Minor of moneyLost
     * @return Processed message
     */
    public static String processEnvPVE(String process, String cause, double moneyLost, int major, int minor) {

        process = process.replaceAll("%MOBNAME", "null");
        process = process.replaceAll("%MONEY", Double.toString(moneyLost));
        process = process.replaceAll("%MAJOR", Integer.toString(major));
        process = process.replaceAll("%MINOR", Integer.toString(minor));
        process = process.replaceAll("%A", "null");
        process = process.replaceAll("%CAUSE", cause);
        process = ChatColor.translateAlternateColorCodes('&', process);

        return process;
    }

    /**
     * Processes a simplified PVE message (environment, player has no balance)
     *
     * @param process Message to process
     * @param cause   Cause of death
     * @return Processed message
     */
    public static String processEnvPVE(String process, String cause) {

        process = process.replaceAll("%MOBNAME", "null");
        process = process.replaceAll("%MONEY", "null");
        process = process.replaceAll("%MAJOR", "null");
        process = process.replaceAll("%MINOR", "null");
        process = process.replaceAll("%A", "null");
        process = process.replaceAll("%CAUSE", cause);
        process = ChatColor.translateAlternateColorCodes('&', process);

        return process;
    }

}
