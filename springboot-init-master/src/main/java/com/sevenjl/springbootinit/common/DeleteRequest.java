package com.sevenjl.springbootinit.common;

import java.io.Serializable;
import lombok.Data;

/**
 * 删除请求
 * @author # @author <a href="https://github.com/SevenJL">SevenJL</a>
 */
@Data
public class DeleteRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    private static final long serialVersionUID = 1L;
}