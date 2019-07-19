package com.javajee.recipes.lombokrecipes.domain.delombok;

public class BuilderOverConstructorDemo {
    String someAttr;
    String someOtherAttr;

    BuilderOverConstructorDemo (String someAttr) {
        this.someAttr = someAttr;
        this.someOtherAttr = "Custom Value";
    }

    public static BuilderOverConstructorDemoBuilder builder() {
        return new BuilderOverConstructorDemoBuilder();
    }

    public static class BuilderOverConstructorDemoBuilder {
        private String someAttr;

        BuilderOverConstructorDemoBuilder() {
        }

        public BuilderOverConstructorDemoBuilder someAttr(String someAttr) {
            this.someAttr = someAttr;
            return this;
        }

        public BuilderOverConstructorDemo build() {
            return new BuilderOverConstructorDemo(someAttr);
        }

        public String toString() {
            return "BuilderOverConstructorDemo.BuilderOverConstructorDemoBuilder(someAttr=" + this.someAttr + ")";
        }
    }
}
