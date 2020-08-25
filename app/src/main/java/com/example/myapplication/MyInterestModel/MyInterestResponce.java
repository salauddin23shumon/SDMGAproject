
package com.example.myapplication.MyInterestModel;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MyInterestResponce {

    @SerializedName("MyInterest")
    @Expose
    private List<MyInterest> myInterest = null;

    public List<MyInterest> getMyInterest() {
        return myInterest;
    }

    public void setMyInterest(List<MyInterest> myInterest) {
        this.myInterest = myInterest;
    }

}
