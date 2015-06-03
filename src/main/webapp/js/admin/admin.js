var admin=new Object();
/**
 * Created by lihb on 2015/5/6.
 */
!function (t) {

    var db = $.indexedDB("wxScreen", {
        "schema": {
            "1": function (versionTransaction) {
                versionTransaction.createObjectStore("userList");
            }
        }
    });
    t.initUser = function () {
        var userUrl = "index.htm/wxscreen/user/sync?state=user";
        $.post(userUrl, {"last_id": "0","last_whitelist_id":""}, function (data, textStatus, jqXHR) {
            db.transaction("userList").then(function () {
                console.log("Transaction completed");
            }, function () {
                console.log("Transaction aborted");
            }, function (t) {
                console.log("Transaction in progress");
                t.objectStore("userList").add(data, 1).then(function () {
                    console.log("Data added");
                }, function () {
                    console.log("Error adding data");
                });
            });
        }, "json");
    }
    t.initQiang=function(){
        var objectStore = db.objectStore("userList");
        var list=objectStore.get(1);
        console.log("user date:");
        console.log(list);
    }
}(admin);