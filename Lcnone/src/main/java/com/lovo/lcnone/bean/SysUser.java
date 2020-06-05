package com.lovo.lcnone.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author DongChen
 * @since 2020-06-01
 */
@Data
public class SysUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "userId", type = IdType.AUTO)
    private Integer userId;

    private String password;

    private String uName;

    private String userPass;
    @TableField(value = "user_name")
    private String userName;


}
