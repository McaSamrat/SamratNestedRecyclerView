package com.example.nestedrecyclerview.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MyTeamList {

    @SerializedName("members")
    @Expose
    private List<Member> members = null;
    @SerializedName("horizontalMembers")
    @Expose
    private List<HorizontalMember> horizontalMembers = null;

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }

    public List<HorizontalMember> getHorizontalMembers() {
        return horizontalMembers;
    }

    public void setHorizontalMembers(List<HorizontalMember> horizontalMembers) {
        this.horizontalMembers = horizontalMembers;
    }

}
