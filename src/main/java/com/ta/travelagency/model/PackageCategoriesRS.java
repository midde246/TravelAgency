
package com.ta.travelagency.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ta_package_categories_rs"
})
public class PackageCategoriesRS {

    @JsonProperty("ta_package_categories_rs")
    private TaPackageCategoriesRS taPackageCategoriesRs;
    
    @JsonProperty("ta_package_categories_rs")
    public TaPackageCategoriesRS getTaPackageCategoriesRs() {
        return taPackageCategoriesRs;
    }

    @JsonProperty("ta_package_categories_rs")
    public void setTaPackageCategoriesRs(TaPackageCategoriesRS taPackageCategoriesRs) {
        this.taPackageCategoriesRs = taPackageCategoriesRs;
    }

}
