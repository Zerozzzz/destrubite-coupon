package org.ling.distribute.coupon.template.api.beans.rules;

import lombok.Data;

@Data
public class TemplateRule {

    private Discount discount;

    private Integer limitation;

    private Long deadline;
}
