//import java.util.Optional;

class Badge {
    public String print(Integer id, String name, String department) {
       // return Optional.ofNullable(id).map(i -> "[" + i + "] - ").orElse("") + name + " - " + Optional.ofNullable(department).map(String::toUpperCase).orElse("OWNER");

     return (id != null ? "[" + id + "] - " : "") + name + " - " + (department != null ? department.toUpperCase() : "OWNER");
    }
}
