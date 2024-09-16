import java.util.ArrayList;
import java.util.List;

public class Restaruentt {
    private int id;
    private String name;
    List<MenuItem> menuItem;

    private int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<MenuItem> getMenuItem() {
        return menuItem;
    }

    public void setMenuItem(List<MenuItem> menuItem) {
        this.menuItem = menuItem;
    }
    

    public Restaruentt(int id, String name, List<MenuItem> menuItem) {
        this.id = id;
        this.name = name;
        this.menuItem = menuItem;
    }


   

    

    public Restaruentt(String name, List<MenuItem> menuItem) {
        this.name = name;
        this.menuItem = menuItem;
    }

   

    
}
