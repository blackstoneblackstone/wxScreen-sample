package com.gcks.smartcity.controller;

import com.gcks.smartcity.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/")
public class WxScreenController {



    // 查询股票 info字段采用Base64编码
    @RequestMapping(value = "wall/api/user/sync", produces = "text/json;charset=UTF-8",method = RequestMethod.POST)
    public ModelAndView user(@RequestParam(value="state") String state,@RequestParam(value="last_id") String last_id,@RequestParam(value="last_whitelist_id") String last_whitelist_id) {
        ModelAndView modelAndView=new ModelAndView("sync");
        if("message".equals(state)){
        if("144192289919006300".equals(last_id)){
            modelAndView=new ModelAndView("sync2");
        }}

        if("app".equals(state)){
            if("144192289919006300".equals(last_id)){
                modelAndView=new ModelAndView("sync2");
            }}


        if("lottery".equals(state)){
            modelAndView=new ModelAndView("lottery");

        }

        System.out.println(state);
        return modelAndView;
    }
    @RequestMapping(value = "wall/api/listening/add_listening", produces = "text/json;charset=UTF-8",method = RequestMethod.POST)
    public ModelAndView add_listening(@RequestParam(value="companyid") String companyid,@RequestParam(value="res_name") String res_name,@RequestParam(value="imgsrc") String imgsrc  ) {
        ModelAndView modelAndView=new ModelAndView("listening");
        return modelAndView;
    }
    // 查询股票 info字段采用Base64编码
    @RequestMapping(value = "index.htm/prize/ajax/data", produces = "text/json;charset=UTF-8",method = RequestMethod.POST)
    public ModelAndView data(@RequestParam(value="company_id") String company_id) {
        ModelAndView modelAndView=new ModelAndView("data");
        User u= new User();
        User u1= new User();
        User u2= new User();
        List<User> l=new ArrayList<User>();
        l.add(u);
        l.add(u1);
        l.add(u2);
        modelAndView.addObject("info","ok");
        modelAndView.addObject("list",l);
        return modelAndView;
    }


    // 查询股票 info字段采用Base64编码
    @RequestMapping(value = "wall/api/message/checkin_sync", produces = "text/json;charset=UTF-8",method = RequestMethod.GET)
    public ModelAndView checkin_sync(@RequestParam(value="last_id") String last_id,@RequestParam(value="state") String state) {
        ModelAndView modelAndView=new ModelAndView("checkin");
        if(!"0".equals(last_id)){
            modelAndView=new ModelAndView("checkinEmpty");
        }
        return modelAndView;
    }
    // 查询股票 info字段采用Base64编码
    @RequestMapping(value = "wall/api/message/sync", produces = "text/json;charset=UTF-8",method = RequestMethod.POST)
    public ModelAndView message(@RequestParam(value="last_id") String last_id,@RequestParam(value="tag_id") String tag_id,@RequestParam(value="state") String state) {
        ModelAndView modelAndView=new ModelAndView("message");
        if("144192289918982554".equals(last_id)){
            modelAndView=new ModelAndView("messageEmpty");

        }
        if("app".equals(state)){
            modelAndView=new ModelAndView("message");
        }
        return modelAndView;
    }

    @RequestMapping(value = "wall/api/message/sync", produces = "text/json;charset=UTF-8",method = RequestMethod.GET)
    public ModelAndView message(@RequestParam(value="last_id",required=false) String last_id ) {
        ModelAndView modelAndView=new ModelAndView("message");
        if("144192289918982554".equals(last_id)){
            modelAndView=new ModelAndView("messageEmpty");

        }
        return modelAndView;
    }
    @RequestMapping(value = "wall/api/user/notice/get_latest_notice", produces = "text/json;charset=UTF-8",method = RequestMethod.POST)
    public ModelAndView message() {
        ModelAndView modelAndView=new ModelAndView("notice");

        return modelAndView;
    }

//    // 查询股票 info字段采用Base64编码
//    @RequestMapping(value = "index.htm/prize/ajax/data", produces = "text/json;charset=UTF-8",method = RequestMethod.POST)
//    public ModelAndView data(@RequestParam(value="last_id") String last_id,@RequestParam(value="last_whitelist_id") String last_whitelist_id) {
//        ModelAndView modelAndView=new ModelAndView("data");
//        User u= new User();
//        User u1= new User();
//        User u2= new User();
//        List<User> l=new ArrayList<User>();
//        l.add(u);
//        l.add(u1);
//        l.add(u2);
//        modelAndView.addObject("info","ok");
//        modelAndView.addObject("list",l);
//        return modelAndView;
//    }



//    // 查询股票 info字段采用Base64编码
//    @RequestMapping(value = "/user", produces = "text/json;charset=UTF-8",method = RequestMethod.POST)
//    @ResponseBody
//    public String user2(@RequestParam(value="last_id") String last_id,@RequestParam(value="last_whitelist_id") String last_whitelist_id) {
//
//        String sb="{\n" +
//                "\t\"info\": \"ok\",\n" +
//                "\t\"user_list\": [{\n" +
//                "\t\t\"id\": \"336\",\n" +
//                "\t\t\"fakeid\": \"15626735\",\n" +
//                "\t\t\"avatar\": \"http:\\/\\/s8.wxscreen.com\\/static\\/upload\\/slave2_store2\\/2014\\/03\\/06\\/20140306032950000000_1_39518_8366.png\",\n" +
//                "\t\t\"name\": \"\\u9773\\u6615\",\n" +
//                "\t\t\"mobile\": \"\",\n" +
//                "\t\t\"is_on_wall\": \"1\",\n" +
//                "\t\t\"staff_no\": \"\",\n" +
//                "\t\t\"gender\": \"1\",\n" +
//                "\t\t\"country\": \"\\u4e2d\\u56fd\",\n" +
//                "\t\t\"province\": \"\\u5317\\u4eac\",\n" +
//                "\t\t\"city\": \"\\u6d77\\u6dc0\",\n" +
//                "\t\t\"district\": \"\",\n" +
//                "\t\t\"update_time_ms\": \"138848208472193303\",\n" +
//                "\t\t\"add_time\": \"2013-12-31 17:28:04\",\n" +
//                "\t\t\"on_wall_time\": \"2013-12-31 17:28:04\"\n" +
//                "\t}, {\n" +
//                "\t\t\"id\": \"67925\",\n" +
//                "\t\t\"fakeid\": \"985576940\",\n" +
//                "\t\t\"avatar\": \"http:\\/\\/s8.wxscreen.com\\/static\\/upload\\/slave2_store2\\/2014\\/01\\/25\\/20140125224124000000_1_34953_4726.png\",\n" +
//                "\t\t\"name\": \"\\u6469\\u767b\\u539f\\u59cb\\u4eba\",\n" +
//                "\t\t\"mobile\": \"\",\n" +
//                "\t\t\"is_on_wall\": \"1\",\n" +
//                "\t\t\"staff_no\": \"\",\n" +
//                "\t\t\"gender\": \"1\",\n" +
//                "\t\t\"country\": \"\\u4e2d\\u56fd\",\n" +
//                "\t\t\"province\": \"\\u4e0a\\u6d77\",\n" +
//                "\t\t\"city\": \"\\u8679\\u53e3\",\n" +
//                "\t\t\"district\": \"\",\n" +
//                "\t\t\"update_time_ms\": \"138863237153771103\",\n" +
//                "\t\t\"add_time\": \"2014-01-02 11:12:51\",\n" +
//                "\t\t\"on_wall_time\": \"2014-01-02 11:12:51\"\n" +
//                "\t}, {\n" +
//                "\t\t\"id\": \"14823\",\n" +
//                "\t\t\"fakeid\": \"353083600\",\n" +
//                "\t\t\"avatar\": \"http:\\/\\/s8.wxscreen.com\\/static\\/upload\\/slave2_store2\\/2015\\/04\\/12\\/20150412142312000000_1_34688_7635.png\",\n" +
//                "\t\t\"name\": \"\\u8d30\\u9ec4\\u4e0d\\u8d30\",\n" +
//                "\t\t\"mobile\": \"\",\n" +
//                "\t\t\"is_on_wall\": \"1\",\n" +
//                "\t\t\"staff_no\": \"\",\n" +
//                "\t\t\"gender\": \"1\",\n" +
//                "\t\t\"country\": \"\\u4e2d\\u56fd\",\n" +
//                "\t\t\"province\": \"\\u6c5f\\u82cf\",\n" +
//                "\t\t\"city\": \"\\u5357\\u4eac\",\n" +
//                "\t\t\"district\": \"\",\n" +
//                "\t\t\"update_time_ms\": \"138866424228335403\",\n" +
//                "\t\t\"add_time\": \"2014-01-02 20:04:02\",\n" +
//                "\t\t\"on_wall_time\": \"2014-01-02 20:04:02\"\n" +
//                "\t}, {\n" +
//                "\t\t\"id\": \"68161\",\n" +
//                "\t\t\"fakeid\": \"2811201984\",\n" +
//                "\t\t\"avatar\": \"http:\\/\\/s8.wxscreen.com\\/static\\/upload\\/slave2_store2\\/2014\\/01\\/02\\/20140102220603000000_1_27261_9605.png\",\n" +
//                "\t\t\"name\": \"HILOLT\",\n" +
//                "\t\t\"mobile\": \"\",\n" +
//                "\t\t\"is_on_wall\": \"1\",\n" +
//                "\t\t\"staff_no\": \"\",\n" +
//                "\t\t\"gender\": \"1\",\n" +
//                "\t\t\"country\": \"\\u963f\\u62c9\\u4f2f\\u8054\\u5408\\u914b\\u957f\\u56fd\",\n" +
//                "\t\t\"province\": \"\\u8fea\\u62dc\",\n" +
//                "\t\t\"city\": \"\",\n" +
//                "\t\t\"district\": \"\",\n" +
//                "\t\t\"update_time_ms\": \"138867156391142203\",\n" +
//                "\t\t\"add_time\": \"2014-01-02 22:06:03\",\n" +
//                "\t\t\"on_wall_time\": \"2014-01-02 22:06:03\"\n" +
//                "\t}, {\n" +
//                "\t\t\"id\": \"68177\",\n" +
//                "\t\t\"fakeid\": \"1381128581\",\n" +
//                "\t\t\"avatar\": \"http:\\/\\/s8.wxscreen.com\\/static\\/upload\\/slave2_store2\\/2014\\/01\\/03\\/20140103092620000000_1_40690_8299.png\",\n" +
//                "\t\t\"name\": \"\\u694a\",\n" +
//                "\t\t\"mobile\": \"\",\n" +
//                "\t\t\"is_on_wall\": \"1\",\n" +
//                "\t\t\"staff_no\": \"\",\n" +
//                "\t\t\"gender\": \"1\",\n" +
//                "\t\t\"country\": \"\\u4e2d\\u56fd\",\n" +
//                "\t\t\"province\": \"\\u91cd\\u5e86\",\n" +
//                "\t\t\"city\": \"\\u6e1d\\u4e2d\",\n" +
//                "\t\t\"district\": \"\",\n" +
//                "\t\t\"update_time_ms\": \"138871238055322603\",\n" +
//                "\t\t\"add_time\": \"2014-01-03 09:26:20\",\n" +
//                "\t\t\"on_wall_time\": \"2014-01-03 09:26:20\"\n" +
//                "\t}]\n" +
//                "}{\n" +
//                "\t\"info\": \"ok\",\n" +
//                "\t\"user_list\": [{\n" +
//                "\t\t\"id\": \"336\",\n" +
//                "\t\t\"fakeid\": \"15626735\",\n" +
//                "\t\t\"avatar\": \"http:\\/\\/s8.wxscreen.com\\/static\\/upload\\/slave2_store2\\/2014\\/03\\/06\\/20140306032950000000_1_39518_8366.png\",\n" +
//                "\t\t\"name\": \"\\u9773\\u6615\",\n" +
//                "\t\t\"mobile\": \"\",\n" +
//                "\t\t\"is_on_wall\": \"1\",\n" +
//                "\t\t\"staff_no\": \"\",\n" +
//                "\t\t\"gender\": \"1\",\n" +
//                "\t\t\"country\": \"\\u4e2d\\u56fd\",\n" +
//                "\t\t\"province\": \"\\u5317\\u4eac\",\n" +
//                "\t\t\"city\": \"\\u6d77\\u6dc0\",\n" +
//                "\t\t\"district\": \"\",\n" +
//                "\t\t\"update_time_ms\": \"138848208472193303\",\n" +
//                "\t\t\"add_time\": \"2013-12-31 17:28:04\",\n" +
//                "\t\t\"on_wall_time\": \"2013-12-31 17:28:04\"\n" +
//                "\t}, {\n" +
//                "\t\t\"id\": \"67925\",\n" +
//                "\t\t\"fakeid\": \"985576940\",\n" +
//                "\t\t\"avatar\": \"http:\\/\\/s8.wxscreen.com\\/static\\/upload\\/slave2_store2\\/2014\\/01\\/25\\/20140125224124000000_1_34953_4726.png\",\n" +
//                "\t\t\"name\": \"\\u6469\\u767b\\u539f\\u59cb\\u4eba\",\n" +
//                "\t\t\"mobile\": \"\",\n" +
//                "\t\t\"is_on_wall\": \"1\",\n" +
//                "\t\t\"staff_no\": \"\",\n" +
//                "\t\t\"gender\": \"1\",\n" +
//                "\t\t\"country\": \"\\u4e2d\\u56fd\",\n" +
//                "\t\t\"province\": \"\\u4e0a\\u6d77\",\n" +
//                "\t\t\"city\": \"\\u8679\\u53e3\",\n" +
//                "\t\t\"district\": \"\",\n" +
//                "\t\t\"update_time_ms\": \"138863237153771103\",\n" +
//                "\t\t\"add_time\": \"2014-01-02 11:12:51\",\n" +
//                "\t\t\"on_wall_time\": \"2014-01-02 11:12:51\"\n" +
//                "\t}, {\n" +
//                "\t\t\"id\": \"14823\",\n" +
//                "\t\t\"fakeid\": \"353083600\",\n" +
//                "\t\t\"avatar\": \"http:\\/\\/s8.wxscreen.com\\/static\\/upload\\/slave2_store2\\/2015\\/04\\/12\\/20150412142312000000_1_34688_7635.png\",\n" +
//                "\t\t\"name\": \"\\u8d30\\u9ec4\\u4e0d\\u8d30\",\n" +
//                "\t\t\"mobile\": \"\",\n" +
//                "\t\t\"is_on_wall\": \"1\",\n" +
//                "\t\t\"staff_no\": \"\",\n" +
//                "\t\t\"gender\": \"1\",\n" +
//                "\t\t\"country\": \"\\u4e2d\\u56fd\",\n" +
//                "\t\t\"province\": \"\\u6c5f\\u82cf\",\n" +
//                "\t\t\"city\": \"\\u5357\\u4eac\",\n" +
//                "\t\t\"district\": \"\",\n" +
//                "\t\t\"update_time_ms\": \"138866424228335403\",\n" +
//                "\t\t\"add_time\": \"2014-01-02 20:04:02\",\n" +
//                "\t\t\"on_wall_time\": \"2014-01-02 20:04:02\"\n" +
//                "\t}, {\n" +
//                "\t\t\"id\": \"68161\",\n" +
//                "\t\t\"fakeid\": \"2811201984\",\n" +
//                "\t\t\"avatar\": \"http:\\/\\/s8.wxscreen.com\\/static\\/upload\\/slave2_store2\\/2014\\/01\\/02\\/20140102220603000000_1_27261_9605.png\",\n" +
//                "\t\t\"name\": \"HILOLT\",\n" +
//                "\t\t\"mobile\": \"\",\n" +
//                "\t\t\"is_on_wall\": \"1\",\n" +
//                "\t\t\"staff_no\": \"\",\n" +
//                "\t\t\"gender\": \"1\",\n" +
//                "\t\t\"country\": \"\\u963f\\u62c9\\u4f2f\\u8054\\u5408\\u914b\\u957f\\u56fd\",\n" +
//                "\t\t\"province\": \"\\u8fea\\u62dc\",\n" +
//                "\t\t\"city\": \"\",\n" +
//                "\t\t\"district\": \"\",\n" +
//                "\t\t\"update_time_ms\": \"138867156391142203\",\n" +
//                "\t\t\"add_time\": \"2014-01-02 22:06:03\",\n" +
//                "\t\t\"on_wall_time\": \"2014-01-02 22:06:03\"\n" +
//                "\t}, {\n" +
//                "\t\t\"id\": \"68177\",\n" +
//                "\t\t\"fakeid\": \"1381128581\",\n" +
//                "\t\t\"avatar\": \"http:\\/\\/s8.wxscreen.com\\/static\\/upload\\/slave2_store2\\/2014\\/01\\/03\\/20140103092620000000_1_40690_8299.png\",\n" +
//                "\t\t\"name\": \"\\u694a\",\n" +
//                "\t\t\"mobile\": \"\",\n" +
//                "\t\t\"is_on_wall\": \"1\",\n" +
//                "\t\t\"staff_no\": \"\",\n" +
//                "\t\t\"gender\": \"1\",\n" +
//                "\t\t\"country\": \"\\u4e2d\\u56fd\",\n" +
//                "\t\t\"province\": \"\\u91cd\\u5e86\",\n" +
//                "\t\t\"city\": \"\\u6e1d\\u4e2d\",\n" +
//                "\t\t\"district\": \"\",\n" +
//                "\t\t\"update_time_ms\": \"138871238055322603\",\n" +
//                "\t\t\"add_time\": \"2014-01-03 09:26:20\",\n" +
//                "\t\t\"on_wall_time\": \"2014-01-03 09:26:20\"\n" +
//                "\t}]\n" +
//                "}{\n" +
//                "\t\"info\": \"ok\",\n" +
//                "\t\"user_list\": [{\n" +
//                "\t\t\"id\": \"336\",\n" +
//                "\t\t\"fakeid\": \"15626735\",\n" +
//                "\t\t\"avatar\": \"http:\\/\\/s8.wxscreen.com\\/static\\/upload\\/slave2_store2\\/2014\\/03\\/06\\/20140306032950000000_1_39518_8366.png\",\n" +
//                "\t\t\"name\": \"\\u9773\\u6615\",\n" +
//                "\t\t\"mobile\": \"\",\n" +
//                "\t\t\"is_on_wall\": \"1\",\n" +
//                "\t\t\"staff_no\": \"\",\n" +
//                "\t\t\"gender\": \"1\",\n" +
//                "\t\t\"country\": \"\\u4e2d\\u56fd\",\n" +
//                "\t\t\"province\": \"\\u5317\\u4eac\",\n" +
//                "\t\t\"city\": \"\\u6d77\\u6dc0\",\n" +
//                "\t\t\"district\": \"\",\n" +
//                "\t\t\"update_time_ms\": \"138848208472193303\",\n" +
//                "\t\t\"add_time\": \"2013-12-31 17:28:04\",\n" +
//                "\t\t\"on_wall_time\": \"2013-12-31 17:28:04\"\n" +
//                "\t}, {\n" +
//                "\t\t\"id\": \"67925\",\n" +
//                "\t\t\"fakeid\": \"985576940\",\n" +
//                "\t\t\"avatar\": \"http:\\/\\/s8.wxscreen.com\\/static\\/upload\\/slave2_store2\\/2014\\/01\\/25\\/20140125224124000000_1_34953_4726.png\",\n" +
//                "\t\t\"name\": \"\\u6469\\u767b\\u539f\\u59cb\\u4eba\",\n" +
//                "\t\t\"mobile\": \"\",\n" +
//                "\t\t\"is_on_wall\": \"1\",\n" +
//                "\t\t\"staff_no\": \"\",\n" +
//                "\t\t\"gender\": \"1\",\n" +
//                "\t\t\"country\": \"\\u4e2d\\u56fd\",\n" +
//                "\t\t\"province\": \"\\u4e0a\\u6d77\",\n" +
//                "\t\t\"city\": \"\\u8679\\u53e3\",\n" +
//                "\t\t\"district\": \"\",\n" +
//                "\t\t\"update_time_ms\": \"138863237153771103\",\n" +
//                "\t\t\"add_time\": \"2014-01-02 11:12:51\",\n" +
//                "\t\t\"on_wall_time\": \"2014-01-02 11:12:51\"\n" +
//                "\t}, {\n" +
//                "\t\t\"id\": \"14823\",\n" +
//                "\t\t\"fakeid\": \"353083600\",\n" +
//                "\t\t\"avatar\": \"http:\\/\\/s8.wxscreen.com\\/static\\/upload\\/slave2_store2\\/2015\\/04\\/12\\/20150412142312000000_1_34688_7635.png\",\n" +
//                "\t\t\"name\": \"\\u8d30\\u9ec4\\u4e0d\\u8d30\",\n" +
//                "\t\t\"mobile\": \"\",\n" +
//                "\t\t\"is_on_wall\": \"1\",\n" +
//                "\t\t\"staff_no\": \"\",\n" +
//                "\t\t\"gender\": \"1\",\n" +
//                "\t\t\"country\": \"\\u4e2d\\u56fd\",\n" +
//                "\t\t\"province\": \"\\u6c5f\\u82cf\",\n" +
//                "\t\t\"city\": \"\\u5357\\u4eac\",\n" +
//                "\t\t\"district\": \"\",\n" +
//                "\t\t\"update_time_ms\": \"138866424228335403\",\n" +
//                "\t\t\"add_time\": \"2014-01-02 20:04:02\",\n" +
//                "\t\t\"on_wall_time\": \"2014-01-02 20:04:02\"\n" +
//                "\t}, {\n" +
//                "\t\t\"id\": \"68161\",\n" +
//                "\t\t\"fakeid\": \"2811201984\",\n" +
//                "\t\t\"avatar\": \"http:\\/\\/s8.wxscreen.com\\/static\\/upload\\/slave2_store2\\/2014\\/01\\/02\\/20140102220603000000_1_27261_9605.png\",\n" +
//                "\t\t\"name\": \"HILOLT\",\n" +
//                "\t\t\"mobile\": \"\",\n" +
//                "\t\t\"is_on_wall\": \"1\",\n" +
//                "\t\t\"staff_no\": \"\",\n" +
//                "\t\t\"gender\": \"1\",\n" +
//                "\t\t\"country\": \"\\u963f\\u62c9\\u4f2f\\u8054\\u5408\\u914b\\u957f\\u56fd\",\n" +
//                "\t\t\"province\": \"\\u8fea\\u62dc\",\n" +
//                "\t\t\"city\": \"\",\n" +
//                "\t\t\"district\": \"\",\n" +
//                "\t\t\"update_time_ms\": \"138867156391142203\",\n" +
//                "\t\t\"add_time\": \"2014-01-02 22:06:03\",\n" +
//                "\t\t\"on_wall_time\": \"2014-01-02 22:06:03\"\n" +
//                "\t}, {\n" +
//                "\t\t\"id\": \"68177\",\n" +
//                "\t\t\"fakeid\": \"1381128581\",\n" +
//                "\t\t\"avatar\": \"http:\\/\\/s8.wxscreen.com\\/static\\/upload\\/slave2_store2\\/2014\\/01\\/03\\/20140103092620000000_1_40690_8299.png\",\n" +
//                "\t\t\"name\": \"\\u694a\",\n" +
//                "\t\t\"mobile\": \"\",\n" +
//                "\t\t\"is_on_wall\": \"1\",\n" +
//                "\t\t\"staff_no\": \"\",\n" +
//                "\t\t\"gender\": \"1\",\n" +
//                "\t\t\"country\": \"\\u4e2d\\u56fd\",\n" +
//                "\t\t\"province\": \"\\u91cd\\u5e86\",\n" +
//                "\t\t\"city\": \"\\u6e1d\\u4e2d\",\n" +
//                "\t\t\"district\": \"\",\n" +
//                "\t\t\"update_time_ms\": \"138871238055322603\",\n" +
//                "\t\t\"add_time\": \"2014-01-03 09:26:20\",\n" +
//                "\t\t\"on_wall_time\": \"2014-01-03 09:26:20\"\n" +
//                "\t}]\n" +
//                "}{\n" +
//                "\t\"info\": \"ok\",\n" +
//                "\t\"user_list\": [{\n" +
//                "\t\t\"id\": \"336\",\n" +
//                "\t\t\"fakeid\": \"15626735\",\n" +
//                "\t\t\"avatar\": \"http:\\/\\/s8.wxscreen.com\\/static\\/upload\\/slave2_store2\\/2014\\/03\\/06\\/20140306032950000000_1_39518_8366.png\",\n" +
//                "\t\t\"name\": \"\\u9773\\u6615\",\n" +
//                "\t\t\"mobile\": \"\",\n" +
//                "\t\t\"is_on_wall\": \"1\",\n" +
//                "\t\t\"staff_no\": \"\",\n" +
//                "\t\t\"gender\": \"1\",\n" +
//                "\t\t\"country\": \"\\u4e2d\\u56fd\",\n" +
//                "\t\t\"province\": \"\\u5317\\u4eac\",\n" +
//                "\t\t\"city\": \"\\u6d77\\u6dc0\",\n" +
//                "\t\t\"district\": \"\",\n" +
//                "\t\t\"update_time_ms\": \"138848208472193303\",\n" +
//                "\t\t\"add_time\": \"2013-12-31 17:28:04\",\n" +
//                "\t\t\"on_wall_time\": \"2013-12-31 17:28:04\"\n" +
//                "\t}, {\n" +
//                "\t\t\"id\": \"67925\",\n" +
//                "\t\t\"fakeid\": \"985576940\",\n" +
//                "\t\t\"avatar\": \"http:\\/\\/s8.wxscreen.com\\/static\\/upload\\/slave2_store2\\/2014\\/01\\/25\\/20140125224124000000_1_34953_4726.png\",\n" +
//                "\t\t\"name\": \"\\u6469\\u767b\\u539f\\u59cb\\u4eba\",\n" +
//                "\t\t\"mobile\": \"\",\n" +
//                "\t\t\"is_on_wall\": \"1\",\n" +
//                "\t\t\"staff_no\": \"\",\n" +
//                "\t\t\"gender\": \"1\",\n" +
//                "\t\t\"country\": \"\\u4e2d\\u56fd\",\n" +
//                "\t\t\"province\": \"\\u4e0a\\u6d77\",\n" +
//                "\t\t\"city\": \"\\u8679\\u53e3\",\n" +
//                "\t\t\"district\": \"\",\n" +
//                "\t\t\"update_time_ms\": \"138863237153771103\",\n" +
//                "\t\t\"add_time\": \"2014-01-02 11:12:51\",\n" +
//                "\t\t\"on_wall_time\": \"2014-01-02 11:12:51\"\n" +
//                "\t}, {\n" +
//                "\t\t\"id\": \"14823\",\n" +
//                "\t\t\"fakeid\": \"353083600\",\n" +
//                "\t\t\"avatar\": \"http:\\/\\/s8.wxscreen.com\\/static\\/upload\\/slave2_store2\\/2015\\/04\\/12\\/20150412142312000000_1_34688_7635.png\",\n" +
//                "\t\t\"name\": \"\\u8d30\\u9ec4\\u4e0d\\u8d30\",\n" +
//                "\t\t\"mobile\": \"\",\n" +
//                "\t\t\"is_on_wall\": \"1\",\n" +
//                "\t\t\"staff_no\": \"\",\n" +
//                "\t\t\"gender\": \"1\",\n" +
//                "\t\t\"country\": \"\\u4e2d\\u56fd\",\n" +
//                "\t\t\"province\": \"\\u6c5f\\u82cf\",\n" +
//                "\t\t\"city\": \"\\u5357\\u4eac\",\n" +
//                "\t\t\"district\": \"\",\n" +
//                "\t\t\"update_time_ms\": \"138866424228335403\",\n" +
//                "\t\t\"add_time\": \"2014-01-02 20:04:02\",\n" +
//                "\t\t\"on_wall_time\": \"2014-01-02 20:04:02\"\n" +
//                "\t}, {\n" +
//                "\t\t\"id\": \"68161\",\n" +
//                "\t\t\"fakeid\": \"2811201984\",\n" +
//                "\t\t\"avatar\": \"http:\\/\\/s8.wxscreen.com\\/static\\/upload\\/slave2_store2\\/2014\\/01\\/02\\/20140102220603000000_1_27261_9605.png\",\n" +
//                "\t\t\"name\": \"HILOLT\",\n" +
//                "\t\t\"mobile\": \"\",\n" +
//                "\t\t\"is_on_wall\": \"1\",\n" +
//                "\t\t\"staff_no\": \"\",\n" +
//                "\t\t\"gender\": \"1\",\n" +
//                "\t\t\"country\": \"\\u963f\\u62c9\\u4f2f\\u8054\\u5408\\u914b\\u957f\\u56fd\",\n" +
//                "\t\t\"province\": \"\\u8fea\\u62dc\",\n" +
//                "\t\t\"city\": \"\",\n" +
//                "\t\t\"district\": \"\",\n" +
//                "\t\t\"update_time_ms\": \"138867156391142203\",\n" +
//                "\t\t\"add_time\": \"2014-01-02 22:06:03\",\n" +
//                "\t\t\"on_wall_time\": \"2014-01-02 22:06:03\"\n" +
//                "\t}, {\n" +
//                "\t\t\"id\": \"68177\",\n" +
//                "\t\t\"fakeid\": \"1381128581\",\n" +
//                "\t\t\"avatar\": \"http:\\/\\/s8.wxscreen.com\\/static\\/upload\\/slave2_store2\\/2014\\/01\\/03\\/20140103092620000000_1_40690_8299.png\",\n" +
//                "\t\t\"name\": \"\\u694a\",\n" +
//                "\t\t\"mobile\": \"\",\n" +
//                "\t\t\"is_on_wall\": \"1\",\n" +
//                "\t\t\"staff_no\": \"\",\n" +
//                "\t\t\"gender\": \"1\",\n" +
//                "\t\t\"country\": \"\\u4e2d\\u56fd\",\n" +
//                "\t\t\"province\": \"\\u91cd\\u5e86\",\n" +
//                "\t\t\"city\": \"\\u6e1d\\u4e2d\",\n" +
//                "\t\t\"district\": \"\",\n" +
//                "\t\t\"update_time_ms\": \"138871238055322603\",\n" +
//                "\t\t\"add_time\": \"2014-01-03 09:26:20\",\n" +
//                "\t\t\"on_wall_time\": \"2014-01-03 09:26:20\"\n" +
//                "\t}]\n" +
//                "}{\n" +
//                "\t\"info\": \"ok\",\n" +
//                "\t\"user_list\": [{\n" +
//                "\t\t\"id\": \"336\",\n" +
//                "\t\t\"fakeid\": \"15626735\",\n" +
//                "\t\t\"avatar\": \"http:\\/\\/s8.wxscreen.com\\/static\\/upload\\/slave2_store2\\/2014\\/03\\/06\\/20140306032950000000_1_39518_8366.png\",\n" +
//                "\t\t\"name\": \"\\u9773\\u6615\",\n" +
//                "\t\t\"mobile\": \"\",\n" +
//                "\t\t\"is_on_wall\": \"1\",\n" +
//                "\t\t\"staff_no\": \"\",\n" +
//                "\t\t\"gender\": \"1\",\n" +
//                "\t\t\"country\": \"\\u4e2d\\u56fd\",\n" +
//                "\t\t\"province\": \"\\u5317\\u4eac\",\n" +
//                "\t\t\"city\": \"\\u6d77\\u6dc0\",\n" +
//                "\t\t\"district\": \"\",\n" +
//                "\t\t\"update_time_ms\": \"138848208472193303\",\n" +
//                "\t\t\"add_time\": \"2013-12-31 17:28:04\",\n" +
//                "\t\t\"on_wall_time\": \"2013-12-31 17:28:04\"\n" +
//                "\t}, {\n" +
//                "\t\t\"id\": \"67925\",\n" +
//                "\t\t\"fakeid\": \"985576940\",\n" +
//                "\t\t\"avatar\": \"http:\\/\\/s8.wxscreen.com\\/static\\/upload\\/slave2_store2\\/2014\\/01\\/25\\/20140125224124000000_1_34953_4726.png\",\n" +
//                "\t\t\"name\": \"\\u6469\\u767b\\u539f\\u59cb\\u4eba\",\n" +
//                "\t\t\"mobile\": \"\",\n" +
//                "\t\t\"is_on_wall\": \"1\",\n" +
//                "\t\t\"staff_no\": \"\",\n" +
//                "\t\t\"gender\": \"1\",\n" +
//                "\t\t\"country\": \"\\u4e2d\\u56fd\",\n" +
//                "\t\t\"province\": \"\\u4e0a\\u6d77\",\n" +
//                "\t\t\"city\": \"\\u8679\\u53e3\",\n" +
//                "\t\t\"district\": \"\",\n" +
//                "\t\t\"update_time_ms\": \"138863237153771103\",\n" +
//                "\t\t\"add_time\": \"2014-01-02 11:12:51\",\n" +
//                "\t\t\"on_wall_time\": \"2014-01-02 11:12:51\"\n" +
//                "\t}, {\n" +
//                "\t\t\"id\": \"14823\",\n" +
//                "\t\t\"fakeid\": \"353083600\",\n" +
//                "\t\t\"avatar\": \"http:\\/\\/s8.wxscreen.com\\/static\\/upload\\/slave2_store2\\/2015\\/04\\/12\\/20150412142312000000_1_34688_7635.png\",\n" +
//                "\t\t\"name\": \"\\u8d30\\u9ec4\\u4e0d\\u8d30\",\n" +
//                "\t\t\"mobile\": \"\",\n" +
//                "\t\t\"is_on_wall\": \"1\",\n" +
//                "\t\t\"staff_no\": \"\",\n" +
//                "\t\t\"gender\": \"1\",\n" +
//                "\t\t\"country\": \"\\u4e2d\\u56fd\",\n" +
//                "\t\t\"province\": \"\\u6c5f\\u82cf\",\n" +
//                "\t\t\"city\": \"\\u5357\\u4eac\",\n" +
//                "\t\t\"district\": \"\",\n" +
//                "\t\t\"update_time_ms\": \"138866424228335403\",\n" +
//                "\t\t\"add_time\": \"2014-01-02 20:04:02\",\n" +
//                "\t\t\"on_wall_time\": \"2014-01-02 20:04:02\"\n" +
//                "\t}, {\n" +
//                "\t\t\"id\": \"68161\",\n" +
//                "\t\t\"fakeid\": \"2811201984\",\n" +
//                "\t\t\"avatar\": \"http:\\/\\/s8.wxscreen.com\\/static\\/upload\\/slave2_store2\\/2014\\/01\\/02\\/20140102220603000000_1_27261_9605.png\",\n" +
//                "\t\t\"name\": \"HILOLT\",\n" +
//                "\t\t\"mobile\": \"\",\n" +
//                "\t\t\"is_on_wall\": \"1\",\n" +
//                "\t\t\"staff_no\": \"\",\n" +
//                "\t\t\"gender\": \"1\",\n" +
//                "\t\t\"country\": \"\\u963f\\u62c9\\u4f2f\\u8054\\u5408\\u914b\\u957f\\u56fd\",\n" +
//                "\t\t\"province\": \"\\u8fea\\u62dc\",\n" +
//                "\t\t\"city\": \"\",\n" +
//                "\t\t\"district\": \"\",\n" +
//                "\t\t\"update_time_ms\": \"138867156391142203\",\n" +
//                "\t\t\"add_time\": \"2014-01-02 22:06:03\",\n" +
//                "\t\t\"on_wall_time\": \"2014-01-02 22:06:03\"\n" +
//                "\t}, {\n" +
//                "\t\t\"id\": \"68177\",\n" +
//                "\t\t\"fakeid\": \"1381128581\",\n" +
//                "\t\t\"avatar\": \"http:\\/\\/s8.wxscreen.com\\/static\\/upload\\/slave2_store2\\/2014\\/01\\/03\\/20140103092620000000_1_40690_8299.png\",\n" +
//                "\t\t\"name\": \"\\u694a\",\n" +
//                "\t\t\"mobile\": \"\",\n" +
//                "\t\t\"is_on_wall\": \"1\",\n" +
//                "\t\t\"staff_no\": \"\",\n" +
//                "\t\t\"gender\": \"1\",\n" +
//                "\t\t\"country\": \"\\u4e2d\\u56fd\",\n" +
//                "\t\t\"province\": \"\\u91cd\\u5e86\",\n" +
//                "\t\t\"city\": \"\\u6e1d\\u4e2d\",\n" +
//                "\t\t\"district\": \"\",\n" +
//                "\t\t\"update_time_ms\": \"138871238055322603\",\n" +
//                "\t\t\"add_time\": \"2014-01-03 09:26:20\",\n" +
//                "\t\t\"on_wall_time\": \"2014-01-03 09:26:20\"\n" +
//                "\t}]\n" +
//                "}";
//        return sb;
//    }
}
