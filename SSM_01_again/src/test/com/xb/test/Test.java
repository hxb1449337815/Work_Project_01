package com.xb.test;

import com.ssm.util.AirLineInfo;
import com.ssm.util.getDomesticAirlinesTimeString;


import java.util.List;

public class Test {

    @org.junit.Test
    public void test() throws Exception {

        List<AirLineInfo> d = getDomesticAirlinesTimeString.getDomesticAirlinesTime("北京", "长沙", "2019-10-11");
        for (AirLineInfo airLineInfo : d) {
            System.out.println(airLineInfo);
        }

    }

}
