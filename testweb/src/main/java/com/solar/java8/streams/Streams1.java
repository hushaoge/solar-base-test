package com.solar.java8.streams;

import com.google.common.collect.Lists;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by hushaoge on 2017/9/21.
 */
public class Streams1 {
    public static void main(String[] args) {
        /**流的获取*/
        /**集合*/
        List<String> list = Lists.newArrayList();
        Stream<String> s1 = list.stream();

        /**数组*/
        String[] strs ={"","2131"};
        Stream<String> s2 = Arrays.stream(strs);

        /**直接将值变成流*/
        Stream<String> s3 = Stream.of("","342","r43");

        /**从文件中获取*/
        try (Stream<String> s4 = Files.lines(Paths.get("F://caseinfo.ser"), Charset.defaultCharset())){
            /**PS：Java7简化了IO操作，把打开IO操作放在try后的括号中即可省略关闭IO的代码。*/
            System.out.println(s4);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
