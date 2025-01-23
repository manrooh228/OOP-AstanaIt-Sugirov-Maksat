package assignment3.interfaces.task13;

import assignment3.interfaces.task13.Solution.DBObject;

public class User implements DBObject {
    long id;
    String name;

    @Override
    public DBObject initializeIdAndName(long id, String name) {
        this.id = id;
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return String.format("The user's name is %s, id = %d", name, id);
    }
}
