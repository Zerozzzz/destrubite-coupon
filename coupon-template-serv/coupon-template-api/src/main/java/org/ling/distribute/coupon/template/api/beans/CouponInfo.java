package org.ling.distribute.coupon.template.api.beans;

import lombok.Builder;
import lombok.Data;

/**
 * Coupon Information
 */
@Data
@Builder
public class CouponInfo {

    private Long id;

    private Long templateId;

    private Long userId;

    private Long shopId;

    private Integer status;

    private CouponTemplateInfo template;
}
