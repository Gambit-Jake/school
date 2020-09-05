  
var OriginTitile = document.title;    // 保存之前页面标题  
var titleTime;  
document.addEventListener('visibilitychange', function(){  
    if (document.hidden){  
        document.title ='你不要我了么？qwq';  // 切出文字
        clearTimeout(titleTime);  
    }else{  
        document.title = '欢迎回来～';  // 切入文字
        titleTime = setTimeout(function() {  
            document.title = OriginTitile;  
        }, 1000); // 2秒后恢复原标题  
    }  
});  
