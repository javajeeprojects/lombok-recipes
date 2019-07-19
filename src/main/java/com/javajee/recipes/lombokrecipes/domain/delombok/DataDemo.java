package com.javajee.recipes.lombokrecipes.domain.delombok;

public class DataDemo {
    String someData;
    String someOtherData;

    public DataDemo() {
    }

    public String getSomeData() {
        return this.someData;
    }

    public String getSomeOtherData() {
        return this.someOtherData;
    }

    public void setSomeData(String someData) {
        this.someData = someData;
    }

    public void setSomeOtherData(String someOtherData) {
        this.someOtherData = someOtherData;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof DataDemo)) return false;
        final DataDemo other = (DataDemo) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$someData = this.getSomeData();
        final Object other$someData = other.getSomeData();
        if (this$someData == null ? other$someData != null : !this$someData.equals(other$someData)) return false;
        final Object this$someOtherData = this.getSomeOtherData();
        final Object other$someOtherData = other.getSomeOtherData();
        if (this$someOtherData == null ? other$someOtherData != null : !this$someOtherData.equals(other$someOtherData))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof DataDemo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $someData = this.getSomeData();
        result = result * PRIME + ($someData == null ? 43 : $someData.hashCode());
        final Object $someOtherData = this.getSomeOtherData();
        result = result * PRIME + ($someOtherData == null ? 43 : $someOtherData.hashCode());
        return result;
    }

    public String toString() {
        return "DataDemo(someData=" + this.getSomeData() + ", someOtherData=" + this.getSomeOtherData() + ")";
    }
}
