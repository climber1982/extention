package com.lovo.mybaits.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author DongChen
 * @since 2020-06-01
 */
@Data
//@EqualsAndHashCode(callSuper = false)
//@Accessors(chain = true)
public class SysUser {

    private static final long serialVersionUID = 1L;

    @TableId(value = "userId", type = IdType.AUTO)
    private Integer userId;

    private String password;

    private String uName;

    private String userPass;
    @TableField(value = "user_name")
    private String userName;


}
