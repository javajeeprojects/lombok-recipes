package com.javajee.recipes.lombokrecipes.domain.lombok;

import lombok.Builder;

public class BuilderOverConstructorDemo {
    String someData;
    String someOtherData;

    @Builder
    BuilderOverConstructorDemo (String someData) {
        this.someData = someData;
        this.someOtherData = "Custom Value";
    }

}
