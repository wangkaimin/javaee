package com.example.demo.core.request;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * StudentHomeworkPageRequest
 *
 * @author wangkm
 * @date 2020-05-07
 * @since 0.0.1
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class StudentHomeworkPageRequest extends PageRequest {

    private Long homeworkId;

}
