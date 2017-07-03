package main.java.models;

/**
 * Created by hughie on 2017/4/3.
 * Group abstract class
 */
public abstract class IGroup {

    public int getGroupID() {
        return groupID;
    }

    public void setGroupID(int groupID) {
        this.groupID = groupID;
    }

    private int groupID;
}
