package com.manager.direct.doctorapp;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Id {

    @SerializedName("contract")
    @Expose
    private List<Contract> contract;

    public Id() {
        contract = null;
    }

    public List<Contract> getContract() {
        return contract;
    }

    public void setContract(List<Contract> contract) {
        this.contract = contract;
    }

}
