package com.abcdrugs.abcdrugs.model;

public class Drug {

    private String brandName;
    private String activeIngredient;
    private String purpose;
    private String usage;

    public String getBrandName() {
        return brandName;
    }

    public void setBrandname(String brandname) {
        this.brandName = brandname;
    }

    public String getActiveIngredient() {
        return activeIngredient;
    }

    public void setActiveIngredient(String activeIngredient) {
        this.activeIngredient = activeIngredient;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }
}
