package com.example.milktea.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
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
public class Goodsinfo extends Model<Goodsinfo> {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("goodsName")
    private String goodsname;

    @TableField("goodsPrice")
    private Integer goodsprice;

    private String describe;

    @TableField("attributebId")
    private Integer attributebid;

    @TableField("attributecId")
    private Integer attributecid;

}
