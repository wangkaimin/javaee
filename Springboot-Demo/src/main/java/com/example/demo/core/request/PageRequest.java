package com.example.demo.core.request;

import lombok.Data;

/**
 * PageRequest
 *
 * @author wangkm
 * @date 2020-05-07
 * @since 0.0.1
 */
@Data
public class PageRequest {
    private int page = 0;
    private int size = 10;
}
