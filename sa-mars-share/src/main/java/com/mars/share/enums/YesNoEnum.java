package com.mars.share.enums;

import org.apache.commons.lang3.StringUtils;

public enum YesNoEnum {
    No("N", "否"),
    Yes("Y", "是");

    private String code;

    private String name;

    private YesNoEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public static YesNoEnum getYesNoEnum(String code) {
        for (YesNoEnum an : YesNoEnum.values()) {
            if (an.getCode().equals(code))
                return an;
        }
        return null;
    }

    public static YesNoEnum getEnumByName(String name) {
        if (StringUtils.isBlank(name)) {
            return null;
        }
        for (YesNoEnum an : YesNoEnum.values()) {
            if (an.getName().equals(name)) {
                return an;
            }
        }
        throw new IllegalArgumentException("只支持 是 否，不支持" + name);
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
