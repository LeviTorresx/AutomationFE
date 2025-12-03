package automationfe.certificacion.FleetGuard360.models;

public class NewAlertData {

    private String name;
    private String description;
    private String manager;
    private String priority;

    public NewAlertData(String name, String priority, String manager, String description) {
        this.name = name;
        this.priority = priority;
        this.manager = manager;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getPriority() {
        return priority;
    }

    public String getManager() {
        return manager;
    }
}
