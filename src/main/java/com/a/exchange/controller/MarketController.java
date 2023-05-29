package com.a.exchange.controller;

import com.a.exchange.config.IndexConfig;
import com.a.exchange.vo.KLineVO;
import com.a.exchange.vo.SymbolVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author panda-team@jiasibode.com
 */
@RestController()
@RequestMapping("/oapi/v2")
public class MarketController {


    @Autowired
    private IndexConfig indexConfig;

    @GetMapping("/list/marketPair")
    public List<SymbolVO> getSymbols() {
        List<SymbolVO> symbolVOS = new ArrayList<>();

        for (String stock : indexConfig.getM2016()) {
            // 分割 /
            String base = stock.split("/")[0];

            // 分割.
            int code = Integer.parseInt(base.split("\\.")[0]);

            symbolVOS.add(SymbolVO.builder()
                    .base(base)
                    .basePrecision("2")
                    .maxLimitBaseAmount(10000000)
                    .minLimitBaseAmount(100)
                    .baseCurrencyId(code)
                    .quoteCurrencyId(999999)
                    .quote("USDT")
                    .quotePrecision("0")
                    .symbol(stock)
                    .build());
        }


        return symbolVOS;
    }

//     http://api.a.io/oapi/v2/kline/getKline?duration=1&quoteCurrencyId=999999&baseCurrencyId=300223&limit=10&startTime=1685106612338
    @GetMapping("/kline/getKline")
    public List<KLineVO> getKline(Integer duration, Integer quoteCurrencyId, Integer baseCurrencyId, Integer limit, Long startTime) {
        List<KLineVO> kLineVOS = new ArrayList<>();
        kLineVOS.add(KLineVO.builder()
                .closePrice(100.0)
                .highPrice(110.0)
                .lowPrice(100.0)
                .openPrice(100.0)
                .volume(100L)
                .createTime("2019-11-08 14:49:00")
                .build());

        kLineVOS.add(KLineVO.builder()
                .closePrice(100.0)
                .highPrice(120.0)
                .lowPrice(90.0)
                .openPrice(100.0)
                .volume(100L)
                .createTime("2019-11-09 14:49:00")
                .build());
        return kLineVOS;
    }
}
