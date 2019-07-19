package com.javajee.recipes.lombokrecipes.domain.delombok;

import com.javajee.recipes.lombokrecipes.domain.common.Parent;

public class BuilderWithParentDemo extends Parent {
    String someAttr;
    String someOtherAttr;

    BuilderWithParentDemo(String someAttr, String someOtherAttr) {
        this.someAttr = someAttr;
        this.someOtherAttr = someOtherAttr;
    }

    public static BuilderWithParentDemoBuilder builder() {
        return new BuilderWithParentDemoBuilder();
    }

    public static class BuilderWithParentDemoBuilder {
        private String someAttr;
        private String someOtherAttr;

        BuilderWithParentDemoBuilder() {
        }

        public BuilderWithParentDemoBuilder someAttr(String someAttr) {
            this.someAttr = someAttr;
            return this;
        }

        public BuilderWithParentDemoBuilder someOtherAttr(String someOtherAttr) {
            this.someOtherAttr = someOtherAttr;
            return this;
        }

        public BuilderWithParentDemo build() {
            return new BuilderWithParentDemo(someAttr, someOtherAttr);
        }

        public String toString() {
            return "BuilderWithParentDemo.BuilderWithParentDemoBuilder(someAttr=" + this.someAttr + ", someOtherAttr=" + this.someOtherAttr + ")";
        }
    }
}
