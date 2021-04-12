package com.zcg.myRule;

import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author : zcg
 * @Data ：Create in 21:132021/4/12
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule() {
        return  new RandomRule();
    }

}
