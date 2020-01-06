package com.example.nestedrecyclerview.response;

import com.example.nestedrecyclerview.model.MyTeamList;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class NestedRecyclerViewResponse {

    @SerializedName("result")
    @Expose
    private String result;
    @SerializedName("myTeamList")
    @Expose
    private List<MyTeamList> myTeamList = null;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public List<MyTeamList> getMyTeamList() {
        return myTeamList;
    }

    public void setMyTeamList(List<MyTeamList> myTeamList) {
        this.myTeamList = myTeamList;
    }

}
