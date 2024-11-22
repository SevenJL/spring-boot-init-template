package com.sevenjl.springbootinit.model.dto.postfavour;

import com.sevenjl.springbootinit.common.PageRequest;
import com.sevenjl.springbootinit.model.dto.post.PostQueryRequest;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 帖子收藏查询请求
 * @author # @author <a href="https://github.com/SevenJL">SevenJL</a>
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PostFavourQueryRequest extends PageRequest implements Serializable {

    /**
     * 帖子查询请求
     */
    private PostQueryRequest postQueryRequest;

    /**
     * 用户 id
     */
    private Long userId;

    private static final long serialVersionUID = 1L;
}