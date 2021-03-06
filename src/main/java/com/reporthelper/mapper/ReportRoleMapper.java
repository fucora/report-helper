package com.reporthelper.mapper;

import com.reporthelper.entity.ReportRole;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Myron
 * @since 2019-01-05
 */
public interface ReportRoleMapper extends BaseMapper<ReportRole> {

    /**
     * 查询列表
     * @param params
     * @return
     */
    List<Map<String,Object>> getReportRoleList(Map<String,Object> params);


    int getReportRoleCount(Map<String,Object> params);
}
