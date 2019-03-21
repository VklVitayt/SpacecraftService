import org.springframework.beans.factory.annotation.Autowired;

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
        return "Название шатла:" + name + ". Экипаж шатла:"+shuttle;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
