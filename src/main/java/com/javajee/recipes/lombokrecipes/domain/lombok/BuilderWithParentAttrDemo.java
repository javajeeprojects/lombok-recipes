package com.javajee.recipes.lombokrecipes.domain.lombok;

import com.javajee.recipes.lombokrecipes.domain.common.Parent;
import lombok.Builder;
import lombok.EqualsAndHashCode;

public class BuilderWithParentAttrDemo extends Parent {
    String someAttr;
    String someOtherAttr;

    /* We can also use @SuperBuilder over class instead. However,
    @SuperBuilder is still experimental and IDE support is limited. */
    @Builder
    BuilderWithParentAttrDemo(String someAttr, String someOtherAttr, String parentAttr) {
        super (parentAttr);
        this.someAttr = someAttr;
        this.someOtherAttr = someOtherAttr;
    }
}
