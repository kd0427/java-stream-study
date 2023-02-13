package day3;

public enum Admin {
    ADMIN("ADMIN"),
    GUEST("GUEST"),
    KNOWLEDGE_ADMINISTRATOR("KNOWLEDGE_ADMINISTRATOR"),
    USER("USER");

    private final String value;

    Admin(String value){
        this.value = value;
    }

    public String value(){
        return value;
    }
}
