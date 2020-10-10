package cn.netdiscovery.example;

import cn.netdiscovery.core.Spider;
import cn.netdiscovery.queue.redis.RedisPriorityQueue;

/**
 * Created by tony on 2018/6/19.
 */
public class TestRedisPriorityQueue {

    public static void main(String[] args) {

        Request request1 = new Request("http://www.163.com").priority(5);

        Request request2 = new Request("https://www.jianshu.com/u/4f2c483c12d8").priority(10);

        Spider.create(new RedisPriorityQueue("127.0.0.1")).name("tony")
                .request(request1,request2)
                .run();
    }
}
