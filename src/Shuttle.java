import java.util.Set;

public class Shuttle {
    private String name;
    private Set shuttle;

    public Set getList() {
        return shuttle;
    }

    public void setList(Set shuttle) {
        this.shuttle = shuttle;
    }

    @Override
    public String toString() {
        return "Shuttle{shuttle name=" + name + shuttle +'}'+"\n" ;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
