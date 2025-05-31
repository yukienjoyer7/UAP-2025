package uap.bases;

public abstract class Shape {
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public void setName(String inputName) {
        this.name = inputName;
    }

    public String getName() {
        return name;
    }

    public abstract void printInfo();
}
