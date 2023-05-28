package com.a.exchange.vo;

import lombok.Builder;
import lombok.Data;

/**
 * @author panda-team@jiasibode.com
 */
@Data
@Builder
public class SymbolVO {
    //             "symbol":"BTC/USDT",
    //             "base":"btc",
    //             "quote":"usdt",
    //             "basePrecision":"8",
    //             "quotePrecision":"5",
    //             "minLimitBaseAmount":"0.1",
    //             "maxLimitBaseAmount":"480286"
    /**
     * 000001.XZSE/USDT
     */
    private String symbol;


    /**
     * 000001.XZSE
     */
    private String base;

    /**
     * USDT
     */
    private String quote;

    /**
     * 2
     */
    private String basePrecision;

    /**
     * 0
     */
    private String quotePrecision;

    private Integer quoteCurrencyId;

    private Integer baseCurrencyId;

    /**
     * 100
     */
    private Integer minLimitBaseAmount;

    private Integer maxLimitBaseAmount;
}
