package org.ling.distribute.coupon.template.api.beans;

import lombok.Data;
import org.ling.distribute.coupon.template.api.beans.rules.TemplateRule;

import javax.validation.constraints.NotNull;

@Data
public class CouponTemplateInfo {

    private Long id;

    @NotNull
    private String name;

    // 优惠券描述
    @NotNull
    private String desc;

    // 优惠券类型(引用CouponType里的code)

    // 优惠券适用门店 - 若无则为全店通用券
    @NotNull
    private String type;

    // 优惠券适用门店 - 若无则为全店通用券
    private Long shopId;

    // 优惠券使用规则
    @NotNull
    private TemplateRule rule;

    // 当前模板是否为可用状态
    private Boolean available;
}
