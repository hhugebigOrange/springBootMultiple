package com.wt.controller;

import cn.hutool.json.JSONUtil;
import com.wt.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/KafkaController")
@Api("KafkaController")
public class KafkaController {

    @Resource
    private KafkaTemplate<String,Object> kafkaTemplate;

    @PostMapping("/sendMessage")
    @ApiOperation(value = "给kafka发送消息", notes = "测试用kafka")
    public void sendMessage(){
        User user = new User();
        user.setUserName("伍涛");
        kafkaTemplate.send("test", JSONUtil.toJsonStr(user));
        kafkaTemplate.send("test","这次的数字是"+Math.random());
    }

    @KafkaListener(topics = "test")
    public void onMessage(ConsumerRecord<?,?> consumerRecord){
        Object value = consumerRecord.value();
        System.out.println("简单消费"+value);
    }

}
