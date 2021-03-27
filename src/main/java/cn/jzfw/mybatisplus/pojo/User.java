package cn.jzfw.mybatisplus.pojo;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * The company is 鉴真防务
 * User: 陳佳伟
 * Date: 2021/2/24 2:42 下午
 * Description: 多敲多练
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @TableId(type= IdType.AUTO)
    private Long id;
    private String name;
    private Integer age;
    private String email;
    // 字段添加填充内容
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    @Version //乐观锁Version注解
    private Integer version;

    @TableLogic //逻辑删除
    private Integer deleted;
}
