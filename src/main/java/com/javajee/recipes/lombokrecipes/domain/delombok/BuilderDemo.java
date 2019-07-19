package com.javajee.recipes.lombokrecipes.domain.delombok;

public class BuilderDemo {
    String someAttr;
    String someOtherAttr;

    BuilderDemo(String someAttr, String someOtherAttr) {
        this.someAttr = someAttr;
        this.someOtherAttr = someOtherAttr;
    }

    public static BuilderDemoBuilder builder() {
        return new BuilderDemoBuilder();
    }

    public static class BuilderDemoBuilder {
        private String someAttr;
        private String someOtherAttr;

        BuilderDemoBuilder() {
        }

        public BuilderDemoBuilder someAttr(String someAttr) {
            this.someAttr = someAttr;
            return this;
        }

        public BuilderDemoBuilder someOtherAttr(String someOtherAttr) {
            this.someOtherAttr = someOtherAttr;
            return this;
        }

        public BuilderDemo build() {
            return new BuilderDemo(someAttr, someOtherAttr);
        }

        public String toString() {
            return "BuilderDemo.BuilderDemoBuilder(someAttr=" + this.someAttr + ", someOtherAttr=" + this.someOtherAttr + ")";
        }
    }
}
