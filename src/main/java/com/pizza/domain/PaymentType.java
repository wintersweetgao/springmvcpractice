package com.pizza.domain;

import org.apache.commons.lang3.text.WordUtils;

import java.util.Arrays;
import java.util.List;

/**
 * @author dongmei.gao
 * @date 2019/6/3 10:36
 */
public enum PaymentType {
    CASH, CHECK, CREDIT_CARD;

    public List<PaymentType> asList(){
        PaymentType[] list = PaymentType.values();
        return Arrays.asList(list);
    }

    @Override
    public String toString() {
        return WordUtils.capitalizeFully(name().replace('_', ' '));
    }
}
