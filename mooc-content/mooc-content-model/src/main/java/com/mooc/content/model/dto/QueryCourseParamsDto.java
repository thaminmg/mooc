package com.mooc.content.model.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class QueryCourseParamsDto {

    @ApiModelProperty("Audit Status")
    private String auditStatus;
    @ApiModelProperty("Course Name")
    private String courseName;
    @ApiModelProperty("Publish Status")
    private String publishStatus;

}