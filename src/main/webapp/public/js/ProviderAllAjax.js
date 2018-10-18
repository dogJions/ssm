/**
 * 
 */

function ajaxLoad(id){
	var pageNum=$("#pageNum").val()==""||$("#pageNum").val()==undefined?1:$("#pageNum").val();
	var proCode=$("#ProCode").val()==""||$("#ProCode").val()==undefined?null:$("#ProCode").val();
	var proName=$("#ProName").val()==""||$("#ProName").val()==undefined?null:$("#ProName").val();
	var uid=id==""||id==undefined?0:id;
	
	if(uid>0){
		if(confirm("确认删除？")){
			
		}else{
			uid=0;
		}
	}
	console.info(uid);
	$.ajax({
		url:"../provider/to_provider_List",
		type:"post",
		data:{pageNum:pageNum,proCode:proCode,proName:proName,id:uid},
		success:function(result){
			$("#providerList").html(result);
			var pages=$("#pages").val()==""||$("#pages").val()==undefined?1:$("#pages").val();
			console.info(pages);
			laypage({
			    cont: 'page' //绑定到指定id
			    ,pages: pages
			    ,curr:pageNum
			    ,jump: function(obj, first){
			      if(!first){
			    	  $("#pageNum").val(obj.curr);
			    	  ajaxLoad();
			      }
			    }
			  });
		}
	});  
	
	
}

$(function(){
	ajaxLoad(0);
})