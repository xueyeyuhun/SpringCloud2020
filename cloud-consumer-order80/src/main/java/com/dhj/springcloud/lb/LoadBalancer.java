package com.dhj.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @Author:Hongjie Ding
 * @Description:
 * @Date:Created in 2020/4/4 2:04
 * @Modified By:
 */
public interface LoadBalancer {
    //获取服务总数
    ServiceInstance instances(List<ServiceInstance> serviceInstances);

}
