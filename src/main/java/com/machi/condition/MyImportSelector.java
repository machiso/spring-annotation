package com.machi.condition;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

//自定义逻辑，返回需要导入的组件
public class MyImportSelector implements ImportSelector {
    //返回值，就是要导入到容器中的组件全类名
    //AnnotationMetadata：当前类的注解信息
    // 返回字符串数组中的类会导入到容器中
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{"com.machi.model.Blue"};

    }
}
