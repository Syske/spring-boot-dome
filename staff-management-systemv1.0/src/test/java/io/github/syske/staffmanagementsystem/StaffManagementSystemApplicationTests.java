package io.github.syske.staffmanagementsystem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.sql.DataSource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StaffManagementSystemApplicationTests {
    @Resource
    private DataSource dataSource;

    @Resource
    private StringRedisTemplate stringRedisTemplate;
    @Test
    public void contextLoads() {
        System.out.println(dataSource);
    }

    @Test
    public void testRedisAdd() {
        stringRedisTemplate.opsForValue().set("redis_t_1","测试");
        String redis = stringRedisTemplate.opsForValue().get("redis_t_1");
        System.out.println(redis);
    }

    public static void main(String[] args) {
        A obj = new D();

        System.out.println("B:"+ (obj instanceof B));//true

        System.out.println("C:"+ (obj instanceof C));//false

        System.out.println("D:"+ (obj instanceof D));//true

        System.out.println("A:"+ (obj instanceof A));//true
    }

}
class A{}

class B extends A{}

class C extends A{}

class D extends B{}



