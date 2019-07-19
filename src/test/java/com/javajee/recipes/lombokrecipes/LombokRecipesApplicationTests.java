package com.javajee.recipes.lombokrecipes;

import com.javajee.recipes.lombokrecipes.domain.lombok.BuilderWithParentAttrDemo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LombokRecipesApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Test
    public void BuilderWithParentAttrDemo() {
        BuilderWithParentAttrDemo builderWithParentAttrDemo = BuilderWithParentAttrDemo.builder()
                .someAttr("A")
                .someOtherAttr("B")
                .parentAttr("P")
                .build();

        com.javajee.recipes.lombokrecipes.domain.delombok.BuilderWithParentAttrDemo builderWithParentAttrDemoDelombook
                = com.javajee.recipes.lombokrecipes.domain.delombok.BuilderWithParentAttrDemo.builder()
                .someAttr("A")
                .someOtherAttr("B")
                .parentAttr("P")
                .build();
    }
}
