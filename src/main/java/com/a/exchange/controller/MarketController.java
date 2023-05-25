package com.a.exchange.controller;

import com.a.exchange.vo.KLineVO;
import com.a.exchange.vo.SymbolVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author panda-team@jiasibode.com
 */
@RestController("/api")
public class MarketController {

    @GetMapping("/symbols")
    public List<SymbolVO> getSymbols() {
        return null;
    }

    @GetMapping("/kline")
    public List<KLineVO> getKline() {
        return null;
    }
}
