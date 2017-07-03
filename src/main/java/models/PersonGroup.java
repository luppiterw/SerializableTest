package main.java.models;

import java.io.Serializable;

/**
 * Created by hughie on 2017/4/3.
 * For group
 */
public class PersonGroup extends IGroup implements Serializable {
    private static final long serialVersionUID = -2581096266403253738L;

    public PersonGroup(String groupTitle, int aim, long startTime) {
        this.groupTitle = groupTitle;
        this.aim = aim;
        this.startTime = startTime;
    }

    @Override
    public String toString() {
        return "groupID=[" + getGroupID() + "] groupTitle=[" + groupTitle + "] aim=[" + aim + "] startTime=[" + startTime + "]";
    }
    private String groupTitle;
    private int aim;
    private long startTime;

}
