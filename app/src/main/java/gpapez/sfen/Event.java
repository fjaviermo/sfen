package gpapez.sfen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 * Class for our event which will include
 * name,
 * status (enabled/disabled),
 * array of Conditions
 * array of Actions
 *
 * Created by Gregor on 10.7.2014.
 */
public class Event {
    private String name;
    private boolean enabled;
    private boolean running = false;
    private boolean matchAllConditions = true;
    private boolean forceRun = false;
    private int uniqueID = -1;

    public boolean isMatchAllConditions() {
        return matchAllConditions;
    }

    public boolean isForceRun() {
        return forceRun;
    }

    public void setForceRun(boolean forceRun) {
        this.forceRun = forceRun;
    }

    public void setMatchAllConditions(boolean matchAllConditions) {
        this.matchAllConditions = matchAllConditions;
    }

    private ArrayList<DialogOptions> conditions = new ArrayList<DialogOptions>();
    private ArrayList<DialogOptions> actions = new ArrayList<DialogOptions>();

    private HashMap<String, String> settings;

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public int getUniqueID() {
        return uniqueID;
    }

    public Event() {
        super();
        if (uniqueID == -1) {
            uniqueID = new Random().nextInt(Integer.MAX_VALUE) + 1;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isEnabled() { return enabled; }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public ArrayList<DialogOptions> getConditions() {
        return conditions;
    }

    public void setConditions(ArrayList<DialogOptions> conditions) {
        this.conditions = conditions;
    }

    public ArrayList<DialogOptions> getActions() {
        return actions;
    }

    public void setActions(ArrayList<DialogOptions> actions) {
        this.actions = actions;
    }

    public void setSetting(String key, String value) {
        settings.put(key, value);
    }

    public String getSetting(String key) {
        return settings.get(key);
    }

    public void setSettings(HashMap<String, String>settings) {
        this.settings = settings;
    }

    public HashMap<String, String>getSettings() {
        return settings;
    }
}
