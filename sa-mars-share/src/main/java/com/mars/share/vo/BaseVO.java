package com.mars.share.vo;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.util.Date;

/**
 * 基类DTO
 *
 * @author stonew1987
 * @create 2018-02-08 16:12
 **/

@Data
public class BaseVO {

    //页面显示行数
    private int pageSize = 10;

    //页码
    private int pageNum = 1;

    // 备注
    @Length(max = 255, message = "备注的长度需要在255个字以内")
    private String remarks;

    // 创建人
    private Long creator;

    // 修改人
    private Long modifier;

    // 创建时间
    private Date gmtCreated;

    // 修改时间
    private Date gmtModified;

    // 删除标识  默认：N
    private String isDeleted;

}
