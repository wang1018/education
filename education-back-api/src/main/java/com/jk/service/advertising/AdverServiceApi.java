package com.jk.service.advertising;

import com.jk.model.ResultPage;
import com.jk.model.TypeBean;
import com.jk.model.advertising.Advertising;
import com.jk.model.user.UserBean;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

public interface AdverServiceApi {

    //查询
   @RequestMapping(value = "user/queryadverPage",method = RequestMethod.POST)
   Map<String, Object> queryadverPage(@RequestParam(value = "page") int page,@RequestParam(value = "limit") int limit);

   //新增
    @RequestMapping(value= "user/saveadver",method = RequestMethod.POST)
    void saveAdver(@RequestBody Advertising adver);

    //查询类型
    @RequestMapping(value = "user/queryType",method = RequestMethod.POST)
    List<TypeBean> queryType(@RequestBody TypeBean typeBean);

    //回显
    @RequestMapping(value = "user/queryadverbyid",method = RequestMethod.POST)
    Advertising queryadverbyid(@RequestParam(value = "imgid") Integer imgid);

    //修改
    @RequestMapping(value = "user/updateadver",method =RequestMethod.POST)
    void updateadver(@RequestBody Advertising advertising);

    //删除
    @RequestMapping(value = "user/deladvertising",method = RequestMethod.POST)
    void deladvertising(@RequestParam(value = "imgid")Integer imgid);





}
