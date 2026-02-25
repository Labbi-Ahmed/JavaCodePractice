package datatype;

public class ClassType {
    private String name;
    private String description;

    public ClassType(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public ClassType() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
