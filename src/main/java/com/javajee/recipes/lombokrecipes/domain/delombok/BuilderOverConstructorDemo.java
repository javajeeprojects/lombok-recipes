package com.javajee.recipes.lombokrecipes.domain.delombok;

public class BuilderOverConstructorDemo {
    String someData;
    String someOtherData;

    BuilderOverConstructorDemo(String someData) {
        this.someData = someData;
        this.someOtherData = "Custom Value";
    }

    public static BuilderOverConstructorDemoBuilder builder() {
        return new BuilderOverConstructorDemoBuilder();
    }

    public static class BuilderOverConstructorDemoBuilder {
        private String someData;

        BuilderOverConstructorDemoBuilder() {
        }

        public BuilderOverConstructorDemoBuilder someData(String someData) {
            this.someData = someData;
            return this;
        }

        public BuilderOverConstructorDemo build() {
            return new BuilderOverConstructorDemo(someData);
        }

        public String toString() {
            return "BuilderOverConstructorDemo.BuilderOverConstructorDemoBuilder(someData=" + this.someData + ")";
        }
    }
}
