// 1、要求5秒请求一次
// 2、自动刷新

$(function(){
    
    var requestData  = window.a = function(){
        var url = siteUrl + '/prize/ajax/data';
        var company_id = $('.dashangList').attr('company_id');
        $.post(url, {company_id:company_id}, function(json){
            if (json.info == 'ok') {
                console.log(json.info);
                $.each(json.data, function(k, v) {
                    UIPayNumUpdate(v.id, v);
                    UIUserNumUpdate(v.id, v);
                    UIPrizeLogUpdate(v.id, v);
                })
                
            } else {
                console.log(json.info);
            }
        },'json');
    }

    // 打赏金额 UI更新
    var UIPayNumUpdate = function(id, json){
        var new_id = '"#prize'+id+'"';
        var obj = $('.dashangList').find(new_id);
        var UINum = obj.find(".num-list");
        var html = '';
        
        for (var i = 0; i < json.price.length; i++) {
          html += '<li>\
              <div class="num-box">\
                  <span>' + json.price[i] + '</span>\
              </div>\
             </li>';
        }
        
        UINum.html(html);
    }
    
    // 打赏人数 UI更新
    var UIUserNumUpdate = function(id, json){
        var new_id = '"#prize'+id+'"';
        var obj = $('.dashangList').find(new_id);
        var UINum = obj.find(".num-list2");
        var html = '';
        
        for (var i = 0; i < json.count.length; i++) {
          html += '<li>\
              <div class="num-box">\
                  <span>' + json.count[i] + '</span>\
              </div>\
             </li>';
        }
        
        UINum.html(html);
    }
    
    // 打赏记录 UI更新
    var UIPrizeLogUpdate = function(id, json){
        var new_id = '"#prize'+id+'"';
        var obj = $('.dashangList').find(new_id);
        var UINum = obj.find(".user_list");
        var html = '';
        
        for (var i = 0; i < json.list.length; i++) {
          html += '<li>\
              <span class="col1"><img src="' + json.list[i]['avatar'] + '" alt="' + json.list[i]['nickname'] + '"></span>\
              <span class="col2">' + json.list[i]['nickname'] + '</span>\
              <span class="col3"><em>' + json.list[i]['price'] + '</em>元</span>\
            </li>';
        }
        
        UINum.html(html);
    }
    
    setInterval(function(){
        requestData();
    }, 5000);
    
    // 每一分钟更新一次统计数据(被打赏人的打赏价格)
    var UpdatePrice = function(){
        var url = siteUrl + '/prize/ajax/update_price';
        var prize_id = $('.dashangList').attr('prize_id');
        $.post(url, {'prize_id':prize_id}, function(json){
            if (json.info == 'ok') {
                console.log(json.info);
            } else {
                console.log(json.info);
            }
        },'json');
    }
    
    setInterval(function(){
        UpdatePrice();
    }, 60000);
})
