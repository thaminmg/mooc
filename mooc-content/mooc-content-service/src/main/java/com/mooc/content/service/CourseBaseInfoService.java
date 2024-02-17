package com.mooc.content.service;

import com.mooc.base.model.PageParams;
import com.mooc.base.model.PageResult;
import com.mooc.content.model.dto.QueryCourseParamsDto;
import com.mooc.content.model.po.CourseBase;

public interface CourseBaseInfoService {

    /**
     * @param pageParams Page parameter
     * @param queryCourseParamsDto Query parameter
     * @return Result
     */
    PageResult<CourseBase> queryCourseBaseList(PageParams pageParams, QueryCourseParamsDto queryCourseParamsDto);
}
