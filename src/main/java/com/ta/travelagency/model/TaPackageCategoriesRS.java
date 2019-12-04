
package com.ta.travelagency.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "package_categories"
})
public class TaPackageCategoriesRS {

    @JsonProperty("package_categories")
    private List<PackageCategory> packageCategories = null;

    @JsonProperty("package_categories")
    public List<PackageCategory> getPackageCategories() {
        if(packageCategories == null){
            packageCategories = new ArrayList<>();
        }
        return packageCategories;
    }

    @JsonProperty("package_categories")
    public void setPackageCategories(List<PackageCategory> packageCategories) {
        this.packageCategories = packageCategories;
    }

}
