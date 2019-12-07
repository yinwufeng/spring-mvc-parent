package com.spring.mvc.controller;

import com.spring.mvc.entity.CityEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class ParamTypeController {
    /**
     * http://localhost:6003/getSum?a=1&b=2
     * 传参名称和方法参数保持一致
     */
    @RequestMapping("/getSum")
    public Integer getSum (int a,int b){
        return a+b ;
    }

    /**
     * http://localhost:6003/getInfo?name=cica&say=hello
     * 传参名和 @RequestParam 指定的参数名要对应
     */
    @RequestMapping("/getInfo")
    public String getInfo (@RequestParam("name") String var1,
                           @RequestParam("say") String var2){
        return var1+":"+var2 ;
    }

    /**
     * http://localhost:6003/getArray?ids=2&ids=3
     * 传递并解析数组类型的参数格式
     */
    @GetMapping("/getArray")
    public String getArray (String[] ids){
        return ids[0]+"-"+ids[1] ;
    }

    /**
     * http://localhost:6003/getMap?name=cicada&desc=smile
     * 这里以Post方式将相关参数传递paramMap中
     */
    @RequestMapping("/getMap")
    public String getMap (@RequestParam Map<String,String> paramMap){
        return paramMap.get("name") ;
    }

    /**
     * http://localhost:6003/getCityEntity?province=浙江&name=杭州
     * 这里以Post方式将相关参数传递CityEntity实体对象中
     */
    @PostMapping("/getCityEntity")
    public CityEntity getCityEntity (CityEntity cityEntity){
        return cityEntity ;
    }

    /**
     * http://localhost:6003/getId/1
     * RestFul 风格参数映射
     */
    @GetMapping("/getId/{id}")
    public String getId (@PathVariable("id") Integer id){
        return "id="+id ;
    }
}
