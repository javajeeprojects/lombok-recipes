package com.javajee.recipes.lombokrecipes.domain.delombok;

public class BuilderDemo {
    String someData;
    String someOtherData;

    BuilderDemo(String someData, String someOtherData) {
        this.someData = someData;
        this.someOtherData = someOtherData;
    }

    public static BuilderDemoBuilder builder() {
        return new BuilderDemoBuilder();
    }

    public static class BuilderDemoBuilder {
        private String someData;
        private String someOtherData;

        BuilderDemoBuilder() {
        }

        public BuilderDemoBuilder someData(String someData) {
            this.someData = someData;
            return this;
        }

        public BuilderDemoBuilder someOtherData(String someOtherData) {
            this.someOtherData = someOtherData;
            return this;
        }

        public BuilderDemo build() {
            return new BuilderDemo(someData, someOtherData);
        }

        public String toString() {
            return "BuilderDemo.BuilderDemoBuilder(someData=" + this.someData + ", someOtherData=" + this.someOtherData + ")";
        }
    }
}
