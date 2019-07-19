package com.javajee.recipes.lombokrecipes.domain.lombok;

import lombok.Builder;

public class BuilderOverConstructorDemo {
    String someAttr;
    String someOtherAttr;

    @Builder
    BuilderOverConstructorDemo (String someAttr) {
        this.someAttr = someAttr;
        this.someOtherAttr = "Custom Value";
    }
}
