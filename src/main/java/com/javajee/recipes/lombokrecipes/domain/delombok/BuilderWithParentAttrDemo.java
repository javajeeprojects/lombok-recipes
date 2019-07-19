package com.javajee.recipes.lombokrecipes.domain.delombok;

import com.javajee.recipes.lombokrecipes.domain.common.Parent;

public class BuilderWithParentAttrDemo extends Parent {
    String someAttr;
    String someOtherAttr;

    BuilderWithParentAttrDemo(String someAttr, String someOtherAttr, String parentAttr) {
        super (parentAttr);
        this.someAttr = someAttr;
        this.someOtherAttr = someOtherAttr;
    }

    public static BuilderWithParentAttrDemoBuilder builder() {
        return new BuilderWithParentAttrDemoBuilder();
    }

    public static class BuilderWithParentAttrDemoBuilder {
        private String someAttr;
        private String someOtherAttr;
        private String parentAttr;

        BuilderWithParentAttrDemoBuilder() {
        }

        public BuilderWithParentAttrDemoBuilder someAttr(String someAttr) {
            this.someAttr = someAttr;
            return this;
        }

        public BuilderWithParentAttrDemoBuilder someOtherAttr(String someOtherAttr) {
            this.someOtherAttr = someOtherAttr;
            return this;
        }

        public BuilderWithParentAttrDemoBuilder parentAttr(String parentAttr) {
            this.parentAttr = parentAttr;
            return this;
        }

        public BuilderWithParentAttrDemo build() {
            return new BuilderWithParentAttrDemo(someAttr, someOtherAttr, parentAttr);
        }

        public String toString() {
            return "BuilderWithParentAttrDemo.BuilderWithParentAttrDemoBuilder(someAttr="
                    + this.someAttr + ", someOtherAttr=" + this.someOtherAttr + ", parentAttr=" + this.parentAttr + ")";
        }
    }
}
