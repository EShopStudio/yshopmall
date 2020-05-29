/**
 * Copyright (C) 2018-2020
 * All rights reserved, Designed By www.yixiang.co

 */
package co.yixiang.modules.shop.service;

import co.yixiang.common.service.BaseService;
import co.yixiang.modules.shop.domain.YxUserBill;
import co.yixiang.modules.shop.service.dto.YxUserBillDto;
import co.yixiang.modules.shop.service.dto.YxUserBillQueryCriteria;
import org.springframework.data.domain.Pageable;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
* @author hupeng
* @date 2020-05-12
*/
public interface YxUserBillService  extends BaseService<YxUserBill>{

/**
    * 查询数据分页
    * @param criteria 条件
    * @param pageable 分页参数
    * @return Map<String,Object>
    */
    Map<String,Object> queryAll(YxUserBillQueryCriteria criteria, Pageable pageable);

    /**
    * 查询所有数据不分页
    * @param criteria 条件参数
    * @return List<YxUserBillDto>
    */
    List<YxUserBillDto> queryAll(YxUserBillQueryCriteria criteria);

    /**
    * 导出数据
    * @param all 待导出的数据
    * @param response /
    * @throws IOException /
    */
    void download(List<YxUserBillDto> all, HttpServletResponse response) throws IOException;
}
