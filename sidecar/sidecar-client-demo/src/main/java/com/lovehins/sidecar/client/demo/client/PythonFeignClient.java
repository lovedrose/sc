package com.lovehins.sidecar.client.demo.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import com.lovehins.sidecar.client.demo.entity.Message;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author yangyongjie
 * @create 2017-10-22 20:30
 */
@FeignClient(name = "sidecar-server")
public interface PythonFeignClient {
    //parse param like /message?id=12
    @RequestMapping("/message/{id}")
    List<Message> getMsg(@RequestParam("id") Long id);
    //parse url like /test
    @RequestMapping("/test")
    String getTest();
}