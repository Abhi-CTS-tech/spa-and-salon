package com.spa.core.core.models;

import com.spa.core.core.models.pojo.NavItem;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;


@Model(adaptables = SlingHttpServletRequest.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class HeaderNavModel {

    @ValueMapValue
    private String[] navigation_title;

    @ValueMapValue
    private String[] navigation_link;


    public List<NavItem> getNavigationItems() {
        List<NavItem> items=new ArrayList<>();
        for(int i=0;i<navigation_title.length;i++){
            String title=navigation_title[i];
            String link=navigation_link[i];
            NavItem item=new NavItem(title,link);
            items.add(item);
        }
        return items;

    }
}
