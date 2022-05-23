package com.example.milktea.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author SixFeet Under
 * @since 2022-05-23
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Userinfo extends Model<Userinfo> {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String phone;

    private String sex;

    private String birthday;

    private Integer noun;

    @TableField("createTime")
    private LocalDateTime createtime;

    @TableField("updeteTime")
    private LocalDateTime updetetime;

    @TableField("deleteTime")
    private LocalDateTime deletetime;
}
