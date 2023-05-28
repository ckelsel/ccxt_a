package com.a.exchange.vo;

import lombok.Builder;
import lombok.Data;

/**
 * @author panda-team@jiasibode.com
 */
@Builder
@Data
public class KLineVO {
    //
    //     {
    //         "volume": 0,
    //         "closePrice": 101000.0,
    //         "lowPrice": 101000.0,
    //         "highPrice": 101000.0,
    //         "openPrice": 101000.0,
    //         "createTime": "2019-11-08 14:49:00"
    //     }
    //

    private Long volume;

    private Double closePrice;

    private Double lowPrice;

    private Double highPrice;

    private Double openPrice;

    private String createTime;
}
