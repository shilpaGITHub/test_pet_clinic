package sk.springframework.com.java.model;

public class PetType extends BaseEntity{
    private String Name;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
