package com.libstar.kb.spider.sp.datadryad.content;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;

/**
 * @author itguang
 * @create 2018-07-09 19:11
 **/
@Component
@Slf4j
public class DryadContentprocessor implements PageProcessor {
    @Override
    public void process(Page page) {

    }

    @Override
    public Site getSite() {
        return null;
    }
}
