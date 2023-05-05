package org.ling.distribute.coupon.template.dao.entity.converter;

import com.google.gson.Gson;
import org.ling.distribute.coupon.template.api.beans.rules.TemplateRule;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class RuleConverter implements AttributeConverter<TemplateRule, String> {//todo replace String to DO

    private static final Gson GSON = new Gson();

    @Override
    public String convertToDatabaseColumn(TemplateRule couponTemplateRule) {
        return GSON.toJson(couponTemplateRule);
    }

    @Override
    public TemplateRule convertToEntityAttribute(String ruleJsonString) {
        return GSON.fromJson(ruleJsonString, TemplateRule.class);
    }
}
