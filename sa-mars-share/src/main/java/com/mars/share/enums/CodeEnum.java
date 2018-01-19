package com.mars.share.enums;

import java.text.MessageFormat;

public enum CodeEnum {

    SUCCESS(0, "成功."),
    CMN_INTER_ERR(20000, "系统繁忙，请稍后再试"),
    CMN_ILLEGAL_ARG(20001, "参数不合法，{0}"),
    CMN_NOT_LOGIN(20002, "账户登录失效，请重新登录"),
    CMN_NO_ACCESS(20003, "访问失败，没有权限访问该资源"),
    /**
     * 10：系统错误
     */
    SYS_RUNTIME_ERROR(100001, "系统运行出错，{0}"),
    SYS_INITIAL_ERROR(100002, "系统初始化出错，{0}"),

    /**
     * 11：通用错误
     */
    CMN_BLANK_ERROR(110001, "{0}"),
    CMN_ILLEGAL_OPERATION(110002, "非法操作，{0}"),
    CMN_REPOSITORY_ERROR(110003, "持久层操作异常，{0}"),
    CMN_INITIAL_ERR(110009, "初始化出错，{0}"),
    CMN_RESOURCE_NO_AUTH(110010, "无权限访问"),
    CMN_ILLEGAL_STATUS(110011, "非法状态:{0}"),
    CMN_CREATE_ERR(110012, "创建失败,{0}"),
    CMN_UPDATE_ERR(110013, "修改失败,{0}"),
    CMN_DELETE_ERR(110014, "删除失败,{0}"),
    CMN_QUERY_ERR(110015, "查询失败,{0}"),
    CMN_NOTEMPTY_ERR(110016, "{0}信息不能为空");


    private int code;
    private String pattern;

    private CodeEnum(int code, String pattern) {
        this.code = code;
        this.pattern = pattern;
    }

    public int getCode() {
        return code;
    }

    public String getErrorMsg(Object... params) {
        String errorMsg = null;
        if ((params == null) || (params.length == 0)) {
            errorMsg = pattern;
        } else {
            MessageFormat msgFmt = new MessageFormat(pattern);
            errorMsg = msgFmt.format(params);
        }
        return errorMsg;
    }

}