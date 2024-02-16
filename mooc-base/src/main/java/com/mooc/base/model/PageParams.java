package com.mooc.base.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class PageParams {

    //why not int -> MyBatis Default type is Long
    @ApiModelProperty("Page Number")
    private Long pageNo = 1L;
    @ApiModelProperty("Page Size")
    private Long pageSize =30L;

    public PageParams() {
    }
    public PageParams(Long pageNo, Long pageSize) {
        this.pageNo = pageNo;
        this.pageSize = pageSize;
    }
}
