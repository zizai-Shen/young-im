package cn.young.im.common.design.template;

import cn.young.im.common.dto.response.ApiResult;

/**
 * 作者：沈自在 <a href="https://www.szz.tax">Blog</a>
 *
 * @description
 * @date 2023/11/10
 */
public interface Operate<T, P> {

    /**
     * 操作子
     */
    ApiResult operate(P param);
}
