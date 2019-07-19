package com.javajee.recipes.lombokrecipes.domain.lombok;

import com.javajee.recipes.lombokrecipes.domain.common.Parent;
import lombok.Builder;

@Builder
public class BuilderWithParentDemo extends Parent {
    String someAttr;
    String someOtherAttr;
}
