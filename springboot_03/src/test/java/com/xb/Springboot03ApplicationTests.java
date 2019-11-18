package com.xb;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import redis.clients.jedis.Jedis;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot03ApplicationTests {

    @Test
    public void contextLoads() {

        Jedis jedis=new Jedis("192.168.154.130",6379);
        //String
        //jedis.set("name","admin");

        System.out.println(jedis.get("name"));

        //list
        /*jedis.lpush("name","admin","sa");
        for (String name : jedis.lrange("name", 0, -1)) {
            System.out.println(name);
        }*/

        //set
        /*jedis.sadd("name","admin","sa");
        for (String name : jedis.smembers("name")) {
            System.out.println(name);
        }*/

        //hash
        /*jedis.hset("stu","age","10");
        jedis.hset("stu","name","张三");
        jedis.hset("stu","sex","男");
        Map<String, String> stu = jedis.hgetAll("stu");
        for (String field : stu.keySet() ){
            System.out.println(stu.get(field)+"\t"+field);
        }*/


    }

}
