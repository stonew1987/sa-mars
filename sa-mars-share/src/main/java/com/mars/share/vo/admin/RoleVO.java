package com.mars.share.vo.admin;


import com.mars.share.vo.BaseVO;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class RoleVO extends BaseVO{

    private String roleName;

    private String roleCode;

    private String roleType;

}