package com.cms.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.junit.Test;

public class RandomIdFactory {
    private static final long WorkLogLength = 7;
    private static final long InternshipPlanLength = 7;
    private static final long GenerallyLength = 7;

    /**
     * @return
     */
    public static String nowDate() {
        SimpleDateFormat time = new SimpleDateFormat("yyyyMMdd");
        Date date = new Date();
        String nowtime = time.format(date);
        return nowtime;
    }


    /**
     * @author: 陈磊
     * @methodsName: getAccountId
     * @description:获取通用的id(无特别的要求可以使用)
     * @param: 无
     * @return:
     * @Time: 2020年6月29日 00:22:27
     * @throws:
     */
    public static String getRandomId() {
        long min = 1, max = 9;
        for (int i = 1; i < GenerallyLength; i++) {
            min *= 10;
            max *= 10;
        }
        long rangeLong = (((long) (new Random().nextDouble() * (max - min)))) + min;
        int temp = 0 + (int) (Math.random() * (9 + 1 - 0));
        return nowDate() + String.valueOf(rangeLong);
    }
}
