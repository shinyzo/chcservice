package com.lming.chcservice.form;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;

/**
 * @Author shinyZo
 * @date 2017-11-28
 * @description
 */
@Data
public class ReserveCreateForm {

    @NotNull(message = "预约者id不能为空")
    private Integer fromUserId;

    private Integer toUserId;

    @NotNull(message = "医师id不能为空")
    private Integer doctorId;

}
