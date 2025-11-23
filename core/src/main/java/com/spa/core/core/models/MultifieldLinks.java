package com.spa.core.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;


@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class MultifieldLinks {
    @ValueMapValue
    private String label;

    @ValueMapValue
    private String path;

    @ValueMapValue
    private String target;

    public String getLabel() {
        return label;
    }

    public String getPath() {
        return path;
    }

    public String getTarget() {
        return target;
    }
}
