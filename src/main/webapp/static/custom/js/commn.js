/**
 * commn assembly javascript
 * Created by HJK on 2017/1/19.
 */

/*绑定时间弹出插件
* @param stId 起始时间id
* @param etId 结束时间id
*/
function bindLayDate(stId,etId) {
    //输入框日期控件绑定
    var lrsj_start = {
        elem : '#'+stId,
        format : 'YYYY/MM/DD hh:mm:ss',
        max : '2099-06-16 23:59:59', //最大日期
        istime : true,
        zIndex: 99999999, //css z-index
        istoday : false,
        choose : function(datas) {
            lrsj_end.min = datas; //开始日选好后，重置结束日的最小日期
            lrsj_end.start = datas //将结束日的初始值设定为开始日
        }
    };
    var lrsj_end = {
        elem : '#'+etId,
        format : 'YYYY/MM/DD hh:mm:ss',
        max : '2099-06-16 23:59:59',
        istime : true,
        zIndex: 99999999, //css z-index
        istoday : false,
        choose : function(datas) {
            lrsj_start.max = datas; //结束日选好后，重置开始日的最大日期
        }
    };
    laydate(lrsj_start);
    laydate(lrsj_end);
}