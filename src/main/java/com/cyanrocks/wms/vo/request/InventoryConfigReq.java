package com.cyanrocks.wms.vo.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @Author wjq
 * @Date 2024/7/23 16:48
 */
@Data
@ApiModel(description = "库存配置请求参数")
public class InventoryConfigReq {

    @ApiModelProperty(value = "字段 库存字段名称;分类;商家编码")
    private String fields;

    @ApiModelProperty(value = "类型 select-选择显示字段；delete-去除显示字段")
    private String type;

    @ApiModelProperty(value = "字段值")
    private String[] value;
}
