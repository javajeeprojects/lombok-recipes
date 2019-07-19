package com.javajee.recipes.lombokrecipes.domain.delombok;

public class DataDemo {
    String someAttr;
    String someOtherAttr;

    public DataDemo() {
    }

    public String getSomeAttr() {
        return this.someAttr;
    }

    public String getSomeOtherAttr() {
        return this.someOtherAttr;
    }

    public void setSomeAttr(String someAttr) {
        this.someAttr = someAttr;
    }

    public void setSomeOtherAttr(String someOtherAttr) {
        this.someOtherAttr = someOtherAttr;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof DataDemo)) return false;
        final DataDemo other = (DataDemo) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$someAttr = this.getSomeAttr();
        final Object other$someAttr = other.getSomeAttr();
        if (this$someAttr == null ? other$someAttr != null : !this$someAttr.equals(other$someAttr)) return false;
        final Object this$someOtherAttr = this.getSomeOtherAttr();
        final Object other$someOtherAttr = other.getSomeOtherAttr();
        if (this$someOtherAttr == null ? other$someOtherAttr != null : !this$someOtherAttr.equals(other$someOtherAttr))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof DataDemo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $someAttr = this.getSomeAttr();
        result = result * PRIME + ($someAttr == null ? 43 : $someAttr.hashCode());
        final Object $someOtherAttr = this.getSomeOtherAttr();
        result = result * PRIME + ($someOtherAttr == null ? 43 : $someOtherAttr.hashCode());
        return result;
    }

    public String toString() {
        return "DataDemo(someAttr=" + this.getSomeAttr() + ", someOtherAttr=" + this.getSomeOtherAttr() + ")";
    }
}
