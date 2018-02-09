package com.mars.share.dto.admin;


import com.mars.share.dto.BaseDTO;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

@Getter
@Setter
@ToString
public class RoleDTO extends BaseDTO{

    private Long id;

    @NotBlank(message = "角色名称不可以为空")
    @Length(min = 2, max = 30, message = "角色名称长度需要在2-20个字之间")
    private String roleName;

    @NotBlank(message = "角色编码不能为空")
    private String roleCode;

    @NotBlank(message = "角色类型不能为空")
    private String roleType;

}