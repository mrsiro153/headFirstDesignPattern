package siro.revision.iterator;

public class MenuItem {
    private String name;
    private Integer waitingTime;
    private String description;

    public MenuItem(String name, Integer waitingTime, String description) {
        this.name = name;
        this.waitingTime = waitingTime;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public MenuItem setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getWaitingTime() {
        return waitingTime;
    }

    public MenuItem setWaitingTime(Integer waitingTime) {
        this.waitingTime = waitingTime;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public MenuItem setDescription(String description) {
        this.description = description;
        return this;
    }
}
